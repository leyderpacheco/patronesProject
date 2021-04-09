<%-- 
    Document   : registrarseEmpren
    Created on : 7 abr. 2021, 22:06:45
    Author     : Sammy Guergachi <sguergachi at gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Busi Connect</title>
        <link rel="shortcut icon" type="imagen/x-icon" href="img/banderin.png">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap" rel="stylesheet">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="https://unpkg.com/ionicons@4.5.10-0/dist/css/ionicons.min.css" rel="stylesheet">
        <link href="css/styleRegistrarseEmpren.css" rel="stylesheet">

        <title>BUSI CONNECT!</title>
    </head>
    <body>
        <section class="contact-box">
            <div class="row no-gutters bg-dark">
                <div class="col-xl-5 col-lg-12 register-bg">
                    <div class="position-absolute testiomonial p-4">
                        <h3 class="font-weight-bold ">La evolución de tu emprendimiento.</h3>
                        <p class="lead ">La nueva etapa de la revolución entre emprendedores se aproxima.</p>
                    </div>
                </div>
                <div class="col-xl-7 col-lg-12 d-flex">
                    <div class="container align-self-center p-6">
                        <h1 class="font-weight-bold mb-3">Crea tu cuenta gratis como emprendedor.</h1>
                        <div class="form-group">
                            <button class="btn btn-outline-dark d-inline-block  mr-2 mb-3 width-100"><i class="icon ion-logo-google lead align-middle mr-2"></i> Google </button>
                            <button class="btn btn-outline-dark d-inline-block  mb-3 width-100"><i class="icon ion-logo-facebook lead align-middle mr-2"></i> Facebook</button>
                        </div>
                        <p class="text-muted mb-5">Ingresa la siguiente información para registrarte.</p>

                        <form action="<%= request.getContextPath() %>/EmprendimientoServlet" method="post">
                            <div class="form-row mb-2">
                                <div class="form-group col-md-6">
                                    <label class="font-weight-bold">Nombre del emprendimiento <span class="text-danger">*</span></label>
                                    <input type="text" class="form-control" placeholder="Tu nombre" name="nombre">
                                </div>
                            </div>
                            <div class="form-group mb-3">
                                <label class="font-weight-bold">Correo electrónico <span class="text-danger">*</span></label>
                                <input type="email" class="form-control" placeholder="Ingresa tu correo electrónico" name="correo">
                            </div>
                            <div class="form-group mb-3">
                                <label class="font-weight-bold">Contraseña <span class="text-danger">*</span></label>
                                <input type="text" class="form-control" placeholder="Ingresa una contraseña" name="contraseña">
                            </div>
                            <div class="form-group mb-5">
                                <div class="form-check">
                                    <input class="form-check-input" type="checkbox">
                                    <label class="form-check-label text-muted">Al seleccionar esta casilla aceptas nuestro aviso de privacidad y los términos y condiciones</label>
                                </div>
                            </div>
                            <button class="btn btn-primary width-100">Regístrate</button>
                        </form>
                        <small class="d-inline-block text-muted mt-5">Todos los derechos reservados|patrones y gente melita| © 2021 </small>
                    </div>
                </div>
            </div>
        </section>

        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </body>
</body>


</html>