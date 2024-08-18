package nahida.mod.Item;

import net.minecraft.registry.Registry;

import nahida.mod.NahidaMod;
import nahida.mod.blocks.ModBlocks;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroups {
    public static final ItemGroup NahidaMod_ItemGroup = Registry.register(Registries.ITEM_GROUP, 
    Identifier.tryParse(NahidaMod.MOD_ID + ":" + "nahidamod_itemgroup"),
    FabricItemGroup.builder()
            .displayName(Text.translatable("itemgroup.nahidamod"))
            .icon(() -> new ItemStack(ModItems.AURORA_SWORD))
            .entries((displayContext, entries) -> {
                entries.add(ModBlocks.AURORA_ORE);
                entries.add(ModBlocks.DEEPSLATE_AURORA_ORE);
                
                entries.add(ModItems.RAW_AURORA);
                entries.add(ModItems.AURORA_INGOT);
                entries.add(ModBlocks.AURORA_BLOCK);
                
                
                entries.add(ModItems.AURORA_CHUNK);
                entries.add(ModItems.SUSHI);
                entries.add(ModItems.BURNING_PAPER);
                entries.add(ModBlocks.SOUND_BLOCK);
                
                entries.add(ModItems.AURORA_SWORD);
                entries.add(ModItems.AURORA_PICKAXE);
                entries.add(ModItems.AURORA_AXE);
                entries.add(ModItems.AURORA_SHOVEL);
                entries.add(ModItems.AURORA_HOE);
                
                
                entries.add(ModItems.KIRA_KILLER_MUSIC_DISC);
                entries.add(ModItems.METAL_DETECTOR);

                entries.add(ModBlocks.LAVANDER_PLANKS);
                entries.add(ModBlocks.LAVANDER_BUTTON);
                entries.add(ModBlocks.LAVANDER_DOOR);
                entries.add(ModBlocks.LAVANDER_FENCE);
                entries.add(ModBlocks.LAVANDER_FENCE_GATE);
                entries.add(ModBlocks.LAVANDER_PRESSURE_PLATE);
                entries.add(ModBlocks.LAVANDER_SLAB);
                entries.add(ModBlocks.LAVANDER_STAIRS);
                entries.add(ModBlocks.LAVANDER_TRAPDOOR);
                entries.add(ModBlocks.LAVANDER_WALL);
            })
            .build());
    public static void RegisterItemGroups() { 
        NahidaMod.LOGGER.info("Registering item groups for " + NahidaMod.MOD_ID );

    }
}
