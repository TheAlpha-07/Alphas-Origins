package com.thealpha07.alphasorigins.item;

import com.thealpha07.alphasorigins.AdaptableOrigins;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class EvolutionItems {
    public static final Item ARACHNIDEVOLUTION = registerItem("arachnidevolution", new Item(new FabricItemSettings()));

    private static void addItemsToCustomEvolutionTab(FabricItemGroupEntries entries) {
        entries.add(ARACHNIDEVOLUTION);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AdaptableOrigins.MOD_ID, name), item);
    }
    public static void registerModItems() {
        AdaptableOrigins.LOGGER.info("Registering Items for Origins Evolutions");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(EvolutionItems::addItemsToCustomEvolutionTab);

    }
}
