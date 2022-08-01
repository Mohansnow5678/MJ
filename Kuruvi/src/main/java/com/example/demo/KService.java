package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class KService {
    
	@Autowired
	private KfcDAO U;

	public KfcDAO getU() {
		return U;
	}


	public void setU(KfcDAO u) {
		U = u;
	}


	public void savetree(Kfc sak) {
		getU().save(sak);
	}
	
	
 public   List<Kfc> checkuser(String kname,String kpassword){
	return getU().checkuser(kname, kpassword);
	}
 
 public List<Kfc>  checkkid(Kfc heart){
	return getU().checkKid(heart);
	 
 }
 
 
 
 
 
}