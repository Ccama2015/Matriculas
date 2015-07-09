<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="estilos/Estilos.css">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/registroCurso.js"></script>

<title>Registrar curso</title>
</head>
<body>
<legend>Registro de Cursos</legend>
<fieldset>
		<form>
		
			<div id="formulario">
			
				<div class="fila">
					<div class="etiqueta">
						<label for="name">Nombre de Curso :</label>
					</div>
					<div class="control">
						<input type="text" id="nombre" maxlength="20" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="name">Numero de creditos :</label>
					</div>
					<div class="control">
						<input type="number" id="creditos" maxlength="2" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="name">Codigo del Curso :</label>
					</div>
					<div class="control">
						<input type="number" id="codigo" maxlength="25" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="name">Profesor asignado :</label>
					</div>
					<div class="control">
						<input type="text" name="profesor" maxlength="30" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="name">Departamento academico de procedencia :</label>
					</div>
					<div class="control">
						<input type="text" name="deptacademico" maxlength="30" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="name">Pre-requisitos :</label>
					</div>
					<div class="control">
						<input type="number" id="prerequisitos" maxlength="10" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="name">Horas:</label>
					</div>
					<div class="control">
						<input type="number" name="horas" maxlength="10" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="name">Numero de Grupos :</label>
					</div>
					<div class="control">
						<input type="number" name="grupos" maxlength="10" required/>
					</div>
				</div>
				
				<div class="fila">
					<div id="action">
						<input type="reset" value="Limpiar" /><input type="button"
							value="Guardar" id="registroCurso"/>
					</div>
				</div>
				
			</div>
		</form>
		
	</fieldset>


</body>
</html>