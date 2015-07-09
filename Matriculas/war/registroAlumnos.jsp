<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/Estilos.css">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/registro.js"></script>
<title>Sistema de Matriculas</title>
</head>
<body ><br><br><br><br><br>
<legend>REGISTRO DE ALUMNO</legend><br>
<table align="center">
<tr>
<td>
	<fieldset >
			<form >
			<div id="formulario">
			<legend>DATOS DEL ALUMNO</legend>
				<div class="fila">
					<div class="etiqueta">
						<label for="cui">CUI: </label>
					</div>
					<div class="control">
						<input type="number" id="cui" maxlength="8" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="nombre">NOMBRE:</label>
					</div>
					<div class="control">
						<input type="text" id="nombre"  maxlength="10" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="apellido">APELLIDO PATERNO</label>
					</div>
					<div class="control">
						<input type="text" id="apellidoPaterno" maxlength="10" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="apellido">APELLIDO MATERNO</label>
					</div>
					<div class="control">
						<input type="text" id="apellidoMaterno" maxlength="10" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="dni">DNI: </label>
					</div>
					<div class="control">
						<input type="number" name="dni" maxlength="8" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="direccion">DIRECCION:</label>
					</div>
					<div class="control">
						<input type="text" name="direccion" maxlength="30" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="ciudad">CIUDAD:</label>
					</div>
					<div class="control">
						<input type="text" name="ciudad" maxlength="10" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="distrito">DISTRITO:</label>
					</div>
					<div class="control">
						<input type="text" name="distrito" maxlength="30" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="nacimiento">FECHA DE NACIMIENTO: </label>
					</div>
					<div class="control">
						<input type="date" name="nacimiento" maxlength="10" required/>
					</div>
				</div>

				<div class="fila">
					<div class="etiqueta">
						<label for="sexo">SEXO: </label>
					</div>
					<div class="control">
						<input type="radio" name="sexo" value="masculino"> Masculino
						<br> <input type="radio" name="sexo" value="femenino">
						Femenino
					</div>
				</div>

				<div class="fila">
					<div class="etiqueta">
						<label for="numT">NUMERO DE TELEFONO: </label>
					</div>
					<div class="control">
						<input type="number" name="numTelefono" maxlength="10" required/>
					</div>
				</div>
	

				
				<p><legend>DATOS DEL APODERADO</legend></p>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="nombreAp">NOMBRE:</label>
					</div>
					<div class="control">
						<input type="text" name="nombreAp" maxlength="10" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="direccionAp">DIRECCION:</label>
					</div>
					<div class="control">
						<input type="text" name="direccionAp" maxlength="30" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="numTelefono">NUMERO DE TELEFONO: </label>
					</div>
					<div class="control">
						<input type="number" name="telefono" maxlength="10" required/>
					</div>
				</div>
				<div class="fila">
					<div id="action">
						<input type="button" id="registro" value="REGISTRAR">
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