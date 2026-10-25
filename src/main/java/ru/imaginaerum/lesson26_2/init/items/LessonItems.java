package ru.imaginaerum.lesson26_2.init.items;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
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

    public static final DeferredItem<Item> AZURITE_SWORD = LESSON_ITEMS.registerItem("azurite_sword",
            properties -> new Item(properties.sword(ModToolTiers.AZURITE, 3, -2.4f)));
    public static final DeferredItem<Item> AZURITE_PICKAXE = LESSON_ITEMS.registerItem("azurite_pickaxe",
            properties -> new Item(properties.pickaxe(ModToolTiers.AZURITE, 1, -2.8f)));
    public static final DeferredItem<Item> AZURITE_SHOVEL = LESSON_ITEMS.registerItem("azurite_shovel",
            properties -> new ShovelItem(ModToolTiers.AZURITE, 1.5f, -3.0f, properties));
    public static final DeferredItem<Item> AZURITE_AXE = LESSON_ITEMS.registerItem("azurite_axe",
            properties -> new AxeItem(ModToolTiers.AZURITE, 6, -3.2f, properties));
    public static final DeferredItem<Item> AZURITE_HOE = LESSON_ITEMS.registerItem("azurite_hoe",
            properties -> new HoeItem(ModToolTiers.AZURITE, 0, -3.0f, properties));
    public static final DeferredItem<Item> AZURITE_SPEAR = LESSON_ITEMS.registerItem("azurite_spear",
            properties -> new Item(properties.spear(ModToolTiers.AZURITE, 0.95f, 0.7f, 0.7f,
                    3.5f, 13f, 8.5f, 5.1f, 13.37f, 4.67f)));
}