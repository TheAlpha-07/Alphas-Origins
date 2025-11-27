package com.thealpha07.alphasorigins.statuseffect.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class StrangleEffect extends StatusEffect {
    public StrangleEffect(StatusEffectCategory statusEffectCategory, int color) {
        // category: StatusEffectCategory - describes if the effect is helpful (BENEFICIAL), harmful (HARMFUL) or useless (NEUTRAL)
        // color: int - Color is the color assigned to the effect (in RGB)
        super(statusEffectCategory, color);
    }


    // Called when the effect is applied
    @Override
    public void applyUpdateEffect(LivingEntity LivingEntity, int amplifier) {
        if (!LivingEntity.getWorld().isClient()) {

            double x = LivingEntity.getX();
            double y = LivingEntity.getY();
            double z = LivingEntity.getZ();

            LivingEntity.teleport(x, y, z);
            LivingEntity.setVelocity(x, y, z);
        }

        super.applyUpdateEffect(LivingEntity, amplifier);
    }

    // Called every tick to check if the effect can be applied or not
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // In our case, we just make it return true so that it applies the effect every tick
        return true;
    }
}
