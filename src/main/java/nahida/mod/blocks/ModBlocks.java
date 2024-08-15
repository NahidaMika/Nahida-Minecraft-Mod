package nahida.mod.blocks;

import nahida.mod.NahidaMod;
import nahida.mod.sounds.ModSounds;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
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
