/***********************************************************************
 * Module:  Personnel.java
 * Author:  xtel
 * Purpose: Defines the Class Personnel
 ************************************************************************/
package com.xsoft.xchoolar.data_jpa.administration;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.xsoft.xchoolar.data_jpa.ESexe;
import com.xsoft.xchoolar.data_jpa.ESitMatrim;

@Entity
public class Personnel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotEmpty
	// @Pattern(regexp=)
	private String matricule;
	@NotEmpty
	private String nom;
	private String prenom;
	@NotNull
	private ESexe sexe;
	@NotNull
	private Date dateNaissance;
	@NotNull
	private Date dateEmbauche;
	@NotEmpty
	private String quartier;
	private ESitMatrim situationMatrimonial;
	private Integer nombreD_enfant;
	private String nomConjoint;
	private String prenomConjoint;
	@NotEmpty
	private String numerosCni;
	@NotNull
	private Date dateDelivranceCni;
	@NotEmpty
	private String telephone1;
	private String telephone2;
	@Email
	private String email;
	private String diplome;
	private Date dateObtentionDiplome;
	public Personnel(String matricule, String nom, String prenom,  ESexe sexe, Date dateNaissance, Date dateEmbauche, String quartier,
			String numerosCni, Date dateDelivranceCni, String telephone1) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.dateNaissance = dateNaissance;
		this.dateEmbauche = dateEmbauche;
		this.quartier = quartier;
		this.numerosCni = numerosCni;
		this.dateDelivranceCni = dateDelivranceCni;
		this.telephone1 = telephone1;
	}
	public Personnel(String matricule, String nom, String prenom, ESexe sexe, Date dateNaissance, Date dateEmbauche,
			String quartier, ESitMatrim situationMatrimonial, Integer nombreD_enfant, String nomConjoint,
			String prenomConjoint, String numerosCni, Date dateDelivranceCni, String telephone1, String telephone2,
			String email, String diplome, Date dateObtentionDiplome) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.dateNaissance = dateNaissance;
		this.dateEmbauche = dateEmbauche;
		this.quartier = quartier;
		this.situationMatrimonial = situationMatrimonial;
		this.nombreD_enfant = nombreD_enfant;
		this.nomConjoint = nomConjoint;
		this.prenomConjoint = prenomConjoint;
		this.numerosCni = numerosCni;
		this.dateDelivranceCni = dateDelivranceCni;
		this.telephone1 = telephone1;
		this.telephone2 = telephone2;
		this.email = email;
		this.diplome = diplome;
		this.dateObtentionDiplome = dateObtentionDiplome;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format(
				"Personnel [matricule=%s, nom=%s, prenom=%s, sexe=%s, dateNaissance=%s, dateEmbauche=%s, quartier=%s, numerosCni=%s, dateDelivranceCni=%s, telephone1=%s]",
				matricule, nom, prenom, sexe, dateNaissance, dateEmbauche, quartier, numerosCni, dateDelivranceCni,
				telephone1);
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
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}
	/**
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the sexe
	 */
	public ESexe getSexe() {
		return sexe;
	}
	/**
	 * @param sexe the sexe to set
	 */
	public void setSexe(ESexe sexe) {
		this.sexe = sexe;
	}
	/**
	 * @return the dateNaissance
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}
	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	/**
	 * @return the dateEmbauche
	 */
	public Date getDateEmbauche() {
		return dateEmbauche;
	}
	/**
	 * @param dateEmbauche the dateEmbauche to set
	 */
	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	/**
	 * @return the quartier
	 */
	public String getQuartier() {
		return quartier;
	}
	/**
	 * @param quartier the quartier to set
	 */
	public void setQuartier(String quartier) {
		this.quartier = quartier;
	}
	/**
	 * @return the situationMatrimonial
	 */
	public ESitMatrim getSituationMatrimonial() {
		return situationMatrimonial;
	}
	/**
	 * @param situationMatrimonial the situationMatrimonial to set
	 */
	public void setSituationMatrimonial(ESitMatrim situationMatrimonial) {
		this.situationMatrimonial = situationMatrimonial;
	}
	/**
	 * @return the nombreD_enfant
	 */
	public Integer getNombreD_enfant() {
		return nombreD_enfant;
	}
	/**
	 * @param nombreD_enfant the nombreD_enfant to set
	 */
	public void setNombreD_enfant(Integer nombreD_enfant) {
		this.nombreD_enfant = nombreD_enfant;
	}
	/**
	 * @return the nomConjoint
	 */
	public String getNomConjoint() {
		return nomConjoint;
	}
	/**
	 * @param nomConjoint the nomConjoint to set
	 */
	public void setNomConjoint(String nomConjoint) {
		this.nomConjoint = nomConjoint;
	}
	/**
	 * @return the prenomConjoint
	 */
	public String getPrenomConjoint() {
		return prenomConjoint;
	}
	/**
	 * @param prenomConjoint the prenomConjoint to set
	 */
	public void setPrenomConjoint(String prenomConjoint) {
		this.prenomConjoint = prenomConjoint;
	}
	/**
	 * @return the numerosCni
	 */
	public String getNumerosCni() {
		return numerosCni;
	}
	/**
	 * @param numerosCni the numerosCni to set
	 */
	public void setNumerosCni(String numerosCni) {
		this.numerosCni = numerosCni;
	}
	/**
	 * @return the dateDelivranceCni
	 */
	public Date getDateDelivranceCni() {
		return dateDelivranceCni;
	}
	/**
	 * @param dateDelivranceCni the dateDelivranceCni to set
	 */
	public void setDateDelivranceCni(Date dateDelivranceCni) {
		this.dateDelivranceCni = dateDelivranceCni;
	}
	/**
	 * @return the telephone1
	 */
	public String getTelephone1() {
		return telephone1;
	}
	/**
	 * @param telephone1 the telephone1 to set
	 */
	public void setTelephone1(String telephone1) {
		this.telephone1 = telephone1;
	}
	/**
	 * @return the telephone2
	 */
	public String getTelephone2() {
		return telephone2;
	}
	/**
	 * @param telephone2 the telephone2 to set
	 */
	public void setTelephone2(String telephone2) {
		this.telephone2 = telephone2;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the diplome
	 */
	public String getDiplome() {
		return diplome;
	}
	/**
	 * @param diplome the diplome to set
	 */
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	/**
	 * @return the dateObtentionDiplome
	 */
	public Date getDateObtentionDiplome() {
		return dateObtentionDiplome;
	}
	/**
	 * @param dateObtentionDiplome the dateObtentionDiplome to set
	 */
	public void setDateObtentionDiplome(Date dateObtentionDiplome) {
		this.dateObtentionDiplome = dateObtentionDiplome;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateDelivranceCni == null) ? 0 : dateDelivranceCni.hashCode());
		result = prime * result + ((dateEmbauche == null) ? 0 : dateEmbauche.hashCode());
		result = prime * result + ((dateNaissance == null) ? 0 : dateNaissance.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((matricule == null) ? 0 : matricule.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + ((quartier == null) ? 0 : quartier.hashCode());
		result = prime * result + ((sexe == null) ? 0 : sexe.hashCode());
		result = prime * result + ((telephone1 == null) ? 0 : telephone1.hashCode());
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
		Personnel other = (Personnel) obj;
		if (dateDelivranceCni == null) {
			if (other.dateDelivranceCni != null)
				return false;
		} else if (!dateDelivranceCni.equals(other.dateDelivranceCni))
			return false;
		if (dateEmbauche == null) {
			if (other.dateEmbauche != null)
				return false;
		} else if (!dateEmbauche.equals(other.dateEmbauche))
			return false;
		if (dateNaissance == null) {
			if (other.dateNaissance != null)
				return false;
		} else if (!dateNaissance.equals(other.dateNaissance))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (matricule == null) {
			if (other.matricule != null)
				return false;
		} else if (!matricule.equals(other.matricule))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (quartier == null) {
			if (other.quartier != null)
				return false;
		} else if (!quartier.equals(other.quartier))
			return false;
		if (sexe != other.sexe)
			return false;
		if (telephone1 == null) {
			if (other.telephone1 != null)
				return false;
		} else if (!telephone1.equals(other.telephone1))
			return false;
		return true;
	}

}