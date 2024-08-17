package nahida.mod.world;

import java.util.List;

import nahida.mod.NahidaMod;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> AURORA_ORE_PLACED_KEY = registerKey("aurora_ore_placed");

    public static void boostrap(Registerable<PlacedFeature> context) {

        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, AURORA_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfigureFeatures.AURORA_ORE_KEY),
        ModOrePlacement.modifiersWithCount(6, //veins pre chunk
        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80)))); // trapezoid make the center be the more ore spawn
    }
    

    public static RegistryKey<PlacedFeature> registerKey(String name){
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.tryParse(NahidaMod.MOD_ID + ":" + name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
                                }
}
