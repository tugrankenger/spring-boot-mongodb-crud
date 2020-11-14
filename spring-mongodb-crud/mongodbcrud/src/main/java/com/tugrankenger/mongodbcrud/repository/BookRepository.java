package com.tugrankenger.mongodbcrud.repository;

import com.tugrankenger.mongodbcrud.model.Book;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {

}