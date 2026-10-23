package ru.imaginaerum.lesson26_2.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import ru.imaginaerum.lesson26_2.Lesson26_2;
import ru.imaginaerum.lesson26_2.init.blocks.LessonBlocks;
import ru.imaginaerum.lesson26_2.init.tags.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Lesson26_2.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(LessonBlocks.AZURITE_BLOCK.getKey())
                .add(LessonBlocks.RAW_AZURITE_BLOCK.getKey())
                .add(LessonBlocks.AZURITE_ORE.getKey())
                .add(LessonBlocks.AZURITE_DEEPSLATE_ORE.getKey())
                .add(LessonBlocks.AZURITE_NETHER_ORE.getKey())
                .add(LessonBlocks.AZURITE_END_ORE.getKey())
                .add(LessonBlocks.MAGIC_BLOCK.getKey())
                .add(LessonBlocks.AZURITE_STAIRS.getKey())
                .add(LessonBlocks.AZURITE_SLAB.getKey())
                .add(LessonBlocks.AZURITE_PRESSURE_PLATE.getKey());

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(LessonBlocks.AZURITE_FENCE.getKey())
                .add(LessonBlocks.AZURITE_FENCE_GATE.getKey());


        tag(BlockTags.STAIRS)
                .add(LessonBlocks.AZURITE_STAIRS.getKey());
        tag(BlockTags.SLABS)
                .add(LessonBlocks.AZURITE_SLAB.getKey());
        tag(BlockTags.PRESSURE_PLATES)
                .add(LessonBlocks.AZURITE_PRESSURE_PLATE.getKey());
        tag(BlockTags.BUTTONS)
                .add(LessonBlocks.AZURITE_BUTTON.getKey());

        tag(BlockTags.FENCES).add(LessonBlocks.AZURITE_FENCE.getKey());
        tag(BlockTags.FENCE_GATES).add(LessonBlocks.AZURITE_FENCE_GATE.getKey());
        tag(BlockTags.WALLS).add(LessonBlocks.AZURITE_WALL.getKey());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(LessonBlocks.AZURITE_DEEPSLATE_ORE.getKey());
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(LessonBlocks.AZURITE_NETHER_ORE.getKey());
        tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(LessonBlocks.AZURITE_END_ORE.getKey());

        tag(ModTags.Blocks.METAL_DETECTABLES)
                .addTag(Tags.Blocks.ORES);
    }
}