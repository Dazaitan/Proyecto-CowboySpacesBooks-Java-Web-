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
    function cargarEstanterias() {
        $.ajax({
            url: '../ObtenerEstanterias',
            method: 'GET',
            dataType: 'json',
            success: function(data) {
                var ul = $('.estanterias');
                $.each(data, function(index, item){
                    var datos = '<li class="estOpcion" value "'+item.Id+'"><a href="">' +  item.nombre + '</a></li>';
                ul.append(datos);
                });
                
            },
            error: function() {
                alert('Error al cargar las estanterias');

            }
        });
    }
    //falta cargar el value y el name que va tener la etiqueta al momento de cargarse cada una
    cargarLibros();
    cargarEstanterias();// Llama a la función para cargar los libros
    const openModal = document.getElementById('OpenModalAnadirEstanteria');
    const closeModal = document.getElementById('closeModal');
    const modal = document.getElementById('myDialog');

    if (openModal && closeModal && modal) {
        openModal.addEventListener('click', () => {
            modal.showModal();
        });

        closeModal.addEventListener('click', () => {
            modal.close();
        });

        modal.addEventListener('click', (event) => {
            const rect = modal.getBoundingClientRect();
            if (!(event.clientX >= rect.left && event.clientX <= rect.right &&
                  event.clientY >= rect.top && event.clientY <= rect.bottom)) {
                modal.close();
            }
        });
    }
});
