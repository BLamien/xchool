/***********************************************************************
 * Module:  Niveau.java
 * Author:  xtel
 * Purpose: Defines the Class Niveau
 ************************************************************************/
package com.xsoft.xchoolar.data_jpa.administration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/** decris les niveau de classe du genre CM2, CM1 etc
 * 
 * @pdOid 496208c4-4a6d-4743-b13d-26cdd0a79664 */
@Entity
public class Niveau {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
	@NotEmpty
   private String code;
	@NotEmpty
   private String libelle;
	@NotNull
   private ECycle cycle;
	public Niveau(String code, String libelle, ECycle cycle) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.cycle = cycle;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Niveau [id=%s, code=%s, libelle=%s, cycle=%s]", id, code, libelle, cycle);
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}
	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	/**
	 * @return the cycle
	 */
	public ECycle getCycle() {
		return cycle;
	}
	/**
	 * @param cycle the cycle to set
	 */
	public void setCycle(ECycle cycle) {
		this.cycle = cycle;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((cycle == null) ? 0 : cycle.hashCode());
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
		Niveau other = (Niveau) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (cycle != other.cycle)
			return false;
		return true;
	}

}