package nahida.mod.Item.Custom;

import nahida.mod.Item.ModItems;
import nahida.mod.NahidaMod;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorItem.Type;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum ModArmorMaterial implements ArmorMaterial{
    AURORA("aurora",40, new int[]{ 3, 8, 6, 3},25,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4f,2F,
            () -> Ingredient.ofItems(ModItems.AURORA_INGOT))
    ; 

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {11, 16, 15 ,13};

    ModArmorMaterial(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }


    @Override
    public int getDurability(ArmorItem.Type type) {
        // TODO Auto-generated method stub
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getEnchantability() {
        // TODO Auto-generated method stub
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        // TODO Auto-generated method stub
        return this.equipSound;
    }

    @Override
    public float getKnockbackResistance() {
        // TODO Auto-generated method stub
        return this.knockbackResistance;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return NahidaMod.MOD_ID + ":" + this.name;
    }

    @Override
    public int getProtection(Type type) {
        // TODO Auto-generated method stub
        return protectionAmounts[type.ordinal()];
    }

    @Override
    public Ingredient getRepairIngredient() {
        // TODO Auto-generated method stub
       return this.repairIngredient.get();
    }

    @Override
    public float getToughness() {
        // TODO Auto-generated method stub
       return this.toughness;
    }

}
