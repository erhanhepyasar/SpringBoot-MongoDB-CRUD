package com.demo.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.mongodb.model.Users;

@Repository
public interface UsersRepository extends MongoRepository<Users, Integer>{

}
