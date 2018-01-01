package com.sl.slmvnweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sl.slmvnweb.entity.User;
import com.sl.slmvnweb.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	public void save(User user) {
		
		userRepository.saveAndFlush(user);
		
	}

	public User findById(Long id) {
		return userRepository.findById(id);
	}
	
	
}
