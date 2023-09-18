package net.lycan.mccourse.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.math.Vec3d;
import org.joml.Vector3d;

public class SlimeyEffect extends StatusEffect {
    protected SlimeyEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if(entity.horizontalCollision){
            Vec3d intialvec = entity.getVelocity();
            Vec3d climbvec = new Vec3d(intialvec.x, 0.2D, intialvec.z);
            entity.setVelocity(climbvec.x * 0.92D, climbvec.y * 0.98D, climbvec.z * 0.92D);

        }
        super.applyUpdateEffect(entity, amplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
