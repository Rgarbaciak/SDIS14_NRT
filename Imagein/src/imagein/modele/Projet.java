package imagein.modele;

import java.util.ArrayList;

/**
* date du programme
* 18/01/2021
* objet du programme
* Classe metier Projet
* @author Garbaciak
*/
public class Projet {

	// dÃ©claration des propriÃ©tÃ©s
	private String code ;
 	private String intitule ;
 	private String dtDebut ;
 	private int montantPrevu;
 	private Salarie leSalarie ;
        private ArrayList<Affectation> lesAffectations1;
	// Constructeurs
	public Projet() {
 	}
 	public Projet(String pCode, String pIntitule ,String pDtDebut, int pMontantPrevu) {
 	this.code = pCode;
 	this.intitule= pIntitule ;
 	this.dtDebut = dtDebut;
 	this.montantPrevu= pMontantPrevu;
 	}
	// Accesseurs = getters
	 public String getCode() {
 	return code;
 	}
 	public String getIntitule() {
 	return intitule;
 	}
 	public String getDtDebut(){
 		return dtDebut;
 	}
 	public int getMontantPrevu(){
 		return montantPrevu;
 	}
 	public Salarie getLeSalarie(){
 		return leSalarie ;
 	}
	// Modificateurs = setters
	public void setCode(String pCode) {
 	this.code = pCode;
 	}
 	public void setIntitule(String pIntitule) {
 	this.intitule = pIntitule;
 	}
 	public void setDtDebut(String pDtDebut) {
 	this.dtDebut = pDtDebut;
 	}
 	public void setMontantPrevu(int pMontantPrevu) {
 	this.montantPrevu = pMontantPrevu;
 	}
 	public void setLeSalarie(Salarie pLeSalarie){
 		this.leSalarie=pLeSalarie ;
 	}

    void addUnSalaries1(Salarie salarie2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Iterable<Salarie> getlesSalaries1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public ArrayList<Affectation> getlesAffectations1(){
    return lesAffectations1 ;
}
public void setlesAffectations1(ArrayList<Affectation>lesAffectations1){
    this.lesAffectations1= lesAffectations1 ;
}
 public void addUneAffectation(Affectation pUneAffectation){
     if(lesAffectations1 == null){
         lesAffectations1 = new ArrayList<Affectation>() ;
     }
     lesAffectations1.add(pUneAffectation) ;
 }
 	

}