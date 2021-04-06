package com.benzimmer123.koth.managers;

import java.util.List;

import org.bukkit.entity.Player;

import com.benzimmer123.koth.api.objects.KOTHArena;

public class KOTHManager {

	
	/**
	 * Method to get all valid capturers in a koth zone
	 * 
	 * @param KOTHArena koth
	 * @return List of players
	 * 
	 */
	public List<Player> getValidCapturers(KOTHArena koth) {
		return null;
	}

	/**
	 * Method to get all active koths on the server
	 *
	 * @return List of active KOTHArenas
	 * 
	 */
	public List<KOTHArena> getActiveKOTHs() {
		return null;
	}

	/**
	 * Method to check if a player is capturing any koths
	 *
	 * @return KOTHArena player is controlling or null
	 * 
	 */
	public KOTHArena isCapping(Player p) {
		return null;
	}

	/**
	 * Method to check if a koth is active
	 *
	 * @return boolean
	 * 
	 */
	public boolean isActiveKOTH() {
		return false;
	}

	/**
	 * Method to get a KOTHArena from a String as the name
	 *
	 * @param String name
	 * @return KOTHArena or null
	 * 
	 */
	public KOTHArena getKOTHFromString(String name) {
		return null;
	}

	/**
	 * Method that calls the start api event, broadcasts, and checks if koth is already active
	 *
	 * @param KOTHArena koth
	 * @param int requiredTime to capture the koth
	 * @param Player p who executed the command (null is console)
	 * @param boolean anonymous to start without broadcast
	 * @param int maxruntime time in seconds until the koth expires
	 * @param int maxpoints if using point system the max number of points until captured
	 * 
	 * @return boolean if started
	 * 
	 */
	public boolean callTask(KOTHArena koth, int requiredtime, Player p, boolean anonymous, int maxruntime, int maxpoints) {
		return true;
	}
}
