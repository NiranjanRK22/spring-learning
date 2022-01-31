package com.player.model;

public class Player {
     private Integer playerId;
     private String name;
     private String sport;
     private String city;
     private int age;
     private boolean playedNational;
     private int matchesPlayed;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(Integer playerId, String name, String sport, String city, int age, boolean playedNational,
			int matchesPlayed) {
		super();
		this.playerId = playerId;
		this.name = name;
		this.sport = sport;
		this.city = city;
		this.age = age;
		this.playedNational = playedNational;
		this.matchesPlayed = matchesPlayed;
	}
	public Integer getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isPlayedNational() {
		return playedNational;
	}
	public void setPlayedIpl(boolean playedNational) {
		this.playedNational = playedNational;
	}
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", name=" + name + ", sport=" + sport + ", city=" + city + ", age="
				+ age + ", playedNational=" + playedNational + ", matchesPlayed=" + matchesPlayed + "]";
	}
	 
     
}
