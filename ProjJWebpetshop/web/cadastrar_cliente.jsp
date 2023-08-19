
<%@page import="br.edu.qi.DAO.ClienteDAO"%>
<%@page import="br.edu.qi.DTO.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta http-equiv="refresh" content="0.001; painel_usuario_page.jsp">
    </head>
    <body>       
        <%
           Cliente objCliente = new Cliente();
           objCliente.setNome(request.getParameter("txtNome"));
           objCliente.setCpf(request.getParameter("txtCpf"));
           objCliente.setTelefone(Long.parseLong(request.getParameter("txtTelefone")));
           objCliente.setEndereco(request.getParameter("txtEndereco"));
           objCliente.setCidade(request.getParameter("txtCidade"));
           
           ClienteDAO objClienteDAO = new ClienteDAO();
           objClienteDAO.cadastrarCliente(objCliente);
        %>
    </body>

</html>
