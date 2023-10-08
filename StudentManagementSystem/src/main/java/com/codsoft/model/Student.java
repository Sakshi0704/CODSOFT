package com.codsoft.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer student_id;

	@Size(min = 1,max = 40, message = "student roll number should be in range 1 to 40")
	@Column(unique = true)
	private Integer rollNo;
	
	@NotNull(message = "$Value{name}")
	@NotEmpty(message = "First Name should not be empty")
	private String firstName;
	
	
	private String lastName;
	
	
	private LocalDate date_of_birth;
	
	@Email
	@Column(unique = true)
	private String email;

	
	@Pattern(regexp = "\\d{10}")
	@Size(min = 1 , max = 10)
	private String phoneNumber;
	
	@NotNull(message = "Address should not be null")
	@NotEmpty(message = "Address should not be empty")
	private String address;
	
	@Enumerated
	@Column(name = "class")
	private Class cName;
	
	
}
