package nahida.mod.blocks;

import nahida.mod.NahidaMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.item.BlockItem;

public class ModBlocks {

    public static final Block NAHIDA_ORE = registerBlock("nahida_ore",
         new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).sounds(BlockSoundGroup.NETHERITE)));
    
    public static final Block NAHIDA_BLOCK = registerBlock("nahida_block",
        new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
        

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
