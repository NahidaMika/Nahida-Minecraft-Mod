package nahida.mod.util;

import nahida.mod.Item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.VillagerProfession;
import net.minecraft.village.TradeOffer;

public class ModCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 3, 
        factories -> {
            factories.add((entity, random) -> new TradeOffer(
                new ItemStack(Items.EMERALD, 8),
                new ItemStack(ModItems.SUSHI, 2),
                6,10,0.05f

            ));
        });
        TradeOfferHelper.registerWanderingTraderOffers(2, 
        factories -> {
            factories.add((entity, random) -> new TradeOffer(
                new ItemStack(Items.EMERALD, 8),
                new ItemStack(ModItems.SUSHI, 2),
                6,10,0.05f

            ));
        });  
        TradeOfferHelper.registerWanderingTraderOffers(2, 
        factories -> {
            factories.add((entity, random) -> new TradeOffer(
                new ItemStack(Items.EMERALD, 32),
                new ItemStack(ModItems.AURORA_CHUNK, 1),
                1,60,0.05f

            ));
        });           
    }
}