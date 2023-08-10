package net.lycan.mccourse.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.lycan.mccourse.item.ModItems;

public class ModRegistries {
    public static void registerModStuff(){
registerFuels();
    }
    private static void registerFuels(){
        FuelRegistry registry = FuelRegistry.INSTANCE;


        registry.add(ModItems.PEAT_BRICK, 200);
    }
}
