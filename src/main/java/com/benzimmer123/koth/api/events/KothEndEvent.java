package com.benzimmer123.koth.api.events;

import org.bukkit.World;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.benzimmer123.koth.api.objects.KOTHArena;

public class KothEndEvent extends Event {

	private KOTHArena koth;
	private double x;
	private double y;
	private double z;
	private World world;

	public KothEndEvent(KOTHArena koth, World world, int x, int y, int z) {
		this.koth = koth;
		this.world = world;
		this.x = x;
		this.y = y;
		this.z = z;
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
