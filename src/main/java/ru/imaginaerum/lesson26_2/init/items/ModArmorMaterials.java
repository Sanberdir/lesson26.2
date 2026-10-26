package ru.imaginaerum.lesson26_2.init.items;

import com.google.common.collect.Maps;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import ru.imaginaerum.lesson26_2.Lesson26_2;
import ru.imaginaerum.lesson26_2.init.tags.ModTags;

import java.util.Map;

public class ModArmorMaterials {
    public static final ResourceKey<? extends Registry<EquipmentAsset>> ROOT_ID = ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));

    public static final ResourceKey<EquipmentAsset> AZURITE_KEY = ResourceKey.create(ROOT_ID, Identifier.fromNamespaceAndPath(Lesson26_2.MODID, "azurite"));

    public static final ArmorMaterial AZURITE_ARMOR_MATERIAL = new ArmorMaterial(1200,
            makeDefense(5, 7, 9, 5, 11), 16, SoundEvents.ARMOR_EQUIP_COPPER,
            2f, 0.1f, ModTags.Items.AZURITE_REPAIRABLE, AZURITE_KEY);


    private static Map<ArmorType, Integer> makeDefense(int boots, int legs, int chest, int helm, int body) {
        return Maps.newEnumMap(
                Map.of(ArmorType.BOOTS, boots, ArmorType.LEGGINGS, legs, ArmorType.CHESTPLATE, chest, ArmorType.HELMET, helm, ArmorType.BODY, body)
        );
    }
}