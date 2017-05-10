<%-- 
    Document   : home.jsp
    Created on : 07/05/2017, 20:01:14
    Author     : PC-CASA
--%>

<%@page import="br.edu.ifpb.bdnc.valueobjects.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html >
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js" lang="pt-br"> <!--<![endif]-->
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

        <header style="">
            <div class="container" >
                <div class="row" style="">
                    <div class="col-xs-12 col-sm-6 col-md-8 col-lg-8">
                        <a href="#"><h1 class="texto tamtex1">${Blog.titulo}</h1></a>
                    </div>
                    <div class="hidden-xs col-sm-6 col-md-4 col-lg-4 centrar" >
                        <a href="#"><img class="social" src="img/facebook.png" alt="" style=""></a>
                        <a href="#"><img class="social" src="img/google.png" alt="" style=""></a>
                        <a href="#"><img class="social" src="img/twitter.png" alt="" style=""></a>
                        <a href="#"><img  class="social" src="img/instagram.jpg" alt="" style=""></a>
                        <a href="#"><img class="social" src="img/youtube.png" alt="" style=""></a>
                    </div>
                </div>
            </div>
        </header>

        <!--Barra de Navegacion-->
        <nav class="navbar navbar-default">

            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Cambiar Navegação</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>

            </div>

            <div class="collapse navbar-collapse navbar-ex1-collapse collapse-menu" style="">

                <ul class="nav navbar-nav navbar-right" >
                    <li><a href="home.jsp">Home</a></li>
                    <li><a href="sobre.jsp">Sobre</a></li>
                    <li><a href="contato.jsp">Contato</a></li>
                    <li><a href="blog.jsp">Blog </a></li>
                    <% 
                        User u = (User) session.getAttribute("User");
                        if (u != null) {
                            %>
                    <li><a href="setting.jsp">Configuração </a></li>
                            <%}%>
                </ul>
                <a href="#" class="navbar-brand" style=" ">${Blog.titulo}</a>
            </div>
            <img src="img/imagem.jpg" class="img-blog" style=" ">
        </nav>

        <div class="container">
            <!--Slider-->

            <style type="text/css">
                #form-edit{width: 30%; float: left}
            </style>

            <section >
                

                <div class="container"  style="width: 72%; float: left; padding: 3% 2%" id="edit">
                    <p >
                        ${Blog.msgBoasVindas}
                    </p>

                </div>
            </section>
            <aside style="float: right">
                <form  method="post" action="../../pesquisapostservlet.do?param2=temas/purpure/pesquisa.jsp" class="form-search">
                    <div class="form-group">

                        <input type="text" name="pesquisa" class="form-control" placeholder="Pesquisar">
                        <button type="submit" class="btn btn-default">Pesquisar</button>
                    </div>
                </form>
                <div class="form-group colunistas">
                    <h2>Colunistas</h2>
                    <a href=""><img src="img/img4.png" class=""><span>Nome do colunista</span></a>
                    <a href=""><img src="img/img4.png" class=""><span>Nome do colunista</span></a>
                    <a href=""><img src="img/img4.png" class=""><span>Nome do colunista</span></a>
                    <a href=""><img src="img/img4.png" class=""><span>Nome do colunista</span></a>
                    <a href=""><img src="img/img4.png" class=""><span>Nome do colunista</span></a>
                </div>               
            </aside>

            <!---->
            <section class="content-bottom">
                <div class="row">
                    <div class="col-xs-12 col-sm-12 col-md-4 col-lg-4">
                        <div class="row">
                            <div class="hidden-xs col-sm-3 col-md-6 col-lg-6">
                                <br><br><img src="img/img4.png" class="img-responsive">
                            </div>
                            <div class="col-xs-12 col-sm-9 col-md-6 col-lg-6">
                                <h3>Github</h3><hr>
                                <p align="justify">GitHub es una forja para alojar proyectos utilizando el sistema de control de versiones Git. Utiliza el framework Ruby on Rails por GitHub.<br><a href="#">Leia mais</a></p>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-12 col-sm-12 col-md-4 col-lg-4">
                        <div class="row">
                            <div class="hidden-xs col-sm-3 col-md-6 col-lg-6">
                                <br><br><img src="img/img5.png" class="img-responsive">
                            </div>
                            <div class="col-xs-12 col-sm-9 col-md-6 col-lg-6">
                                <h3>Android Studio</h3><hr>
                                <p align="justify">Android Studio es un entorno de desarrollo integrado (IDE) para el Android plataforma. Está disponible para su descarga en la de Windows, Mac OS X y Linux.<br><a href="#">Leia mais</a></p>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-12 col-sm-12 col-md-4 col-lg-4">
                        <div class="row">
                            <div class="hidden-xs col-sm-3 col-md-6 col-lg-6">
                                <br><br><img src="img/img6.png" class="img-responsive">
                            </div>
                            <div class="col-xs-12 col-sm-9 col-md-6 col-lg-6">
                                <h3>Arduino</h3><hr>
                                <p align="justify">Es una plataforma de hardware libre, basada en una placa con un microcontrolador, diseñada para facilitar el uso de la electrónica en proyectos multidisciplinares.<br><a href="#">Leia mais</a></p>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </div>


        <footer class="" style="position: relative;">
            <div class="container"><br>
                <p>Todos os direitos reservados &copy</p>
                </br></div>
        </footer>


        <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.10.1.min.js"><\/script>')</script>

        <script src="js/vendor/bootstrap.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
