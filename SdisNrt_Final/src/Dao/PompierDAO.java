/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import static Dao.LoginDAO.rs;
import Modele.Caserne;
import Modele.Grade;
import Modele.Pompier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author ts1sio
 */
public class PompierDAO {
    Connection cnt=null;
    static PreparedStatement requete=null;
    static ResultSet rs=null;
    
    public static Pompier getPompierbyId(Connection cnt, int id) {
        Pompier unPompier = new Pompier();
        try{
            requete=cnt.prepareStatement("SELECT * FROM `pompier` WHERE `pom_id`=?");
            requete.setInt(1, id);
            rs=requete.executeQuery();
            if(rs.next()){
                unPompier.setMatricule(rs.getString("pom_mat"));
                unPompier.setNom(rs.getString("pom_nom"));
                unPompier.setPrenom(rs.getString("pom_prenom"));
                
            }
            ConnexionBdd.fermerConnexion(rs);
            ConnexionBdd.fermerConnexion(requete);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return unPompier;
        
    }
    public static Pompier getPompierbyNom(Connection cnt) {
        Pompier unPompier = new Pompier();
        try{
            requete=cnt.prepareStatement("SELECT POM_NOM FROM `pompier`");
            
            rs=requete.executeQuery();
            while(rs.next()){
               
                unPompier.setNom(rs.getString("pom_nom"));
                
                
            }
            ConnexionBdd.fermerConnexion(rs);
            ConnexionBdd.fermerConnexion(requete);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return unPompier;
        
    }
    
    
    public static Pompier getLesFoncs(Connection cnt, int id){
        Pompier unPompier = new Pompier();
         try{
            requete=cnt.prepareStatement("SELECT * FROM `pompier`, fonction WHERE `pom_id`=?");
            requete.setInt(1, id);
            rs=requete.executeQuery();
            if(rs.next()){
                unPompier.setMatricule(rs.getString("pom_mat"));
                unPompier.setNom(rs.getString("pom_nom"));
                unPompier.setPrenom(rs.getString("pom_prenom"));
                
              /* unPompier.setLesFonctions();*/
                
            }
            ConnexionBdd.fermerConnexion(rs);
            ConnexionBdd.fermerConnexion(requete);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return unPompier;
        
    }
    
     public static int addPompier(Connection cnt, Pompier p){
           int resultatUpdate= -1;
        try{
            requete=cnt.prepareStatement("INSERT INTO pompier(pom_respId, pom_nom, pom_prenom, pom_sexe, pom_dtNaissance, pom_tel, pom_mat,pom_numBip,gra_id,cas_id )VALUES ('1',?,?,?,?,?,?,?,?,'1','1' )");
          System.out.println("req=" + requete);
            
            requete.setString(1,p.getNom());
            requete.setString(2,p.getPrenom());
            requete.setString(3,p.getSexe());
            requete.setString(4,p.getDteNaissance());
            requete.setString(5,p.getTel());
            requete.setString(5,p.getMatricule());
            requete.setString(5,p.getBip());

           
            resultatUpdate = requete.executeUpdate();  
            
            ConnexionBdd.fermerConnexion(rs);
            ConnexionBdd.fermerConnexion(requete);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return resultatUpdate;
        
    }
        public static Pompier afficheInfo(Connection cnt , String list){
       Pompier unPompier= new Pompier();
        try{
            requete=cnt.prepareStatement("SELECT * FROM pompier,grade,caserne WHERE POM_NOM=? ");
            requete.setString(1, list);
            rs=requete.executeQuery();
            if(rs.next()){
                
               
                unPompier.setNom(rs.getString("POM_NOM"));
                unPompier.setPrenom(rs.getString("POM_PRENOM"));
                unPompier.setSexe(rs.getString("POM_SEXE"));
                unPompier.setDteNaissance(rs.getString("POM_dtNaissance"));
                unPompier.setTel(rs.getString("POM_TEL"));
                unPompier.setMatricule(rs.getString("POM_MAT"));
                unPompier.setBip(rs.getString("pom_numBip"));
                
                Grade unGrade = new Grade();
                unGrade.setLibelle(rs.getString("gra_libelle"));
                
                Caserne uneCaserne =new Caserne();
                uneCaserne.setNomCas(rs.getString("cas_nom"));
                
                unPompier.setUneCaserne(uneCaserne);
                unPompier.setUnGrade(unGrade);
            }
            ConnexionBdd.fermerConnexion(rs);
            ConnexionBdd.fermerConnexion(requete);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return unPompier;
       
        
        }
        
       
        
    /*
                int resultatUpdate = BD.UpdateQuery("INSERT INTO pompier(pom_respId, pom_nom, pom_prenom, pom_sexe, pom_dtNaissance, pom_tel, pom_mat,pom_numBip,gra_id,cas_id,pom_fonc )VALUES (?,?,?,?,?,?,?,?,?,?,? )");

    public static PompierDAO updatePompier(String prenom, String date, String nom,String bip){
       
        try{
            ConnexionBdd BD= new ConnexionBdd();
            int resultatUpdate = BD.UpdateQuery("UPDATE pompier SET POM_PRENOM='"+prenom+"', POM_DTNAISSANCE='"+date+"',POM_NUMBIP='"+bip+"'WHERE POM_NOM='"+nom+"' ");
            if (resultatUpdate == -1){
                 ListePompier liste =new ListePompier();
                 JOptionPane.showMessageDialog(liste,"Modification échoué !");
                
            }
            else if(resultatUpdate == 1){
                ListePompier liste =new ListePompier();            
                JOptionPane.showMessageDialog(liste,"Modification reussie !");
            }
        }
           
       
        catch(Exception e){
             System.out.println("Error " + e.getMessage());
        }
        return null;
    
    
    }  
    
    
    
    public static PompierDAO deletePompier(String list){
    
    try{
            ConnexionBdd BD= new ConnexionBdd();
            int resultatUpdate = BD.UpdateQuery("DELETE FROM pompier WHERE POM_NOM='"+list+"' ");
            if (resultatUpdate == -1){
                ListePompier liste =new ListePompier();            
                JOptionPane.showMessageDialog(liste,"Suppresion échoué !");
                
            }
            else if(resultatUpdate == 1){
                 ListePompier liste =new ListePompier();
                 JOptionPane.showMessageDialog(liste,"Suppresion reussie !");
            }
                 
           
       }
        catch(Exception e){
             System.out.println("Error " + e.getMessage());
        }
     return null;
    }
 */   
}
    