package net.lycan.mccourse.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.lycan.mccourse.item.ModItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;
    public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
        public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
            super(output, completableFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup arg) {
            getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                    .add(ModItems.PINK_GARNET_HELMET, ModItems.PINK_GARNET_CHESTPLATE, ModItems.PINK_GARNET_LEGGINGS, ModItems.PINK_GARNET_BOOTS);
        }
    }
