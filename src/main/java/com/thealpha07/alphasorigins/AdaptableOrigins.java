package com.thealpha07.alphasorigins;

import com.thealpha07.alphasorigins.item.EvolutionItems;
import com.thealpha07.alphasorigins.item.ItemGroups;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdaptableOrigins implements ModInitializer {
    public static final String MOD_ID = "alphasorigins";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        ItemGroups.registerItemGroups();
        EvolutionItems.registerModItems();
    }
}
