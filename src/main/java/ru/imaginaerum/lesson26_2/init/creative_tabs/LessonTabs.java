package ru.imaginaerum.lesson26_2.init.creative_tabs;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import ru.imaginaerum.lesson26_2.Lesson26_2;
import ru.imaginaerum.lesson26_2.init.items.LessonItems;

public class LessonTabs {

    // Создаём DeferredRegister для CreativeModeTab
    public static final DeferredRegister<CreativeModeTab> CREATIVE_LESSON_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Lesson26_2.MODID);

    // Регистрируем новую вкладку
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LESSON_TAB_ITEMS =
            CREATIVE_LESSON_TABS.register("lesson_tab_items", () -> CreativeModeTab.builder()
                    // Заголовок вкладки (ключ локализации)
                    .title(Component.translatable("itemGroup.lesson26_2.lesson_tab"))
                    // Иконка вкладки (можно использовать любой предмет)
                    .icon(() -> new ItemStack(LessonItems.AZURITE.get()))
                    // Предметы, которые будут отображаться во вкладке
                    .displayItems((parameters, output) -> {
                        output.accept(LessonItems.AZURITE.get());
                        output.accept(LessonItems.RAW_AZURITE.get());
                        // Добавляйте другие предметы здесь
                    })
                    .build());
}
