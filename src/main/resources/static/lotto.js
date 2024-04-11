// lotto.html
document.addEventListener("DOMContentLoaded", function (){
    $.get("/tilKlient", function (rekke){
        utSkrift(rekke);
        // $("#vinnertall").html(sessionStorage.getItem("vinnertabell"));
    });
})

function utSkrift(rekke) {
    let ut = "<table class='table table-striped'>";
    let rekkeNr = 1;
    for (let i of rekke) {
        ut += "<tr><th>Rekke #" +rekkeNr+ "</th><td>" +i.tall0+ "</td><td>" +i.tall1+ "</td><td>" +i.tall2+ "</td><td>" +i.tall3+ "</td><td>" +i.tall4+ "</td><td>" +i.tall5+ "</td><td>" +i.tall6+ "</td></tr>";
        rekkeNr++;
    }
    ut += "</table>";
    $("#rekker").html(ut);
    $("#trekningRekker").html(ut);
}

function registrerRekke() {
    const rekke = {
        tall0 : $("#tall0").val(),
        tall1 : $("#tall1").val(),
        tall2 : $("#tall2").val(),
        tall3 : $("#tall3").val(),
        tall4 : $("#tall4").val(),
        tall5 : $("#tall5").val(),
        tall6 : $("#tall6").val()
    };

    if ((rekke.tall0 >= 1 && rekke.tall0 <= 34) && (rekke.tall1 >= 1 && rekke.tall1 <= 34) && (rekke.tall2 >= 1 && rekke.tall2 <= 34) && (rekke.tall3 >= 1 && rekke.tall3 <= 34) && (rekke.tall4 >= 1 && rekke.tall4 <= 34) && (rekke.tall5 >= 1 && rekke.tall5 <= 34) && (rekke.tall6 >= 1 && rekke.tall6 <= 34)) {
        let duplikat = false;
        for (let i = 0; i<6; i++) {
            let index = "#tall"+i;
            for (let j = i+1; j<7; j++) {
                let nesteIndex = "#tall"+j;
                if ($(index).val() === $(nesteIndex).val()) {
                   duplikat = true;
                   break;
                }
            }
        }
        if (!duplikat) {
            $("#tall0").val("");
            $("#tall1").val("");
            $("#tall2").val("");
            $("#tall3").val("");
            $("#tall4").val("");
            $("#tall5").val("");
            $("#tall6").val("");

            $.post("/tilServer", rekke, function (){
                hentAlleRekker();
            });
        }
    }
}

function hentAlleRekker() {
    $.get("/tilKlient", function (rekke){
        utSkrift(rekke);
    });
}

function hentTilfeldigRekke() {
    $.get("/tilfeldigTall", function (tilfeldigTall){
        fyllInnTilfeldigRekke(tilfeldigTall);
    });
}

function fyllInnTilfeldigRekke(tilfeldigTall) {
    for (let i = 0; i<7; i++) {
        let index = "#tall"+i;
        $(index).val(tilfeldigTall[i]);
    }
};

function slettSisteRekke() {
    $.get("/slettSiste", function (rekke){
        utSkrift(rekke);
    });
}

function slettAlleRekker() {
    $.get("/slettAlle", function (rekke){
        utSkrift(rekke);
    });
}


// lotto_trekning.html
function hentVinnertall() {
    $.get("/hentVinnerTall", function (vinnertall){
        const tall = {
            vinnertall0 : vinnertall[0],
            vinnertall1 : vinnertall[1],
            vinnertall2 : vinnertall[2],
            vinnertall3 : vinnertall[3],
            vinnertall4 : vinnertall[4],
            vinnertall5 : vinnertall[5],
            vinnertall6 : vinnertall[6]
        };
        $.post("/sendVinnertall", tall, function (){
            skrivUtVinnertall(vinnertall);
        });
    });
}

function skrivUtVinnertall(vinnertall) {
    let ut = "<table class='table table-bordered'><tr class='bg-success'><th>Vinnertall</th>";
    for (let i = 0; i<vinnertall.length; i++) {
        ut += "<td>" +vinnertall[i]+ "</td>"
    }
    ut += "</strong></tr></table>";
    $("#vinnertall").html(ut);
    // sessionStorage.setItem("vinnertabell", ut);
};