package com.manytomany.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.manytomany.model.Book;

@Repository
public interface BookRepo extends CrudRepository<Book,Integer>{

}
