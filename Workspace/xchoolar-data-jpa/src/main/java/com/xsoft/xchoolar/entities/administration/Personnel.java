/***********************************************************************
 * Module:  Personnel.java
 * Author:  xtel
 * Purpose: Defines the Class Personnel
 ************************************************************************/
package com.xsoft.xchoolar.entities.administration;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.xsoft.xchoolar.entities.AbstractEntity;

@Entity
public class Personnel extends AbstractEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull
	private Date dateDebut;
	private Date dateFin;
	@NotNull
	private Double salaire;
	@NotNull
	@ManyToOne
	private Ecole ecole;
	@ManyToOne
	private Employe employe;
	
	private boolean enseignant;
	
	@OneToMany(mappedBy = "personnel", cascade = CascadeType.ALL, orphanRemoval = true, fetch= FetchType.EAGER)
	 public java.util.List<Administratif> fonctionsAdministrative;
	 
	public Personnel(Date dateDebut, Date dateFin, Double salaire, Ecole ecole, Employe employe) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.salaire = salaire;
		this.ecole = ecole;
		this.employe = employe;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Personnel [id=%s, dateDebut=%s, dateFin=%s, salaire=%s, ecole=%s, employe=%s]", id,
				dateDebut, dateFin, salaire, ecole, employe);
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
	 * @return the employe
	 */
	public Employe getPersonnel() {
		return employe;
	}

	/**
	 * @param employe
	 *            the employe to set
	 */
	public void setPersonnel(Employe employe) {
		this.employe = employe;
	}
	/** @pdGenerated default getter */
	   public java.util.List<Administratif> getFonctionsAdministrative() {
	      if (fonctionsAdministrative == null)
	    	  fonctionsAdministrative = new java.util.ArrayList<Administratif>();
	      return fonctionsAdministrative;
	   }
	   
	   /** @pdGenerated default iterator getter */
	   public java.util.Iterator<Administratif> getIteratorFonctionsAdministrative() {
	      if (fonctionsAdministrative == null)
	    	  fonctionsAdministrative = new java.util.ArrayList<Administratif>();
	      return fonctionsAdministrative.iterator();
	   }
	   
	   /** @pdGenerated default setter
	     * @param newAdministratif */
	   public void setFonctionsAdministrative(java.util.List<Administratif> newAdministratif) {
	      removeAllFonctionsAdministrative();
	      for (java.util.Iterator<Administratif> iter = newAdministratif.iterator(); iter.hasNext();)
	          addFonctionsAdministrative(iter.next());
	   }
	   
	   /** @pdGenerated default add
	     * @param newAdministratif */
	   public void addFonctionsAdministrative(Administratif newAdministratif) {
	      if (newAdministratif == null)
	         return;
	      if (this.fonctionsAdministrative == null)
	         this.fonctionsAdministrative = new java.util.ArrayList<Administratif>();
	      if (!this.fonctionsAdministrative.contains(newAdministratif)){
	    	  newAdministratif.setPersonnel(this);
	    	  this.fonctionsAdministrative.add(newAdministratif);
	      }
	         
	   }
	   
	   /** @pdGenerated default remove
	     * @param oldAdministratif */
	   public void removeFonctionsAdministrative(Administratif oldAdministratif) {
	      if (oldAdministratif == null)
	         return;
	      if (this.fonctionsAdministrative != null)
	         if (this.fonctionsAdministrative.contains(oldAdministratif)){
	        	 oldAdministratif.setPersonnel(null);
	            this.fonctionsAdministrative.remove(oldAdministratif);
	         }
	   }
	   
	   /** @pdGenerated default removeAll */
	   public void removeAllFonctionsAdministrative() {
	      if (fonctionsAdministrative != null){
	    	  for (java.util.Iterator<Administratif> iter = fonctionsAdministrative.iterator(); iter.hasNext();)
	              ((Administratif)iter.next()).setPersonnel(null);
	    	  fonctionsAdministrative.clear();
	      }
	    	  
	   }

	/**
	 * @return the enseignant
	 */
	public boolean isEnseignant() {
		return enseignant;
	}

	/**
	 * @param enseignant the enseignant to set
	 */
	public void setEnseignant(boolean enseignant) {
		this.enseignant = enseignant;
	}

	/**
	 * @return the employe
	 */
	public Employe getEmploye() {
		return employe;
	}

	/**
	 * @param employe the employe to set
	 */
	public void setEmploye(Employe employe) {
		this.employe = employe;
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
		result = prime * result + ((employe == null) ? 0 : employe.hashCode());
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
		Personnel other = (Personnel) obj;
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
		if (employe == null) {
			if (other.employe != null)
				return false;
		} else if (!employe.equals(other.employe))
			return false;
		if (salaire == null) {
			if (other.salaire != null)
				return false;
		} else if (!salaire.equals(other.salaire))
			return false;
		return true;
	}

}