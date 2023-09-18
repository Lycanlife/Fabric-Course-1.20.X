package net.lycan.mccourse.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.lycan.mccourse.MCCourseMod;
import net.lycan.mccourse.item.ModItems;
import net.lycan.mccourse.util.InventoryUtil;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementDisplay;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.advancement.criterion.UsingItemCriterion;
import net.minecraft.item.ItemStack;
import net.minecraft.predicate.entity.EntityPredicate;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModAdvancementProvider extends FabricAdvancementProvider {
    public ModAdvancementProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        Advancement rootAdvancement = Advancement.Builder.create()
                .display(new AdvancementDisplay(new ItemStack(ModItems.PINK_GARNET),
                        Text.literal("MC Course"), Text.literal("The Power lies in the Pink Garnet!"),
                        new Identifier(MCCourseMod.MOD_ID, "textures/block/pink_garnet_ore.png"), AdvancementFrame.TASK,
                        true, true, false))
                .criterion("has_pink_garnet", InventoryChangedCriterion.Conditions.items(ModItems.PINK_GARNET))
                .build(consumer, MCCourseMod.MOD_ID + ":mccourse");

        Advancement metalDetector = Advancement.Builder.create()
                .display(new AdvancementDisplay(new ItemStack(ModItems.METAL_DETECTOR),
                        Text.literal("Metal Detector"), Text.literal("Batteries not included! (Actually doesn't need batteries)"),
                        new Identifier(MCCourseMod.MOD_ID, "block/pink_garnet_ore"), AdvancementFrame.TASK,
                        true, true, false))
                .criterion("has_used_metal_detector", InventoryChangedCriterion.Conditions.items(ModItems.METAL_DETECTOR))
                .parent(rootAdvancement)
                .build(consumer, MCCourseMod.MOD_ID + ":metal_detector");
    }
}
