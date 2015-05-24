package Servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Bean.Compte;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author macbookpro
 */
public class TraitementBank extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Compte c1 = new Compte(1, "mehdi", 100);
        Compte c2 = creercompte(2, "agouzal", 100);
        PrintWriter out = response.getWriter();
        out.write("result------"+request.getParameter("operation"));
        if(request.getParameter("operation").equals("retrait")){
            retraitcompte(c1, Float.parseFloat(request.getParameter("mont1")));
            request.setAttribute("result", c1);
        }else if(request.getParameter("operation").equals("versement")){
            versercompte(c1, Float.parseFloat(request.getParameter("mont1")));
            request.setAttribute("result", c1);
        }else if(request.getParameter("operation").equals("virement")){
            transfertargent(c1, c2, Float.parseFloat(request.getParameter("mont1")));
            request.setAttribute("result1", c1);
            request.setAttribute("result2", c2);
        }
        this.getServletContext().getRequestDispatcher( "/WEB-INF/traitement.jsp" ).forward( request, response );
    }

   public Compte creercompte(int id,String prop,float solde){
        return new Compte(id, prop, solde);
    }
    
    public void versercompte(Compte c1,float montant){
        c1.setSolde(c1.getSolde()+montant);
    }
    
    public void retraitcompte(Compte c1,float montant){
        if(c1.getSolde()-montant>=0) {
        c1.setSolde(c1.getSolde()-montant);
        } else {
            System.out.println("Fonds Insuffisant");
        }
    }
    
    public void transfertargent(Compte cptexp, Compte cptdest , float montant) {
        if(cptexp.getSolde()-montant>=0) {
        cptexp.setSolde(cptexp.getSolde()-montant);
        cptdest.setSolde(cptdest.getSolde()+montant);
        } else {
            System.out.println("Fonds Insuffisant");
        } 
    }
    
    public void afficher(Compte c1){
        System.out.println("Identifiant : "+c1.getId());
        System.out.println("Propriétaire : "+c1.getProprietaire());
        System.out.println("Solde : "+c1.getSolde());
    }

}
