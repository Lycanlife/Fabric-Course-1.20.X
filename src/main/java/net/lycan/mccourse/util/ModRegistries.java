package net.lycan.mccourse.util;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.lycan.mccourse.block.ModBlocks;
import net.lycan.mccourse.command.ReturnHomeCommand;
import net.lycan.mccourse.command.SetHomeCommand;
import net.lycan.mccourse.event.AttackEntityHandler;
import net.lycan.mccourse.event.PlayerCopyHandler;
import net.lycan.mccourse.item.ModItems;
import net.lycan.mccourse.mixin.BrewingRecipeRegistryMixin;
import net.lycan.mccourse.potion.ModPotions;
import net.lycan.mccourse.villager.ModVillagers;
import net.minecraft.block.ComposterBlock;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModRegistries {
    public static void registerModStuff(){
    registerFuels();
    registerModCompostables();
    registerCommands();
    registerEvents();
    registerPotionRecipes();
    registerCustomTrades();
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
    private static void registerPotionRecipes(){
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, ModItems.PINK_GARNET, ModPotions.SLIMEY_POTION);
    }
    private static void registerCustomTrades(){
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
       factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(ModItems.CAULIFLOWER, 2), 6, 2, 0.02f
            ));
       });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 16),
                            new ItemStack(ModItems.PINK_GARNET_PAXEL, 1), 2, 5, 0.02f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(ModItems.RADIATION_STAFF, 1), 2, 5, 0.02f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 8),
                            new ItemStack(ModBlocks.SOUND_BLOCK, 1), 3, 5, 0.02f
                    ));
                });
         TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(ModItems.METAL_DETECTOR, 1), 1, 5, 0.02f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(ModItems.PINK_GARNET, 8), 1, 5, 0.02f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(ModItems.PEAT_BRICK, 8), 1, 5, 0.02f
                    ));
                });

    }

}
