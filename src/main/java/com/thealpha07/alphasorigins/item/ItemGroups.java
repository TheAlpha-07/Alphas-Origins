package com.thealpha07.alphasorigins.item;

import com.thealpha07.alphasorigins.AdaptableOrigins;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemGroups {
    public static final ItemGroup EVOLUTION_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AdaptableOrigins.MOD_ID, "evolutions"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.evolutions"))
                    .icon(() -> new ItemStack(EvolutionItems.ARACHNIDEVOLUTION)).entries((displayContext, entries) -> {
                        entries.add(EvolutionItems.ARACHNIDEVOLUTION);
                        entries.add(EvolutionItems.AVIANEVOLUTION);
                        entries.add(EvolutionItems.BLAZEBORNEVOLUTION);
                        entries.add(EvolutionItems.ELYTRIANEVOLUTION);
                        entries.add(EvolutionItems.ENDERIANEVOLUTION);
                        entries.add(EvolutionItems.FELINEEVOLUTION);
                        entries.add(EvolutionItems.MERLINGEVOLUTION);
                        entries.add(EvolutionItems.PHANTOMEVOLUTION);
                        entries.add(EvolutionItems.SHULKEVOLUTION);
                        entries.add(EvolutionItems.ASSASSINEVOLUTION);
                        entries.add(EvolutionItems.HUNTEREVOLUTION);
                        entries.add(EvolutionItems.STRIDEREVOLUTION);
                        entries.add(EvolutionItems.VILLAGEREVOLUTION);

                    }).build());
    public static void registerItemGroups() {
        AdaptableOrigins.LOGGER.info("Registering Item Groups");
    }
}
