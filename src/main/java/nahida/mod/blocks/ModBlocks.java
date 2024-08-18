package nahida.mod.blocks;

import nahida.mod.NahidaMod;
import nahida.mod.blocks.custom.SoundBlock;
import nahida.mod.sounds.ModSounds;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.Blocks;
import net.minecraft.block.ButtonBlock;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.WoodType;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.item.BlockItem;

public class ModBlocks {

    public static final Block AURORA_ORE = registerBlock("aurora_ore",
        new ExperienceDroppingBlock(UniformIntProvider.create(5, 20),AbstractBlock.Settings.copy(Blocks.STONE).strength(3.0F,3.0F ).sounds(BlockSoundGroup.STONE)));
    
    public static final Block AURORA_BLOCK = registerBlock("aurora_block",
        new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).sounds(ModSounds.AURORA_BLOCK_SOUNDS)));

    public static final Block DEEPSLATE_AURORA_ORE = registerBlock("deepslate_aurora_ore",
        new ExperienceDroppingBlock(UniformIntProvider.create(5, 20), AbstractBlock.Settings.copy(Blocks.DEEPSLATE).strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block SOUND_BLOCK = registerBlock("sound_block",
        new SoundBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(-1F,36666666F)));

    //My wood

    public static final Block LAVANDER_PLANKS = registerBlock("lavander_planks",
        new Block(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS).burnable()));

    public static final Block LAVANDER_STAIRS = registerBlock("lavander_stairs",
        new StairsBlock(ModBlocks.LAVANDER_PLANKS.getDefaultState() ,AbstractBlock.Settings.copy(Blocks.CHERRY_STAIRS)));

    public static final Block LAVANDER_SLAB = registerBlock("lavander_slab",  
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_SLAB)));

    public static final Block LAVANDER_BUTTON = registerBlock("lavander_button",
        new ButtonBlock(BlockSetType.CHERRY, 10,AbstractBlock.Settings.copy(Blocks.CHERRY_BUTTON)));

    public static final Block LAVANDER_PRESSURE_PLATE = registerBlock("lavander_pressure_plate",
        new PressurePlateBlock(BlockSetType.CHERRY ,AbstractBlock.Settings.copy(Blocks.CHERRY_PRESSURE_PLATE)));

    public static final Block LAVANDER_FENCE = registerBlock("lavander_fence",
        new FenceBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_FENCE)));

    public static final Block LAVANDER_FENCE_GATE = registerBlock("lavander_fence_gate",
        new FenceGateBlock( WoodType.CHERRY, AbstractBlock.Settings.copy(Blocks.CHERRY_FENCE_GATE)));

    public static final Block LAVANDER_WALL = registerBlock("lavander_wall",
        new WallBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_FENCE)));

    public static final Block LAVANDER_DOOR = registerBlock("lavander_door",
        new DoorBlock(BlockSetType.CHERRY,AbstractBlock.Settings.copy(Blocks.CHERRY_DOOR).nonOpaque()));

    public static final Block LAVANDER_TRAPDOOR = registerBlock("lavander_trapdoor",
        new TrapdoorBlock(BlockSetType.CHERRY ,AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).nonOpaque()));

    

        
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.tryParse(NahidaMod.MOD_ID + ":" + name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.tryParse(NahidaMod.MOD_ID + ":" + name), 
        new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        NahidaMod.LOGGER.info("Registering ModBlocks for " + NahidaMod.MOD_ID);
    } 

}
