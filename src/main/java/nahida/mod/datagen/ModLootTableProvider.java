package nahida.mod.datagen;

import nahida.mod.Item.ModItems;
import nahida.mod.blocks.ModBlocks;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;

import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;

import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;



public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.AURORA_ORE, oreDrops(ModBlocks.AURORA_ORE, ModItems.RAW_AURORA));
        addDrop(ModBlocks.DEEPSLATE_AURORA_ORE, oreDrops(ModBlocks.DEEPSLATE_AURORA_ORE, ModItems.RAW_AURORA));
        addDrop(ModBlocks.AURORA_BLOCK);
        
        addDrop(ModBlocks.LAVANDER_STAIRS);
        addDrop(ModBlocks.LAVANDER_TRAPDOOR);
        addDrop(ModBlocks.LAVANDER_WALL);
        addDrop(ModBlocks.LAVANDER_FENCE);
        addDrop(ModBlocks.LAVANDER_FENCE_GATE);
        addDrop(ModBlocks.LAVANDER_BUTTON);
        addDrop(ModBlocks.LAVANDER_PLANKS);
        addDrop(ModBlocks.LAVANDER_PRESSURE_PLATE);
        
        addDrop(ModBlocks.LAVANDER_DOOR, doorDrops(ModBlocks.LAVANDER_DOOR));
        addDrop(ModBlocks.LAVANDER_SLAB, slabDrops(ModBlocks.LAVANDER_SLAB));

        
    }

    public LootTable.Builder oreDrops(Block drop, Item item) {
        return dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder<?>)this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 1.0F)))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))
                )
        );
    }

}




