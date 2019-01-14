package org.recruitement.domain.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table ( name = "entretienRh")
public class EntretienRh extends Entretien {

	private static final long serialVersionUID = 1L;

	private Date dateRh;
	
	public EntretienRh(Date dateRh) {
		this.dateRh = dateRh;
	}

	public EntretienRh(String commentaire, Date date, String statut, Date dateRH) {
		super(commentaire, date, statut);
		this.dateRh = dateRH;
	}

	public Date getDateRh() {
		return dateRh;
	}

	public void setDateRh(Date dateRh) {
		this.dateRh = dateRh;
	} 
	
	
}
