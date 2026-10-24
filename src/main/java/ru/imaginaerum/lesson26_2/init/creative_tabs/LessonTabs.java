package ru.imaginaerum.lesson26_2.init.creative_tabs;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import ru.imaginaerum.lesson26_2.Lesson26_2;
import ru.imaginaerum.lesson26_2.init.blocks.LessonBlocks;
import ru.imaginaerum.lesson26_2.init.items.LessonItems;

import java.util.function.Supplier;

public class LessonTabs {

    // Создаём DeferredRegister для CreativeModeTab
    public static final DeferredRegister<CreativeModeTab> CREATIVE_LESSON_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Lesson26_2.MODID);

    // Регистрируем новую вкладку
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LESSON_TAB_ITEMS =
            CREATIVE_LESSON_TABS.register("lesson_tab_items", () -> CreativeModeTab.builder()
                    // Заголовок вкладки (ключ локализации)
                    .title(Component.translatable("itemGroup.lesson26_2.lesson_tab_items"))
                    // Иконка вкладки (можно использовать любой предмет)
                    .icon(() -> new ItemStack(LessonItems.AZURITE.get()))
                    .withTabsBefore(CreativeModeTabs.INGREDIENTS)
                    .withTabsAfter(Identifier.fromNamespaceAndPath(Lesson26_2.MODID, "lesson_tab_blocks"))
                    // Предметы, которые будут отображаться во вкладке
                    .displayItems((parameters, output) -> {
                        output.accept(LessonItems.AZURITE.get());
                        output.accept(LessonItems.RAW_AZURITE.get());
                        output.accept(LessonItems.METAL_DETECTOR.get());
                        output.accept(LessonItems.ONION.get());
                        output.accept(LessonItems.END_FIRE_STARTER.get());
                        // Добавляйте другие предметы здесь
                    })
                    .build());

    public static final Supplier<CreativeModeTab> LESSON_TAB_BLOCKS = CREATIVE_LESSON_TABS.register("lesson_tab_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(LessonBlocks.AZURITE_BLOCK))
                    .title(Component.translatable("itemGroup.lesson26_2.lesson_tab_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(LessonBlocks.AZURITE_BLOCK);
                        output.accept(LessonBlocks.RAW_AZURITE_BLOCK);

                        output.accept(LessonBlocks.AZURITE_ORE);
                        output.accept(LessonBlocks.AZURITE_DEEPSLATE_ORE);
                        output.accept(LessonBlocks.AZURITE_NETHER_ORE);
                        output.accept(LessonBlocks.AZURITE_END_ORE);
                        output.accept(LessonBlocks.MAGIC_BLOCK);
                        output.accept(LessonBlocks.AZURITE_SLAB);
                        output.accept(LessonBlocks.AZURITE_STAIRS);
                        output.accept(LessonBlocks.AZURITE_BUTTON);
                        output.accept(LessonBlocks.AZURITE_PRESSURE_PLATE);
                        output.accept(LessonBlocks.AZURITE_FENCE);
                        output.accept(LessonBlocks.AZURITE_FENCE_GATE);
                        output.accept(LessonBlocks.AZURITE_WALL);
                        output.accept(LessonBlocks.AZURITE_DOOR);
                        output.accept(LessonBlocks.AZURITE_TRAPDOOR);


                    }).build());
}
