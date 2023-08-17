
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
        <div class="form-page">
        <div class="form-model">
        <h2>Cadastro de animal</h2>
        <form action="cadastrar_animal.jsp" method="POST"> 
            
            <label>
                Nome: 
                <input class="form-control" type="text" name="txtNome">
            </label>
            <br>
            <label>
                Espécie: 
                <input class="form-control" type="text" name="txtEspecie">
            </label>
            <br>
            <label>
                Raça: 
                <input class="form-control" type="text" name="txtRaca">
            </label>
            <br>
            <label>
                Peso: 
                <input class="form-control" type="text" name="txtPeso">
            </label>
            <br>
            <label>
                Sexo: 
                <input class="form-control" type="text" name="txtSexo">
            </label>
            <br>
            <label>
                Tutor: 
                <input class="form-control" type="text" name="txtTutor">
            </label>
            <br>
            <br>
            <input type="submit" class="btn btn-success btn-lg" style="margin-left: 50px" value="Cadastrar">             
        </form>
        <a href="painel_usuario_page.jsp"><button class="btn btn-danger btn-lg" style="margin-top: 10px">Cancelar</button></a>

        
        </div>
        </div>
    </body>
</html>
