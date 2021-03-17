package imagein.modele;


import imagein.modele.Salarie;

/**
* date du programme
* 18/01/2021
* objet du programme
* Classe metier Salarie
* @author Garbaciak
*/
public class Compte {
	private String login ;
	private String mdp ;
	private String role ;
	private Salarie laSalarie;
	public Compte(){
	}
	public Compte(String pLogin ,String pMdp , String pRole ){
		this.login=pLogin ;
		this.mdp=pMdp;
		this.role=pRole;

	}

    Compte(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	public String getLogin(){
		return login;
	}
	public String getMdp(){
		return mdp;
	}
	public String getRole(){
		return role;
	}
	public void setLogin(String pLogin){
		this.login = pLogin ;
	}
	public void setMdp(String pMdp){
		this.mdp = pMdp ;
	}
	public void setRole(String pRole){
		this.role = pRole ;
	}
	public Salarie getLaSalarie(){
 		return laSalarie;
 	}
 	public void setLaSalarie(Salarie pLaSalarie){
 	this.laSalarie=pLaSalarie;
 	}


}