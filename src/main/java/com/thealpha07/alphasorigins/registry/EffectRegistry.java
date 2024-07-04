package com.thealpha07.alphasorigins.registry;

import com.thealpha07.alphasorigins.effect.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class EffectRegistry implements ModInitializer {
    public static final StatusEffect STRANGLED = new StrangleEffect();

    @Override
    public void onInitialize() {
        Registry.register(Registries.STATUS_EFFECT, new Identifier("alphasorigins", "strangled"), STRANGLED);
    }
}

