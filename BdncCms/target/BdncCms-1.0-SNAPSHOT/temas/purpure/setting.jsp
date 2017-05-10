<%-- 
    Document   : blog.jsp
    Created on : 07/05/2017, 20:47:10
    Author     : PC-CASA
--%>

<%@page import="br.edu.ifpb.bdnc.valueobjects.User"%>
<%@page import="br.edu.ifpb.bdnc.valueobjects.Tema"%>
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

        <header style="">
            <div class="container" >
                <div class="row" style="">
                    <div class="col-xs-12 col-sm-6 col-md-8 col-lg-8">
                        <a href="#"><h1 class="texto tamtex1">Alguma informação aqui</h1></a>
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
                <a href="#" class="navbar-brand" style=" ">Alguma coisa aqui</a>
            </div>
            <img src="img/imagem.jpg" class="img-blog" style=" ">
        </nav>

        <section class="container">
            <div class="menu-left">
                <h3><a href="#">Meus Blogs</a></h3>
                <h3><a href="../../setting.jsp">Nova página</a></h3>
                <h3><a href="#"></a></h3>
                <h3><a href="#"></a></h3>
                <h3><a href="temas.html">Temas</a></h3>
                <h3><a href="#">Perfil</a></h3>
                <h3><a href="../../logoutservlet.do">Sair</a></h3>
            </div>
            <div class="content-center">
                <h4 style="margin: 0 auto;"></h4>
                <form  method="post" action="../../atualizarpost.do" class="form">
                    <div class="form-group">
                        <input type="text" name="titulo" value="${Blog.titulo}" class="form-control" placeholder="Título do blog">
                        <textarea type="text" name="msg-boasvindas" class="form-control"  rows="15" placeholder="Deseje as boas vindas aos seus usuários">${Blog.msgBoasVindas}</textarea>
                        <textarea type="text" name="sobre" class="form-control" rows="15" placeholder="Fale um pouco sobre o trabalho de vocês!">${Blog.descricao}</textarea>
                        <button type="submit" class="btn btn-default">Atualizar</button>
                    </div>
                </form>
            </div>

        </section>

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

