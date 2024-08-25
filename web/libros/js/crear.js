$(document).ready(function() {
    function cargarOpciones() {
        $.ajax({
            url: '../ObtenerOpciones',
            method: 'GET',
            dataType: 'json',
            success: function(data) {
                console.log('Respuesta del servidor:'); //(No esta recibiendo los datos)
                var select = $('#editorial');
                select.empty(); // Limpia las opciones actuales
                $.each(data, function(index, item) {
                    select.append($('<option>', { 
                        value: item.id,
                        text: item.nombre 
                    }));
                });
            },
            error: function() {
                alert('Error al cargar las opciones');

            }
        });
    }
    //falta cargar el value y el name que va tener la etiqueta al momento de cargarse cada una
    cargarOpciones();  // Llama a la función para cargar las opciones
    // También puedes llamar a `cargarOpciones()` en otros eventos si es necesario
});


