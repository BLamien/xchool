/***********************************************************************
 * Module:  Ecole.java
 * Author:  xtel
 * Purpose: Defines the Class Ecole
 ***********************************************************************/ 
package com.xsoft.xchoolar.data_jpa.administration;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class Ecole {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
	@NotEmpty
	// @Pattern(regexp=)
   private String code;
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
      
   
   /** @pdGenerated default getter */
   public java.util.List<Personnel> getPersonnelEnFonction() {
      if (personnelEnFonction == null)
    	  personnelEnFonction = new java.util.ArrayList<Personnel>();
      return personnelEnFonction;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorPersonnelEnFonction() {
      if (personnelEnFonction == null)
    	  personnelEnFonction = new java.util.ArrayList<Personnel>();
      return personnelEnFonction.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newAdministratif */
   public void setPersonnelEnFonction(java.util.List<Personnel> newAdministratif) {
      removeAllPersonnelEnFonction();
      for (java.util.Iterator iter = newAdministratif.iterator(); iter.hasNext();)
          addPersonnelEnFonction((Personnel)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newAdministratif */
   public void addPersonnelEnFonction(Personnel newAdministratif) {
      if (newAdministratif == null)
         return;
      if (this.personnelEnFonction == null)
         this.personnelEnFonction = new java.util.ArrayList<Personnel>();
      if (!this.personnelEnFonction.contains(newAdministratif)){
    	  newAdministratif.setEcole(this);
    	  this.personnelEnFonction.add(newAdministratif);
      }
         
   }
   
   /** @pdGenerated default remove
     * @param oldAdministratif */
   public void removePersonnelEnFonction(Personnel oldAdministratif) {
      if (oldAdministratif == null)
         return;
      if (this.personnelEnFonction != null)
         if (this.personnelEnFonction.contains(oldAdministratif)){
        	 oldAdministratif.setEcole(null);
            this.personnelEnFonction.remove(oldAdministratif);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllPersonnelEnFonction() {
      if (personnelEnFonction != null){
    	  for (java.util.Iterator iter = personnelEnFonction.iterator(); iter.hasNext();)
              ((Personnel)iter.next()).setEcole(null);
    	  personnelEnFonction.clear();
      }
    	  
   }
  
}