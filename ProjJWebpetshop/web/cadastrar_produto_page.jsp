

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
        <h2>Cadastro de produto</h2>
        <form action="cadastrar_produto.jsp" method="POST"> 
            <label>
                Nome: 
                <input type="text" name="txtNome">
            </label>
            <br>
            <label>
                Preço: 
                <input type="text" name="txtPreco">
            </label>
            <br>
            <label>
                Disponibilidade: 
                <input type="text" name="txtDisponibilidade">
            </label>
            <input type="submit" class="btn btn-success" value="Cadastrar">
        </form>
        <div class="container">
            <a href="listar_produto_page.jsp"><button class="btn btn-info btn-lg" id="btn-cancelar">Cancelar</button></a>
        </div>
    </body>
</html>
