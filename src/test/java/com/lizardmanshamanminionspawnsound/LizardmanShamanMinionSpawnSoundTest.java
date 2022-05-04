package com.lizardmanshamanminionspawnsound;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class LizardmanShamanMinionSpawnSoundTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(LizardmanShamanMinionSpawnSound.class);
		RuneLite.main(args);
	}
}