package com.sandeep.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sandeep.dto.SampleDTO;
import com.sandeep.model.Address;
import com.sandeep.model.User;
import com.sandeep.repo.AddressRepo;
import com.sandeep.repo.UserRepo;

@Service
public class SampleService {

	Logger LOGGER = LoggerFactory.getLogger(getClass());
	@Autowired
	private UserRepo repo;
	
	@Autowired
	private AddressRepo addrRepo;
	
	@PersistenceContext
	private EntityManager em;
	
	public List<User> findAllUsers(){
		LOGGER.info("inside service");
		return repo.findAll();
	}
	
	public Page<Address> findAllAddress(Pageable page){
		return addrRepo.findAll(page);
	}
	
	/*public Page<Address> findNative(Pageable page){
		return addrRepo.findNative(page);
	}*/
	
	public Page<SampleDTO> getCustomPage(Pageable page){
		
		List<SampleDTO> sampleList = repo.findPageData(em, page).stream().map((obj) -> {
			Object ob[] = (Object []) obj;
			return new SampleDTO((String)ob[0],(Integer)ob[1]);
		}).collect(Collectors.toList());
		
		long pageCount = repo.findPageCount();
		LOGGER.info("======count"+pageCount);
		return new PageImpl<>(sampleList, page, pageCount);
		
	}
	
	/*public Page<Object> findDist(Pageable page){
		
		return repo.findAllDist(page);
	}*/
}
