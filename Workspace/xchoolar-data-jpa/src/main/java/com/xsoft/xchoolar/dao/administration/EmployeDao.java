package com.xsoft.xchoolar.dao.administration;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.xsoft.xchoolar.entities.administration.Employe;

public interface EmployeDao extends PagingAndSortingRepository<Employe, Long> {

}
