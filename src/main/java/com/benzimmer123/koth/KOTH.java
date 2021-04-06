package com.benzimmer123.koth;

import com.benzimmer123.koth.managers.KOTHManager;

public class KOTH {

	private static final KOTH instance = new KOTH();
	private static final KOTHManager kothManager = new KOTHManager();

	public static KOTH getInstance() {
		return instance;
	}

	public KOTHManager getKOTHManager() {
		return kothManager;
	}

}
