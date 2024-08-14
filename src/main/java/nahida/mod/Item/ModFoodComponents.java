package nahida.mod.Item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;



public class ModFoodComponents {
    public static final FoodComponent SUSHI = new FoodComponent.Builder().hunger(6).saturationModifier(2.2F)
    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 3000, 1), 1.0f)
	.statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 3000, 0), 1.0f)
    .statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 3000, 1), .5F)
    .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 3000, 10), 0.25f)
    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 3000, 3), 0.75f)
    .statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 3000, 2), 0.75f)
    .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 3000, 2), 0.75f)
    .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3000, 3), 1.0f)
    .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 3000, 2), 0.75f)
    .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 3000, 2), 0.75f)
    .alwaysEdible()
    .build();
}
