package com.cg.deptemp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.deptemp.entities.Login;
import com.cg.deptemp.repository.UserRepository;

@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
	UserRepository user_repo;
    
	@Override
	public Login findByUserId(String userid) {
		return user_repo.findByUserId(userid);
	}

}
