package com.sandeep.repo;

import com.sandeep.model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.Table;

@Repository
public interface BudgetRepo extends JpaRepository<Budget,Long> {
}
