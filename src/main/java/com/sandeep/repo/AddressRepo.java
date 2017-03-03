package com.sandeep.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sandeep.model.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, String>{

	Page<Address> findAll(Pageable page);
	
	/*@Query(value="select * from address where id in(1,2,3)",nativeQuery=true)
	Page<Address> findNative(Pageable pageable);*/
	
}
