package com.manytomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manytomany.model.Author;
import com.manytomany.service.ManyToManyService;

@RestController
@RequestMapping("api/v3")
public class ManyToManyController {
	
	/*
	 * 
	 *
	{
	    "id":211,
	    "authorName":"sunil",
	    "books":[
	        {
	            "id":212,
	            "bookName":"Oxford"
	        },
	        {
	            "id":213,
	             "bookName":"Oxford"
	        }
	    ]
	}

	 */
	
	@Autowired
	ManyToManyService manyToManyService;
	
	@RequestMapping("/SaveAllRecords")
	public void oneToManyMapping(@RequestBody Author person) {
		manyToManyService.saveToDb(person);
	}
	

}
