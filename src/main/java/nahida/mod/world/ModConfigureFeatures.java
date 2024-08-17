package nahida.mod.world;



import java.util.List;

import nahida.mod.NahidaMod;
import nahida.mod.blocks.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class ModConfigureFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> AURORA_ORE_KEY = registerKey("aurora_ore");

    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        
        List<OreFeatureConfig.Target> overworldAuroraOres =
            List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.AURORA_ORE.getDefaultState()),
                       OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_AURORA_ORE.getDefaultState()));

        register(context, AURORA_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldAuroraOres, 8));
        
        
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE,  Identifier.tryParse(NahidaMod.MOD_ID + ":" + name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                    RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
                                                                                    }
}
