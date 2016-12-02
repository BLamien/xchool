/***********************************************************************
 * Module:  Classe.java
 * Author:  xtel
 * Purpose: Defines the Class Classe
 ***********************************************************************/ package com.xsoft.xchoolar.data_jpa.administration;

/** @pdOid 1af79493-2e72-4282-9a89-7a5f7475dd25 */
public class Classe {
   /** @pdOid fa275d6e-48b8-4533-a659-234315ef13e5 */
   private Long id;
   /** @pdOid 318b2af5-13f7-4257-842c-a86c9b5f4b82 */
   private String code;
   
   /** @pdRoleInfo migr=no name=Enseignant assc=maitre mult=1..1 */
   public Enseignant enseignant;
   /** @pdRoleInfo migr=no name=Niveau assc=niveauClasse mult=1..1 */
   public Niveau niveau;
   /** @pdRoleInfo migr=no name=AnneeScolaire assc=anneeClasse mult=1..1 */
   public AnneeScolaire anneeScolaire;
   /** @pdRoleInfo migr=no name=SalleDeClasse assc=association16 mult=1..1 */
   public SalleDeClasse salleDeClasse;
//   /** @pdRoleInfo migr=no name=Inscription assc=inscritEnClasse coll=java.util.List impl=java.util.ArrayList mult=0..* type=Aggregation */
//   public java.util.List<Inscription> inscription;
//   
//   
//   /** @pdGenerated default getter */
//   public java.util.List<Inscription> getInscription() {
//      if (inscription == null)
//         inscription = new java.util.ArrayList<Inscription>();
//      return inscription;
//   }
//   
//   /** @pdGenerated default iterator getter */
//   public java.util.Iterator getIteratorInscription() {
//      if (inscription == null)
//         inscription = new java.util.ArrayList<Inscription>();
//      return inscription.iterator();
//   }
//   
//   /** @pdGenerated default setter
//     * @param newInscription */
//   public void setInscription(java.util.List<Inscription> newInscription) {
//      removeAllInscription();
//      for (java.util.Iterator iter = newInscription.iterator(); iter.hasNext();)
//         addInscription((Inscription)iter.next());
//   }
//   
//   /** @pdGenerated default add
//     * @param newInscription */
//   public void addInscription(Inscription newInscription) {
//      if (newInscription == null)
//         return;
//      if (this.inscription == null)
//         this.inscription = new java.util.ArrayList<Inscription>();
//      if (!this.inscription.contains(newInscription))
//         this.inscription.add(newInscription);
//   }
//   
//   /** @pdGenerated default remove
//     * @param oldInscription */
//   public void removeInscription(Inscription oldInscription) {
//      if (oldInscription == null)
//         return;
//      if (this.inscription != null)
//         if (this.inscription.contains(oldInscription))
//            this.inscription.remove(oldInscription);
//   }
//   
//   /** @pdGenerated default removeAll */
//   public void removeAllInscription() {
//      if (inscription != null)
//         inscription.clear();
//   }

}