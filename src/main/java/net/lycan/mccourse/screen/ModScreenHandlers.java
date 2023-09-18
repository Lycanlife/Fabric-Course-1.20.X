package net.lycan.mccourse.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.lycan.mccourse.MCCourseMod;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<GemEmpoweringScreenHandler> GEM_EMPOWERING_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(MCCourseMod.MOD_ID, "gem_empowering_screen_handler"), new ExtendedScreenHandlerType<>(GemEmpoweringScreenHandler::new));
    public static void registerModScreenHandlers(){
        MCCourseMod.LOGGER.info("Registering Mod Screen Handlers For " + MCCourseMod.MOD_ID);
    }
}
