package ru.imaginaerum.lesson26_2.init.items;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import ru.imaginaerum.lesson26_2.Lesson26_2;

public class LessonItems {
    public static final DeferredRegister.Items LESSON_ITEMS = DeferredRegister.createItems(Lesson26_2.MODID);

    public static final DeferredItem<Item> AZURITE = LESSON_ITEMS.registerSimpleItem("azurite");
    public static final DeferredItem<Item> RAW_AZURITE = LESSON_ITEMS.registerSimpleItem("raw_azurite");
}