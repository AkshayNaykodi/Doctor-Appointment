package com.example.demo.Repositary;

import org.springframework.data.repository.CrudRepository;


import com.example.demo.model.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment,String>,CustomRepository,CustomTwo{

	
	
}