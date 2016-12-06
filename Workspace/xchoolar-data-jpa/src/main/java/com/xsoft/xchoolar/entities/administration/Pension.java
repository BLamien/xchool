/***********************************************************************
 * Module:  Pension.java
 * Author:  xtel
 * Purpose: Defines the Class Pension
 ************************************************************************/
package com.xsoft.xchoolar.entities.administration;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.xsoft.xchoolar.entities.AbstractEntity;

@Entity
public class Pension extends AbstractEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull
   private Double montant;
   
   @OneToOne
   public AnneeScolaire anneeScolaire;
   @OneToOne
   public Niveau niveau;
   @OneToMany(orphanRemoval = false)
   public java.util.List<Ecole> ecole;
   
   
   /**
 * @param montant
 * @param anneeScolaire
 * @param niveau
 */
public Pension(Double montant, AnneeScolaire anneeScolaire, Niveau niveau) {
	super();
	this.montant = montant;
	this.anneeScolaire = anneeScolaire;
	this.niveau = niveau;
}

/** @pdGenerated default getter */
   public java.util.List<Ecole> getEcole() {
      if (ecole == null)
         ecole = new java.util.ArrayList<Ecole>();
      return ecole;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEcole() {
      if (ecole == null)
         ecole = new java.util.ArrayList<Ecole>();
      return ecole.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEcole */
   public void setEcole(java.util.List<Ecole> newEcole) {
      removeAllEcole();
      for (java.util.Iterator iter = newEcole.iterator(); iter.hasNext();)
         addEcole((Ecole)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEcole */
   public void addEcole(Ecole newEcole) {
      if (newEcole == null)
         return;
      if (this.ecole == null)
         this.ecole = new java.util.ArrayList<Ecole>();
      if (!this.ecole.contains(newEcole))
         this.ecole.add(newEcole);
   }
   
   /** @pdGenerated default remove
     * @param oldEcole */
   public void removeEcole(Ecole oldEcole) {
      if (oldEcole == null)
         return;
      if (this.ecole != null)
         if (this.ecole.contains(oldEcole))
            this.ecole.remove(oldEcole);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllEcole() {
      if (ecole != null)
         ecole.clear();
   }

/**
 * @return the montant
 */
public Double getMontant() {
	return montant;
}

/**
 * @param montant the montant to set
 */
public void setMontant(Double montant) {
	this.montant = montant;
}

/**
 * @return the anneeScolaire
 */
public AnneeScolaire getAnneeScolaire() {
	return anneeScolaire;
}

/**
 * @param anneeScolaire the anneeScolaire to set
 */
public void setAnneeScolaire(AnneeScolaire anneeScolaire) {
	this.anneeScolaire = anneeScolaire;
}

/**
 * @return the niveau
 */
public Niveau getNiveau() {
	return niveau;
}

/**
 * @param niveau the niveau to set
 */
public void setNiveau(Niveau niveau) {
	this.niveau = niveau;
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return String.format("Pension [id=%s, montant=%s, anneeScolaire=%s, niveau=%s]", id, montant, anneeScolaire,
			niveau);
}

/* (non-Javadoc)
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((anneeScolaire == null) ? 0 : anneeScolaire.hashCode());
	result = prime * result + ((montant == null) ? 0 : montant.hashCode());
	result = prime * result + ((niveau == null) ? 0 : niveau.hashCode());
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
	Pension other = (Pension) obj;
	if (anneeScolaire == null) {
		if (other.anneeScolaire != null)
			return false;
	} else if (!anneeScolaire.equals(other.anneeScolaire))
		return false;
	if (montant == null) {
		if (other.montant != null)
			return false;
	} else if (!montant.equals(other.montant))
		return false;
	if (niveau == null) {
		if (other.niveau != null)
			return false;
	} else if (!niveau.equals(other.niveau))
		return false;
	return true;
}

}