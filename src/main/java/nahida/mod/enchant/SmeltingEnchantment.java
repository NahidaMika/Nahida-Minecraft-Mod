package nahida.mod.enchant;

import nahida.mod.NahidaMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class SmeltingEnchantment extends Enchantment {
    
    public static Enchantment SMELTING = new SmeltingEnchantment();

    public SmeltingEnchantment() {
        super(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.DIGGER, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }
 
    @Override
    public int getMinLevel() {
        return 1;
    }
 
    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public int getMinPower(int level) {
        return 15;
    }

    @Override
    public int getMaxPower(int level) {
        return super.getMinPower(level) + 50;
    }


    @Override
    protected boolean canAccept(Enchantment other) {
        return super.canAccept(other) && other != Enchantments.SILK_TOUCH;
    }

    public static Enchantment registerSmeltingEnchantment() {
        return Registry.register(Registries.ENCHANTMENT, Identifier.tryParse(NahidaMod.MOD_ID + ":" + "smelting"), SMELTING);

        
    }
}