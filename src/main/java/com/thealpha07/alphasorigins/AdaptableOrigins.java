package com.thealpha07.alphasorigins;

import com.thealpha07.alphasorigins.item.EvolutionItems;
import com.thealpha07.alphasorigins.item.ItemGroups;
import net.fabricmc.api.ModInitializer;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class AdaptableOrigins implements ModInitializer {
    public static final String MOD_ID = "alphasorigins";
    public static final Logger LOGGER = LogManager.getLogManager().getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        LOGGER.info("Welcome to the world of Miracles.");
        ItemGroups.registerItemGroups();
        EvolutionItems.registerModItems();
    }
}
