package com.example.demo.Repositary;

import java.util.List;

import com.example.demo.model.Appointment;

public interface CustomTwo{
    public List<Appointment> findByDocId(String docId);
}