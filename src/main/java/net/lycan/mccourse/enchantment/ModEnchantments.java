package net.lycan.mccourse.enchantment;

import net.lycan.mccourse.MCCourseMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantments {
    public static final Enchantment LIGHTNING_STRIKER = register("lightning_striker",
            new LightningStrikerEnchantment(Enchantment.Rarity.COMMON,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

    public static void registerEnchantments(){
        MCCourseMod.LOGGER.info("Registering ModEnchantments for " + MCCourseMod.MOD_ID);
    }
    public static Enchantment register(String name, Enchantment enchantment){
        return Registry.register(Registries.ENCHANTMENT, new Identifier(MCCourseMod.MOD_ID, name), enchantment);
    }

}
