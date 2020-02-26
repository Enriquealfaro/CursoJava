<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

        <!-- Place your kit's code here -->
        <script src="https://kit.fontawesome.com/8e2cefcd85.js" crossorigin="anonymous"></script>


        <title>Editar clientes</title>
    </head>
    <body> 
        <!-- header -->
        <jsp:include page="/WEB-INF/paginas/comunes/cabecero.jsp"/>


        <form action="${pageContext.request.contextPath}/ServletControlador?accion=modificar&idCliente=${cliente.idCliente}" method="POST" class="was-validated">

            <!-- bara de navegacion -->
            <jsp:include page="/WEB-INF/paginas/comunes/botonesNavegacionEdicion.jsp"/>

            <section id="details">
                <div class="container">
                    <div class="row">
                        <div class="col">
                            <div class="card">
                                <div class="card-header">
                                    <h4>Editar Cliente</h4>
                                </div>
                                <div class="card-body">
                                    <div class="modal-body">
                                        <div class="form-group">
                                            <label for="nombre">Nombre</label>
                                            <input type="text" class="form-control" name="nombre" value="${cliente.nombre}" required>
                                        </div> 
                                        <div class="form-group">
                                            <label for="apellido">apellido</label>
                                            <input type="text" class="form-control" name="apellido" value="${cliente.apellido}" required>
                                        </div> 
                                        <div class="form-group">
                                            <label for="email">email</label>
                                            <input type="email" class="form-control" name="email" value="${cliente.email}">
                                        </div> 
                                        <div class="form-group">
                                            <label for="telefono">telefono</label>
                                            <input type="tel" class="form-control" name="telefono" value="${cliente.telefono}">
                                        </div> 
                                        <div class="form-group">
                                            <label for="saldo">Saldo</label>
                                            <input type="number" class="form-control" name="saldo" value="${cliente.saldo}" step="any" required>
                                        </div> 
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>

        </form>
        <!-- footer-->
        <jsp:include page="/WEB-INF/paginas/comunes/footer.jsp"/>

        <!-- Fin del los javascritp de bootstrap -->
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html>
