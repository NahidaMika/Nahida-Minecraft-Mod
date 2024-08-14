package nahida.mod.Item;

import nahida.mod.NahidaMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Items;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import nahida.mod.Item.Custom.ModToolMaterial;
import nahida.mod.sounds.ModSounds;

public class ModItems {
    
    public static final Item AURORA_INGOT = registerItem("aurora_ingot", new Item(new Item.Settings()));
    public static final Item RAW_AURORA = registerItem("raw_aurora", new Item(new Item.Settings()));
    public static final Item NAHIDA_SEX = registerItem("nahida_sex", new Item(new Item.Settings()));
    public static final Item SUSHI = registerItem("sushi", new Item(new Item.Settings().food(ModFoodComponents.SUSHI).maxCount(16).rarity(Rarity.EPIC)));
    public static final Item BURNING_PAPER = registerItem("burning_paper", new Item(new Item.Settings()));
    public static final Item AURORA_PICKAXE = registerItem("aurora_pickaxe", new PickaxeItem(ModToolMaterial.AURORA, 2, 2f, new Item.Settings().rarity(Rarity.RARE).fireproof()));
    public static final Item AURORA_AXE = registerItem("aurora_axe", new AxeItem(ModToolMaterial.AURORA, 5, 5f, new Item.Settings().rarity(Rarity.RARE).fireproof()));
    public static final Item AURORA_HOE = registerItem("aurora_hoe", new HoeItem(ModToolMaterial.AURORA, 0, 0f, new Item.Settings().rarity(Rarity.RARE).fireproof()));
    public static final Item AURORA_SHOVEL = registerItem("aurora_shovel", new ShovelItem(ModToolMaterial.AURORA, 1, 2f, new Item.Settings().rarity(Rarity.RARE).fireproof()));
    public static final Item AURORA_SWORD = registerItem("aurora_sword", new SwordItem(ModToolMaterial.AURORA, 9, 5f, new Item.Settings().rarity(Rarity.RARE).fireproof()));
    public static final Item KIRA_KILLER_MUSIC_DISC = registerItem("kira_killer_music_disc", new MusicDiscItem(20, ModSounds.KIRA_KILLER, new Item.Settings().maxCount(1).fireproof().rarity(Rarity.EPIC).food(ModFoodComponents.SUSHI), 253));
    
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