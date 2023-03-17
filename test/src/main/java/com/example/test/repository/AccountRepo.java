package com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.test.model.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Integer> {
	
	@Query(value = "select count(id) from account where user_name =:userName",nativeQuery = true)
	public int countUserName(String userName);
	
	@Query(value = "select * from account where user_name=:userName and password =:pass",nativeQuery = true)
	public Account checkLogin(String userName,String pass);
	
}
