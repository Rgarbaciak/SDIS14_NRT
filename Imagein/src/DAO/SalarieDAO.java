/**
 * Classe de mapping bdd Salarie
 * 20/01/2021
 * @author Garbaciak
 */
package DAO;

import imagein.modele.Categorie;
import imagein.modele.Salarie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SalarieDAO {
    Connection connection=null;
    static PreparedStatement requete=null;
    static ResultSet rs=null;

public static Salarie getSalarieByMatricule(Connection connection , String matricule) throws SQLException{
    Salarie unSalarie = new Salarie();
    try 
    {
        requete=connection.prepareStatement("SELECT sal_matricule , sal_nom , sal_prenom, sal_categorie, cat_libelle FROM SALARIE, CATEGORIE WHERE sal_categorie=cat_code AND sal_matricule = ?"); 
        requete.setString(1, matricule);
        rs=requete.executeQuery() ;
        if( rs.next()){
            unSalarie.setMatricule(rs.getString("sal_matricule"));
            unSalarie.setNom(rs.getString("sal_nom")) ;
            unSalarie.setPrenom(rs.getString("sal_prenom"));
            
            Categorie laCateg = new Categorie();
            laCateg.setCode(rs.getString("sal_categorie"));
            laCateg.setLibelle(rs.getString("cat_libelle")) ;
            unSalarie.setlaCategorie(laCateg);

        }
        ConnexionBdd.fermerConnexion(rs) ;
        ConnexionBdd.fermerConnexion(requete) ;
    }
    catch (SQLException e){
        e.printStackTrace();
    }
    return unSalarie;
}
public static ArrayList<Salarie> getLesSalaries(Connection connection) throws SQLException{
    ArrayList<Salarie> lesSalaries = new ArrayList<Salarie>();
    try
    {
        requete=connection.prepareStatement("SELECT * FROM SALARIE, CATEGORIE WHERE sal_categorie = cat_code ");
        
        rs=requete.executeQuery();
        while (rs.next()){
            Salarie unSalarie =new Salarie();
            unSalarie.setMatricule(rs.getString("sal_matricule"));
            unSalarie.setNom(rs.getString("sal_nom"));
            unSalarie.setPrenom(rs.getString("sal_prenom"));
            
            Categorie uneCategorie= new Categorie();
            uneCategorie.setCode(rs.getString("cat_code")) ;
            uneCategorie.setLibelle(rs.getString("cat_libelle"));
            
            unSalarie.setlaCategorie(uneCategorie); 
            lesSalaries.add(unSalarie);
        }
        ConnexionBdd.fermerConnexion(rs); 
        ConnexionBdd.fermerConnexion(requete);
    }

catch(SQLException e) 
{
    e.printStackTrace();
}
return lesSalaries;
}
public static int updateSalarie(Connection connection , Salarie leSalarie) throws SQLException{
    int resultatUpdate =-1 ;
    try{
        requete = connection.prepareStatement("UPDATE salarie SET SAL_NOM =? , SAL_PRENOM=? , SAl_CATEGORIE=? WHERE SAl_MATRICULE=?");
        
        requete.setString(1, leSalarie.getNom());
        requete.setString(2, leSalarie.getPrenom());
        requete.setString(3, leSalarie.getLaCategorie().getCode());
        requete.setString(4, leSalarie.getMatricule());
        
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