package com.example.demo.Repositary;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor,String>{
	
	
}