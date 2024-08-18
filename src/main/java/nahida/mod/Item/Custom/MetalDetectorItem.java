package nahida.mod.Item.Custom;


import java.util.List;

import nahida.mod.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MetalDetectorItem extends Item{

    public MetalDetectorItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (!context.getWorld().isClient()) {
            BlockPos positonClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundBlock = false;

            for(int i = 0; i <= positonClicked.getY() + 64; i++) {
                BlockState state = context.getWorld().getBlockState(positonClicked.down(i));
            
                if(isValuableBlock(state)) {
                    outputValuableCordinates(positonClicked.down(i) ,player , state.getBlock());
                    foundBlock = true;
                    
                    break;
                }
            }

            if(!foundBlock) {
                player.sendMessage(Text.literal("No Valuables Found!"));
            }
        }
        context.getStack().damage(1, context.getPlayer(), 
                playerEntity -> playerEntity.sendToolBreakStatus(playerEntity.getActiveHand()));
                  
        return ActionResult.SUCCESS;
        
    }
    private void outputValuableCordinates(BlockPos blockPos, PlayerEntity player, Block block) {
        player.sendMessage(Text.literal("Found " + block.asItem().getName().getString() + " at " +"("+ blockPos.getX() +", "+ blockPos.getY() + ", "+ blockPos.getZ() +")"), false);
    }

    private boolean isValuableBlock(BlockState state) {
        return state.isIn(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKS);  
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.nahidamod.metal_detector.tooltip"));
        super.appendTooltip(stack, world, tooltip, context);
    }
    

}