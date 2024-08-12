package nahida.mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

import nahida.mod.blocks.ModBlocks;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
public void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(Blocks.BEDROCK)
                .add(ModBlocks.NAHIDA_BLOCK)
                .add(ModBlocks.NAHIDA_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL) 
                .add(Blocks.BEDROCK);

        getOrCreateTagBuilder(BlockTags.CLIMBABLE)
                .add(Blocks.BAMBOO)
                .add(Blocks.OAK_LOG)
                .add(Blocks.BIRCH_LOG)
                .add(Blocks.SPRUCE_LOG)
                .add(Blocks.JUNGLE_LOG)
                .add(Blocks.ACACIA_LOG)
                .add(Blocks.DARK_OAK_LOG)
                .add(Blocks.CHERRY_LOG)
                .add(Blocks.MANGROVE_ROOTS)
                .add(Blocks.MANGROVE_LOG)
                .add(Blocks.BAMBOO_BLOCK)
                .add(Blocks.MUDDY_MANGROVE_ROOTS)
                .add(Blocks.STRIPPED_OAK_LOG)
                .add(Blocks.STRIPPED_BIRCH_LOG)
                .add(Blocks.STRIPPED_SPRUCE_LOG)
                .add(Blocks.STRIPPED_JUNGLE_LOG)
                .add(Blocks.STRIPPED_ACACIA_LOG)
                .add(Blocks.STRIPPED_DARK_OAK_LOG)
                .add(Blocks.STRIPPED_CHERRY_LOG)
                .add(Blocks.STRIPPED_MANGROVE_LOG)
                .add(Blocks.STRIPPED_BAMBOO_BLOCK);
                
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(Blocks.BEDROCK);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(Blocks.BEDROCK);
    }
}
