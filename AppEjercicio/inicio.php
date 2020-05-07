<?php
//VISTA
      session_start();
     $name = $_SESSION['name'];
     $clave=$_SESSION['clave'];
      if(!isset($name)){
          header("location: index.php");
        }else{
?>
<html>

<head>
    <meta charset="utf-8">
    <title>AppEjercicio</title>
    <link href="static/css/estilo.css" rel="stylesheet">
    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
    <script src="static/js/temporizador.js"></script>
</head>

<body>

<audio id="audio" controls style="display:none">
<source type="audio/wav" src="audio.wav">
</audio>
<audio id="audiof" controls style="display:none">
<source type="audio/wav" src="audio.wav">
</audio>
    <header>
        <div class="logo">AppEjercicio</div>
        <nav>
        <a href="#"> Inicio</a>
        <?php
            
            $_SESSION['name'] = $name; 
        } 
              
        ?>
            <a href="salir.php"> Salir</a>
        </nav>
    </header>
    <div class="contenedor">
    <div id="timer">
            <table id="tabla2" >
              <tr>
                <td>
            <h3>Duración (minutos):</h3><input type="number" name="duracion" id="duracion"  min="1" style="width: 60px;" step="1"><br>
            <h3>tiempo de ejercicio por minuto :</h3><input type="number" id="tejexmin" name="tejexmin" min="1"  style="width: 60px;" step="1"><br>
            <br><button id="btn-comenzar">Comenzar</button>
            </td>
            <td style="background: #ffffff; width: 1pt;"></td>
            <td>
            <div class="container">
                <div id="hour">00</div>
                <div class="divider">:</div>
                <div id="minute">00</div>
                <div class="divider">:</div>
                <div id="second">00</div>                
            </div>
            </td></tr>
      </table>
        </div>
          <div id="panelrutina">
                  <h3>Hola <?php echo "  $name "; ?> estos son tus rutinas:</h3><br>
                  <table id="tabla">
                      <thead>
                          <th><h3>Fecha.</h3></th>
                          <th><h3>Duración (Minutos)</h3></th>
                          <th><h3>Tiempo de ejercicio por minuto</h3></th>
                      </thead>

            <?php
                  include "conexion.php";
                  $sql =<<<EOF
                  SELECT * FROM rutinas where user = '$name';
EOF;
            $ret = $db->query($sql);
            while($row = $ret->fetchArray(SQLITE3_ASSOC) ) {
                
              echo "<tr>";
                echo "<td><h3>".$row['fecha']."</h3></td>";
                echo "<td><h3>"; echo $row['duracion']; echo "</h3></td>";
                echo "<td><h3>"; echo $row['Tejexmin']; echo "</h3></td>";
              echo "</tr>";
            }
            ?>
                    </table>
          </div>
    </div>
</body>

</html>
