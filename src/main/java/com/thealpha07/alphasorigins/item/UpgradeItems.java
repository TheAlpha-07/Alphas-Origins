package com.thealpha07.alphasorigins.item;

import com.thealpha07.alphasorigins.UpgradableOrigins;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class UpgradeItems {
    public static Item register(Item item, String id){
        Identifier itemID = Identifier.of(UpgradableOrigins.MOD_ID, id);

        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        return registeredItem;
    }
    public static final Item ARACHNIDUPGRADE = register(new Item(new Item.Settings()), "arachnidupgrade");
    public static final Item AVIANUPGRADE = register(new Item(new Item.Settings()), "avianupgrade");
    public static final Item BLAZEBORNUPGRADE = register(new Item(new Item.Settings()), "blazebornupgrade");
    public static final Item ENDERIANUPGRADE = register(new Item(new Item.Settings()), "enderianupgrade");
    public static final Item ELYTRIANUPGRADE = register(new Item(new Item.Settings()), "elytrianupgrade");
    public static final Item FELINEUPGRADE = register(new Item(new Item.Settings()), "felineupgrade");
    public static final Item MERLINGUPGRADE = register(new Item(new Item.Settings()), "merlingupgrade");
    public static final Item PHANTOMUPGRADE = register(new Item(new Item.Settings()), "phantomupgrade");
    public static final Item SHULKUPGRADE = register(new Item(new Item.Settings()), "shulkupgrade");
    public static final Item ASSASSINUPGRADE = register(new Item(new Item.Settings()), "assassinupgrade");
    public static final Item HUNTERUPGRADE = register(new Item(new Item.Settings()), "hunterupgrade");
    public static final Item STRIDERUPGRADE = register(new Item(new Item.Settings()), "striderupgrade");
    public static final Item VILLAGERUPGRADE = register(new Item(new Item.Settings()), "villagerupgrade");

    private static void addItemsToCustomEvolutionTab(FabricItemGroupEntries entries) {
        entries.add(ARACHNIDUPGRADE);
        entries.add(AVIANUPGRADE);
        entries.add(BLAZEBORNUPGRADE);
        entries.add(ELYTRIANUPGRADE);
        entries.add(ENDERIANUPGRADE);
        entries.add(FELINEUPGRADE);
        entries.add(MERLINGUPGRADE);
        entries.add(PHANTOMUPGRADE);
        entries.add(SHULKUPGRADE);
        entries.add(ASSASSINUPGRADE);
        entries.add(HUNTERUPGRADE);
        entries.add(STRIDERUPGRADE);
        entries.add(VILLAGERUPGRADE);
    }

    public static final RegistryKey<ItemGroup> UPGRADES_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(),
            Identifier.of(UpgradableOrigins.MOD_ID, "upgrades"));
    public static final ItemGroup UPGRADES_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Items.DRAGON_BREATH))
            .displayName(Text.translatable("alpha.upgradable_origins"))
            .build();

    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, UPGRADES_GROUP_KEY, UPGRADES_GROUP);

        // Register items to the evolutions group.
        ItemGroupEvents.modifyEntriesEvent(UPGRADES_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(UpgradeItems.ARACHNIDUPGRADE);
            itemGroup.add(UpgradeItems.AVIANUPGRADE);
            itemGroup.add(UpgradeItems.BLAZEBORNUPGRADE);
            itemGroup.add(UpgradeItems.ENDERIANUPGRADE);
            itemGroup.add(UpgradeItems.ELYTRIANUPGRADE);
            itemGroup.add(UpgradeItems.FELINEUPGRADE);
            itemGroup.add(UpgradeItems.MERLINGUPGRADE);
            itemGroup.add(UpgradeItems.PHANTOMUPGRADE);
            itemGroup.add(UpgradeItems.SHULKUPGRADE);
            itemGroup.add(UpgradeItems.ASSASSINUPGRADE);
            itemGroup.add(UpgradeItems.HUNTERUPGRADE);
            itemGroup.add(UpgradeItems.STRIDERUPGRADE);
            itemGroup.add(UpgradeItems.VILLAGERUPGRADE);
        });
    }
}
