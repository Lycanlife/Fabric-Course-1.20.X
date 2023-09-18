package net.lycan.mccourse.painting;

import net.lycan.mccourse.MCCourseMod;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPainting {
    public static final PaintingVariant SAW_THEM = registerPainting("saw_them", new PaintingVariant(16,16));
    public static final PaintingVariant SHRIMP = registerPainting("shrimp", new PaintingVariant(32,16));
    public static final PaintingVariant WORLD = registerPainting("world", new PaintingVariant(32,32));


    private static final PaintingVariant registerPainting(String name, PaintingVariant paintingVariant){
        return Registry.register(Registries.PAINTING_VARIANT, new Identifier(MCCourseMod.MOD_ID, name), paintingVariant);
    }

    public static void registerModPainting(){
        MCCourseMod.LOGGER.info("Registering Paintings For " + MCCourseMod.MOD_ID);
    }


}
