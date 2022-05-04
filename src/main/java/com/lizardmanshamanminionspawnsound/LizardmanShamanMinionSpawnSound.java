package com.lizardmanshamanminionspawnsound;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.api.NPC;
import net.runelite.api.NpcID;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.config.ConfigManager;

@Slf4j
@PluginDescriptor(
		name = "Lizardman Shaman Minion Spawn Sound",
		description = "Plays an sound effect when Lizardman Shaman spawns a Minion",
		loadWhenOutdated = true
)

public class ShamanSound extends Plugin {
	@Inject
	private Client client;

	@Inject
	private ShamanSoundConfig config;

	@Subscribe
	private void onNpcSpawned(NpcSpawned npcSpawned)
	{
		NPC npc = npcSpawned.getNpc();

		switch (npc.getId())
		{
			case NpcID.SPAWN_6768:
				log.info("Spawn Spawned");
				client.playSoundEffect(2596, config.volume());
				break;
		}
	}

	@Provides
	ShamanSoundConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(ShamanSoundConfig.class);
	}
}