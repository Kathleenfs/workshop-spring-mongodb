package com.kathfss.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kathfss.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {


}
