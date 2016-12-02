/***********************************************************************
 * Module:  Fonction.java
 * Author:  xtel
 * Purpose: Defines the Class Fonction
 ************************************************************************/
package com.xsoft.xchoolar.data_jpa.administration;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Fonction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotNull
	private Date dateDebut;
	private Date dateFin;
	@NotNull
	private Double salaire;
	@NotNull
	@ManyToOne
	private Ecole ecole;
	@ManyToOne
	private Personnel personnel;

	public Fonction(Date dateDebut, Date dateFin, Double salaire, Ecole ecole, Personnel personnel) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.salaire = salaire;
		this.ecole = ecole;
		this.personnel = personnel;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Fonction [id=%s, dateDebut=%s, dateFin=%s, salaire=%s, ecole=%s, personnel=%s]", id,
				dateDebut, dateFin, salaire, ecole, personnel);
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/**
	 * @param dateDebut
	 *            the dateDebut to set
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
	 * @param dateFin
	 *            the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * @return the salaire
	 */
	public Double getSalaire() {
		return salaire;
	}

	/**
	 * @param salaire
	 *            the salaire to set
	 */
	public void setSalaire(Double salaire) {
		this.salaire = salaire;
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
		result = prime * result + ((dateDebut == null) ? 0 : dateDebut.hashCode());
		result = prime * result + ((dateFin == null) ? 0 : dateFin.hashCode());
		result = prime * result + ((ecole == null) ? 0 : ecole.hashCode());
		result = prime * result + ((personnel == null) ? 0 : personnel.hashCode());
		result = prime * result + ((salaire == null) ? 0 : salaire.hashCode());
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
		Fonction other = (Fonction) obj;
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
		if (ecole == null) {
			if (other.ecole != null)
				return false;
		} else if (!ecole.equals(other.ecole))
			return false;
		if (personnel == null) {
			if (other.personnel != null)
				return false;
		} else if (!personnel.equals(other.personnel))
			return false;
		if (salaire == null) {
			if (other.salaire != null)
				return false;
		} else if (!salaire.equals(other.salaire))
			return false;
		return true;
	}

}