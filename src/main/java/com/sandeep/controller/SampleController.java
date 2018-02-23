package com.sandeep.controller;

import java.util.List;

import com.sandeep.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.sandeep.dto.SampleDTO;
import com.sandeep.service.SampleService;

@RestController
public class SampleController {

	@Autowired
	private SampleService sampleService;
	@RequestMapping(path="/testService")
	public List<User> findAllUsers(){
		return sampleService.findAllUsers();
	}
	
	@RequestMapping(path="/testService2")
	public Page<Address> findAllAddress(@RequestParam("pageNbr") int page,@RequestParam("pgSize") int pageSize){
		return sampleService.findAllAddress(new PageRequest(page, pageSize));
	}

	@RequestMapping(path="/findAllAccountTran",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Account> findAllAccount(){
	    return sampleService.findAllAccounts();
    }

	@RequestMapping(path="/findAllCredentials")
    public List<Credentials> findAllCredentials(){
	    return sampleService.findAllCredentials();
    }
	/*@RequestMapping(path="/testService3")
	public Page<Address> findAllAddress2(@RequestParam("pageNbr") int page,@RequestParam("pgSize") int pageSize){
		return sampleService.findNative(new PageRequest(page, pageSize));
	}*/
	
	@RequestMapping(path="/testService4")
	public Page<SampleDTO> findAllAddress4(@RequestParam("pageNbr") int page,@RequestParam("pgSize") int pageSize){
		return sampleService.getCustomPage(new PageRequest(page, pageSize));
	}

	@RequestMapping(path = "/saveUSer",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public User saveUser(@RequestBody User saveUser){
	    return sampleService.saveUser(saveUser);
    }

    @RequestMapping(path="/getBank",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Bank> getAllBankList(){
	    return sampleService.findAllBankDetails();
    }

    @RequestMapping(path = "/saveBank",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public Bank saveBank(@RequestBody Bank bank){
	    return sampleService.saveBank(bank);
    }
}
