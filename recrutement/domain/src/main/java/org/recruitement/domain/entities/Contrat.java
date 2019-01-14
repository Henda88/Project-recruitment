package org.recruitement.domain.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contrat")
public class Contrat implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String reference;
	private Date date_debut;
	private String type_contrat;
	private float salaire;
	private String poste;

	public Contrat() {
		super();
	}

	public Contrat(Date date_debut, String type_contrat, float salaire, String poste) {
		super();
		this.date_debut = date_debut;
		this.type_contrat = type_contrat;
		this.salaire = salaire;
		this.poste = poste;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public String getType_contrat() {
		return type_contrat;
	}

	public void setType_contrat(String type_contrat) {
		this.type_contrat = type_contrat;
	}

	public float getSalaire() {
		return salaire;
	}

	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

}
