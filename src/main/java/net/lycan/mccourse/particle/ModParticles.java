package net.lycan.mccourse.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.lycan.mccourse.MCCourseMod;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles {
    public static final DefaultParticleType PINK_GARNET_PARTICLE =
            registerParticles("pink_garnet_particle", FabricParticleTypes.simple());

private static DefaultParticleType registerParticles(String name, DefaultParticleType defaultParticleType){
    return Registry.register(Registries.PARTICLE_TYPE, new Identifier(MCCourseMod.MOD_ID, name), defaultParticleType);
}
    public static void registerParticles(){
        MCCourseMod.LOGGER.info("Registering Particles For " + MCCourseMod.MOD_ID);
    }
}
