$(document).ready(function() {
    function cargarLibros() {
        $.ajax({
            url: '../GetConsultaLibros',
            method: 'GET',
            dataType: 'json',
            success: function(data) {
                var tbody = $('.bookBody');
                $.each(data, function(index, item){
                    var datos = '<tr>' +
                        '<td class="field portada"><a href="#"><img src="'+item.portada+'"></a></td>'
                        +'<td class="field titulo">'+item.titulo+'</td>'
                        +'<td class="field autor">'+item.autor+'</td>'
                        +'<td class="field calificacion">'+item.calificacion+'</td>'
                        +'<td class="field estanteria">'+item.Lista+'</td>'
                        +'<td class="field reseña">frame</td>'
                        +'<td class="field fecha_lectura">Hoy</td>'
                        +'<td class="field fecha_anadido">'+item.FechaAgregacion+'</td>';
                tbody.append(datos);
                });
                
            },
            error: function() {
                alert('Error al cargar las opciones');

            }
        });
    }
    //falta cargar el value y el name que va tener la etiqueta al momento de cargarse cada una
    cargarLibros();  // Llama a la función para cargar los libros
});

