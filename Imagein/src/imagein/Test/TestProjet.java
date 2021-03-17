package imagein.Test;

import imagein.modele.Affectation;
import imagein.modele.Projet;
import imagein.modele.Salarie;

/**
* date du programme
* 18/01/2021
* objet du programme
* Classe metier TestProjet
* @author Garbaciak
*/public class TestProjet {
 public static void main(String[] args) {

 	/*Projet projet1 = new Projet(" P17 "," Finagora ", " 10.01.14 ", 98000);
 	Salarie leSalarie1 = new Salarie("A19", "",0,"") ;

 	projet1.setLeSalarie(leSalarie1) ;
 	System.out.println ( projet1.getCode() + projet1.getIntitule()  +
	projet1.getDtDebut()  + projet1.getMontantPrevu() + " est responsable " + projet1.getLeSalarie().getMatricule());


	for (Projet lesProjets1 : leSalarie1.getLesProjets1() ){
 System.out.println (leSalarie1.getMatricule() + " " + leSalarie1.getSalaire());
 }
*/
         Projet proj1=new Projet("Dupont","R","", 50000);
        
        Affectation uneAffec = new Affectation("47" , 0) ;
        uneAffec.setTempsPasse(8) ;
        proj1.addUneAffectation(uneAffec);
        
        System.out.println("Liste" + proj1.getIntitule());
        for (Affectation uneAffec1:proj1.getlesAffectations1()){
     System.out.println(uneAffec1.getAnneesemaine()+ " " + uneAffec1.getTempsPasse()) ;
 }

}
}