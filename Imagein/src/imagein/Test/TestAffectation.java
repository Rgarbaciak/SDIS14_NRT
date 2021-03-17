
import DAO.ConnexionBdd;
import DAO.SalarieDAO;
import imagein.modele.Affectation;
import imagein.modele.Projet;
import imagein.modele.Salarie;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
* date du programme
* 18/01/2021
* objet du programme
* Classe metier TestAffectation
* @author Garbaciak
*/
public class TestAffectation {
 public static void main(String[] args) throws SQLException {
 	
        /*Affectation affectation1= new Affectation("1701", 32);
 	
        
        Salarie laSal= new Salarie("Dupont","Dupont" , 25000, "") ;
        affectation1.setLeSalarie(laSal);
        
       
        
        
        
        
        Projet leproj= new Projet("a","z" , "e" ,50) ;
        affectation1.setLeProjet(leproj);
        System.out.println(affectation1.getAnneesemaine() +" "+ affectation1.getTempsPasse() + " " + affectation1.getLeSalarie().getNom() + " " + affectation1.getLeProjet().getIntitule());

        
        Connection con = ConnexionBdd.ouvrirConnexion();
        ArrayList<Salarie> lesSalaries =SalarieDAO.getLesSalaries(con);
    
        for (Salarie unSalarie : lesSalaries ){
 System.out.println (unSalarie.getNom() + " " + unSalarie.getPrenom());
 }
        ConnexionBdd.fermerConnexion(con);
        
        
 */
        
        Connection con= ConnexionBdd.ouvrirConnexion();
        Salarie unSalarie = SalarieDAO.getSalarieByMatricule(con,"A18");
        unSalarie.setNom("ELKANTE");
        System.out.println("Resultat de l'update = " + SalarieDAO.updateSalarie(con, unSalarie));
 }
 }