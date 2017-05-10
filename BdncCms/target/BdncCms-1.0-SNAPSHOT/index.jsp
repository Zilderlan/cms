<%-- 
    Document   : index
    Created on : 05/05/2017, 10:01:26
    Author     : PC-CASA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title></title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width">
        <link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Tangerine">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/main.css">
        <link rel="stylesheet" href="css/style.css">

        <script src="js/vendor/modernizr-2.6.2.min.js"></script>
    </head>
    <body>
        <!--[if lt IE 7]>
            <p class="chromeframe">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> or <a href="http://www.google.com/chromeframe/?redirect=true">activate Google Chrome Frame</a> to improve your experience.</p>
        <![endif]-->

        <!--Header-->
        <header>
            <nav class="navbar navbar-default" style="background: #000; border: none; padding: 1% 1.5% 1% 1%;">
                <div class="navbar-header inicio">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                        <span class="sr-only"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href="index.jsp" class="navbar-brand" style="color: #fff">HOME</a>
                </div>

                <div class="collapse navbar-collapse navbar-ex1-collapse">
                    <ul class="nav navbar-nav">
                        <li><a href="#">Sobre</a></li>
                        <li><a href="#">Contato</a></li>
                        <li ><a href="setting.jsp">Configurações</a>
                        </li>
                    </ul>

                    <style type="text/css">

                    </style>
                    <form class="navbar-form navbar-left">
                        <div class="form-group">
                            <input type="text" class="form-control">
                        </div>
                        <button type="submit" class="btn btn-default">Buscar</button>
                    </form>
                    <div>
                        <ul class="nav navbar-nav navbar-right">
                            <% HttpSession s = request.getSession(); s.setAttribute("p", "index.jsp");%>
                            <li><a href="login.jsp">Login</a></li>
                            
                            <li class="comecar"><a href="buscartodostemasservlet.do" style="color: #fff">COMECE AGORA</a></li>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>

        <div class="container" ">
            <section class="img-container">
                <img src="img/home.jpg" alt="">
            </section>
            <section >
                <div class="row ">
                    <div class="col-xs-12 col-sm-12 col-md-4 col-lg-4">
                        <div class="row">
                            <div class="hidden-xs col-sm-3 col-md-6 col-lg-6">
                                <br><br><img src="img/img4.png" class="img-responsive">
                            </div>
                            <div class="col-xs-12 col-sm-9 col-md-6 col-lg-6">
                                <h3>Github</h3><hr>
                                <p align="justify">Temas e estilos também ajudam a manter seu documento coordenado. Quando você clica em Design e escolhe um novo tema, as imagens, gráficos<br><a href="#">Leia mais...</a></p>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-12 col-sm-12 col-md-4 col-lg-4">
                        <div class="row">
                            <div class="hidden-xs col-sm-3 col-md-6 col-lg-6" >
                                <br><br><img src="img/img5.png" class="img-responsive">
                            </div>
                            <div class="col-xs-12 col-sm-9 col-md-6 col-lg-6">
                                <h3>Android Studio</h3><hr>
                                <p align="justify">Temas e estilos também ajudam a manter seu documento coordenado. Quando você clica em Design e escolhe um novo tema, as imagens, gráficos<br><a href="#">Leia mais...</a></p>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-12 col-sm-12 col-md-4 col-lg-4" style="">
                        <div class="row">
                            <div class="hidden-xs col-sm-3 col-md-6 col-lg-6">
                                <br><br><img src="img/img6.png" class="img-responsive">
                            </div>
                            <div class="col-xs-12 col-sm-9 col-md-6 col-lg-6">
                                <h3>HI-Tec</h3><hr>
                                <p align="justify" style="">ETemas e estilos também ajudam a manter seu documento coordenado. Quando você clica em Design e escolhe um novo tema, as imagens, gráficos <br><a href="#">Leia mais...</a></p>
                            </div> 
                        </div>
                    </div>
                </div>
            </section>
        </div>

        <footer class="color4">
            <div class="container"><br>
                <p>Todos os direitos reservados &copy</p>
                </br></div>
        </footer>

        <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.10.1.min.js"><\/script>')</script>

        <script src="js/vendor/bootstrap.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
