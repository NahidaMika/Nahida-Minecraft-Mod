package nahida.mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

import nahida.mod.Item.ModItems;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    public void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
            .add(ModItems.AURORA_HELMET, ModItems.AURORA_CHESPLATE, ModItems.AURORA_LEGGINGS, ModItems.AURORA_BOOTS);
        
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
            .add(ModItems.KIRA_KILLER_MUSIC_DISC);


        
    }
}
