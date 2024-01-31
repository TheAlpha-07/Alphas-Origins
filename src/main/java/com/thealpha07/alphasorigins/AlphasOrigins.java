package com.thealpha07.alphasorigins;

//import com.thealpha07.alphasorigins.statuseffects.effects.BindStatusEffect;
import net.fabricmc.api.ModInitializer;
//import net.minecraft.entity.effect.StatusEffect;
//import net.minecraft.registry.Registries;
//import net.minecraft.registry.Registry;
//import net.minecraft.util.Identifier;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class AlphasOrigins implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogManager().getLogger("alphasorigins");
    public static final String MOD_ID = "alphasorigins";
//    public static final StatusEffect EXP = new BindStatusEffect();
    @Override
    public void onInitialize() {
//        Registry.register(Registries.STATUS_EFFECT, new Identifier("test", "bind"), EXP);
    }
}
