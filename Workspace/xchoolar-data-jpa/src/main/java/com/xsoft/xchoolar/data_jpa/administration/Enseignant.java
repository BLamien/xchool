/***********************************************************************
 * Module:  Enseignant.java
 * Author:  xtel
 * Purpose: Defines the Class Enseignant
 ***********************************************************************/ package com.xsoft.xchoolar.data_jpa.administration;

/** @pdOid 05dfca8f-7bc1-4c2b-bf87-24028cb84144 */
public class Enseignant extends Fonction {
   /** @pdRoleInfo migr=no name=Personnel assc=association4 mult=1..1 */
   public Personnel personnel;

}