package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface message_repository extends MongoRepository<message,String> {

}
