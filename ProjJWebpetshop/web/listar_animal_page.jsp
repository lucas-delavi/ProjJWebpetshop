

<%@page import="br.edu.qi.ConexaoBD.ConexaoBD"%>
<%@page import="br.edu.qi.DTO.Animal"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.edu.qi.DAO.AnimalDAO"%>
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
        <header id="topo">
            <a href="cadastrar_animal_page.jsp"><button  class="btn btn-success btn-lg">Novo animal</button></a>
            <a href="painel_usuario_page.jsp"><button  class="btn btn-danger btn-lg">Sair</button></a>        
        </header>
        <main>
            <div class="container">
                <h2>Consulta de animais</h2>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Código</th>
                            <th>Nome</th>
                            <th>Espécie</th>
                            <th>Raça</th>
                            <th>Peso</th>
                            <th>Sexo</th>
                            <th>Tutor</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            AnimalDAO objAnimalDAO = new AnimalDAO();
                            ArrayList<Animal> l = objAnimalDAO.listarTodosAnimais();

                            for (int i = 0; i < l.size(); i++) {
                        %>
                        <tr>
                            <td><%=l.get(i).getIdanimal()%></td>
                            <td><%=l.get(i).getNome()%></td>
                            <td><%=l.get(i).getEspecie()%></td>
                            <td><%=l.get(i).getRaca()%></td>
                            <td><%=l.get(i).getPeso()%></td>
                            <td><%=l.get(i).getSexo()%></td>
                            <td><%=l.get(i).getTutor()%></td>
                            <td>
                                <form method="POST" action="alterar_animal_page.jsp">
                                    <button class="btn btn-warning"
                                            value="<%=l.get(i).getIdanimal()%>">
                                        <span class="glyphicon glyphicon-edit" aria-hidden="true"></span>
                                    </button>
                                        <a href="excluir_animal_page.jsp?"><button class="btn btn-danger"
                                            value="<%=l.get(i).getIdanimal()%>">
                                        <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
                                    </button><a/>
                                </form>
                            </td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
            </div>

           
        </main>
    </body>
</html>
