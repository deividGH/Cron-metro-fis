
<html>

<head>
    <meta charset="utf-8">
    <title>AppEjercicio</title>
    <link href="static/css/estilo.css" rel="stylesheet">
    <link href="static/css/estilo2.css" rel="stylesheet">
    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <script src="header.js"></script>
</head>

<body>

    <div class="cont_ini">
        <div class="panelForm">
            <div id="container">
                <h1>&bull; Bienvenido &bull;</h1>
                <div class="underline">
                </div>
                <form action="verificador.php"  method="POST" id="formulario">
                    <div class="name">
                        <label for="name"></label>
                        <input type="text" placeholder="Nombre de usuario" name="name" id="name_input" required>
                    </div>
                    <div class="clave">
                        <label for="clave"></label>
                        <input type="clave" placeholder="Contrase&ntilde;a" name="clave" id="clave_input" required>
                    </div>
                    <div class="submit">
                         <input type="submit" name="ingresar" value="ingresar" id="form_button1" />
                    </div>
                    <div class="submit">
                        <input type="submit" name="registro" value="Registro " id="form_button2" formaction="regUser.php" />
                    </div>
                </form>
            </div>
        </div>
    </div>

    <div class="piepag">
        <br>
        <p>&nbsp;&nbsp;&nbsp;Developed by: Raúl Pachón , Brayan Parra, Deivid Toloza</p>
    </div>
</body>

</html>