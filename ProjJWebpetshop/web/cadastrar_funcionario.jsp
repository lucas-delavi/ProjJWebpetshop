

<%@page import="br.edu.qi.DAO.FuncionarioDAO"%>
<%@page import="br.edu.qi.DTO.Funcionario"%>
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
           Funcionario objFuncionario = new Funcionario();
           objFuncionario.setNome(request.getParameter("txtNome"));
           objFuncionario.setCpf(request.getParameter("txtCpf"));
           objFuncionario.setTelefone(Long.parseLong(request.getParameter("txtTelefone")));
           objFuncionario.setEndereco(request.getParameter("txtEndereco"));
           objFuncionario.setCidade(request.getParameter("txtCidade"));
           objFuncionario.setEmail(request.getParameter("txtEmail"));
           objFuncionario.setSenha(request.getParameter("txtSenha"));
           
           FuncionarioDAO objFuncionarioDAO = new FuncionarioDAO();
           objFuncionarioDAO.cadastrarFuncionario(objFuncionario);
        %>
    </body>
</html>
