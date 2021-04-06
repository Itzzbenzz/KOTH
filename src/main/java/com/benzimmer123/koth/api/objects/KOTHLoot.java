package com.benzimmer123.koth.api.objects;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

import com.benzimmer123.koth.api.enums.LootType;

public interface KOTHLoot {

	/**
	 * Method to get all loot locations as bukkit Locations
	 * 
	 * @return List of bukkit Locations
	 * 
	 */
	List<Location> getLootLocations();

	/**
	 * Method to get all loot items as ItemStacks
	 * 
	 * @return List of bukkit ItemStacks
	 * 
	 */
	List<ItemStack> getLootItemStacks();

	/**
	 * Method to clear all loot items associated with this koth
	 * 
	 */
	void clearLootItems();

	/**
	 * Method to get all loot items in a list
	 * 
	 * @param boolean allowDuplicates
	 * @return List of KOTHLootItem
	 * 
	 */
	List<KOTHLootItem> getLootItems(boolean allowDuplicates);

	/**
	 * Method to set the koths LootType
	 * 
	 * @param LootType lootType
	 * 
	 */
	void setLootType(LootType lootType);

	/**
	 * Method to get the koths LootType
	 * 
	 * @return LootType
	 * 
	 */
	LootType getLootType();

	/**
	 * Method to clear all loot locations associated with this koth
	 * 
	 */
	void clearLootLocations();

	/**
	 * Method to add a loot item
	 * 
	 * @param ItemStack loot
	 * @param int percent
	 * @param int slot
	 * 
	 */
	void addLootItem(ItemStack loot, int percent, int slot);

	/**
	 * Method to add a loot location
	 * 
	 * @param Location loc
	 * 
	 */
	void addLootLocation(Location loc);

	/**
	 * Method to remove a loot location
	 * 
	 * @param Location loc
	 * 
	 */
	void removeLootLocation(Location loc);

}