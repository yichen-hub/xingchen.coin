package xingchen.xingchenCoin;

import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class CoinDrop {

    public static void DropCoin(BlockBreakEvent e, double chance, int amount) {
        if (Math.random() < chance) {
            ItemStack coin = ItemCoin.create();
            coin.setAmount(amount);
            e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(),coin);
        }
    }
}
