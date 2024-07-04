package com.thealpha07.alphasorigins.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.math.Vec3d;

public class StrangleEffect extends StatusEffect {
    public StrangleEffect() {
        super(
                StatusEffectCategory.HARMFUL,
                0x98D982);
    }

    @Override
    public void applyUpdateEffect(LivingEntity livingEntity, int amplifier) {
        livingEntity.slowMovement(livingEntity.getBlockStateAtPos(), new Vec3d(0.05F, 0.1F, 0.05F));
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

}
