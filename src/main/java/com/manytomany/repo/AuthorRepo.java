package com.manytomany.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.manytomany.model.Author;

@Repository
public interface AuthorRepo extends CrudRepository<Author,Integer>{

}
