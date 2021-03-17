/*
 * Classe de connexion à la base de données mysql Imagin
 * 20/01/2021
 * author : Garbaciak
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Zakina
 */
public class ConnexionBdd {
    
    public static Connection connection=null;
    public static Statement st=null;
    public static ResultSet rs=null;
    
    
    // Méthode de création et d'ouverture de la connexion
    public static Connection ouvrirConnexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");                  
        } catch (ClassNotFoundException e) {
            e.printStackTrace();         
        }     
        try {
            //obtention de la connexion
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/imagin","root","");
            System.out.println("Connexion OK");
           
        } catch (SQLException e) {
            e.printStackTrace();
        }            
        return connection ;
     
    }

    
    // Méthode de fermeture du resultset
    public static void fermerConnexion(ResultSet rs)
    {
        if(rs!=null)
        {
            try
            {
                rs.close();
            }
            catch(Exception e)
            {
        	System.out.println("Erreur lors de la fermeture d’une connexion dans fermerConnexion(ResultSet)");
            }
        }
    }

    // Méthode de fermeture du statement
    public static void fermerConnexion(Statement stmt)
    {
        if(stmt!=null)
        {
            try
            {
                stmt.close();
            }
            catch(Exception e)
            {
                System.out.println("Erreur lors de la fermeture d’une connexion dans fermerConnexion(Statement)");
            }
        }
    }

    /// Méthode de fermeture de la connexion
    public static void fermerConnexion(Connection con)
    {
        if(con!=null)
        {
            try
            {
                con.close();
                System.out.println("Fermeture Connexion OK");
            }
            catch(Exception e)
            {
                System.out.println("Erreur lors de la fermeture d’une connexion dans fermerConnexion(Connection)");
            }
        }
    } 
}