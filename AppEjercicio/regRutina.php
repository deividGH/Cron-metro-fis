<?php
//controlador
session_start();
$name = $_SESSION['name'];
$clave=$_SESSION['clave'];
if (isset($_GET["duracion"]) && isset($_GET["tejexmin"])) {
    $duracion = $_GET["duracion"];
    $tejexmin= $_GET["tejexmin"];
}
 if(!isset($name)){
     header("location: index.php");
   }else{
include "conexion.php";
$fecha = " " . date("d") . " / " . date("m") . " / " . date("Y");
$_SESSION['name'] = $name; 

$sql =<<<EOF
    INSERT INTO rutinas (fecha,duracion,tejexmin,user)
    VALUES ('$fecha','$duracion','$tejexmin','$name');       
EOF;
    $ret = $db->exec($sql);
    if(!$ret) {
        echo '<script language="javascript">alert("ERROR: no se guardaron los datos");</script>'; 
    } else {
        echo '<script language="javascript" >alert("DATOS GUARDADOS");</script>'; 
        header("location: inicio.php");
    }
    $db->close();
}
?>
