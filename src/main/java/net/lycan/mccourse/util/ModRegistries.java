package net.lycan.mccourse.util;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.lycan.mccourse.command.ReturnHomeCommand;
import net.lycan.mccourse.command.SetHomeCommand;
import net.lycan.mccourse.event.AttackEntityHandler;
import net.lycan.mccourse.event.PlayerCopyHandler;
import net.lycan.mccourse.item.ModItems;
import net.minecraft.block.ComposterBlock;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.server.network.ServerPlayerEntity;

public class ModRegistries {
    public static void registerModStuff(){
    registerFuels();
    registerModCompostables();
    registerCommands();
    registerEvents();
    }
    private static void registerFuels(){
        FuelRegistry registry = FuelRegistry.INSTANCE;


        registry.add(ModItems.PEAT_BRICK, 200);
    }
    private static void registerModCompostables(){
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CAULIFLOWER, 0.5f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CAULIFLOWER_SEEDS, 0.25f);
    }
    private static void registerCommands(){
        CommandRegistrationCallback.EVENT.register(SetHomeCommand::register);
        CommandRegistrationCallback.EVENT.register(ReturnHomeCommand::register);
    }
    private static void registerEvents(){
        AttackEntityCallback.EVENT.register(new AttackEntityHandler());
        ServerPlayerEvents.COPY_FROM.register(new PlayerCopyHandler());
    }

}
