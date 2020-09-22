//Código para Datables

//$('#example').DataTable(); //Para inicializar datatables de la manera más simple

$(document).ready(function() {    
    $('#example').DataTable({
    //para cambiar el lenguaje a español
        "language": {
                "lengthMenu": "To show _MENU_ records",
                //"lengthMenu": "Mostrar _MENU_ registros",
                "zeroRecords": "No results found",
                //"zeroRecords": "No se encontraron resultados",
                "info": "Showing records from _START_ al _END_ out of a total of _TOTAL_ records", 
                //"info": "Mostrando registros del _START_ al _END_ de un total de _TOTAL_ registros",
                "infoEmpty": "Showing records from 0 al 0 out of a total of 0 records",
                //"infoEmpty": "Mostrando registros del 0 al 0 de un total de 0 registros",
                "infoFiltered": "(filtered from a total of _MAX_ records)",
                //"infoFiltered": "(filtrado de un total de _MAX_ registros)",
                "sSearch": "Search for:",
                //"sSearch": "Buscar:",
                "oPaginate": {
                    "sFirst": "Primero",
                    "sLast":"Último",
                    "sNext":"Next",
                    //"sNext":"Siguiente",
                    "sPrevious": "Previous"
                    //"sPrevious": "Anterior"
			     },
			     "sProcessing":"Procesando...",
            }
    });     
});