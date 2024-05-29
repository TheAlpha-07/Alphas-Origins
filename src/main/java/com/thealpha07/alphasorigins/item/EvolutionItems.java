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
    public static final Item AVIANEVOLUTION = registerItem("avianevolution", new Item(new FabricItemSettings()));
    public static final Item BLAZEBORNEVOLUTION = registerItem("blazebornevolution", new Item(new FabricItemSettings()));
    public static final Item ELYTRIANEVOLUTION = registerItem("elytrianevolution", new Item(new FabricItemSettings()));
    public static final Item ENDERIANEVOLUTION = registerItem("enderianevolution", new Item(new FabricItemSettings()));
    public static final Item FELINEEVOLUTION = registerItem("felineevolution", new Item(new FabricItemSettings()));
    public static final Item MERLINGEVOLUTION = registerItem("merlingevolution", new Item(new FabricItemSettings()));
    public static final Item PHANTOMEVOLUTION = registerItem("phantomevolution", new Item(new FabricItemSettings()));
    public static final Item SHULKEVOLUTION = registerItem("shulkevolution", new Item(new FabricItemSettings()));
    public static final Item ASSASSINEVOLUTION = registerItem("assassinevolution", new Item(new FabricItemSettings()));
    public static final Item HUNTEREVOLUTION = registerItem("hunterevolution", new Item(new FabricItemSettings()));
    public static final Item STRIDEREVOLUTION = registerItem("striderevolution", new Item(new FabricItemSettings()));
    public static final Item VILLAGEREVOLUTION = registerItem("villagerevolution", new Item(new FabricItemSettings()));
    private static void addItemsToCustomEvolutionTab(FabricItemGroupEntries entries) {
        entries.add(ARACHNIDEVOLUTION);
        entries.add(AVIANEVOLUTION);
        entries.add(BLAZEBORNEVOLUTION);
        entries.add(ELYTRIANEVOLUTION);
        entries.add(ENDERIANEVOLUTION);
        entries.add(FELINEEVOLUTION);
        entries.add(MERLINGEVOLUTION);
        entries.add(PHANTOMEVOLUTION);
        entries.add(SHULKEVOLUTION);
        entries.add(ASSASSINEVOLUTION);
        entries.add(HUNTEREVOLUTION);
        entries.add(STRIDEREVOLUTION);
        entries.add(VILLAGEREVOLUTION);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AdaptableOrigins.MOD_ID, name), item);
    }
    public static void registerModItems() {
        AdaptableOrigins.LOGGER.info("Registering Items for Origins Evolutions");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(EvolutionItems::addItemsToCustomEvolutionTab);

    }
}
