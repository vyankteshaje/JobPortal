package com.extremity.jp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.extremity.jp.Model.Candidate;
import com.extremity.jp.ServiceI.ServiceInterface;

@RestController
public class HomeController {
	
	@Autowired
	ServiceInterface si;
	
	@RequestMapping(value="/getAllcandidate",method=RequestMethod.GET)
	public List<Candidate> getAllCandidate(){
		
		
		List<Candidate> list=	si.getAllcandidate();
		
		return list;
		
	}
	
	@RequestMapping(value="/saveCandidate",method=RequestMethod.POST)
	public String saveCandidate(@RequestBody Candidate c) {
	
		si.saveCandidate(c);
		
		return "Save successfully";
		
	}
	
	
	

}
