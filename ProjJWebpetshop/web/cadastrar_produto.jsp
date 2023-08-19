

<%@page import="br.edu.qi.DAO.ProdutoDAO"%>
<%@page import="br.edu.qi.DTO.Produto"%>
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
            Produto objProduto = new Produto();
            objProduto.setNome(request.getParameter("txtNome"));
            objProduto.setPreco(Float.parseFloat(request.getParameter("txtPreco")));
            objProduto.setDisponibilidade(Boolean.parseBoolean(request.getParameter("txtDisponibilidade")));
            
            ProdutoDAO objProdutoDAO = new ProdutoDAO();
            objProdutoDAO.cadastrarProduto(objProduto);
        %>
    </body>
</html>
