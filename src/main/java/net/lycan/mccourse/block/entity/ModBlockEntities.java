package net.lycan.mccourse.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.lycan.mccourse.MCCourseMod;
import net.lycan.mccourse.MCCourseModClient;
import net.lycan.mccourse.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<GemEmpoweringStationBlockEntity> GEM_EMPOWERING_STATION_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(MCCourseMod.MOD_ID, "gem_empowering_block_station"),
                    FabricBlockEntityTypeBuilder.create(GemEmpoweringStationBlockEntity::new,
                            ModBlocks.GEM_EMPOWERING_STATION).build(null));
    public static void registerBlockEntities(){

        MCCourseMod.LOGGER.info("Registering block entities for " + MCCourseMod.MOD_ID);
    }
}
