package nahida.mod.Item;

import nahida.mod.NahidaMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;

public class ModItems {
    
    public static final Item AURORA_INGOT = registerItem("aurora_ingot", new Item(new Item.Settings()));
    public static final Item RAW_AURORA = registerItem("raw_aurora", new Item(new Item.Settings()));
    public static final Item NAHIDA_SEX = registerItem("nahida_sex", new Item(new Item.Settings()));
    public static final Item SUSHI = registerItem("sushi", new Item(new Item.Settings().food(ModFoodComponents.SUSHI).maxCount(16).rarity(Rarity.EPIC)));
    public static final Item BURNING_PAPER =registerItem("burning_paper", new Item(new Item.Settings()));


    
    private static void addItemsToFirstItemGroup(FabricItemGroupEntries entries) {
        entries.add(Items.STONE);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM,Identifier.tryParse(NahidaMod.MOD_ID + ":" + name), item);
    }
    public static void RegisterModItems() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToFirstItemGroup); 
    }
}