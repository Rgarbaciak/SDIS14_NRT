
import imagein.modele.Compte;
import imagein.modele.Salarie;

public class TestCompte {
 public static void main(String[] args) {

 	Salarie unSalarie = new Salarie("A19","Damir", 32000 ,"Martin");
 	Salarie laSalarie=new Salarie("1","2",3,"");

 	Compte compte1 = new Compte("dmartin" , "mdpmartin" ,"");
 	compte1.setRole("S");
 	unSalarie.addUnCompte(compte1);

 	Compte compte2 = new Compte("dmartin" , "mdpmartin" ,"");
 	compte2.setRole("R");
 	unSalarie.addUnCompte(compte2);

 	compte1.setLaSalarie(laSalarie);
 	System.out.println("Le salariÃ© se nommant" + compte1.getLogin() + "a pour catÃ©gorie " + compte1.getLaSalarie().getPrenom());
 	System.out.println ("Liste des comptes de la catÃ©gorie " + unSalarie.getNom());


 	for (Compte unCompte : unSalarie.getLesCompte() ){
 System.out.println (compte1.getLogin() + " " + compte1.getMdp());
 }

 }
}