package imagein.modele;

/**
* date du programme
* 18/01/2021
* objet du programme
* Classe metier Salarie
* @author Garbaciak
*/
import java.util.ArrayList ;
public class Categorie{
	private String code ;
	private String libelle ;
	private ArrayList <Salarie> lesSalaries ;

	public Categorie(){

	}
	public Categorie(String pCode, String pLibelle){
		this.code=pCode ;
		this.libelle=pLibelle;
	}
	public String getCode(){
		return code ; 
	}
	public String getLibelle(){
		return libelle ;
	}
	public void setCode(String pCode){
		this.code=pCode;
	}
	public void setLibelle(String pLibelle){
		this.libelle=pLibelle ;
	}
	public ArrayList<Salarie> getLesSalaries() {
 return lesSalaries;
 }
 public void setLesSalaries(ArrayList <Salarie> lesSalaries) {
 this.lesSalaries = lesSalaries;
}
public void addUnSalarie(Salarie pUnSalarie){
 if (lesSalaries == null){
 lesSalaries = new ArrayList<Salarie>();
 }
 lesSalaries.add(pUnSalarie);
 }

}