package com.thealpha07.alphasorigins.statuseffect;

import com.thealpha07.alphasorigins.AdaptableOrigins;
import com.thealpha07.alphasorigins.statuseffect.effects.StrangleEffect;
import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;



public class ModEffectRegistry{
    public static StatusEffect STRANGLED_EFFECT;

    public static StatusEffect registerStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(AdaptableOrigins.MOD_ID, name),
                new StrangleEffect(StatusEffectCategory.HARMFUL, 3124687));
    }

    public static void registerStatusEffect() {
        STRANGLED_EFFECT = registerStatusEffect("strangled");
    }

}
