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
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUND_BLOCK);

        BlockStateModelGenerator.BlockTexturePool lavanderPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LAVANDER_PLANKS);
        lavanderPool.stairs(ModBlocks.LAVANDER_STAIRS);
        lavanderPool.slab(ModBlocks.LAVANDER_SLAB);
        lavanderPool.button(ModBlocks.LAVANDER_BUTTON);
        lavanderPool.pressurePlate(ModBlocks.LAVANDER_PRESSURE_PLATE);
        lavanderPool.fence(ModBlocks.LAVANDER_FENCE);
        lavanderPool.fenceGate(ModBlocks.LAVANDER_FENCE_GATE);
        lavanderPool.wall(ModBlocks.LAVANDER_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.LAVANDER_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.LAVANDER_TRAPDOOR);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.AURORA_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.AURORA_CHUNK, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_AURORA, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUSHI, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BURNING_PAPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.AURORA_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AURORA_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AURORA_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AURORA_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AURORA_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.KIRA_KILLER_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MISTSPLITTER_REFORGED, Models.HANDHELD);

    }
}
