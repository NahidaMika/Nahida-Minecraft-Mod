package nahida.mod.datagen;

import nahida.mod.Item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BEDROCK, 9)
                .pattern("SSS")
                .pattern("S#S")
                .pattern("SSS")
                .input('S', Items.DIRT)
                .input('#', Items.ENCHANTED_GOLDEN_APPLE)
                .criterion(hasItem(Items.ENCHANTED_GOLDEN_APPLE), conditionsFromItem(Items.ENCHANTED_GOLDEN_APPLE))
                .offerTo(exporter, Identifier.tryParse(getRecipeName(Items.ENCHANTED_GOLDEN_APPLE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NAHIDA_INGOT, 9)
                .pattern("SSS")
                .pattern("S#S")
                .pattern("SSS")
                .input('S', Items.COBBLESTONE)
                .input('#', Items.ENCHANTED_GOLDEN_APPLE)
                .criterion(hasItem(Items.ENCHANTED_GOLDEN_APPLE), conditionsFromItem(Items.ENCHANTED_GOLDEN_APPLE))
                .offerTo(exporter, Identifier.tryParse(getRecipeName(ModItems.NAHIDA_INGOT)));
            }
}
