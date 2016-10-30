package edu.sjsu.project.dao;

import edu.sjsu.project.models.*;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository{
	
	public void createUser(User saved);
}
