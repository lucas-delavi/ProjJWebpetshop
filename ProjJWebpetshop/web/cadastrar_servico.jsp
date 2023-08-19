
<%@page import="br.edu.qi.DAO.ServicoDAO"%>
<%@page import="br.edu.qi.DTO.Servico"%>
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
        Servico objServico = new Servico();
        objServico.setNome(request.getParameter("txtNome"));
        objServico.setPreco(Float.parseFloat(request.getParameter("txtPreco")));
        objServico.setDia(request.getParameter("txtDia"));
        objServico.setHorario(request.getParameter("txtHorario"));
        
        ServicoDAO objServicoDAO = new ServicoDAO();
        objServicoDAO.cadastrarServico(objServico);
        %>
    </body>
</html>
