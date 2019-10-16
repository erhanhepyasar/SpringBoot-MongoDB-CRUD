package com.demo.mongodb.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.mongodb.model.Users;
import com.demo.mongodb.repository.UsersRepository;

@RestController
@RequestMapping("/rest/users")
public class UsersController {
	
	private UsersRepository usersRepository;
	// Constructor injection (instead of @Autowired)
	public UsersController(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}
	
	@GetMapping("/all")
	public List<Users> getAll() {
		return usersRepository.findAll();
	}

}
