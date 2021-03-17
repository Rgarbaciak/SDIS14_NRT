/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagein.Test;

import DAO.ConnexionBdd;
import DAO.ProjetDAO;
import imagein.modele.Projet;
import imagein.modele.Salarie;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author ts1sio
 */
public class TestProjetDao {
    public static void main(String[] args) throws SQLException {
     Connection con= ConnexionBdd.ouvrirConnexion();
        Projet unProjet = ProjetDAO.getProjet(con,"A41");
        unProjet.setIntitule(" Finarrgora ");
        unProjet.setCode("485");
        unProjet.setDtDebut(" 2021-03-13 ");
        unProjet.setMontantPrevu( 80000 );
        Salarie unSalarie = new Salarie();
        unSalarie.setMatricule(" A18" );
        System.out.println(" Le nom du projet est : " + unProjet.getIntitule()+ " Le responsable est :" +unSalarie.getMatricule() + " Résultat de l'ajout = " +ProjetDAO.addProjet(con,unProjet) );
       
       
        
        
    
}}

