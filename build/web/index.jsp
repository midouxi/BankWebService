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
        <h1>Operation Bank</h1>
        <form  action="/BankWebService/TraitementBank" method="POST"/>
            Compte Expéditeur <select class="form-control" name="compte" tabindex="1">
                <option value="" selected>C1</option></select>---------------- Compte Destinataire <select class="form-control" name="compte"  tabindex="1">
                <option value="" selected>C2</option></select> <br /><br />
            Montant<input type="text" name="mont1"/> --------------------------- Montant <input type="text" name="mont2"/> <br /><br />
            <input type="checkbox" name="operation" value="retrait" onclick=""/> Retrait <br /><br />
            <input type="checkbox" name="operation" value="versement"/> Versement <br /><br />
            <input type="checkbox" name="operation" value="virement"/> Virement <br /><br />
            <input type="submit" value="Valider" onclick="return confirm('Etes-vous sûr que vous voulez exécuter cette opération?')"/>
        </form>
        
            
    </body>
</html>

    