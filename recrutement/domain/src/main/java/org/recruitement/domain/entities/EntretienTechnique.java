package org.recruitement.domain.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity 
@Table ( name = "entretienTechnique")
public class EntretienTechnique extends Entretien {

	private static final long serialVersionUID = 1L;

	private Date dateTech;

	public EntretienTechnique(String commentaire, Date date, String statut, Date dateTech) {
		super(commentaire, date, statut);
		this.dateTech = dateTech; 
		
	}

	public EntretienTechnique(Date dateTech) {
		this.dateTech = dateTech;
	}

	public Date getDateTech() {
		return dateTech;
	}

	public void setDateTech(Date dateTech) {
		this.dateTech = dateTech;
	} 
	
	
	
}
