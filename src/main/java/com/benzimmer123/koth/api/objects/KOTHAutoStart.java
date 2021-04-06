package com.benzimmer123.koth.api.objects;

public interface KOTHAutoStart {

	/**
	 * Method to get the amount of players for start
	 *
	 * @return int 
	 * 
	 */
	int getPlayers();

	/**
	 * Method to get the koth capture time
	 *
	 * @return int 
	 * 
	 */
	int getRunTime();

	/**
	 * Method to set the run time and players to null
	 */
	void resetAutoStart();

	/**
	 * Method to set the players and koth capture time
	 *
	 * @param int players
	 * @param int runTime 
	 * 
	 */
	void setAutoStart(int players, int runTime);

	/**
	 * Method to check if this amount of players is more than the auto start
	 *
	 * @param int players
	 * @return boolean 
	 * 
	 */
	boolean checkAutoStart(int players);

	/**
	 * Method to check if this koth has an auto start
	 *
	 * @return boolean 
	 * 
	 */
	boolean hasAutoStart();

}