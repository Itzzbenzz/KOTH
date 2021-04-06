package com.benzimmer123.koth.api.objects;

public interface KOTHTopPlayer {

	/**
	 * Method to set how many participations a player has
	 *
	 * @param int participations
	 * 
	 */
	void setParticipations(int participations);

	/**
	 * Method to set how many wins a player has
	 *
	 * @param int wins
	 * 
	 */
	void setWins(int wins);

	/**
	 * Method to how many participations a player has
	 *
	 * @return int
	 * 
	 */
	int getParticipations();

	/**
	 * Method to how many wins a player has
	 *
	 * @return int
	 * 
	 */
	int getWins();

	/**
	 * Method to check a players team name
	 *
	 * @return String
	 * 
	 */
	String getTeamName();

	/**
	 * Method to check a players name
	 *
	 * @return String
	 * 
	 */
	String getPlayerName();

	/**
	 * Method to check a players uuid as a string
	 *
	 * @return String
	 * 
	 */
	String getUUID();

	/**
	 * Method to compare wins to another KOTHTopPlayer
	 *
	 * @return int
	 * 
	 */
	int compareTo(KOTHTopPlayer player);

}