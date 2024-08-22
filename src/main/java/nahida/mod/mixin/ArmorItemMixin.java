package nahida.mod.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import nahida.mod.Item.Custom.ModArmorMaterial;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ArmorItem;
import net.minecraft.registry.entry.RegistryEntry;

@Mixin(ArmorItem.class)
public abstract class ArmorItemMixin {

    @Inject(method = "method_56689", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/Identifier;ofVanilla(Ljava/lang/String;)Lnet/minecraft/util/Identifier;"), locals = LocalCapture.CAPTURE_FAILSOFT)
    private static void constructor(RegistryEntry<?> registryEntry, ArmorItem.Type type, CallbackInfoReturnable<AttributeModifiersComponent> cir, int i, float f, AttributeModifiersComponent.Builder builder, AttributeModifierSlot slot) {
        var material = registryEntry.value();
        boolean isChestOrLegs = type.equals(ArmorItem.Type.CHESTPLATE) || type.equals(ArmorItem.Type.LEGGINGS);
        if (material.equals(ModArmorMaterial.AURORA)) {
            nahidamod$armorMapBuilder(builder, Registry.id("celestium_%s_speed_bonus".formatted(type.getName())), EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.1F, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, slot);
            nahidamod$armorMapBuilder(builder, Registry.id("celestium_%s_damage_bonus".formatted(type.getName())), EntityAttributes.GENERIC_ATTACK_DAMAGE, 1.0F, EntityAttributeModifier.Operation.ADD_VALUE, slot);
        }
    }
}
