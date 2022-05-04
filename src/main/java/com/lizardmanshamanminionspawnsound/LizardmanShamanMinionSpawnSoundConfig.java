package com.lizardmanshamanminionspawnsound;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("lizardmanshamanminionspawnsound")
public interface LizardmanShamanMinionSpawnSoundConfig extends Config {
	@ConfigItem(
			keyName = "volume",
			name = "Minion Spawn Volume",
			description = "The volume of the minion spawn sound"
	)
	default int volume()
	{
		return 100;
	}
}