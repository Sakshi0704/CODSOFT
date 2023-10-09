package com.codsoft.dto;


public class GameDTO {
	
	private String userName;
	
	private Long scores;
	
	private Integer take_rounds;


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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
