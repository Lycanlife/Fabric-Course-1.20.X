package net.lycan.mccourse;

import net.fabricmc.api.ModInitializer;

import net.lycan.mccourse.block.ModBlocks;
import net.lycan.mccourse.enchantment.ModEnchantments;
import net.lycan.mccourse.item.ModItemGroup;
import net.lycan.mccourse.item.ModItems;
import net.lycan.mccourse.util.ModRegistries;
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
	}
}