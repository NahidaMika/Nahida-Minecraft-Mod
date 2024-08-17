package nahida.mod.datagen;

import nahida.mod.Item.ModItems;
import nahida.mod.blocks.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {

    public static final List<ItemConvertible> OUR_SMELTABLES = List.of(ModItems.RAW_AURORA);
    public static final List<ItemConvertible> SAND_BLASTABLE = List.of(Items.SAND);


    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }


    @Override
    public void generate(RecipeExporter exporter) {

        offerSmelting(exporter, OUR_SMELTABLES, RecipeCategory.MISC, ModItems.AURORA_INGOT,
        2.5f, 200, "nahida_ingot");

        offerSmelting(exporter, SAND_BLASTABLE, RecipeCategory.MISC, Items.GLASS,
        2.5F, 150, "glass");

        offerBlasting(exporter, OUR_SMELTABLES, RecipeCategory.MISC, ModItems.AURORA_INGOT,
        2.5f, 100, "nahida_ingot");

        offerBlasting(exporter, SAND_BLASTABLE, RecipeCategory.MISC, Items.GLASS,
         2.5F, 75, "glass");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.AURORA_INGOT, 
                RecipeCategory.DECORATIONS, ModBlocks.AURORA_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BURNING_PAPER, 64)
        .pattern("AAA")
        .pattern("ACA")
        .pattern("AAA")
        .input('C', Items.FLINT_AND_STEEL)
        .input('A', Items.PAPER)
        .criterion(hasItem(Items.FLINT_AND_STEEL), conditionsFromItem(Items.FLINT_AND_STEEL))
        .criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER))
        .offerTo(exporter, Identifier.tryParse(getRecipeName(ModItems.BURNING_PAPER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AURORA_SWORD, 1)
        .pattern(" A ")
        .pattern(" K ")
        .pattern(" S ")
        .input('S', Items.STICK)
        .input('K', ModItems.AURORA_CHUNK)
        .input('A', ModItems.AURORA_INGOT)
        .criterion(hasItem(ModItems.AURORA_INGOT), conditionsFromItem(ModItems.AURORA_INGOT))
        .criterion(hasItem(ModItems.AURORA_CHUNK), conditionsFromItem(ModItems.AURORA_CHUNK))
        .offerTo(exporter, Identifier.tryParse(getRecipeName(ModItems.AURORA_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AURORA_SHOVEL, 1)
        .pattern(" A ")
        .pattern(" S ")
        .pattern(" K ")
        .input('S', Items.STICK)
        .input('K', ModItems.AURORA_CHUNK)
        .input('A', ModItems.AURORA_INGOT)
        .criterion(hasItem(ModItems.AURORA_INGOT), conditionsFromItem(ModItems.AURORA_INGOT))
        .criterion(hasItem(ModItems.AURORA_CHUNK), conditionsFromItem(ModItems.AURORA_CHUNK))
        .offerTo(exporter, Identifier.tryParse(getRecipeName(ModItems.AURORA_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AURORA_HOE, 1)
        .pattern("AK ")
        .pattern(" S ")
        .pattern(" S ")
        .input('S', Items.STICK)
        .input('K', ModItems.AURORA_CHUNK)
        .input('A', ModItems.AURORA_INGOT)
        .criterion(hasItem(ModItems.AURORA_INGOT), conditionsFromItem(ModItems.AURORA_INGOT))
        .criterion(hasItem(ModItems.AURORA_CHUNK), conditionsFromItem(ModItems.AURORA_CHUNK))
        .offerTo(exporter, Identifier.tryParse(getRecipeName(ModItems.AURORA_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AURORA_AXE, 1)
        .pattern("KA ")
        .pattern("AS ")
        .pattern(" S ")
        .input('S', Items.STICK)
        .input('K', ModItems.AURORA_CHUNK)
        .input('A', ModItems.AURORA_INGOT)
        .criterion(hasItem(ModItems.AURORA_INGOT), conditionsFromItem(ModItems.AURORA_INGOT))
        .criterion(hasItem(ModItems.AURORA_CHUNK), conditionsFromItem(ModItems.AURORA_CHUNK))
        .offerTo(exporter, Identifier.tryParse(getRecipeName(ModItems.AURORA_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AURORA_PICKAXE, 1)
        .pattern("AKA")
        .pattern(" S ")
        .pattern(" S ")
        .input('S', Items.STICK)
        .input('K', ModItems.AURORA_CHUNK)
        .input('A', ModItems.AURORA_INGOT)
        .criterion(hasItem(ModItems.AURORA_INGOT), conditionsFromItem(ModItems.AURORA_INGOT))
        .criterion(hasItem(ModItems.AURORA_CHUNK), conditionsFromItem(ModItems.AURORA_CHUNK))
        .offerTo(exporter, Identifier.tryParse(getRecipeName(ModItems.AURORA_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AURORA_CHUNK, 1)
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .input('B', ModItems.AURORA_CHUNK)
        .input('A', ModItems.AURORA_INGOT)
        .criterion(hasItem(ModItems.AURORA_INGOT), conditionsFromItem(ModItems.AURORA_INGOT))
        .criterion(hasItem(ModBlocks.AURORA_BLOCK), conditionsFromItem(ModBlocks.AURORA_BLOCK))
        .offerTo(exporter, Identifier.tryParse(getRecipeName(ModItems.AURORA_CHUNK)));
        
        
        //ShapelessRecipeJsonBuilder
        
        }

};
