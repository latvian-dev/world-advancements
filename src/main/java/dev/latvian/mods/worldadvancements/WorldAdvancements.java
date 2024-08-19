package dev.latvian.mods.worldadvancements;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(WorldAdvancements.MOD_ID)
public class WorldAdvancements {
	public static final String MOD_ID = "worldadvancements";

	public static ResourceLocation id(String path) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
	}

	public WorldAdvancements(IEventBus bus) {
	}
}