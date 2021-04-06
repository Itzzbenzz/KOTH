package com.benzimmer123.koth.api.objects;

import org.bukkit.Location;

public interface KOTHLocation {

	/**
	 * Method to get the world name
	 *
	 * @return String
	 * 
	 */
	String getWorld();

	/**
	 * Method to get the 1st location
	 *
	 * @return Location
	 * 
	 */
	Location getLocation1();

	/**
	 * Method to get the 2nd location
	 *
	 * @return Location
	 * 
	 */
	Location getLocation2();

	/**
	 * Method to set the 1st location
	 *
	 * @param Location loc
	 * 
	 */
	void setLocation1(Location loc);

	/**
	 * Method to set the 2nd location
	 *
	 * @param Location loc
	 * 
	 */
	void setLocation2(Location loc);

}
