$(document).ready(function() {

    var tiempo = {
        hora: 0,
        minuto: 0,
        segundo: 0
    };

    var duracion = document.getElementById("duracion");
    var tejexmin = document.getElementById("tejexmin");
    var audio = document.getElementById("audio");
    var audiof = document.getElementById("audiof");

    $("#btn-comenzar").click(function() {
        if ($(this).text() == 'Comenzar') {
            $(this).text('Detener');
            tiempo_corriendo = setInterval(function() {
                // Segundos
                tiempo.segundo++;
                if (tiempo.segundo == $(tejexmin).val() - 1) {
                    audio.play();
                }
                if (tiempo.segundo >= 60) {
                    tiempo.segundo = 0;
                    tiempo.minuto++;
                    audiof.play();
                    if (tiempo.minuto == $(duracion).val()) {
                       window.location.href = 'regRutina.php' + "?duracion=" + $(duracion).val() + "&tejexmin=" + $(tejexmin).val();

                    }
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
