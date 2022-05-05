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
import net.runelite.api.SoundEffectID;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.config.ConfigManager;
import java.awt.*;

@Slf4j
@PluginDescriptor(
		name = "Lizardman Shaman Minion Spawn Sound",
		description = "Plays an sound effect when Lizardman Shaman spawns a Minion",
		loadWhenOutdated = true
)

public class LizardmanShamanMinionSpawnSoundPlugin extends Plugin {
	@Inject
	private Client client;

	@Inject
	private LizardmanShamanMinionSpawnSoundConfig config;

	@Subscribe
	private void onNpcSpawned(NpcSpawned npcSpawned)
	{
		NPC npc = npcSpawned.getNpc();

		switch (npc.getId())
		{
			case NpcID.SPAWN_6768:
				log.info("Minion Spawned");
				if (config.windowsErrorBeep() == true) {
					Toolkit.getDefaultToolkit().beep();
				}
				if (config.gameAttackHit() == true) {
					client.playSoundEffect(SoundEffectID.ATTACK_HIT, config.gameAttackHitVolume());
				}
				if (config.gameBuryBones() == true) {
					client.playSoundEffect(SoundEffectID.BURY_BONES, config.gameBuryBonesVolume());
				}
				if (config.gameCloseDoor() == true) {
					client.playSoundEffect(SoundEffectID.CLOSE_DOOR, config.gameCloseDoorVolume());
				}
				if (config.gameCookWoosh() == true) {
					client.playSoundEffect(SoundEffectID.COOK_WOOSH, config.gameCookWooshVolume());
				}
				if (config.gameFireWoosh() == true) {
					client.playSoundEffect(SoundEffectID.FIRE_WOOSH, config.gameFireWooshVolume());
				}
				if (config.gameGeAddOfferDingaling() == true) {
					client.playSoundEffect(SoundEffectID.GE_ADD_OFFER_DINGALING, config.gameGeAddOfferDingalingVolume());
				}
				if (config.gameGeCoinTinkle() == true) {
					client.playSoundEffect(SoundEffectID.GE_COIN_TINKLE, config.gameGeCoinTinkleVolume());
				}
				if (config.gameNPCTeleportWoosh() == true) {
					client.playSoundEffect(SoundEffectID.NPC_TELEPORT_WOOSH, config.gameNPCTeleportWooshVolume());
				}
				break;
		}
	}

	@Provides
	LizardmanShamanMinionSpawnSoundConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(LizardmanShamanMinionSpawnSoundConfig.class);
	}
}