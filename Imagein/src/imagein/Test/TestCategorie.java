
import imagein.modele.Categorie;

/**
* date du programme
* 18/01/2021
* objet du programme
* Classe metier Salarie
* @author Garbaciak
*/
public class TestCategorie{
		public static void main(String[] args) {
			Categorie categorie1 = new Categorie("DJAVA","Developpeur java") ;
			System.out.println(" Le code est " + categorie1.getCode() + " son libelle est " + categorie1.getLibelle());
		
	}
}