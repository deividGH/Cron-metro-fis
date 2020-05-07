$(document).ready(function() {

    var tiempo = {
        hora: 0,
        minuto: 0,
        segundo: 0
    };

    var tiempo_corriendo = null;
    var duracion = null;
    var tejexmin = null;
    /*  duracion = document.getElementById("duracion").value;
    tejexmin = document.getElementById("tejexmin").value;
    var audio = document.getElementById("audio");
    var audiof = document.getElementById("audiof");
*/

    $("#btn-comenzar").click(function() {
        if ($(this).text() == 'Comenzar') {
            $(this).text('Detener');
            tiempo_corriendo = setInterval(function() {
                // Segundos

                tiempo.segundo++;
                /*if (segundo == tejexmin) {
                    audio.play();
                }*/
                if (tiempo.segundo >= 60) {
                    audiof.play();
                    tiempo.segundo = 0;
                    tiempo.minuto++;
                    /* if (minuto == duracion) {
                         window.location.href = 'regRutina.php';
                     }*/
                }

                // Minutos
                if (tiempo.minuto >= 60) {
                    tiempo.minuto = 0;
                    tiempo.hora++;
                }

                $("#hour").text(tiempo.hora < 10 ? '0' + tiempo.hora : tiempo.hora);
                $("#minute").text(tiempo.minuto < 10 ? '0' + tiempo.minuto : tiempo.minuto);
                $("#second").text(tiempo.segundo < 10 ? '0' + tiempo.segundo : tiempo.segundo);
            }, 1000);
        } else {
            $(this).text('Comenzar');
            clearInterval(tiempo_corriendo);
        }
    })
})