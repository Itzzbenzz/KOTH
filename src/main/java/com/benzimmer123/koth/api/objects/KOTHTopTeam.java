package com.benzimmer123.koth.api.objects;

public interface KOTHTopTeam {

	/**
	 * Method to set participations
	 *
	 * @param int participations
	 * 
	 */
	void setParticipations(int participations);

	/**
	 * Method to set how many wins
	 *
	 * @param int wins
	 * 
	 */
	void setWins(int wins);

	/**
	 * Method to how many participations a team has
	 *
	 * @return int
	 * 
	 */
	int getParticipations();

	/**
	 * Method to how many wins a team has
	 *
	 * @return int
	 * 
	 */
	int getWins();

	/**
	 * Method to get the team name
	 *
	 * @return String
	 * 
	 */
	String getTeamName();
	
	/**
	 * Method to get the team id
	 *
	 * @return String
	 * 
	 */
	String getTeamID();
	
	/**
	 * Method to compare wins to another KOTHTopTeam
	 *
	 * @return int
	 * 
	 */
	int compareTo(KOTHTopTeam team);

}