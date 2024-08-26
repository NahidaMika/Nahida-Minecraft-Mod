package nahida.mod.Item;

import nahida.mod.NahidaMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BowItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import nahida.mod.Item.Custom.MetalDetectorItem;
import nahida.mod.Item.Custom.ModArmorItem;
import nahida.mod.Item.Custom.ModArmorMaterial;
import nahida.mod.Item.Custom.ModToolMaterial;
import nahida.mod.blocks.ModBlocks;
import nahida.mod.sounds.ModSounds;

public class ModItems {
    
    public static final Item AURORA_INGOT = registerItem("aurora_ingot", new Item(new Item.Settings()));
    public static final Item RAW_AURORA = registerItem("raw_aurora", new Item(new Item.Settings()));
    public static final Item AURORA_CHUNK = registerItem("aurora_chunk", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item SUSHI = registerItem("sushi", new Item(new Item.Settings().food(ModFoodComponents.SUSHI).maxCount(16).rarity(Rarity.EPIC)));
    public static final Item BURNING_PAPER = registerItem("burning_paper", new Item(new Item.Settings()));
    public static final Item AURORA_PICKAXE = registerItem("aurora_pickaxe", new PickaxeItem(ModToolMaterial.AURORA, 2, -1.4f, new Item.Settings().rarity(Rarity.RARE).fireproof()));
    public static final Item AURORA_AXE = registerItem("aurora_axe", new AxeItem(ModToolMaterial.AURORA, 8F, -2f, new Item.Settings().rarity(Rarity.RARE).fireproof()));
    public static final Item AURORA_HOE = registerItem("aurora_hoe", new HoeItem(ModToolMaterial.AURORA, 0, 0f, new Item.Settings().rarity(Rarity.RARE).fireproof()));
    public static final Item AURORA_SHOVEL = registerItem("aurora_shovel", new ShovelItem(ModToolMaterial.AURORA, 2.5F, -2.0F, new Item.Settings().rarity(Rarity.RARE).fireproof()));
    public static final Item AURORA_SWORD = registerItem("aurora_sword", new SwordItem(ModToolMaterial.AURORA, 7, -1.2f, new Item.Settings().rarity(Rarity.RARE).fireproof()));
    public static final Item KIRA_KILLER_MUSIC_DISC = registerItem("kira_killer_music_disc", new MusicDiscItem(20, ModSounds.KIRA_KILLER, new Item.Settings().maxCount(1).fireproof().rarity(Rarity.EPIC), 253));
    public static final Item METAL_DETECTOR = registerItem("metal_detector", new MetalDetectorItem(new Item.Settings().fireproof().rarity(Rarity.EPIC).maxCount(1)));
    public static final Item MISTSPLITTER_REFORGED = registerItem("mistsplitter_reforged", new SwordItem(ModToolMaterial.AURORA, 12, 8F, new Item.Settings().maxCount(1).rarity(Rarity.EPIC).fireproof()));
    public static final Item BOWS = registerItem("bows", new BowItem(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).fireproof()));

    public static final Item AURORA_HELMET = registerItem("aurora_helmet", new ModArmorItem(ModArmorMaterial.AURORA, ArmorItem.Type.HELMET, new Item.Settings().maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item AURORA_CHESPLATE = registerItem("aurora_chestplate", new ArmorItem(ModArmorMaterial.AURORA, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item AURORA_LEGGINGS = registerItem("aurora_leggings", new ArmorItem(ModArmorMaterial.AURORA, ArmorItem.Type.LEGGINGS, new Item.Settings().maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item AURORA_BOOTS = registerItem("aurora_boots", new ArmorItem(ModArmorMaterial.AURORA, ArmorItem.Type.BOOTS, new Item.Settings().maxCount(1).fireproof().rarity(Rarity.RARE)));
    
    public static final Item CUCUMBER = registerItem("cucumber", new Item(new Item.Settings().food(ModFoodComponents.CUCUMBER).maxCount(64)));

    public static final Item CUCUMBER_SEEDS = registerItem("cucumber_seeds", 
    new AliasedBlockItem(ModBlocks.CUCUMBER_CROP, new Item.Settings()));

    private static void addItemsToFirstItemGroup(FabricItemGroupEntries entries) {
        entries.add(AURORA_INGOT);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM,Identifier.tryParse(NahidaMod.MOD_ID + ":" + name), item);
    }
        public static void RegisterModItems() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToFirstItemGroup); 
    }
}