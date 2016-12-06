/***********************************************************************
 * Module:  Classe.java
 * Author:  xtel
 * Purpose: Defines the Class Classe
 ***********************************************************************/
package com.xsoft.xchoolar.entities.administration;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.xsoft.xchoolar.entities.AbstractEntity;

@Entity
public class Classe extends AbstractEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// TODO Ajouter une contrainte avant persistance pour verifier aue le
	// personnel est bien un enseignant
	//TODO autre contrainte l'enseignant doit etre dans la meme ecole aue la salle de classe
	@OneToOne
	public Personnel enseignant;
	@OneToOne
	public Niveau niveau;

	@OneToOne
	public AnneeScolaire anneeScolaire;
	@OneToOne
	public SalleDeClasse salleDeClasse;

	/**
	 * @param enseignant
	 * @param niveau
	 * @param anneeScolaire
	 * @param salleDeClasse
	 */
	public Classe(Personnel enseignant, Niveau niveau, AnneeScolaire anneeScolaire, SalleDeClasse salleDeClasse) {
		super();
		this.enseignant = enseignant;
		this.niveau = niveau;
		this.anneeScolaire = anneeScolaire;
		this.salleDeClasse = salleDeClasse;
	}

	// /** @pdRoleInfo migr=no name=Inscription assc=inscritEnClasse
	// coll=java.util.List impl=java.util.ArrayList mult=0..* type=Aggregation
	// */
	// public java.util.List<Inscription> inscription;
	//
	//
	// /** @pdGenerated default getter */
	// public java.util.List<Inscription> getInscription() {
	// if (inscription == null)
	// inscription = new java.util.ArrayList<Inscription>();
	// return inscription;
	// }
	//
	// /** @pdGenerated default iterator getter */
	// public java.util.Iterator getIteratorInscription() {
	// if (inscription == null)
	// inscription = new java.util.ArrayList<Inscription>();
	// return inscription.iterator();
	// }
	//
	// /** @pdGenerated default setter
	// * @param newInscription */
	// public void setInscription(java.util.List<Inscription> newInscription) {
	// removeAllInscription();
	// for (java.util.Iterator iter = newInscription.iterator();
	// iter.hasNext();)
	// addInscription((Inscription)iter.next());
	// }
	//
	// /** @pdGenerated default add
	// * @param newInscription */
	// public void addInscription(Inscription newInscription) {
	// if (newInscription == null)
	// return;
	// if (this.inscription == null)
	// this.inscription = new java.util.ArrayList<Inscription>();
	// if (!this.inscription.contains(newInscription))
	// this.inscription.add(newInscription);
	// }
	//
	// /** @pdGenerated default remove
	// * @param oldInscription */
	// public void removeInscription(Inscription oldInscription) {
	// if (oldInscription == null)
	// return;
	// if (this.inscription != null)
	// if (this.inscription.contains(oldInscription))
	// this.inscription.remove(oldInscription);
	// }
	//
	// /** @pdGenerated default removeAll */
	// public void removeAllInscription() {
	// if (inscription != null)
	// inscription.clear();
	// }
	
	/**
	 * @return the enseignant
	 */
	public Personnel getEnseignant() {
		return enseignant;
	}

	/**
	 * @param enseignant
	 *            the enseignant to set
	 */
	public void setEnseignant(Personnel enseignant) {
		this.enseignant = enseignant;
	}

	/**
	 * @return the niveau
	 */
	public Niveau getNiveau() {
		return niveau;
	}

	/**
	 * @param niveau
	 *            the niveau to set
	 */
	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}

	/**
	 * @return the anneeScolaire
	 */
	public AnneeScolaire getAnneeScolaire() {
		return anneeScolaire;
	}

	/**
	 * @param anneeScolaire
	 *            the anneeScolaire to set
	 */
	public void setAnneeScolaire(AnneeScolaire anneeScolaire) {
		this.anneeScolaire = anneeScolaire;
	}

	/**
	 * @return the salleDeClasse
	 */
	public SalleDeClasse getSalleDeClasse() {
		return salleDeClasse;
	}

	/**
	 * @param salleDeClasse
	 *            the salleDeClasse to set
	 */
	public void setSalleDeClasse(SalleDeClasse salleDeClasse) {
		this.salleDeClasse = salleDeClasse;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("%s-%s", niveau.getCode(), anneeScolaire);
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
		result = prime * result + ((anneeScolaire == null) ? 0 : anneeScolaire.hashCode());
		result = prime * result + ((niveau == null) ? 0 : niveau.hashCode());
		result = prime * result + ((salleDeClasse == null) ? 0 : salleDeClasse.hashCode());
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
		Classe other = (Classe) obj;
		if (anneeScolaire == null) {
			if (other.anneeScolaire != null)
				return false;
		} else if (!anneeScolaire.equals(other.anneeScolaire))
			return false;
		if (niveau == null) {
			if (other.niveau != null)
				return false;
		} else if (!niveau.equals(other.niveau))
			return false;
		if (salleDeClasse == null) {
			if (other.salleDeClasse != null)
				return false;
		} else if (!salleDeClasse.equals(other.salleDeClasse))
			return false;
		return true;
	}

}