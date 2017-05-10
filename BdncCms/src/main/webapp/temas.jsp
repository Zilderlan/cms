<%-- 
    Document   : temas
    Created on : 05/05/2017, 10:36:39
    Author     : PC-CASA
--%>

<%
    User user = (User) session.getAttribute("User");
    if (user == null) {
        response.sendRedirect("login.jsp");
    }
%>

<%@page import="br.edu.ifpb.bdnc.valueobjects.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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



        <style type="text/css">
            .container-themas {}
            .themas {width: 80%; margin: 4% 9.5% 6% 9.5%; float: left;}
            .themas img {width: 30%; float: left;}
            .themas .descricao {width: 69%; float: right;}

            .thema-btn {float: left; width: 100%; margin: 1% 0 0 0;}
            .thema-btn .btn{width: 30%;}
        </style>

        <script>
            function abrirPagina(pagina) {
                location.href = pagina;
            }
        </script>

        <c:forEach var="temas" items="${ListTemas}">
            <section class="container container-themas">
                <article class="themas">
                    <div>
                        <img src="${temas.img}">
                    </div>
                    <div class="descricao">
                        <h3>${temas.nome}</h3>
                        <p>${temas.descricao}</p>
                    </div>
                    <div class="thema-btn">
                        <% HttpSession s = request.getSession();
                            s.setAttribute("p", "temas.jsp");%>
                        <button type="button" class="btn btn-default" onclick="abrirPagina('recuperartemaservlet.do?param=${temas.id}')" > Quero este</button>
                    </div>
                </article>  
            </section>
        </c:forEach>

        <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.10.1.min.js"><\/script>')</script>

        <script src="js/vendor/bootstrap.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>

