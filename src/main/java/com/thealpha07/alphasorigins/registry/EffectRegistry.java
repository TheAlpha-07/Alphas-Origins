package com.thealpha07.alphasorigins.registry;

import com.thealpha07.alphasorigins.effect.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;


public class EffectRegistry implements ModInitializer {

    public static final RegistryEntry<StatusEffect> STRANGLED;

    static {
        STRANGLED = Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of("adaptable_origins",
                        "strangle_effect"),
                new StrangleEffect());
    }


    @Override
    public void onInitialize() {
    }
}

