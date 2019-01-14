package org.recruitement.domain.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "entretien")
public class Entretien implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String commentaire;
	private Date date;
	private String Statut;

	public Entretien() {
		super();
	}

	public Entretien(String commentaire, Date date, String statut) {
		super();
		this.commentaire = commentaire;
		this.date = date;
		Statut = statut;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatut() {
		return Statut;
	}

	public void setStatut(String statut) {
		Statut = statut;
	}

}
