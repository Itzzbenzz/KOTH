package com.benzimmer123.koth.api.events;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.benzimmer123.koth.api.objects.KOTHArena;

public class KothStartCapEvent extends Event implements Cancellable {

	private KOTHArena koth;
	private double x;
	private double y;
	private double z;
	private World world;
	private Player player;
	private String teamName;
	private boolean cancelled;

	public KothStartCapEvent(KOTHArena koth, Player player, String teamName, World world, int x, int y, int z) {
		this.koth = koth;
		this.world = world;
		this.x = x;
		this.y = y;
		this.z = z;
		this.teamName = teamName;
		this.player = player;
	}

	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	public Player getCapper() {
		return player;
	}

	public String getCapperTeamName() {
		return teamName;
	}

	public KOTHArena getKOTH() {
		return koth;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}

	public World getWorld() {
		return world;
	}

	private static final HandlerList handlers = new HandlerList();

	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

}
