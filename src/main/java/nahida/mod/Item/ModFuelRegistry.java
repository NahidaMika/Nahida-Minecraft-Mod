package nahida.mod.Item;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;

public class ModFuelRegistry {
    public static void registerFuel(Item item, Integer value) {
        FuelRegistry.INSTANCE.add(item, value);
    }

}
