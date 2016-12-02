/***********************************************************************
 * Module:  Pension.java
 * Author:  xtel
 * Purpose: Defines the Class Pension
 ************************************************************************/
package com.xsoft.xchoolar.data_jpa.administration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Pensions {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
	@NotNull
   private Double montant;
   
   /** @pdRoleInfo migr=no name=AnneeScolaire assc=pensionAnneeScolaire mult=1..1 */
	@NotNull
   public AnneeScolaire anneeScolaire;
   /** @pdRoleInfo migr=no name=Niveau assc=pensionClasse mult=1..1 */
	@NotNull
   public Niveau niveau;
   /** @pdRoleInfo migr=no name=Ecole assc=pensionDeL_ecole coll=java.util.List impl=java.util.ArrayList mult=* */
   public java.util.List<Ecole> ecole;
   
   
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

}