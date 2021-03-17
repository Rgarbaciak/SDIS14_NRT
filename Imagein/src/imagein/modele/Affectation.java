package imagein.modele;

/**
* date du programme
* 18/01/2021
* objet du programme
* Classe metier Affectation
* @author Garbaciak
*/
public class Affectation {
	private String anneesemaine ;
	private int tempsPasse ;
        private Salarie leSalarie;
        private Projet leProjet;
        

	public Affectation(){}
	public Affectation(String panneesemaine, int ptempsPasse){
		this.anneesemaine= panneesemaine ;
		this.tempsPasse= ptempsPasse ;

	}
	public String getAnneesemaine(){
		return anneesemaine;

	}
	public int getTempsPasse(){
		return tempsPasse ;
	}
        
    public Projet getLeProjet() {
        return leProjet;
    }

    public void setLeProjet(Projet leProjet) {
        this.leProjet = leProjet;
    }

    public Salarie getLeSalarie() {
        return leSalarie;
    }

    public void setLeSalarie(Salarie leSalarie) {
        this.leSalarie = leSalarie;
    }
        
	public void setAnneesemaine(String panneesemaine){
		this.anneesemaine= panneesemaine ;
	}
	public void setTempsPasse(int ptempsPasse){
		this.tempsPasse= ptempsPasse ;
	}
}