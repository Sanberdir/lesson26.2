package ru.imaginaerum.lesson26_2.init.items;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import ru.imaginaerum.lesson26_2.Lesson26_2;
import ru.imaginaerum.lesson26_2.init.items.custom.MetalDetectorItem;
import ru.imaginaerum.lesson26_2.init.items.food.LessonFood;

public class LessonItems {
    public static final DeferredRegister.Items LESSON_ITEMS = DeferredRegister.createItems(Lesson26_2.MODID);

    public static final DeferredItem<Item> AZURITE = LESSON_ITEMS.registerSimpleItem("azurite");
    public static final DeferredItem<Item> RAW_AZURITE = LESSON_ITEMS.registerSimpleItem("raw_azurite");

    public static final DeferredItem<Item> METAL_DETECTOR = LESSON_ITEMS.registerItem("metal_detector",
            properties -> new MetalDetectorItem(properties.durability(64)));

    public static final DeferredItem<Item> ONION = LESSON_ITEMS.registerItem("onion",
            properties -> new Item(properties.food(LessonFood.ONION, LessonFood.ONION_CONSUMABLE)));

    public static final DeferredItem<Item> END_FIRE_STARTER = LESSON_ITEMS.registerItem("end_fire_starter",
            properties -> new Item(properties.stacksTo(32)));
}