<%-- 
    Document   : setting
    Created on : 05/05/2017, 10:35:11
    Author     : PC-CASA
--%>

<%@page import="br.edu.ifpb.bdnc.valueobjects.User"%>
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
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                        <span class="sr-only"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href="index.jsp" class="navbar-brand" style="border: 1px solid #f5f5f5; color: #fff; ">HOME</a>
                </div>

                <div class="collapse navbar-collapse navbar-ex1-collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="logoutservlet.do" style="background: green; color: #fff; ">Sair</a></li>
                    </ul>
                </div>
            </nav>
        </header>

        <section class="container" ">
            <div class="menu-left">
                <h3><a href="#">Meus Blogs</a></h3>
                <h3><a href="#">Nova página</a></h3>
                <h3><a href="#"></a></h3>
                <h3><a href="#"></a></h3>
                <h3><a href="temas.html">Temas</a></h3>
                <h3><a href="#">Perfil</a></h3>
                <h3><a href="logoutservlet.do">Sair</a></h3>
            </div>

            <div class="content-center">
                <h4>${msg}</h4>
                <form  action="cadastropagservlet.do" method="post" class="form">
                    <div class="form-group">
                        <input type="text" name="titulo" class="form-control" placeholder="Título Aqui">

                        <input type="text" name="descricao" class="form-control" placeholder="Descrição Aqui">

                        <input type="text" name="palavra-chave" class="form-control" placeholder="Palavras-Chave">
                        
                        <input type="text" name="categoria" class="form-control" placeholder="Categoria">

                        <textarea type="text" name="conteudo-post" class="form-control" rows="25" placeholder="Digite aqui o que você pensa"></textarea>
                        
                        <button type="submit" class="btn btn-default">Salvar</button>
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

