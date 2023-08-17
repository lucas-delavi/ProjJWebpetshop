

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
            <%
                    AnimalDAO objAnimalDAO = new AnimalDAO();

                    ArrayList<Animal> l = objAnimalDAO.listarTodosAnimais();

                    for (int i = 0; i < l.size(); i++) {
                        out.print("<div class='container jumbotron'><p>Código: " + l.get(i).getIdanimal() + "</p>");
                        out.print("<p>Nome: " + l.get(i).getNome() + "</p>");
                        out.print("<p>Espécie: " + l.get(i).getEspecie()+ "</p>");
                        out.print("<p>Raça: " + l.get(i).getRaca()+ "</p>");
                        out.print("<p>Peso: " + l.get(i).getPeso()+ "</p>");
                        out.print("<p>Sexo: " + l.get(i).getSexo()+ "</p>");
                        out.print("<p>Tutor: " + l.get(i).getTutor()+ "</p><br>");

                        out.print("<a href='excluir_contato_page.jsp?"
                                + "codigo=" + l.get(i).getIdanimal()+ ""
                                + "&nome=" + l.get(i).getNome() + ""
                                + "&especie=" + l.get(i).getEspecie()+ ""
                                + "&raca=" + l.get(i).getRaca()+ ""
                                + "&peso=" + l.get(i).getPeso()+ ""
                                + "&sexo=" + l.get(i).getSexo()+ ""
                                + "&tutor=" + l.get(i).getTutor()+ "'><button class='btn btn-danger'>Excluir</button></a>"
                                );

                        out.print("<a href='alterar_contato_page.jsp?"
                                + "codigo=" + l.get(i).getIdanimal()+ ""
                                + "&nome=" + l.get(i).getNome() + ""
                                + "&especie=" + l.get(i).getEspecie()+ ""
                                + "&raca=" + l.get(i).getRaca()+ ""
                                + "&peso=" + l.get(i).getPeso()+ ""
                                + "&sexo=" + l.get(i).getSexo()+ ""
                                + "&tutor=" + l.get(i).getTutor()+ "'><button class='btn btn-warning'>Alterar</button></a></div>"); 
                    }
                %>
        </main>
    </body>
</html>
