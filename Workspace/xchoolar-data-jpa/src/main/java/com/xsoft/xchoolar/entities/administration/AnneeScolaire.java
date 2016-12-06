/***********************************************************************
 * Module:  AnneeScolaire.java
 * Author:  xtel
 * Purpose: Defines the Class AnneeScolaire
 ***********************************************************************/ 
package com.xsoft.xchoolar.entities.administration;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import com.xsoft.xchoolar.entities.AbstractEntity;

@Entity
public class AnneeScolaire extends AbstractEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull
   private Date dateDebut;
	@NotNull
   private Date dateFin;
	/**
	 * @param dateDebut
	 * @param dateFin
	 */
	public AnneeScolaire(Date dateDebut, Date dateFin) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	/**
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}
	/**
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	/**
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}
	/**
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		DateFormat formatter = new SimpleDateFormat("MM/yyyy");
		return String.format("AnneeScolaire [%s, %s]", formatter.format(dateDebut) , formatter.format(dateFin));
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateDebut == null) ? 0 : dateDebut.hashCode());
		result = prime * result + ((dateFin == null) ? 0 : dateFin.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AnneeScolaire other = (AnneeScolaire) obj;
		if (dateDebut == null) {
			if (other.dateDebut != null)
				return false;
		} else if (!dateDebut.equals(other.dateDebut))
			return false;
		if (dateFin == null) {
			if (other.dateFin != null)
				return false;
		} else if (!dateFin.equals(other.dateFin))
			return false;
		return true;
	}

}