package com.benzimmer123.koth.api.objects;

import java.util.UUID;

public interface KOTHPoints {

	/**
	 * Method to check if the plugin has points enabled
	 *
	 * @return boolean 
	 * 
	 */
	boolean isEnabled();

	/**
	 * Method to check if the plugin is using teams
	 *
	 * @return boolean 
	 * 
	 */
	boolean isTeam();

	/**
	 * Method to get the player uuid associated with the stored name
	 *
	 * @param String name
	 * @return UUID 
	 * 
	 */
	UUID getUUIDFromName(String name);

	/**
	 * Method to get the name at position
	 *
	 * @param int pos
	 * @return String 
	 * 
	 */
	String getPosition(int pos);

	/**
	 * Method to get the amount as a String at a position
	 *
	 * @param int pos
	 * @return String 
	 * 
	 */
	String getAmountPosition(int pos);

	/**
	 * Method to add points to a name, associated with a uuid
	 *
	 * @param String name
	 * @param int amount
	 * @param UUID uuid
	 * 
	 */
	void addPoints(String name, int amount, UUID uuid);

	/**
	 * Method to get the amount of points from a name
	 *
	 * @param String name
	 * @return int 
	 * 
	 */
	int getPoints(String name);

	/**
	 * Method to sort all the stored points
	 */
	void sortPoints();
}