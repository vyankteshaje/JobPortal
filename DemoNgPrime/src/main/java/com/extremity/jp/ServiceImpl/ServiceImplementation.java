package com.extremity.jp.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.extremity.jp.Model.Candidate;
import com.extremity.jp.ServiceI.ServiceInterface;
import com.extremity.jp.repository.CandidateRepository;

@Repository
public class ServiceImplementation implements ServiceInterface {

	@Autowired
	CandidateRepository cr;
	
	
	@Override
	public List<Candidate> getAllcandidate() {
		// TODO Auto-generated method stub
		List<Candidate> list=(List<Candidate>) cr.findAll();
		
		return list;
	}

	@Override
	public String saveCandidate(Candidate c) {
		// TODO Auto-generated method stub
		cr.save(c);
		return "save candidate Successfully";
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		cr.deleteById(id);
		return "Deleted Candidate Successfully";
	}
	
	
	

	
	
}
