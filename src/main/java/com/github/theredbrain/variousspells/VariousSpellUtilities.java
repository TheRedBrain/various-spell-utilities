package com.github.theredbrain.variousspells;

import com.github.theredbrain.variousspells.registry.SpellSchoolRegistry;
import net.fabricmc.api.ModInitializer;

import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VariousSpellUtilities implements ModInitializer {
	public static final String MOD_ID = "variousspellutilities";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static RegistryEntry<EntityAttribute> GENERIC_MAGIC_DAMAGE;
	@Override
	public void onInitialize() {
		LOGGER.info("Various Spell Utilities initialized!");
		SpellSchoolRegistry.init();
	}

	public static Identifier identifier(String path) {
		return Identifier.of(MOD_ID, path);
	}

}