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
            .icon(() -> new ItemStack(ModItems.AURORA_INGOT))
            .entries((displayContext, entries) -> {
                entries.add(ModItems.AURORA_INGOT);
                entries.add(ModBlocks.AURORA_ORE);
                entries.add(ModBlocks.AURORA_BLOCK);
                entries.add(ModItems.RAW_AURORA);
                entries.add(ModItems.NAHIDA_SEX);
                entries.add(ModItems.SUSHI);
                entries.add(ModItems.BURNING_PAPER);
                entries.add(ModBlocks.DEEPSLATE_AURORA_ORE);
            })
            .build());
    public static void RegisterItemGroups() { 
        NahidaMod.LOGGER.info("Registering item groups for " + NahidaMod.MOD_ID );

    }
}
