package com.benzimmer123.koth.api.objects;

import org.bukkit.Location;

public interface KOTHLootLocation {

	/**
	 * Method to convert a saved location to a bukkit location
	 *
	 * @return Location
	 * 
	 */
	Location toLocation();

}