package com.example.demo.Repositary;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Person;

 

public interface PersonRepository extends CrudRepository<Person,String>{
	
	
}