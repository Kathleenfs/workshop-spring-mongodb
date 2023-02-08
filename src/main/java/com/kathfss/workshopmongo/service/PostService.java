package com.kathfss.workshopmongo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kathfss.workshopmongo.repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;

}
