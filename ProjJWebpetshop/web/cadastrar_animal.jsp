

<%@page import="br.edu.qi.DAO.AnimalDAO"%>
<%@page import="br.edu.qi.DTO.Animal"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta http-equiv="refresh" content="3; painel_usuario_page.jsp">
    </head>
    <body>
        <%
           Animal objAnimal = new Animal();
           objAnimal.setNome(request.getParameter("txtNome"));
           objAnimal.setEspecie(request.getParameter("txtEspecie"));
           objAnimal.setRaca(request.getParameter("txtRaca"));
           objAnimal.setPeso(Float.parseFloat(request.getParameter("txtPeso")));
           objAnimal.setSexo(request.getParameter("txtSexo"));
           objAnimal.setTutor(request.getParameter("txtTutor"));
           
           AnimalDAO objAnimalDAO = new AnimalDAO();
           objAnimalDAO.cadastrarAnimal(objAnimal);
        %>
    </body>
</html>
