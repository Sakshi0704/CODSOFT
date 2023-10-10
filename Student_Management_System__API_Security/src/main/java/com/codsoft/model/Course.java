package com.codsoft.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "courseID")
	private Long courseId;
	
	@NotNull(message = "$Value{nameNotNull}")
	@NotEmpty(message = "$Value{nameNotEmpty}")
	private String courseName;
	
	private Integer credits;

	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@Column(name = "instuctorID")
	private Instructor instructor;

}
