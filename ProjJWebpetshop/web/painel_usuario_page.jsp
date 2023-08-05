

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
			<button type="button" class="btn btn-info navbar-btn">Sair</button>
            </div>

            <div class="page-header">
			<h1>Animania Pet Shop <small>Cuidando do seu pet</small></h1>
            </div>
        </header>
        <main>
            <div class =" col-lg-6 col-lg-offset-4 ">
                
                <div class="btn-group">
                    <button type="button" class="btn btn-primary btn-lg dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                         Animais <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu">
                      <li><a href="#">Cadastrar</a></li>
                      <li><a href="#">Listar</a></li>
                    </ul>
                </div>
                <div class="btn-group">
                    <button type="button" class="btn btn-primary btn-lg dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                         Clientes <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu">
                      <li><a href="#">Cadastrar</a></li>
                      <li><a href="#">Listar</a></li>
                    </ul>
                </div>
                <div class="btn-group">
                    <button type="button" class="btn btn-primary btn-lg dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                         Serviços <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu">
                      <li><a href="#">Cadastrar</a></li>
                      <li><a href="#">Listar</a></li>
                    </ul>
                </div>
                <div class="btn-group">
                    <button type="button" class="btn btn-primary btn-lg dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                         Produtos <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu">
                      <li><a href="#">Cadastrar</a></li>
                      <li><a href="#">Listar</a></li>
                    </ul>
                </div>
                <div class="btn-group">
                    <button type="button" class="btn btn-primary btn-lg dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                         Funcionários <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu">
                      <li><a href="#">Cadastrar</a></li>
                      <li><a href="#">Listar</a></li>
                    </ul>
                </div>
        </div>
            
                       
        </main>
        <script src='http://code.jquery.com/jquery-2.1.3.min.js'></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
    </body>
</html>
