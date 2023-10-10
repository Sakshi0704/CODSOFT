package com.codsoft.model;

import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class Instructor {

	private Long InstructorId;
	
	private String firstName;
	
	private String lastName;
	
	
	private String email;
	
	private String phoneNumber;
	
	private String department;
	
	private List<Course> courses; 
	
}
