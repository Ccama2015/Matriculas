<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Matriculas</title>
<link rel="stylesheet" type="text/css" href="css/pymestyle.css">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/frame.js"></script>
</head>
<body>
<table align="center" height="1000px" bgcolor="#191970" >
<tr>
<td height="20px">
	<div align="center" style="color: white ; font-family: Calibri Light; font-size: 40px">S I S T E M A  -  DE  -  M A T R I C U L A S</div>
</td>
</tr>
<tr>
<td height="50px">
	<img src="img/cabeza.jpg" width=auto height=auto>
</td>
</tr>
<tr>
<td height="10px" align="center">
		<ul class="menu">
	<li id="inicio"> <a>INICIO</a> </li>
    <li> <a>REGISTRAR</a>
        <ul>
        	<li id="registrarAlumnos"> <a >ALUMNOS</a></li>
            <li id="registrarProfesor"><a >PROFESORES</a></li>
            <li id="registroCursos"><a>CURSOS</a></li>
        </ul> 
    </li>
        <li> <a>ELIMINAR</a>
        <ul>
        	<li id="eliminarAlumnos"> <a >ALUMNOS</a></li>
            <li id="eliminarProfesor"> <a>PROFESORES</a></li>
            <li id="eliminarCurso"> <a>CURSOS</a></li>
        </ul> 
    </li>
        <li> <a>MODIFICAR</a>
        <ul>
        	<li id="modificarAlumnos"> <a >ALUMNOS</a></li>
            <li id="modificarProfesor"> <a>PROFESORES</a></li>
            <li id="modificarCurso"> <a>CURSOS</a></li>
        </ul> 
    </li>
            <li> <a>MOSTRAR</a>
        <ul>
        	<li id="mostrarAlumnos"> <a >ALUMNOS</a></li>
            <li id="mostrarProfesores"> <a>PROFESORES</a></li>
            <li id="mostrarCurso"> <a>CURSOS</a></li>
        </ul> 
    </li>

</ul>
</td>
</tr>
<tr>
<td>
<div id="cuerpo" align="center" style="color: white">
<a style=" font-family: Calibri; font-size: 40px;color: white ">BIENVENIDO A PANEL DE CONTROL</a><br>

<a style="color: white; font-size: 18px; font-family: calibri;" href="DESCRIPCION-DE-LA-PAGINA-WEB.pdf">DESCRIPCION DE LA WEB</a><br>
<a style="color: white; font-size: 18px; font-family: calibri;" href="PROYECTO-DE-MATRICULAS.pdf">INFORME</a><br>
<a style="color: white; font-size: 18px; font-family: calibri;" href="SISTEMA-DE-MATRICULAS-2015.pdf">MAPA DE SITIO</a><br>
<a style="color: white; font-size: 18px; font-family: calibri;" href="UML.gif">UML</a>
<h3>BIENVENIDO ADMINISTRADOR ${sessionScope.usuario}</h3>
<form action="cerrar" method="post">
		<input type="submit" value="Salir" ><br>
</form>
</div><br>

</td>
</tr>
<tr>
<td align="center" height="40px">
<hr>
<div style="color: gray ;">Derechos Reservados</div>
<div style="color: gray ;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</div>
<div style="color: gray ;">2015</div>
</td>
</tr>
</table>
</body>
</html>

