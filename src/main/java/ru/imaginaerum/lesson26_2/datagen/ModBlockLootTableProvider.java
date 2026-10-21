package ru.imaginaerum.lesson26_2.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import ru.imaginaerum.lesson26_2.init.blocks.LessonBlocks;
import ru.imaginaerum.lesson26_2.init.items.LessonItems;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    public ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(LessonBlocks.AZURITE_BLOCK.get());
        dropSelf(LessonBlocks.RAW_AZURITE_BLOCK.get());

        add(LessonBlocks.AZURITE_ORE.get(),
                createOreDrop(LessonBlocks.AZURITE_ORE.get(), LessonItems.RAW_AZURITE.get()));
        add(LessonBlocks.AZURITE_DEEPSLATE_ORE.get(),
                createOreDrop(LessonBlocks.AZURITE_DEEPSLATE_ORE.get(), LessonItems.RAW_AZURITE.get()));

        add(LessonBlocks.AZURITE_NETHER_ORE.get(),
                createMultipleOreDrops(LessonBlocks.AZURITE_NETHER_ORE.get(), LessonItems.RAW_AZURITE.get(), 4, 7));
        add(LessonBlocks.AZURITE_END_ORE.get(),
                createMultipleOreDrops(LessonBlocks.AZURITE_END_ORE.get(), LessonItems.RAW_AZURITE.get(), 5, 9));

        dropSelf(LessonBlocks.MAGIC_BLOCK.get());
        dropSelf(LessonBlocks.AZURITE_STAIRS.get());
        add(LessonBlocks.AZURITE_SLAB.get(), this::createSlabItemTable);

        dropSelf(LessonBlocks.AZURITE_PRESSURE_PLATE.get());
        dropSelf(LessonBlocks.AZURITE_BUTTON.get());
    }

    protected LootTable.Builder createMultipleOreDrops(Block block, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(block, this.applyExplosionDecay(block,
                LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return LessonBlocks.LESSON_BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}