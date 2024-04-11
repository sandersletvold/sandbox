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

function fyllInnRekke() {
    $.get("/tilfeldigTall", function (tilfeldigTall){
        fyllInnTall(tilfeldigTall);
    });
}

function slettSisteRekke() {
    $.get("/slettSiste", function (rekke){
        utSkrift(rekke);
    })
}

function slettAlleRekker() {
    $.get("/slettAlle", function (rekke){
        utSkrift(rekke);
    })
}

function hentAlleRekker() {
    $.get("/tilKlient", function (rekke){
        utSkrift(rekke);
    })
}

function utSkrift(rekke) {
    let ut = "<table class='table'>";
    for (let i of rekke) {
        ut += "<tr><th class='active'>Rekke</th><td>" +i.tall0+ "</td><td>" +i.tall1+ "</td><td>" +i.tall2+ "</td><td>" +i.tall3+ "</td><td>" +i.tall4+ "</td><td>" +i.tall5+ "</td><td>" +i.tall6+ "</td></tr>";
    }
    ut += "</table>";
    $("#rekker").html(ut);
}

function fyllInnTall(tilfeldigTall) {
    for (let i = 0; i<7; i++) {
        let index = "#tall"+i;
        $(index).val(tilfeldigTall[i]);
    }
}
