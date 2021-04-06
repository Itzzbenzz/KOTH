package com.benzimmer123.koth.api.objects;

import org.bukkit.inventory.ItemStack;

public interface KOTHLootItem {

	/**
	 * Method to get the percent chance of getting this item
	 *
	 * @return int
	 * 
	 */
	int getPercent();

	/**
	 * Method to get the serialized item string
	 *
	 * @return String
	 * 
	 */
	String getString();

	/**
	 * Method to get the saved slot
	 *
	 * @return int
	 * 
	 */
	int getSlot();

	/**
	 * Method to convert a saved string to an itemstack
	 *
	 * @return Location
	 * 
	 */
	ItemStack toItemStack();

}