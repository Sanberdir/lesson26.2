package ru.imaginaerum.lesson26_2.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;
import ru.imaginaerum.lesson26_2.Lesson26_2;
import ru.imaginaerum.lesson26_2.init.blocks.LessonBlocks;
import ru.imaginaerum.lesson26_2.init.items.LessonItems;
import ru.imaginaerum.lesson26_2.init.items.ModArmorMaterials;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, Lesson26_2.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(LessonItems.AZURITE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LessonItems.RAW_AZURITE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LessonItems.METAL_DETECTOR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LessonItems.ONION.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LessonItems.END_FIRE_STARTER.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(LessonItems.AZURITE_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(LessonItems.AZURITE_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(LessonItems.AZURITE_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(LessonItems.AZURITE_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(LessonItems.AZURITE_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateTrimmableItem(LessonItems.AZURITE_HELMET.get(), ModArmorMaterials.AZURITE_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModels.generateTrimmableItem(LessonItems.AZURITE_CHESTPLATE.get(), ModArmorMaterials.AZURITE_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModels.generateTrimmableItem(LessonItems.AZURITE_LEGGINGS.get(), ModArmorMaterials.AZURITE_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModels.generateTrimmableItem(LessonItems.AZURITE_BOOTS.get(), ModArmorMaterials.AZURITE_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModels.generateFlatItem(LessonItems.AZURITE_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateSpear(LessonItems.AZURITE_SPEAR.get());
        /* BLOCKS */
        blockModels.createTrivialCube(LessonBlocks.RAW_AZURITE_BLOCK.get());
        blockModels.createTrivialCube(LessonBlocks.AZURITE_ORE.get());
        blockModels.createTrivialCube(LessonBlocks.AZURITE_DEEPSLATE_ORE.get());
        blockModels.createTrivialCube(LessonBlocks.AZURITE_NETHER_ORE.get());
        blockModels.createTrivialCube(LessonBlocks.AZURITE_END_ORE.get());
        blockModels.createTrivialCube(LessonBlocks.MAGIC_BLOCK.get());

        blockModels.family(LessonBlocks.AZURITE_BLOCK.get())
                .stairs(LessonBlocks.AZURITE_STAIRS.get())
                .slab(LessonBlocks.AZURITE_SLAB.get())
                .pressurePlate(LessonBlocks.AZURITE_PRESSURE_PLATE.get())
                .button(LessonBlocks.AZURITE_BUTTON.get())
                .fence(LessonBlocks.AZURITE_FENCE.get())
                .fenceGate(LessonBlocks.AZURITE_FENCE_GATE.get())
                .wall(LessonBlocks.AZURITE_WALL.get())
                .door(LessonBlocks.AZURITE_DOOR.get())
                .trapdoor(LessonBlocks.AZURITE_TRAPDOOR.get());
    }
}