package com.kathfss.workshopmongo.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kathfss.workshopmongo.service.PostService;

@RestController
@RequestMapping(value = "/posters")
public class PostResource {

	private PostService service;
}
