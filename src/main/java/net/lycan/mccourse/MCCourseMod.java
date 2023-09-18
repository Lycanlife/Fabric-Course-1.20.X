package net.lycan.mccourse;

import net.fabricmc.api.ModInitializer;

import net.lycan.mccourse.block.ModBlocks;
import net.lycan.mccourse.block.entity.ModBlockEntities;
import net.lycan.mccourse.effect.ModEffects;
import net.lycan.mccourse.enchantment.ModEnchantments;
import net.lycan.mccourse.fluid.ModFluids;
import net.lycan.mccourse.item.ModItemGroup;
import net.lycan.mccourse.item.ModItems;
import net.lycan.mccourse.painting.ModPainting;
import net.lycan.mccourse.particle.ModParticles;
import net.lycan.mccourse.potion.ModPotions;
import net.lycan.mccourse.recipe.ModRecipes;
import net.lycan.mccourse.screen.ModScreenHandlers;
import net.lycan.mccourse.sound.ModSounds;
import net.lycan.mccourse.util.ModLootTableModifiers;
import net.lycan.mccourse.util.ModRegistries;
import net.lycan.mccourse.villager.ModVillagers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroup.registerItemGroups();
		ModRegistries.registerModStuff();
		ModEnchantments.registerEnchantments();
		ModSounds.registerSounds();
		ModLootTableModifiers.modifyLootTables();
		ModPainting.registerModPainting();
		ModEffects.registerModEffects();
		ModPotions.registerPotions();
		ModParticles.registerParticles();
		ModVillagers.registerVillagers();
		ModFluids.registerFluids();
		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerModScreenHandlers();
		ModRecipes.registerRecipes();
	}
}