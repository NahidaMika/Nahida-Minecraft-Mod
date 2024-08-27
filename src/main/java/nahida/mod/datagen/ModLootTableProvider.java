package nahida.mod.datagen;

import nahida.mod.Item.ModItems;
import nahida.mod.blocks.ModBlocks;
import nahida.mod.blocks.custom.CucumberCropBlock;
import nahida.mod.blocks.custom.RiceCropBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.vanilla.VanillaBlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.AnyOfLootCondition;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;

import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;



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
        addDrop(ModBlocks.SOUND_BLOCK);
        
        addDrop(ModBlocks.LAVANDER_DOOR, doorDrops(ModBlocks.LAVANDER_DOOR));
        addDrop(ModBlocks.LAVANDER_SLAB, slabDrops(ModBlocks.LAVANDER_SLAB));

        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.CUCUMBER_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(CucumberCropBlock.AGE, 5));
        addDrop(ModBlocks.CUCUMBER_CROP, cropDrops(ModBlocks.CUCUMBER_CROP, ModItems.CUCUMBER, ModItems.CUCUMBER_SEEDS, builder));

        AnyOfLootCondition.Builder builder2 =
                BlockStatePropertyLootCondition.builder(ModBlocks.RICE_CROP).properties(StatePredicate.Builder.create()
                                .exactMatch(RiceCropBlock.AGE, 7))
                        .or(BlockStatePropertyLootCondition.builder(ModBlocks.RICE_CROP).properties(StatePredicate.Builder.create()
                                .exactMatch(RiceCropBlock.AGE, 8)));

        // BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.RICE_CROP).properties(StatePredicate.Builder.create()
        //         .exactMatch(RiceCropBlock.AGE, 8));

        addDrop(ModBlocks.RICE_CROP, cropDrops(ModBlocks.RICE_CROP, ModItems.RICE, ModItems.RICE_SEEDS, builder2));
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




