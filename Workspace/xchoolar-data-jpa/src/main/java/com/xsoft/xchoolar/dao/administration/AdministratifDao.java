package com.xsoft.xchoolar.dao.administration;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.xsoft.xchoolar.entities.administration.Administratif;
import com.xsoft.xchoolar.entities.administration.EPoste;
import com.xsoft.xchoolar.entities.administration.Personnel;

public interface AdministratifDao  extends CrudRepository<Administratif, Long>{
 List<Administratif> findByPoste(EPoste poste);
 List<Administratif> findByPersonnel(Personnel personnel);
}
