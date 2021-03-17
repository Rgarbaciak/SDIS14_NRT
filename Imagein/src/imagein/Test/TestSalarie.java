package imagein.Test;


import imagein.modele.Affectation;
import imagein.modele.Categorie;
import imagein.modele.Compte;
import imagein.modele.Projet;
import imagein.modele.Salarie;


/*
*
* date du programme
* 18/01/2021
* objet du programme
* Classe metier Salarie
* @author Garbaciak
*/
public class TestSalarie {
 public static void main(String[] args) {

 	/*Categorie laCateg= new Categorie("DJAVA" , "developpeur java") ;
 	Projet leProjet=new Projet("1" , "2" ,"3", 4);
 	Compte leCompte = new Compte("1","2");

 	Salarie salarie1 = new Salarie("A19", "Martin", 0,"");
 	salarie1.setPrenom("Damir");
 	laCateg.addUnSalarie(salarie1);

 	Salarie salarie2=new Salarie("A41","Morel", 0,"");
 	salarie2.setPrenom("Lucie") ;
 	laCateg.addUnSalarie(salarie2);
 	salarie2.setSalaire(400);
 	leProjet.addUnSalaries1(salarie2);





 	

 	System.out.println ("Liste des salariÃ©s de la catÃ©gorie " + laCateg.getLibelle());

 	System.out.println ("Liste des salariÃ©s de la catÃ©gorie " + leProjet.getDtDebut());

 	for (Salarie unSal : laCateg.getLesSalaries() ){
         System.out.println(unSal.getNom() + " " + unSal.getPrenom());
         }
        for (Salarie unSal1 : leProjet.getlesSalaries1()) {
         System.out.println(unSal1.getSalaire() + " " + unSal1.getMatricule());
        }*/
       
        
        
        Salarie sal1=new Salarie("Dupont","R",50000,"");
        
        Affectation uneAffec = new Affectation("47" , 0) ;
        uneAffec.setTempsPasse(8) ;
        sal1.addUneAffectation(uneAffec);
        
        System.out.println("Liste" + sal1.getNom());
        for (Affectation uneAffec1:sal1.getlesAffectations()){
     System.out.println(uneAffec1.getAnneesemaine()+ " " + uneAffec1.getTempsPasse()) ;
 }
        

 }

}
