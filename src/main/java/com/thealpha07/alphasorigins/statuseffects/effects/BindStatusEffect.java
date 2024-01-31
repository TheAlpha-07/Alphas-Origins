//package com.thealpha07.alphasorigins.statuseffects.effects;
//
//import net.minecraft.entity.LivingEntity;
//import net.minecraft.entity.effect.StatusEffect;
//import net.minecraft.entity.effect.StatusEffectCategory;
//import net.minecraft.entity.player.PlayerEntity;
//
//public class BindStatusEffect extends StatusEffect {
//    public BindStatusEffect() {
//        super(
//                StatusEffectCategory.NEUTRAL,
//                0x2a441d
//        );
//    }
//
//    @Override
//    public boolean canApplyUpdateEffect(int duration, int amplifier) {
//        return true;
//    }
//
//    @Override
//    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
//        if (entity instanceof PlayerEntity) {
//            ((PlayerEntity) entity).addExperience(1 << amplifier);
//        }
//    }
//}
