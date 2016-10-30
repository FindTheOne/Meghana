package edu.sjsu.project.dao;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import edu.sjsu.project.models.*;


@Repository
public class UserService implements UserRepository{
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public static final String collectionName = "user";
	
	public void createUser(User user) {
		if(!mongoTemplate.collectionExists(User.class)){
			mongoTemplate.createCollection(User.class);
		}
		user.setUserid(UUID.randomUUID().toString());
		mongoTemplate.insert(user, collectionName);
    }
}
