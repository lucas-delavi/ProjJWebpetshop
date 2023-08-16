
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/css/bootstrap.min.css"
              integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
        <link rel="stylesheet" href="css/estilo.css">        
    </head>
    <body>
        <h2>Cadastro de funcionário</h2>
        <form action="cadastrar_funcionario.jsp" method="POST"> 
            <label>
                Nome: 
                <input type="text" name="txtNome">
            </label>
            <br>
            <label>
                CPF: 
                <input type="text" name="txtCpf">
            </label>
            <br>
            <label>
                Telefone: 
                <input type="text" name="txtTelefone">
            </label>
            <br>
            <label>
                Endereço: 
                <input type="text" name="txtEndereco">
            </label>
            <br>
            <label>
                Cidade: 
                <input type="text" name="txtCidade">
            </label>
            <br>
            <label>
                E-mail: 
                <input type="text" name="txtEmail">
            </label>
            <br>
            <label>
                Senha: 
                <input type="text" name="txtSenha">
            </label>
            <input type="submit" class="btn btn-success" value="Cadastrar">
        </form> 
        <div class="container">
            <a href="listar_funcionario_page.jsp"><button class="btn btn-info btn-lg" id="btn-cancelar">Cancelar</button></a>
        </div>
    </body>
</html>
