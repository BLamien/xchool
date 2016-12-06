/***********************************************************************
 * Module:  Ecole.java
 * Author:  xtel
 * Purpose: Defines the Class Ecole
 ***********************************************************************/
package com.xsoft.xchoolar.entities.administration;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.xsoft.xchoolar.entities.AbstractEntityCode;

@Entity
public class Ecole extends AbstractEntityCode{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	private String nom;
	@NotEmpty
	private String numerosAutorisation;
	@NotNull
	private Date dateAutorisation;

	private byte logo;
	@NotEmpty
	private String quartier;
	@NotEmpty
	private String telephone;

	@OneToMany(mappedBy = "ecole", cascade = CascadeType.ALL, orphanRemoval = true)
	public java.util.List<Personnel> personnelEnFonction;

	/**
	 * @param code
	 * @param nom
	 * @param numerosAutorisation
	 * @param dateAutorisation
	 * @param quartier
	 * @param telephone
	 */
	public Ecole(String code, String nom, String numerosAutorisation, Date dateAutorisation, String quartier,
			String telephone) {
		super(code);
		this.nom = nom;
		this.numerosAutorisation = numerosAutorisation;
		this.dateAutorisation = dateAutorisation;
		this.quartier = quartier;
		this.telephone = telephone;
	}

	/** @pdGenerated default getter */
	public java.util.List<Personnel> getPersonnelEnFonction() {
		if (personnelEnFonction == null)
			personnelEnFonction = new java.util.ArrayList<Personnel>();
		return personnelEnFonction;
	}

	/** @pdGenerated default iterator getter */
	public java.util.Iterator<Personnel> getIteratorPersonnelEnFonction() {
		if (personnelEnFonction == null)
			personnelEnFonction = new java.util.ArrayList<Personnel>();
		return personnelEnFonction.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newAdministratif
	 */
	public void setPersonnelEnFonction(java.util.List<Personnel> newAdministratif) {
		removeAllPersonnelEnFonction();
		for (java.util.Iterator<Personnel> iter = newAdministratif.iterator(); iter.hasNext();)
			addPersonnelEnFonction(iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newAdministratif
	 */
	public void addPersonnelEnFonction(Personnel newAdministratif) {
		if (newAdministratif == null)
			return;
		if (this.personnelEnFonction == null)
			this.personnelEnFonction = new java.util.ArrayList<Personnel>();
		if (!this.personnelEnFonction.contains(newAdministratif)) {
			newAdministratif.setEcole(this);
			this.personnelEnFonction.add(newAdministratif);
		}

	}

	/**
	 * @pdGenerated default remove
	 * @param oldAdministratif
	 */
	public void removePersonnelEnFonction(Personnel oldAdministratif) {
		if (oldAdministratif == null)
			return;
		if (this.personnelEnFonction != null)
			if (this.personnelEnFonction.contains(oldAdministratif)) {
				oldAdministratif.setEcole(null);
				this.personnelEnFonction.remove(oldAdministratif);
			}
	}

	/** @pdGenerated default removeAll */
	public void removeAllPersonnelEnFonction() {
		if (personnelEnFonction != null) {
			for (java.util.Iterator<Personnel> iter = personnelEnFonction.iterator(); iter.hasNext();)
				iter.next().setEcole(null);
			personnelEnFonction.clear();
		}

	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the numerosAutorisation
	 */
	public String getNumerosAutorisation() {
		return numerosAutorisation;
	}

	/**
	 * @param numerosAutorisation
	 *            the numerosAutorisation to set
	 */
	public void setNumerosAutorisation(String numerosAutorisation) {
		this.numerosAutorisation = numerosAutorisation;
	}

	/**
	 * @return the dateAutorisation
	 */
	public Date getDateAutorisation() {
		return dateAutorisation;
	}

	/**
	 * @param dateAutorisation
	 *            the dateAutorisation to set
	 */
	public void setDateAutorisation(Date dateAutorisation) {
		this.dateAutorisation = dateAutorisation;
	}

	/**
	 * @return the logo
	 */
	public byte getLogo() {
		return logo;
	}

	/**
	 * @param logo
	 *            the logo to set
	 */
	public void setLogo(byte logo) {
		this.logo = logo;
	}

	/**
	 * @return the quartier
	 */
	public String getQuartier() {
		return quartier;
	}

	/**
	 * @param quartier
	 *            the quartier to set
	 */
	public void setQuartier(String quartier) {
		this.quartier = quartier;
	}

	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone
	 *            the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Ecole [id=%s, code=%s, nom=%s, quartier=%s, telephone=%s]", id, super.getCode(), nom, quartier,
				telephone);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((dateAutorisation == null) ? 0 : dateAutorisation.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((numerosAutorisation == null) ? 0 : numerosAutorisation.hashCode());
		result = prime * result + ((quartier == null) ? 0 : quartier.hashCode());
		result = prime * result + ((telephone == null) ? 0 : telephone.hashCode());
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
		Ecole other = (Ecole) obj;
		if (getCode() == null) {
			if (other.getCode() != null)
				return false;
		} else if (!getCode().equals(other.getCode()))
			return false;
		if (dateAutorisation == null) {
			if (other.dateAutorisation != null)
				return false;
		} else if (!dateAutorisation.equals(other.dateAutorisation))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (numerosAutorisation == null) {
			if (other.numerosAutorisation != null)
				return false;
		} else if (!numerosAutorisation.equals(other.numerosAutorisation))
			return false;
		if (quartier == null) {
			if (other.quartier != null)
				return false;
		} else if (!quartier.equals(other.quartier))
			return false;
		if (telephone == null) {
			if (other.telephone != null)
				return false;
		} else if (!telephone.equals(other.telephone))
			return false;
		return true;
	}

}