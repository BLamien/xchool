/***********************************************************************
 * Module:  SalleDeClasse.java
 * Author:  xtel
 * Purpose: Defines the Class SalleDeClasse
 ***********************************************************************/
package com.xsoft.xchoolar.entities.administration;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.xsoft.xchoolar.entities.AbstractEntityCode;

@Entity
public class SalleDeClasse extends AbstractEntityCode{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	private String localisation;
	@NotNull
	private Integer nombrePlace;
	@NotNull
	@ManyToOne
	private Ecole ecole; 
	
	public SalleDeClasse(String code, String localisation, Integer nombrePlace, Ecole ecole) {
		super(code);
		this.localisation = localisation;
		this.nombrePlace = nombrePlace;
		this.ecole = ecole;
	}


	/**
	 * @return the ecole
	 */
	public Ecole getEcole() {
		return ecole;
	}

	/**
	 * @param ecole
	 *            the ecole to set
	 */
	public void setEcole(Ecole ecole) {
		this.ecole = ecole;
	}

	/**
	 * @return the localisation
	 */
	public String getLocalisation() {
		return localisation;
	}

	/**
	 * @param localisation
	 *            the localisation to set
	 */
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	/**
	 * @return the nombrePlace
	 */
	public Integer getNombrePlace() {
		return nombrePlace;
	}

	/**
	 * @param nombrePlace
	 *            the nombrePlace to set
	 */
	public void setNombrePlace(Integer nombrePlace) {
		this.nombrePlace = nombrePlace;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("SalleDeClasse [id=%s, code=%s,ecole=%s,  localisation=%s, nombrePlace=%s]", id, getCode(), ecole, localisation,
				nombrePlace);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;

		int result = super.hashCode();
		result = prime * result + ((localisation == null) ? 0 : localisation.hashCode());
		result = prime * result + ((ecole == null) ? 0 : ecole.hashCode());
		result = prime * result + ((nombrePlace == null) ? 0 : nombrePlace.hashCode());
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
		SalleDeClasse other = (SalleDeClasse) obj;
		if (getCode() == null) {
			if (other.getCode() != null)
				return false;
		} else if (!getCode().equals(other.getCode()))
			return false;
		if (localisation == null) {
			if (other.localisation != null)
				return false;
		} else if (!localisation.equals(other.localisation))
			return false;
		if (nombrePlace == null) {
			if (other.nombrePlace != null)
				return false;
		} else if (!nombrePlace.equals(other.nombrePlace))
			return false;
		if (ecole == null) {
			if (other.ecole != null)
				return false;
		} else if (!ecole.equals(other.ecole))
			return false;
		return true;
	}
}