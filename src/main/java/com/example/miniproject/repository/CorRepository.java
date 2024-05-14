package com.example.miniproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.miniproject.entity.Corpor;

public interface CorRepository extends JpaRepository<Corpor, String>{

	 

	 
//	 @Query(value = "select * from corpor where cname like %:cname%", nativeQuery = true)
//	 List<Corpor> getCorporList(@Param("cname") String str);


	 @Query(value = "select * from corpor where cname like :cname", nativeQuery = true)
	 List<Corpor> getCorporList(@Param("cname") String str);
}
