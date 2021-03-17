package imagein.modele;

import java.util.ArrayList;

/**
* date du programme
* 18/01/2021
* objet du programme
* Classe metier Salarie
* @author Garbaciak
*/
public class Salarie {

	// dÃ©claration des propriÃ©tÃ©s
	private String nom ;
 	private double salaire ;
 	private String matricule ;
 	private String prenom;
 	private Categorie laCategorie;
 	private ArrayList<Compte> lesCompte ;
 	private ArrayList<Projet> lesProjets1 ;
        private ArrayList<Affectation> lesAffectations ;
	// Constructeurs
	public Salarie() {
 	}
 	public Salarie(String pNom, String pPrenom ,double pSalaire, String pMatricule) {
 	this.nom = pNom;
 	this.prenom= pPrenom ;
 	this.salaire = pSalaire;
 	this.matricule= pMatricule;
 	}
	// Accesseurs = getters
	 public String getNom() {
 	return nom;
 	}
 	public double getSalaire() {
 	return salaire;
 	}
 	public String getMatricule(){
 		return matricule;
 	}
 	public String getPrenom(){
 		return prenom;
 	}
 	public Categorie getLaCategorie(){
 		return laCategorie;
 	}
	// Modificateurs = setters
	public void setNom(String pNom) {
 	this.nom = pNom;
 	}
 	public void setPrenom(String pPrenom) {
 	this.prenom = pPrenom;
 	}
 	public void setMatricule(String pMatricule) {
 	this.matricule = pMatricule;
 	}
 	public void setSalaire(double pSalaire) {
 	this.salaire = pSalaire;
 	}
 	public void setlaCategorie(Categorie pLaCategorie){
 	this.laCategorie=pLaCategorie;
 	}
 	public ArrayList<Compte> getLesCompte() {
            return lesCompte;
        }

public void setLesCompte(ArrayList<Compte> lesComptes) {
 this.lesCompte = lesComptes;
}

public void addUnCompte(Compte pUnCompte){
 if (lesCompte == null){
 lesCompte = new ArrayList<Compte>();
 }
 lesCompte.add(pUnCompte);
 }




public ArrayList<Projet> getLesProjets1() {
 return lesProjets1;
 }

public void setLesProjets1(ArrayList<Projet>lesProjets1) {
 this.lesProjets1 = lesProjets1;
}

public void addUnProjet1(Projet pUnProjet1){
 if (lesProjets1 == null){
 lesProjets1 = new ArrayList<Projet>();
 }
 lesProjets1.add(pUnProjet1);
 }



public ArrayList<Affectation> getlesAffectations(){
    return lesAffectations ;
}
public void setlesAffectations(ArrayList<Affectation>lesAffectations){
    this.lesAffectations= lesAffectations ;
}
 public void addUneAffectation(Affectation pUneAffectation){
     if(lesAffectations == null){
         lesAffectations = new ArrayList<Affectation>() ;
     }
     lesAffectations.add(pUneAffectation) ;
 }

    public void setLaCategorie(Categorie uneCategorie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

