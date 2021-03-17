/**
 * Classe de ProjetDAO
 * 15/03/2021
 * @author Garbaciak
 */
package DAO;


import static DAO.SalarieDAO.requete;
import imagein.modele.Projet;
import imagein.modele.Salarie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ProjetDAO {
    Connection connection=null;
    static PreparedStatement requete=null;
    static ResultSet rs=null;

public static Projet getProjet(Connection connection , String code) throws SQLException{
    Projet unProjet = new Projet();
    try 
    {
        requete=connection.prepareStatement("SELECT pro_responsable,pro_intitule,pro_dtdebut,pro_montantprevu , sal_nom ,sal_matricule ,sal_prenom FROM SALARIE, PROJET WHERE pro_responsable=sal_matricule AND pro_responsable = ?"); 
        requete.setString(1, code);
        rs=requete.executeQuery() ;
        if( rs.next()){
            unProjet.setCode(rs.getString("pro_responsable"));
            unProjet.setIntitule(rs.getString("pro_intitule")) ;
            unProjet.setDtDebut(rs.getString("pro_dtdebut"));
            unProjet.setMontantPrevu(rs.getInt("pro_montantprevu"));
            
            Salarie unSalarie = new Salarie();
            unSalarie.setMatricule(rs.getString("sal_matricule"));
            unSalarie.setPrenom(rs.getString("sal_prenom")) ;
            unSalarie.setNom(rs.getString("sal_nom"));
            unProjet.setLeSalarie(unSalarie);

        }
        ConnexionBdd.fermerConnexion(rs) ;
        ConnexionBdd.fermerConnexion(requete) ;
    }
    catch (SQLException e){
        e.printStackTrace();
    }
    return unProjet;
}
public static int addProjet(Connection connection , Projet unProjet) throws SQLException{
    int resultatUpdate =-1 ;
    
        try{
        requete = connection.prepareStatement("INSERT INTO projet SET PRO_CODE =? , PRO_RESPONSABLE=? , PRO_INTITULE=?, PRO_DTDEBUT=? , PRO_MONTANTPREVU=?" );
        
        requete.setString(1, unProjet.getCode());
        requete.setString(3, unProjet.getIntitule());
        requete.setString(2, unProjet.getLeSalarie().getMatricule());
        requete.setString(4, unProjet.getDtDebut());
        requete.setInt(5, unProjet.getMontantPrevu());
        
        resultatUpdate = requete.executeUpdate();
        ConnexionBdd.fermerConnexion(rs); 
        ConnexionBdd.fermerConnexion(requete);
        
    }
    catch(SQLException e){
        e.printStackTrace();
       
    }
    return resultatUpdate;
    
    }

}
