<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/Estilos.css">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/registroProfesor.js"></script>
<title>SISTEMA DE MATRICULAS</title>
</head>
<body ><br><br><br><br><br>
<legend>REGISTRO DE PROFESORES</legend><br>
<table align="center">
<tr>
<td>
	<fieldset >
			<form >
			<div id="formulario">
			<legend>DATOS DEL DOCENTE</legend>
				<div class="fila">
					<div class="etiqueta">
						<label for="DNI">DNI: </label>
					</div>
					<div class="control">
						<input type="number" id="DNI" maxlength="8" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="Nombre">NOMBRE:</label>
					</div>
					<div class="control">
						<input type="text" id="Nombre"  maxlength="20" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="ApellidoPaterno">APELLIDO PATERNO</label>
					</div>
					<div class="control">
						<input type="text" id="ApellidoPaterno" maxlength="20" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="ApellidoMaterno">APELLIDO MATERNO</label>
					</div>
					<div class="control">
						<input type="text" id="ApellidoMaterno" maxlength="20" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="Direccion">DIRECCION:</label>
					</div>
					<div class="control">
						<input type="text" id="Direccion" maxlength="50" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="Departamento">DEPARTAMENTO:</label>
					</div>
					<div class="control">
						<input type="text" id="Departamento" maxlength="20" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="Provincia">PROVINCIA:</label>
					</div>
					<div class="control">
						<input type="text" id="Provincia" maxlength="20" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="Distrito">DISTRITO:</label>
					</div>
					<div class="control">
						<input type="text" id="Distrito" maxlength="30" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="FechaNacimiento">FECHA DE NACIMIENTO: </label>
					</div>
					<div class="control">
						<input type="date" id="FechaNacimiento" maxlength="10" required/>
					</div>
				</div>

				<div class="fila">
					<div class="etiqueta">
						<label for="Sexo">SEXO: </label>
					</div>
					<div class="control">
						<input type="radio" id="Sexo" value="masculino"> Masculino
						<br> <input type="radio" id="Sexo" value="femenino">
						Femenino
					</div>
				</div>

				<div class="fila">
					<div class="etiqueta">
						<label for="Telefono">NUMERO DE TELEFONO: </label>
					</div>
					<div class="control">
						<input type="number" id="Telefono" maxlength="15" required/>
					</div>
				</div>
	
				<p><legend>DATOS ACADEMICOS</legend></p>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="GradoAcademico">Grado Academico:</label>
					</div>
					<div class="control">
						<input type="text" id="GradoAcademico" maxlength="30" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="DepartamentoAcademico">Departamento Academico:</label>
					</div>
					<div class="control">
						<input type="text" id="DepartamentoAcademico" maxlength="30" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="CursosAcargo">Cursos a cargo: </label>
					</div>
					<div class="control">
						<input type="number" id="CursosAcargo" maxlength="30" required/>
					</div>
				</div>
				
				<div class="fila">
					<div id="action">
						<input type="button" id="registroProfesor" value="REGISTRAR">
					</div>
				</div>
				
			</div>
			
		</form>
	</fieldset>

</td>
</tr>
</table>
</body>
</html>