package com.kathfss.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kathfss.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {



}
