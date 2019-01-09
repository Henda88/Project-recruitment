package org.domain.entities;

public class candidat {

	private String id;
	private String nom;
	private String prenom;
	private String diplome;
	private int experience;
	private String mail;

	public candidat() {
		super();
	}

	public candidat(String nom, String prenom, String diplome, int experience, String mail) {
		this.nom = nom;
		this.prenom = prenom;
		this.diplome = diplome;
		this.experience = experience;
		this.mail = mail;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

}
