package nahida.mod.util;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;

import nahida.mod.Item.ModItems;
//import nahida.mod.blocks.ModBlocks;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
//import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
//import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;



public class ModLootTableModifiers {

    private static final Identifier END_CITY_ID =
    new Identifier("minecraft", "chests/end_city_treasure");

    private static final Identifier END_DRAGON_ID =
    new Identifier("minecraft", "entities/ender_dragon");

    private static final Identifier DESERT_PYRAMID_SUS_SAND_ID =
    new Identifier("minecraft", "archaeology/desert_pyramid");

    private static final Identifier DESERT_VILLAGE_HOUSE_ID =
    new Identifier("minecraft", "chests/village/village_desert_house");

    private static final Identifier PLAINS_VILLAGE_HOUSE_ID =
    new Identifier("minecraft", "chests/village/village_plains_house");

    private static final Identifier SAVANNA_VILLAGE_HOUSE_ID =
    new Identifier("minecraft", "chests/village/village_savanna_house");

    private static final Identifier SNOWY_VILLAGE_HOUSE_ID =
    new Identifier("minecraft", "chests/village/village_snowy_house");

    private static final Identifier TAIGA_VILLAGE_HOUSE_ID =
    new Identifier("minecraft", "chests/village/village_taiga_house");



    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(END_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.01f))
                    .with(ItemEntry.builder(ModItems.AURORA_CHUNK))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f))); 

                    tableBuilder.pool(poolBuilder.build());
            }
            if(END_DRAGON_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(1f))
                    .with(ItemEntry.builder(ModItems.AURORA_CHUNK))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f))); 

                    tableBuilder.pool(poolBuilder.build());
            }
            if(DESERT_VILLAGE_HOUSE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(.5f))
                    .with(ItemEntry.builder(ModItems.CUCUMBER_SEEDS))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f))); 

                    tableBuilder.pool(poolBuilder.build());
            }
            if(PLAINS_VILLAGE_HOUSE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(.5f))
                    .with(ItemEntry.builder(ModItems.CUCUMBER_SEEDS))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f))); 

                    tableBuilder.pool(poolBuilder.build());
            }
            if(SAVANNA_VILLAGE_HOUSE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(.5f))
                    .with(ItemEntry.builder(ModItems.CUCUMBER_SEEDS))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f))); 

                    tableBuilder.pool(poolBuilder.build());
            }
            if(SNOWY_VILLAGE_HOUSE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(.5f))
                    .with(ItemEntry.builder(ModItems.CUCUMBER_SEEDS))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f))); 

                    tableBuilder.pool(poolBuilder.build());
            }
            if(TAIGA_VILLAGE_HOUSE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(.5f))
                    .with(ItemEntry.builder(ModItems.CUCUMBER_SEEDS))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f))); 

                    tableBuilder.pool(poolBuilder.build());
            }
        });
        
        //LootTableEvents.REPLACE.register((resourceManager, lootManager, id, original, source) -> {
        //    if(DESERT_PYRAMID_SUS_SAND_ID.equals(id)) {
        //        List<LootPoolEntry> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
        //        entries.add(ItemEntry.builder(ModBlocks.SOUND_BLOCK).build());

        //        LootPool.Builder pool = LootPool.builder().with(entries);
        //        return LootTable.builder().pool(pool).build();
         //   }
            
        //    return null;
        //});
    }

}
