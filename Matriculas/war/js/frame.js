$(document).ready(function() {
	$('#inicio').click(function() {
		document.location.href = "../index.jsp";
	}); 
	$('#registrarAlumnos').click(function() {
		$( "#cuerpo" ).load("../registroAlumnos.jsp");
	}); 
	$('#eliminarAlumnos').click(function() {
		$( "#cuerpo" ).load("../eliminarAlumnos.jsp");
	}); 
	$('#modificarAlumnos').click(function() {
		$( "#cuerpo" ).load("../modificarAlumnos.jsp");
	}); 
	$('#mostrarAlumnos').click(function() {
		$( "#cuerpo" ).load("/relacionAlumnos");
	}); 
	$('#registrarProfesor').click(function() {
		$( "#cuerpo" ).load("../registroProfesor.jsp");
	}); 
	$('#eliminarProfesor').click(function() {
		$( "#cuerpo" ).load("../eliminarProfesor.jsp");
	}); 
	$('#modificarProfesor').click(function() {
		$( "#cuerpo" ).load("../modificarProfesor.jsp");
	}); 
	$('#mostrarProfesores').click(function() {
		$( "#cuerpo" ).load("/relacionProfesores");
	}); 
});