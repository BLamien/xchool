package com.xsoft.xchoolar.dao.administration;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.xsoft.xchoolar.entities.administration.Ecole;
import com.xsoft.xchoolar.entities.administration.Personnel;

public interface PersonnelDao extends PagingAndSortingRepository<Personnel, Long> {
List<Personnel> findByEcoleAndEnseignantTrue(Ecole ecole);
}
