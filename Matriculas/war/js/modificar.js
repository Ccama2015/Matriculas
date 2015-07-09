$(document).ready(function() {
	$('#modificar').click(function() {
		var cui = $('#cui').val();
		var nombre = $('#nombre').val();
		var toString = "Cui = " + cui + "\n" + "con el Nombre = " + nombre;
		var result = window.confirm('¿Seguro que desea el cambio de nombre del ?\n' + toString);
        if (result == false) {
            return;
        };
    	$.get('modificarNombre',{"cui": cui, "nombre": nombre},
                function() { // on success
                    alert("Se Modifico .. Bien!");
                    window.location.href = "/index.jsp";
                })
                .fail(function() { //on failure
                	alert("Ups Error");
                });
	}); 
});