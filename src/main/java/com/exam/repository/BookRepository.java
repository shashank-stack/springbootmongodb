package com.exam.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.exam.model.Book;
public interface BookRepository extends MongoRepository < Book,Integer> {

}
