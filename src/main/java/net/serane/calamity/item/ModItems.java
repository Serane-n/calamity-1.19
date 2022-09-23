package net.serane.calamity.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.serane.calamity.calamity;

public class ModItems {
    public static final  Item LIVID_DAGGER = registerItem("livid_dagger",
        new SwordItem(ModToolMaterial.LIVID, 5, 0f,
                new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final  Item DAMAGED_LIVID_DAGGER = registerItem("damaged_livid_dagger",
        new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item LIVID_HELMET = registerItem("livid_helmet",
            new ArmorItem(ModArmorMaterial.LIVIDA, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final  Item LIVID_CHESTPLATE = registerItem("livid_chestplate",
            new ArmorItem(ModArmorMaterial.LIVIDA, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item LIVID_LEGGINGS = registerItem("livid_leggings",
            new ArmorItem(ModArmorMaterial.LIVIDA, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item LIVID_BOOTS = registerItem("livid_boots",
            new ArmorItem(ModArmorMaterial.LIVIDA, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item STRANGE_COATING = registerItem("strange_coating",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item CHARRED_GOLD = registerItem("charred_gold",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(calamity.MOD_ID, name), item);
    }

    public static void registerModItems() {
        calamity.LOGGER.debug("Registering Mod Items for " + calamity.MOD_ID);
    }
}
