package com.codsoft.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Instructor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long InstructorId;
	
	@NotNull(message = "$Value{nameNotNull}")
	@NotEmpty(message = "$Value{nameNotEmpty}")
	private String firstName;
	
	private String lastName;
	
	@Email(message = "$Value{email}")
	private String email;
	

	@Pattern(regexp = "\\d{10}")
	@Size(min = 1 , max = 10)
	private String phoneNumber;
	
	private String department;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER, mappedBy = "instructor")
	private List<Course> courses; 
	
}
