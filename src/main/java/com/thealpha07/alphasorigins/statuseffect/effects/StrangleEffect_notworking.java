package com.thealpha07.alphasorigins.statuseffect.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.math.Vec3d;
import com.thealpha07.alphasorigins.statuseffect.ModStatusEffect_notworking;

public class StrangleEffect_notworking extends ModStatusEffect_notworking {
    public StrangleEffect_notworking(StatusEffectCategory type, int color, boolean isInstant) {
        super(type, color, isInstant);
    }
    @Override
    protected boolean canApplyEffect(int remainingTicks, int level) {
        return true;
    }
    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        entity.slowMovement(entity.getBlockStateAtPos(), new Vec3d(0.05F, 0.1F, 0.05F));
    }
}
