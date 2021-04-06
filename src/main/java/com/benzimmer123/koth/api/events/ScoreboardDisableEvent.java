package com.benzimmer123.koth.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ScoreboardDisableEvent extends Event {
	
	private Player p;
	
	public ScoreboardDisableEvent(Player p) {
		this.p = p;
	}
	
	public Player getPlayer() {
		return p;
	}

	private static final HandlerList handlers = new HandlerList();

	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

}
