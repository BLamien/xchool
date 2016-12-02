/***********************************************************************
 * Module:  Ecole.java
 * Author:  xtel
 * Purpose: Defines the Class Ecole
 ***********************************************************************/ package com.xsoft.xchoolar.data_jpa.administration;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import scala.annotation.meta.setter;

/** @pdOid 5137a8e8-181e-460f-916a-3d8c61741d11 */
public class Ecole {
   /** @pdOid 4b4370cc-34cf-41ea-9882-f0231bcc44a4 */
   private Long id;
   /** @pdOid 7f521a8a-7361-4b61-8161-667e93a17b0a */
   private String code;
   /** @pdOid 6d49dedb-7a5a-4c28-bf7e-f2240759dc6d */
   private String nom;
   /** @pdOid c10e7bb4-bbe6-4f80-a8b5-de49b0236d6e */
   private byte logo;
   /** @pdOid 1630d63d-cd2f-4c47-b794-6257ab26233f */
   private String quartier;
   /** @pdOid 6eb64174-02ac-48ec-85e0-b8c5a3f1a3c4 */
   private String telephone;
   
   @OneToMany(mappedBy = "ecole", cascade = CascadeType.ALL, orphanRemoval = true)
    public java.util.List<Fonction> personnelEnFonction;
   /** @pdRoleInfo migr=no name=Enseignant assc=association2 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<Enseignant> enseignant;
   
   
   /** @pdGenerated default getter */
   public java.util.List<Fonction> getPersonnelEnFonction() {
      if (personnelEnFonction == null)
    	  personnelEnFonction = new java.util.ArrayList<Fonction>();
      return personnelEnFonction;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorPersonnelEnFonction() {
      if (personnelEnFonction == null)
    	  personnelEnFonction = new java.util.ArrayList<Fonction>();
      return personnelEnFonction.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newAdministratif */
   public void setPersonnelEnFonction(java.util.List<Fonction> newAdministratif) {
      removeAllPersonnelEnFonction();
      for (java.util.Iterator iter = newAdministratif.iterator(); iter.hasNext();)
          addPersonnelEnFonction((Fonction)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newAdministratif */
   public void addPersonnelEnFonction(Fonction newAdministratif) {
      if (newAdministratif == null)
         return;
      if (this.personnelEnFonction == null)
         this.personnelEnFonction = new java.util.ArrayList<Fonction>();
      if (!this.personnelEnFonction.contains(newAdministratif)){
    	  newAdministratif.setEcole(this);
    	  this.personnelEnFonction.add(newAdministratif);
      }
         
   }
   
   /** @pdGenerated default remove
     * @param oldAdministratif */
   public void removePersonnelEnFonction(Fonction oldAdministratif) {
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
              ((Fonction)iter.next()).setEcole(null);
    	  personnelEnFonction.clear();
      }
    	  
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Enseignant> getEnseignant() {
      if (enseignant == null)
         enseignant = new java.util.HashSet<Enseignant>();
      return enseignant;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEnseignant() {
      if (enseignant == null)
         enseignant = new java.util.HashSet<Enseignant>();
      return enseignant.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEnseignant */
   public void setEnseignant(java.util.Collection<Enseignant> newEnseignant) {
      removeAllEnseignant();
      for (java.util.Iterator iter = newEnseignant.iterator(); iter.hasNext();)
         addEnseignant((Enseignant)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEnseignant */
   public void addEnseignant(Enseignant newEnseignant) {
      if (newEnseignant == null)
         return;
      if (this.enseignant == null)
         this.enseignant = new java.util.HashSet<Enseignant>();
      if (!this.enseignant.contains(newEnseignant))
         this.enseignant.add(newEnseignant);
   }
   
   /** @pdGenerated default remove
     * @param oldEnseignant */
   public void removeEnseignant(Enseignant oldEnseignant) {
      if (oldEnseignant == null)
         return;
      if (this.enseignant != null)
         if (this.enseignant.contains(oldEnseignant))
            this.enseignant.remove(oldEnseignant);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllEnseignant() {
      if (enseignant != null)
         enseignant.clear();
   }

}