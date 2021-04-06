package com.benzimmer123.koth.api.objects;

import org.bukkit.entity.Player;

public interface KOTHRegion {

	/**
	 * Method to check if a player is in a region
	 *
	 * @param Player p
	 * @return boolean
	 * 
	 */
	boolean isInRegion(Player p);

	/**
	 * Method to get the region name
	 *
	 * @return String
	 * 
	 */
	String getName();

}