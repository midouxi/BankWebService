<%-- 
    Document   : traitement.jsp
    Created on : 17 mai 2015, 12:31:40
    Author     : macbookpro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Bean.Compte" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Interface Bancaire</title>
    </head>
    <body>
        <h1>Resultat de l'opération bancaire Bank</h1>
        <% 
                if(request.getAttribute("result")!=null){
                    Compte c = (Compte) request.getAttribute("result");
                out.println("Identifiant du Client : ");
                out.println(c.getId()); %> <br /><br />
              <%   out.println("Nom du Client : ");
                out.println(c.getProprietaire()); %><br /><br />
              <%   out.println("Solde : ");
                out.println(c.getSolde()); %><br /><br />
               <% }
            
        %>
            
    </body>
</html>
