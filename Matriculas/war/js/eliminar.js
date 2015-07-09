$(document).ready(function() {
	$('#eliminar').click(function() {
		var cui = $('#cui').val();

		var toString = "Cui = " + cui;
		var result = window.confirm('¿Seguro que quiere Borrar?\n' + toString);
        if (result == false) {
            return;
        };
    	$.get('eliminarAlumnos',{"cui": cui},
                function() { // on success
                    alert("Se Borro .. Bien!");
                    window.location.href = "/index.jsp";
                })
                .fail(function() { //on failure
                	alert("Ups Error");
                });
	}); 
});