package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface KfcDAO extends JpaRepository<Kfc , Integer>{

	
	@Query("from Kfc where kname=?1 and kpassword=?2 ")
	public List<Kfc> checkuser(String kname,String kpassword);
	
	
	@Query("from Kfc order by kid ASC ")
	public  List<Kfc> checkKid(Kfc love);
	
	

	
	
	
	
	
	
	
}
