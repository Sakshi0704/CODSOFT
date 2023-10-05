package com.codsoft.dto;


public class GameDTO {

	private Integer Id;
	
	private String name;
	
	private Long scores;
	
	private Integer take_rounds;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getScores() {
		return scores;
	}

	public void setScores(Long scores) {
		this.scores = scores;
	}

	public Integer getTake_rounds() {
		return take_rounds;
	}

	public void setTake_rounds(Integer take_rounds) {
		this.take_rounds = take_rounds;
	}

	
}
