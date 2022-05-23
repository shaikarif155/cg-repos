package com.cg.deptemp.service;

import com.cg.deptemp.entities.Login;

public interface LoginService {
	Login findByUserId(String userid);
}
