/***********************************************************************
 * Module:  Administratif.java
 * Author:  xtel
 * Purpose: Defines the Class Administratif
 ***********************************************************************/
package com.xsoft.xchoolar.data_jpa.administration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Administratif {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	private EPoste poste;
	@ManyToOne
	public Personnel personnel;

	public Administratif(EPoste poste, Personnel personnel) {
		super();
		this.poste = poste;
		this.personnel = personnel;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Administratif [id=%s, poste=%s]", id, poste);
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the poste
	 */
	public EPoste getPoste() {
		return poste;
	}

	/**
	 * @param poste
	 *            the poste to set
	 */
	public void setPoste(EPoste poste) {
		this.poste = poste;
	}

	/**
	 * @return the personnel
	 */
	public Personnel getPersonnel() {
		return personnel;
	}

	/**
	 * @param personnel
	 *            the personnel to set
	 */
	public void setPersonnel(Personnel personnel) {
		this.personnel = personnel;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((personnel == null) ? 0 : personnel.hashCode());
		result = prime * result + ((poste == null) ? 0 : poste.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
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
		Administratif other = (Administratif) obj;
		if (personnel == null) {
			if (other.personnel != null)
				return false;
		} else if (!personnel.equals(other.personnel))
			return false;
		if (poste != other.poste)
			return false;
		return true;
	}

}