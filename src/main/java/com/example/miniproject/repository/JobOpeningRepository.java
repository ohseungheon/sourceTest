package com.example.miniproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.miniproject.entity.Corpor;
import com.example.miniproject.entity.Jobopening;

public interface JobOpeningRepository extends JpaRepository<Jobopening, Integer>{
	
}
