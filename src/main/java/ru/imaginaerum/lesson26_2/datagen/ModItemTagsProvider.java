package ru.imaginaerum.lesson26_2.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.data.ItemTagsProvider;
import ru.imaginaerum.lesson26_2.Lesson26_2;
import ru.imaginaerum.lesson26_2.init.items.LessonItems;
import ru.imaginaerum.lesson26_2.init.tags.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Lesson26_2.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(Items.IRON_INGOT.builtInRegistryHolder().key())
                .add(Items.REDSTONE.builtInRegistryHolder().key())
                .add(Items.COPPER_INGOT.builtInRegistryHolder().key())
                .add(LessonItems.AZURITE.get().builtInRegistryHolder().key());
        tag(ModTags.Items.AZURITE_REPAIRABLE)
                .add(LessonItems.AZURITE.get().builtInRegistryHolder().key());

        tag(ItemTags.SWORDS).add(LessonItems.AZURITE_SWORD.get().builtInRegistryHolder().key());
        tag(ItemTags.PICKAXES).add(LessonItems.AZURITE_PICKAXE.get().builtInRegistryHolder().key());
        tag(ItemTags.SHOVELS).add(LessonItems.AZURITE_SHOVEL.get().builtInRegistryHolder().key());
        tag(ItemTags.AXES).add(LessonItems.AZURITE_AXE.get().builtInRegistryHolder().key());
        tag(ItemTags.HOES).add(LessonItems.AZURITE_HOE.get().builtInRegistryHolder().key());
        tag(ItemTags.SPEARS).add(LessonItems.AZURITE_SPEAR.get().builtInRegistryHolder().key());
    }

}
