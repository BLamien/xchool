/***********************************************************************
 * Module:  Administratif.java
 * Author:  xtel
 * Purpose: Defines the Class Administratif
 ***********************************************************************/
package com.xsoft.xchoolar.data_jpa.administration;

/** @pdOid da0e0bbe-5cfb-43b7-b0b9-3c78d24587d5 */
public class Administratif extends Fonction {
   /** @pdOid 73899d89-e2fd-451d-af4f-ce0d2dcfe856 */
   private EPoste poste;
   
   /** @pdRoleInfo migr=no name=Personnel assc=association3 mult=1..1 */
   public Personnel personnel;

}