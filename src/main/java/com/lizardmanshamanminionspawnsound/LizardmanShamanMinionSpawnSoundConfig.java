package com.lizardmanshamanminionspawnsound;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup(LizardmanShamanMinionSpawnSoundConfig.GROUP)
public interface LizardmanShamanMinionSpawnSoundConfig extends Config {
	String GROUP = "lizardmanshamanminionspawnsound";

	// Windows Group

	@ConfigSection(
			name = "Windows Sounds",
			description = "Windows sound options to play when a minion spawns",
			position = 0,
			closedByDefault = true
	)
	String windowsSection = "windowssoundeffects";

	// Windows Options

	@ConfigItem(
			position = 0,
			keyName = "windowsErrorBeep",
			name = "Error Beep",
			description = "Plays the windows error beep on minion spawn",
			section = windowsSection
	)
	default boolean windowsErrorBeep()
	{
		return false;
	}

	// Game Group

	@ConfigSection(
			name = "Game Sounds",
			description = "Game sound options to play when a minion spawns",
			position = 1,
			closedByDefault = true
	)
	String gameSection = "gamesoundeffects";

	// Game Attack Hit Options

	@ConfigItem(
			position = 0,
			keyName = "gameAttackHit",
			name = "Attack Hit",
			description = "Plays the Attack Hit sound on minion spawn",
			section = gameSection
	)
	default boolean gameAttackHit()
	{
		return false;
	}

	@ConfigItem(
			position = 1,
			keyName = "gameAttackHitVolume",
			name = "Attack Hit Volume",
			description = "The volume of the Attack Hit sound on minion spawn",
			section = gameSection
	)
	default int gameAttackHitVolume()
	{
		return 100;
	}

	// Game Bury Bones Options

	@ConfigItem(
			position = 2,
			keyName = "gameBuryBones",
			name = "Bury Bones",
			description = "Plays the Bury Bones sound on minion spawn",
			section = gameSection
	)
	default boolean gameBuryBones()
	{
		return false;
	}

	@ConfigItem(
			position = 3,
			keyName = "gameBuryBonesVolume",
			name = "Bury Bones Volume",
			description = "The volume of the Bury Bones sound on minion spawn",
			section = gameSection
	)
	default int gameBuryBonesVolume()
	{
		return 100;
	}

	// Game Close Door Options

	@ConfigItem(
			position = 4,
			keyName = "gameCloseDoor",
			name = "Close Door",
			description = "Plays the Close Door sound on minion spawn",
			section = gameSection
	)
	default boolean gameCloseDoor()
	{
		return false;
	}

	@ConfigItem(
			position = 5,
			keyName = "gameCloseDoorVolume",
			name = "Close Door Volume",
			description = "The volume of the Close Door sound on minion spawn",
			section = gameSection
	)
	default int gameCloseDoorVolume()
	{
		return 100;
	}

	// Game Cook Woosh Options

	@ConfigItem(
			position = 6,
			keyName = "gameCookWoosh",
			name = "Cook Woosh",
			description = "Plays the Cook Woosh sound on minion spawn",
			section = gameSection
	)
	default boolean gameCookWoosh()
	{
		return false;
	}

	@ConfigItem(
			position = 7,
			keyName = "gameCookWooshVolume",
			name = "Cook Woosh Volume",
			description = "The volume of the Cook Woosh sound on minion spawn",
			section = gameSection
	)
	default int gameCookWooshVolume()
	{
		return 100;
	}

	// Game Fire Woosh Options

	@ConfigItem(
			position = 8,
			keyName = "gameFireWoosh",
			name = "Fire Woosh",
			description = "Plays the Fire Woosh sound on minion spawn",
			section = gameSection
	)
	default boolean gameFireWoosh()
	{
		return false;
	}

	@ConfigItem(
			position = 9,
			keyName = "gameFireWooshVolume",
			name = "Fire Woosh Volume",
			description = "The volume of the Fire Woosh sound on minion spawn",
			section = gameSection
	)
	default int gameFireWooshVolume()
	{
		return 100;
	}

	// Game Ge Add Offer Dingaling Options

	@ConfigItem(
			position = 10,
			keyName = "gameGeAddOfferDingaling",
			name = "Ge Add Offer Dingaling",
			description = "Plays the Ge Add Offer Dingaling sound on minion spawn",
			section = gameSection
	)
	default boolean gameGeAddOfferDingaling()
	{
		return false;
	}

	@ConfigItem(
			position = 11,
			keyName = "gameGeAddOfferDingalingVolume",
			name = "Ge Add Offer Dingaling Volume",
			description = "The volume of the Ge Add Offer Dingaling sound on minion spawn",
			section = gameSection
	)
	default int gameGeAddOfferDingalingVolume()
	{
		return 100;
	}

	// Game Ge Coin Tinkle Options

	@ConfigItem(
			position = 12,
			keyName = "gameGeCoinTinkle",
			name = "Ge Coin Tinkle",
			description = "Plays the Ge Coin Tinkle sound on minion spawn",
			section = gameSection
	)
	default boolean gameGeCoinTinkle()
	{
		return false;
	}

	@ConfigItem(
			position = 13,
			keyName = "gameGeCoinTinkleVolume",
			name = "Ge Coin Tinkle Volume",
			description = "The volume of the Ge Coin Tinkle sound on minion spawn",
			section = gameSection
	)
	default int gameGeCoinTinkleVolume()
	{
		return 100;
	}

	/* // Game NPC Teleport Woosh Options

	@ConfigItem(
			position = 2,
			keyName = "gameNPCTeleportWoosh",
			name = "NPC Teleport Woosh",
			description = "Plays the npc teleport woosh sound on minion spawn",
			section = gameSection
	)
	default boolean gameNPCTeleportWoosh()
	{
		return false;
	}

	@ConfigItem(
			position = 3,
			keyName = "gameNPCTeleportWooshVolume",
			name = "NPC Teleport Woosh Volume",
			description = "The volume of the npc teleport woosh sound on minion spawn",
			section = gameSection
	)
	default int gameNPCTeleportWooshVolume()
	{
		return 100;
	} */
}