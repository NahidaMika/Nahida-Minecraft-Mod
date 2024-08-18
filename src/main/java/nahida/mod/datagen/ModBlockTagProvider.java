package nahida.mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

import nahida.mod.blocks.ModBlocks;
import nahida.mod.util.ModTags;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
        public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
        }

        @Override
        public void configure(RegistryWrapper.WrapperLookup arg) {
        
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(Blocks.BEDROCK)
                .add(ModBlocks.AURORA_BLOCK)
                .add(ModBlocks.AURORA_ORE)
                .add(ModBlocks.DEEPSLATE_AURORA_ORE)
                .add(ModBlocks.SOUND_BLOCK);


        getOrCreateTagBuilder(BlockTags.CLIMBABLE)
                .add(Blocks.BAMBOO);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_5")))
                .add(Blocks.BEDROCK)
                .add(ModBlocks.AURORA_BLOCK)
                .add(ModBlocks.SOUND_BLOCK);

        getOrCreateTagBuilder(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKS)
                .add(Blocks.ANCIENT_DEBRIS)
                .add(Blocks.NETHER_GOLD_ORE)
                .forceAddTag(BlockTags.GOLD_ORES)
                .forceAddTag(BlockTags.GOLD_ORES)
                .forceAddTag(BlockTags.DIAMOND_ORES)
                .forceAddTag(BlockTags.LAPIS_ORES)
                .forceAddTag(BlockTags.IRON_ORES)
                .forceAddTag(BlockTags.REDSTONE_ORES)
                .forceAddTag(BlockTags.COPPER_ORES)
                .forceAddTag(BlockTags.COAL_ORES)
                .forceAddTag(BlockTags.EMERALD_ORES)
                .forceAddTag(ModTags.Blocks.AURORA_ORES);  
                

        getOrCreateTagBuilder(ModTags.Blocks.AURORA_ORES)
                .add(ModBlocks.AURORA_ORE)
                .add(ModBlocks.DEEPSLATE_AURORA_ORE);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.LAVANDER_FENCE);
        
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.LAVANDER_FENCE_GATE);
        
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.LAVANDER_WALL);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ModBlocks.LAVANDER_PLANKS);
        }
}
