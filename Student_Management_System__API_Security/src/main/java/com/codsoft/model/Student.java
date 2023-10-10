package com.codsoft.model;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "studentID")
	private Long student_id;

	@Column(unique = true)
	private String rollNo;
	
	@NotNull(message = "$Value{nameNotNull}")
	@NotEmpty(message = "$Value{nameNotEmpty}")
	private String firstName;
	
	private String lastName;
	
    @Past(message = "Date of birth must be in the past")
	private LocalDate date_of_birth;
	
	@Email
	@Column(unique = true)
	private String email;

	
	@Pattern(regexp = "\\d{10}")
	@Size(min = 1 , max = 10)
	private String phoneNumber;
	
	@NotNull(message = "$Value{addressNotNull}")
	@NotEmpty(message = "$Value{addressNotEmpty}")
	private String address;
	
	
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonIgnore
    private List<StudentEnrollment> enrollments;
    
}
