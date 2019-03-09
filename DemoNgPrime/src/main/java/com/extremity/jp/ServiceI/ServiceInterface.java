package com.extremity.jp.ServiceI;

import java.util.List;

import com.extremity.jp.Model.Candidate;

public interface ServiceInterface {
	
	public List<Candidate> getAllcandidate();
	public String saveCandidate(Candidate c);
	public String delete(int id);
}
