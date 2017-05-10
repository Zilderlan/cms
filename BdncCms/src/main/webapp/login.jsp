<%-- 
    Document   : login
    Created on : 05/05/2017, 10:33:23
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
            <nav class="navbar navbar1 navbar-default " style="">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a href="index.jsp" class="navbar-brand inicio" style="color: #fff; ">HOME</a>
            </div>
        </nav>
        </header>
        
        <style type="text/css">
       
        </style>

        <div class="container">
	        <section>
                    <form action="loginservlet.do" method="post" class="navbar-form navbar-left login" id="login">
                    <div >
                        <input name="login" type="text" placeholder="Login" value="zilderlan.leite@gmail.com" class="form-control">
                    </div>
                    <div >
                        <input name="password" type="password" value="123456" placeholder="***********" class="form-control">
                    </div>                    
                    <button type="reset" class="btn btn-default">Cancelar</button>
                    <button type="submit" class="btn btn-default">Login</button>
                    <a href="#" onclick="document.getElementById('login').style.display='none';document.getElementById('cadastro').style.display='block';">ou cadastre-se</a>
                </form>
            </section>
            <section>
              
                <form action="cadastrouserservlet.do" method="post" class="navbar-form navbar-left cadastro" id="cadastro">
                    
                    <div >
                        <input type="text" name="nome" placeholder="Nome" class="form-control">
                    </div>
                    <div >
                        <input type="text" name="email" placeholder="E-mail" class="form-control">
                    </div>                    
                    <div >
                        <input type="password" name="password" placeholder="Senha" class="form-control">
                    </div>    
                                  
                    <button type="reset" class="btn btn-default">Limpar</button>
                    <button type="submit" class="btn btn-default">Cadastar</button>
                    <a href="#" onclick="document.getElementById('login').style.display='block';document.getElementById('cadastro').style.display='none';">ou logar-se</a>
                </form>
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
