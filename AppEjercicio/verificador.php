<?php
//CONTROLADOR

session_start();
require 'conexion.php';
$name = $_POST['name'];
$clave = $_POST['clave'];


 $sql =<<<EOF
SELECT * FROM usuario where nombre = '$name' and clave = '$clave';
EOF;
$ret = $db->query($sql);
$row = $ret->fetchArray(SQLITE3_ASSOC);
if($row['nombre']==""){
  header("location: index.php");
}else{
  $_SESSION['name'] = $name;
  $_SESSION['clave'] = $clave;
  header("location: inicio.php");
}
$db->close();

?>