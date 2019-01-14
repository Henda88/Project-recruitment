package org.recruitement.domain.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table ( name = "entretienIntegration")
public class EntretienIntegration extends Entretien {

	private static final long serialVersionUID = 1L;

	private Date dateInteg;
	
	public EntretienIntegration(String commentaire, Date date, String statut, Date dateInteg) {
		super(commentaire, date, statut);
		this.dateInteg = dateInteg; 
		
	}

	public EntretienIntegration(Date dateInteg) {
		super();
		this.dateInteg = dateInteg;
	}

	public Date getDateInteg() {
		return dateInteg;
	}

	public void setDateInteg(Date dateInteg) {
		this.dateInteg = dateInteg;
	} 
	
	
}
