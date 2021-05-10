package com.benzimmer123.koth.api.objects;

import org.bukkit.Location;

import com.benzimmer123.koth.api.enums.EditLootAction;

public interface KOTHPlayer {
	
	/**
	 * Method to get the player name
	 *
	 * @return String
	 * 
	 */
	String getName();

	/**
	 * Method to get the players team name
	 *
	 * @return String
	 * 
	 */
	String getTeamName();

	/**
	 * Method to set a koth timeout
	 *
	 * @param long kothTimeout
	 * 
	 */
	void setKOTHTimeout(long kothTimeout);

	/**
	 * Method to get a players koth timeout (as timestamp)
	 *
	 * @param long
	 * 
	 */
	long getKOTHTimeout();

	/**
	 * Method to check if this player has a koth timeout
	 *
	 * @return boolean
	 * 
	 */
	boolean hasKOTHTimeout();
	
	/**
	 * Method to check if this player's koth timeout has expired
	 *
	 * @return boolean
	 * 
	 */
	boolean hasKOTHTimeoutExpired();

	/**
	 * Method to check if this player has a koth cooldown
	 *
	 * @return boolean
	 * 
	 */
	boolean hasKOTHCooldown();

	/**
	 * Method to set a koth cooldown
	 *
	 * @param long kothCooldown
	 * 
	 */
	void setKOTHCooldown(long kothCooldown);

	/**
	 * Method to get a players koth cooldown (as timestamp)
	 *
	 * @param long
	 * 
	 */
	long getKOTHCooldown();

	/**
	 * Method to check if a player has expired editing loot
	 *
	 * @return boolean
	 * 
	 */
	boolean hasEditingLootExpired();

	/**
	 * Method to get a players koth timeout (as timestamp)
	 *
	 * @return long
	 * 
	 */
	long getEditingLootTimeout();

	/**
	 * Method to set a players koth editing loot timeout (as timestamp)
	 *
	 * @param long editingLootTimeout
	 * 
	 */
	void setEditingKOTHLootTimeout(long editingLootTimeout);

	/**
	 * Method to get the EditingLootAction a player is performing
	 *
	 * @return EditLootAction
	 * 
	 */
	EditLootAction getEditingKOTHLootAction();

	/**
	 * Method to set the EditingLootAction for a player
	 *
	 * @param EditLootAction editingLootAction
	 * 
	 */
	void setEditingKOTHLootAction(EditLootAction editingLootAction);

	/**
	 * Method to get the koth arena they are editing the loot for
	 *
	 * @return KOTHArena
	 * 
	 */
	KOTHArena getEditingKOTHLoot();

	/**
	 * Method to set the koth arena they are editing the loot for
	 *
	 * @param KOTHArena editingLootLocation
	 * 
	 */
	void setEditingKOTHLoot(KOTHArena editingLootLocation);

	/**
	 * Method to set if a player is starting a koth
	 *
	 * @param boolean isStartingKOTH
	 * 
	 */
	void setStartingKOTH(boolean isStartingKOTH);

	/**
	 * Method to check if a player has the start gui open
	 *
	 * @return boolean
	 * 
	 */
	boolean isStartingKOTH();

	/**
	 * Method to check if a player has a koth wand location
	 *
	 * @return boolean
	 * 
	 */
	boolean hasWandLocation();

	/**
	 * Method to add a koth wand location
	 *
	 * @param int numberLocation
	 * @param Location wandLocation
	 * 
	 */
	void addWandLocation(int numberLocation, Location wandLocation);

	/**
	 * Method to set if a player has a disabled scoreboard
	 *
	 * @param boolean hasDisabledScoreboard
	 * 
	 */
	void setDisabledScoreboard(boolean hasDisabledScoreboard);

	/**
	 * Method to check if a player has a disabled scoreboard
	 *
	 * @return boolean
	 * 
	 */
	boolean hasDisabledScoreboard();

	/**
	 * Method to check a players capturing speed
	 *
	 * @return int
	 * 
	 */
	int getCappingSpeed();
	
	/**
	 * Method to set if a player is in bypass mode
	 *
	 * @param boolean inBypassMode
	 * 
	 */
	void setBypassMode(boolean inBypassMode);

	/**
	 * Method to check if a player is in bypass mode
	 *
	 * @return boolean
	 * 
	 */
	boolean inBypassMode();

	/**
	 * Method to set if a player is in a disabled scoreboard world
	 *
	 * @param boolean inDisabledScoreboardWorld
	 * 
	 */
	void setDisabledScoreboardWorld(boolean inDisabledScoreboardWorld);

	/**
	 * Method to check if a player is in a disabled scoreboard world
	 *
	 * @return boolean
	 * 
	 */
	boolean inDisabledScoreboardWorld();

	/**
	 * Method to check if a player has a saved inventory
	 *
	 * @return boolean
	 * 
	 */
	boolean hasStoredInventory();

}