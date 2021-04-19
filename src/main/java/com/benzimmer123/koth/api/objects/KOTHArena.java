package com.benzimmer123.koth.api.objects;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public interface KOTHArena {

	/**
	 * Method to start a koth (advised to use KOTH.getInstance().getKOTHManager().callTask() instead)
	 *
	 * @param int maxRunTime
	 * @param int requiredTime (use -1 if using point system)
	 * @param int maxPoints (use -1 if using timer system)
	 * @param int syncTaskID
	 * @param int asyncTaskID
	 * @param boolean reset (reset the current total run time)
	 * 
	 */
	void start(int maxRunTime, int requiredTime, int maxPoints, int syncTaskID, int asyncTaskID, boolean reset);

	/**
	 * Method to find a random available player to capture
	 *
	 * @return Player
	 * 
	 */
	Player findPlayer();

	/**
	 * Method to set the capper name (no other changes or checks)
	 *
	 * @param String
	 * 
	 */
	void setCapper(String capper);

	/**
	 * Method to set the capper and set if the previous player lost control
	 *
	 * @param Player capper
	 * @param boolean lostControl
	 * 
	 */
	void setCapper(Player capper, boolean lostControl);

	/**
	 * Method to call important tasks (sync)
	 */
	void callImportantTasks();

	/**
	 * Method to call capper tasks (async)
	 */	
	void callCapperTasks();

	/**
	 * Method to call a successful capture
	 */
	void successful();

	/**
	 * Method to disable the koth
	 * 
	 * @param CommandSender sender
	 * @param booelan announce
	 * 
	 */
	void disable(CommandSender sender, boolean announce);

	/**
	 * Method to reset capper data
	 * 
	 * @param Player capper
	 * 
	 */
	void resetData(Player capper);

	/**
	 * Method to get the KOTHPoints object
	 * 
	 * @return KOTHPoints
	 * 
	 */
	KOTHPoints getKOTHPoints();
	
	/**
	 * Method to get the KOTHAutoStart object
	 * 
	 * @return KOTHAutoStart
	 * 
	 */
	KOTHAutoStart getKOTHAutoStart();
	
	/**
	 * Method to get the KOTHLoot object
	 * 
	 * @return KOTHLoot
	 * 
	 */
	KOTHLoot getKOTHLoot();

	/**
	 * Method to get the KOTHDetails object
	 * 
	 * @return KOTHDetails
	 * 
	 */
	KOTHDetails getKOTHDetails();

	/**
	 * Method to get the KOTHScheduler object
	 * 
	 * @return KOTHScheduler
	 * 
	 */
	KOTHScheduler getKOTHScheduler();

	/**
	 * Method to get the KOTHLocation object
	 * 
	 * @return KOTHLocation
	 * 
	 */
	KOTHLocation getKOTHLocation();

	/**
	 * Method to get the time remaining as an int
	 * 
	 * @return int
	 * 
	 */
	int getTimeRemainingAsInt();

	/**
	 * Method to get the time remaining as a String
	 * 
	 * @return String
	 * 
	 */
	String getTimeRemainingAsString();

	/**
	 * Method to set the koth as temporarily disabled (for a cooldown)
	 * 
	 * @param boolean tempDisabled
	 * 
	 */	
	void setTempDisabled(boolean tempDisabled);

	/**
	 * Method to check if the koth is active
	 */
	boolean isActive();

	/**
	 * Method to get the capper name
	 * 
	 * @return String
	 * 
	 */
	String getCapper();

	/**
	 * Method to get the capper as a bukkit Player
	 * 
	 * @return Player
	 * 
	 */
	Player getPlayerCapper();

	/**
	 * Method to check if a bukkit location is in the koth zone
	 * 
	 * @param Location loc
	 * @return boolean
	 * 
	 */
	boolean contains(Location loc);

	/**
	 * Method to get the koth name
	 * 
	 * @param boolean capitalised
	 * @return String
	 * 
	 */
	String getName(boolean capitalised);
	
	/**
	 * Method to set the koth name
	 * 
	 * @param String name
	 * 
	 */
	void setName(String name);

	/**
	 * Method to save the koth to json
	 */
	void save();

}
