package nahida.mod.Item;

import nahida.mod.NahidaMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;

public class ModItems {
    public static final Item NAHIDA_INGOT = registerItem("nahida_ingot", new Item(new Item.Settings()));
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