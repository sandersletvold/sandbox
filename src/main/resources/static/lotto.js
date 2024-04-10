function registrerRekke() {
    const rekke = {
        tall1 : $("#tall1").val(),
        tall2 : $("#tall2").val(),
        tall3 : $("#tall3").val(),
        tall4 : $("#tall4").val(),
        tall5 : $("#tall5").val(),
        tall6 : $("#tall6").val(),
        tall7 : $("#tall7").val()
    };

    let ut = "";
    if ((rekke.tall1 >= 1 && rekke.tall1 <= 34) && (rekke.tall2 >= 1 && rekke.tall2 <= 34) && (rekke.tall3 >= 1 && rekke.tall3 <= 34) && (rekke.tall4 >= 1 && rekke.tall4 <= 34) && (rekke.tall5 >= 1 && rekke.tall5 <= 34) && (rekke.tall6 >= 1 && rekke.tall6 <= 34) && (rekke.tall7 >= 1 && rekke.tall7 <= 34)) {
        ut += "<td>" +rekke.tall1+ "</td><td>" +rekke.tall2+ "</td><td>" +rekke.tall3+ "</td><td>" +rekke.tall4+ "</td><td>" +rekke.tall5+ "</td><td>" +rekke.tall6+ "</td><td>" +rekke.tall7+ "</td>";
        $("#tall1").val("");
        $("#tall2").val("");
        $("#tall3").val("");
        $("#tall4").val("");
        $("#tall5").val("");
        $("#tall6").val("");
        $("#tall7").val("");
    }
}

function fyllInnRekke() {

}

function slettSisteRekke() {

}

function slettAlleRekker() {

}
