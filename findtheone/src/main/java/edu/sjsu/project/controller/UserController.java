package edu.sjsu.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import edu.sjsu.project.models.*;
import edu.sjsu.project.dao.*;

//import java.util.*;
import java.util.concurrent.atomic.AtomicLong;


@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	/*
    @RequestMapping(value="/register/",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody User user) {
    	userRepo.createUser(user);
    }
*/
	
	@RequestMapping(value="/register/",method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestParam(value="username") String username,
    		@RequestParam(value="password") String password){
    	
    	User user = new User();
    	user.setUsername(username);
    	user.setPassword(password);
    	
    	userRepo.createUser(user);
    }
	
    
    /*
    @RequestMapping(value="/login",method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody User loginUser(@RequestParam(value="username") String username,
    		@RequestParam(value="password") String password) {
    	
    	
    }*/
    
	
}
