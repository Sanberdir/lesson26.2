package ru.imaginaerum.lesson26_2.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.model.ItemModelUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.client.renderer.item.ClientItem;
import net.minecraft.client.renderer.item.ConditionalItemModel;
import net.minecraft.client.renderer.item.ItemModel;
import net.minecraft.client.renderer.item.properties.conditional.HasComponent;
import net.minecraft.data.PackOutput;
import ru.imaginaerum.lesson26_2.Lesson26_2;
import ru.imaginaerum.lesson26_2.data.ModDataComponents;
import ru.imaginaerum.lesson26_2.init.blocks.LessonBlocks;
import ru.imaginaerum.lesson26_2.init.blocks.custom.AzuriteLampBlock;
import ru.imaginaerum.lesson26_2.init.items.LessonItems;
import ru.imaginaerum.lesson26_2.init.items.ModArmorMaterials;

import java.util.Optional;

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
        itemModels.generateFlatItem(LessonItems.AZURITE_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);


        itemModels.generateFlatItem(LessonItems.AZURITE_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(LessonItems.AZURITE_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(LessonItems.AZURITE_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(LessonItems.AZURITE_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(LessonItems.AZURITE_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateTrimmableItem(LessonItems.AZURITE_HELMET.get(), ModArmorMaterials.AZURITE_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModels.generateTrimmableItem(LessonItems.AZURITE_CHESTPLATE.get(), ModArmorMaterials.AZURITE_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModels.generateTrimmableItem(LessonItems.AZURITE_LEGGINGS.get(), ModArmorMaterials.AZURITE_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModels.generateTrimmableItem(LessonItems.AZURITE_BOOTS.get(), ModArmorMaterials.AZURITE_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        blockModels.blockStateOutput.accept(
                MultiVariantGenerator.dispatch(LessonBlocks.AZURITE_LAMP.get()).with(BlockModelGenerators.createBooleanModelDispatch(AzuriteLampBlock.CLICKED,
                        BlockModelGenerators.plainVariant(blockModels.createSuffixedVariant(LessonBlocks.AZURITE_LAMP.get(), "_on", ModelTemplates.CUBE_ALL, TextureMapping::cube)),
                        BlockModelGenerators.plainVariant(TexturedModel.CUBE.create(LessonBlocks.AZURITE_LAMP.get(), blockModels.modelOutput)))));


        ItemModel.Unbaked unbakedDataTablet = ItemModelUtils.plainModel(itemModels.createFlatItemModel(LessonItems.DATA_TABLET.get(), ModelTemplates.FLAT_ITEM));
        ItemModel.Unbaked unbakedDataTabletOn = ItemModelUtils.plainModel(itemModels.createFlatItemModel(LessonItems.DATA_TABLET.get(), "_on", ModelTemplates.FLAT_ITEM));
        itemModels.itemModelOutput.register(LessonItems.DATA_TABLET.get(),
                new ClientItem(new ConditionalItemModel.Unbaked(Optional.empty(), new HasComponent(ModDataComponents.COORDINATES.get(), false),
                        unbakedDataTabletOn, unbakedDataTablet), new ClientItem.Properties(false, false, 1f)));

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