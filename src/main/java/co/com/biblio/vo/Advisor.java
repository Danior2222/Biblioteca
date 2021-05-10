package co.com.biblio.vo;

public class Advisor {
	private int idadvisor;
	private String identificationadv;
	private String usernameadv;
	private String phoneadv;
	private String firstnameadv;
	private String lastnameadv;
	private String emailadv;
	private int idUser;
	private int idadministrator;
	private int idcostumer;
	private int idroles;
	public int getIdadvisor() {
		return idadvisor;
	}
	public void setIdadvisor(int idadvisor) {
		this.idadvisor = idadvisor;
	}
	public String getIdentificationadv() {
		return identificationadv;
	}
	public void setIdentificationadv(String identificationadv) {
		this.identificationadv = identificationadv;
	}
	public String getUsernameadv() {
		return usernameadv;
	}
	public void setUsernameadv(String usernameadv) {
		this.usernameadv = usernameadv;
	}
	public String getPhoneadv() {
		return phoneadv;
	}
	public void setPhoneadv(String phoneadv) {
		this.phoneadv = phoneadv;
	}
	public String getFirstnameadv() {
		return firstnameadv;
	}
	public void setFirstnameadv(String firstnameadv) {
		this.firstnameadv = firstnameadv;
	}
	public String getLastnameadv() {
		return lastnameadv;
	}
	public void setLastnameadv(String lastnameadv) {
		this.lastnameadv = lastnameadv;
	}
	public String getEmailadv() {
		return emailadv;
	}
	public void setEmailadv(String emailadv) {
		this.emailadv = emailadv;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public int getIdadministrator() {
		return idadministrator;
	}
	public void setIdadministrator(int idadministrator) {
		this.idadministrator = idadministrator;
	}
	public int getIdcostumer() {
		return idcostumer;
	}
	public void setIdcostumer(int idcostumer) {
		this.idcostumer = idcostumer;
	}
	public int getIdroles() {
		return idroles;
	}
	public void setIdroles(int idroles) {
		this.idroles = idroles;
	}
	@Override
	public String toString() {
		return "Advisor [idadvisor=" + idadvisor + ", identificationadv=" + identificationadv + ", usernameadv="
				+ usernameadv + ", phoneadv=" + phoneadv + ", firstnameadv=" + firstnameadv + ", lastnameadv="
				+ lastnameadv + ", emailadv=" + emailadv + ", idUser=" + idUser + ", idadministrator=" + idadministrator
				+ ", idcostumer=" + idcostumer + ", idroles=" + idroles + "]";
	}
	
	

}
