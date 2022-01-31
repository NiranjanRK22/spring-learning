package com.sportsapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity   
@Table(name="teamsports")
@NamedQuery(name="findBySponsorsStadium", query="from Sports s where s.sponsors=?1 and s.stadium=?2")
public class Sports {
	
    private String name;
    @Column(name="playercount")
	private int playerCount;
    @Column(name="coachname", length=20)
	private String coachName;
	@Id
	@Column(name="sportsid")
	@GeneratedValue(generator="sports_seq", strategy=GenerationType.AUTO)
	@SequenceGenerator(name="sports_seq", sequenceName="sports_sequence", initialValue=100, allocationSize=1)
	private Integer sportsId;
	@Enumerated(EnumType.STRING)
	private Type type;
	private String duration;
	private String sponsors;
	private String stadium;
	private String city;
	/**
	 * 
	 */
	public Sports() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param playerCount
	 * @param coachName
	 * @param type
	 * @param duration
	 * @param sponsors
	 * @param stadium
	 * @param city
	 */
	public Sports(String name, int playerCount, String coachName, Type type, String duration, String sponsors,
			String stadium, String city) {
		super();
		this.name = name;
		this.playerCount = playerCount;
		this.coachName = coachName;
		this.type = type;
		this.duration = duration;
		this.sponsors = sponsors;
		this.stadium = stadium;
		this.city = city;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the playerCount
	 */
	public int getPlayerCount() {
		return playerCount;
	}
	/**
	 * @param playerCount the playerCount to set
	 */
	public void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}
	/**
	 * @return the coachName
	 */
	public String getCoachName() {
		return coachName;
	}
	/**
	 * @param coachName the coachName to set
	 */
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	/**
	 * @return the sportsId
	 */
	public Integer getSportsId() {
		return sportsId;
	}
	/**
	 * @param sportsId the sportsId to set
	 */
	public void setSportsId(Integer sportsId) {
		this.sportsId = sportsId;
	}
	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}
	/**
	 * @return the duration
	 */
	public String getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}
	/**
	 * @return the sponsors
	 */
	public String getSponsors() {
		return sponsors;
	}
	/**
	 * @param sponsors the sponsors to set
	 */
	public void setSponsors(String sponsors) {
		this.sponsors = sponsors;
	}
	/**
	 * @return the stadium
	 */
	public String getStadium() {
		return stadium;
	}
	/**
	 * @param stadium the stadium to set
	 */
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Sports [name=" + name + ", playerCount=" + playerCount + ", coachName=" + coachName + ", sportsId="
				+ sportsId + ", type=" + type + ", duration=" + duration + ", sponsors=" + sponsors + ", stadium="
				+ stadium + ", city=" + city + "]";
	}
	
	
}
