package com.sl.slmvnweb.service;

import com.sl.slmvnweb.entity.User;

public interface UserService {
	
	public void save(User user);

	public User findById(Long id);
	

}
