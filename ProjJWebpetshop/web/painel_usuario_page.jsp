

<%@page import="br.edu.qi.DTO.Animal"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.edu.qi.DAO.AnimalDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Painel</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/css/bootstrap.min.css"
              integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
        <link rel="stylesheet" href="css/estilo.css">
    </head>
    <body>
        <header>
            <div class="container" id="container-login">
                <a href="index.html"><button type="button" class="btn btn-primary navbar-btn">Sair</button></a>
            </div>

            <div class="page-header">
                <h1>Animania Pet Shop <small>Cuidando do seu pet</small></h1>
            </div>
        </header>
        <main id="userpage">                           
            
            <article class="jumbotron" id="container-userpage">
            <!-- Single button -->
            <div class="btn-group">
                <button type="button" class="btn btn-primary btn-lg dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Animal <span class="caret"></span>
                </button>
                <ul class="dropdown-menu">
                    <li><a href="cadastrar_animal_page.jsp">Novo</a></li>
                    <li><a href="listar_animal_page.jsp">Listar</a></li>
                </ul>
            </div>

            <!-- Single button -->
            <div class="btn-group">
                <button type="button" class="btn btn-primary btn-lg dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Cliente <span class="caret"></span>
                </button>
                <ul class="dropdown-menu">
                    <li><a href="cadastrar_cliente_page.jsp">Novo</a></li>
                    <li><a href="#">Listar</a></li>
                </ul>
            </div>

            <!-- Single button -->
            <div class="btn-group">
                <button type="button" class="btn btn-primary btn-lg dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Funcionário <span class="caret"></span>
                </button>
                <ul class="dropdown-menu">
                    <li><a href="cadastrar_funcionario_page.jsp">Novo</a></li>
                    <li><a href="#">Listar</a></li>
                </ul>
            </div>

            <!-- Single button -->
            <div class="btn-group">
                <button type="button" class="btn btn-primary btn-lg dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Produto <span class="caret"></span>
                </button>
                <ul class="dropdown-menu">
                    <li><a href="cadastrar_produto_page.jsp">Novo</a></li>
                    <li><a href="#">Listar</a></li>
                </ul>
            </div>

            <!-- Single button -->
            <div class="btn-group">
                <button type="button" class="btn btn-primary btn-lg dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Serviço <span class="caret"></span>
                </button>
                <ul class="dropdown-menu">
                    <li><a href="cadastrar_servico_page.jsp">Novo</a></li>
                    <li><a href="#">Listar</a></li>
                </ul>
            </div>
            </article>

        </main>                
        <script src='http://code.jquery.com/jquery-2.1.3.min.js'></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>   
    </body>
</html>
