package com.thealpha07.alphasorigins.item;

import com.thealpha07.alphasorigins.AdaptableOrigins;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class EvolutionItems {
    public static Item register(Item item, String id){
        Identifier itemID = Identifier.of(AdaptableOrigins.MOD_ID, id);

        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        return registeredItem;
    }
    public static final Item ARACHNIDEVOLUTION = register(new Item(new Item.Settings()), "arachnidevolution");
    public static final Item AVIANEVOLUTION = register(new Item(new Item.Settings()), "avianevolution");
    public static final Item BLAZEBORNEVOLUTION = register(new Item(new Item.Settings()), "blazebornevolution");
    public static final Item ENDERIANEVOLUTION = register(new Item(new Item.Settings()), "enderianevolution");
    public static final Item ELYTRIANEVOLUTION = register(new Item(new Item.Settings()), "elytrianevolution");
    public static final Item FELINEEVOLUTION = register(new Item(new Item.Settings()), "felineevolution");
    public static final Item MERLINGEVOLUTION = register(new Item(new Item.Settings()), "merlingevolution");
    public static final Item PHANTOMEVOLUTION = register(new Item(new Item.Settings()), "phantomevolution");
    public static final Item SHULKEVOLUTION = register(new Item(new Item.Settings()), "shulkevolution");
    public static final Item ASSASSINEVOLUTION = register(new Item(new Item.Settings()), "assassinevolution");
    public static final Item HUNTEREVOLUTION = register(new Item(new Item.Settings()), "hunterevolution");
    public static final Item STRIDEREVOLUTION = register(new Item(new Item.Settings()), "striderevolution");
    public static final Item VILLAGEREVOLUTION = register(new Item(new Item.Settings()), "villagerevolution");

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

    public static final RegistryKey<ItemGroup> EVOLUTION_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(),
            Identifier.of(AdaptableOrigins.MOD_ID, "evolutions"));
    public static final ItemGroup EVOLUTION_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(EvolutionItems.MERLINGEVOLUTION))
            .displayName(Text.translatable("evolution.adaptable_origins"))
            .build();

    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, EVOLUTION_GROUP_KEY, EVOLUTION_GROUP);

        // Register items to the evolutions group.
        ItemGroupEvents.modifyEntriesEvent(EVOLUTION_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(EvolutionItems.ARACHNIDEVOLUTION);
            itemGroup.add(EvolutionItems.AVIANEVOLUTION);
            itemGroup.add(EvolutionItems.BLAZEBORNEVOLUTION);
            itemGroup.add(EvolutionItems.ENDERIANEVOLUTION);
            itemGroup.add(EvolutionItems.ELYTRIANEVOLUTION);
            itemGroup.add(EvolutionItems.FELINEEVOLUTION);
            itemGroup.add(EvolutionItems.MERLINGEVOLUTION);
            itemGroup.add(EvolutionItems.PHANTOMEVOLUTION);
            itemGroup.add(EvolutionItems.SHULKEVOLUTION);
            itemGroup.add(EvolutionItems.ASSASSINEVOLUTION);
            itemGroup.add(EvolutionItems.HUNTEREVOLUTION);
            itemGroup.add(EvolutionItems.STRIDEREVOLUTION);
            itemGroup.add(EvolutionItems.VILLAGEREVOLUTION);
        });
    }
}
