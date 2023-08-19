

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
       
        <div class="form-page">
            <div class="form-model">
                <h2>Deseja alterar os dados?</h2>
                <form action="alterar_animal.jsp" method="POST">
                    <label>
                        Código:
                        <input class="form-control" type="number" name="txtIdanimal" value="<%=request.getParameter("idanimal")%>">
                    </label>
                    <br>
                    <label>
                        Nome:
                        <input class="form-control" type="text" name="txtNome" value="<%=request.getParameter("&nome")%>">
                    </label>
                    <br>
                    <label>
                        Espécie:
                        <input class="form-control" type="text" name="txtEspecie" value="<%=request.getParameter("&especie")%>">
                    </label>
                    <br>
                    <label>
                        Raça:
                        <input class="form-control" type="text" name="txtRaca" value="<%=request.getParameter("&raca")%>">
                    </label>
                    <br>
                    <label>
                        Peso:
                        <input class="form-control" type="number" name="txtPeso" value="<%=request.getParameter("&peso")%>">
                    </label>
                    <br>
                    <label>
                        Sexo:
                        <input class="form-control" type="text" name="txtSexo" value="<%=request.getParameter("&sexo")%>">
                    </label>
                    <br>
                    <label>
                        Tutor:
                        <input class="form-control" type="number" name="txtTutor" value="<%=request.getParameter("&tutor")%>">
                    </label>
                    <br>
                    <br>
                    <input type="submit" class="btn btn-warning" value="Alterar" style="margin-left: 72px">

                </form>
                <a href="listar_animal_page.jsp"><button class="btn btn-danger btn-lg" style="margin-top: 10px">Cancelar</button></a>
            </div>
        </div>
    </body>
</html>
