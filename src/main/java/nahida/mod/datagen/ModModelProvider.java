package nahida.mod.datagen;

import nahida.mod.Item.ModItems;
import nahida.mod.blocks.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AURORA_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AURORA_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_AURORA_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.AURORA_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.NAHIDA_SEX, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_AURORA, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUSHI, Models.GENERATED);
        itemModelGenerator.register(ModItems.BURNING_PAPER, Models.GENERATED);

    }
}
