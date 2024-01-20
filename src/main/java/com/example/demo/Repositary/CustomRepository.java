package com.example.demo.Repositary;

import java.util.List;

import com.example.demo.model.Appointment;

public interface CustomRepository{
    public List<Appointment> findAllByEmail(String email);
   
}