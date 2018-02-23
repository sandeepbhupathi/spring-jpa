package com.sandeep.repo;

import com.sandeep.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepo extends JpaRepository<Bank,Long> {

}
