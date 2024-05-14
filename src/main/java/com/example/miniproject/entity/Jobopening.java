package com.example.miniproject.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Jobopening {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int jno;
	
	@ManyToOne
	@JoinColumn(name="cname")
	@ToString.Exclude
	private Corpor cname;
	
	
	private String post;
	
}
