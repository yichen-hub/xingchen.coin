package xingchen.xingchenCoin;


import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;



public class BlockBreakListener implements Listener {
    @EventHandler
    public void oreBlockListener(BlockBreakEvent e) {
        Material breakBlockType = e.getBlock().getType();
        if (breakBlockType == Material.DEEPSLATE_DIAMOND_ORE || breakBlockType == Material.DIAMOND_ORE) {
            ItemStack tool = e.getPlayer().getInventory().getItemInMainHand();
            boolean dropsDiamond = e.getBlock().getDrops(tool).stream().anyMatch(drop -> drop.getType() == Material.DIAMOND);
            if (!dropsDiamond) {
                return;}
            double chance = XingchenCoin.instance.getConfig().getDouble("diamond_ores.chance");
            int amount = XingchenCoin.instance.getConfig().getInt("diamond_ores.amount");
            CoinDrop.DropCoin(e,chance,amount);
            }
        else if (breakBlockType == Material.DEEPSLATE_GOLD_ORE || breakBlockType == Material.GOLD_ORE) {
            ItemStack tool = e.getPlayer().getInventory().getItemInMainHand();
            boolean drops = e.getBlock().getDrops(tool).stream().anyMatch(drop -> drop.getType() == Material.RAW_GOLD);
            if (!drops) {
                return;}
            double chance = XingchenCoin.instance.getConfig().getDouble("gold_ores.chance");
            int amount = XingchenCoin.instance.getConfig().getInt("gold_ores.amount");
            CoinDrop.DropCoin(e,chance,amount);
            }
        else if (breakBlockType == Material.DEEPSLATE_EMERALD_ORE||breakBlockType == Material.EMERALD_ORE){
            ItemStack tool = e.getPlayer().getInventory().getItemInMainHand();
            boolean drops = e.getBlock().getDrops(tool).stream().anyMatch(drop -> drop.getType() == Material.EMERALD);
            if (!drops) {
                return;}
            double chance = XingchenCoin.instance.getConfig().getDouble("emerald_ores.chance");
            int amount = XingchenCoin.instance.getConfig().getInt("emerald_ores.amount");
            CoinDrop.DropCoin(e,chance,amount);
        }
        else if (breakBlockType == Material.DEEPSLATE_REDSTONE_ORE||breakBlockType == Material.REDSTONE_ORE){
            ItemStack tool = e.getPlayer().getInventory().getItemInMainHand();
            boolean drops = e.getBlock().getDrops(tool).stream().anyMatch(drop -> drop.getType() == Material.REDSTONE);
            if (!drops) {
                return;}
            double chance = XingchenCoin.instance.getConfig().getDouble("redStone_ores.chance");
            int amount = XingchenCoin.instance.getConfig().getInt("redStone_ores.amount");
            CoinDrop.DropCoin(e,chance,amount);
        }
        else if (breakBlockType == Material.DEEPSLATE_LAPIS_ORE||breakBlockType == Material.LAPIS_ORE){
            ItemStack tool = e.getPlayer().getInventory().getItemInMainHand();
            boolean drops = e.getBlock().getDrops(tool).stream().anyMatch(drop -> drop.getType() == Material.LAPIS_LAZULI);
            if (!drops) {
                return;}
            double chance = XingchenCoin.instance.getConfig().getDouble("lapis_ores.chance");
            int amount = XingchenCoin.instance.getConfig().getInt("lapis_ores.chance");
            CoinDrop.DropCoin(e,chance,amount);
        }
        else if (breakBlockType == Material.DEEPSLATE_IRON_ORE||breakBlockType == Material.IRON_ORE){
            ItemStack tool = e.getPlayer().getInventory().getItemInMainHand();
            boolean drops = e.getBlock().getDrops(tool).stream().anyMatch(drop -> drop.getType() == Material.RAW_IRON);
            if (!drops) {
                return;}
            double chance = XingchenCoin.instance.getConfig().getDouble("iron_ores.chance");
            int amount = XingchenCoin.instance.getConfig().getInt("iron_ores.amount");
            CoinDrop.DropCoin(e,chance,amount);
        }
        else if (breakBlockType == Material.DEEPSLATE_COPPER_ORE||breakBlockType == Material.COPPER_ORE){
            ItemStack tool = e.getPlayer().getInventory().getItemInMainHand();
            boolean drops = e.getBlock().getDrops(tool).stream().anyMatch(drop -> drop.getType() == Material.RAW_COPPER);
            if (!drops) {
                return;}
            double chance = XingchenCoin.instance.getConfig().getDouble("copper_ores.chance");
            int amount = XingchenCoin.instance.getConfig().getInt("copper_ores.amount");
            CoinDrop.DropCoin(e,chance,amount);
        }
        else if (breakBlockType == Material.DEEPSLATE_COAL_ORE||breakBlockType == Material.COAL_ORE){
            ItemStack tool = e.getPlayer().getInventory().getItemInMainHand();
            boolean drops = e.getBlock().getDrops(tool).stream().anyMatch(drop -> drop.getType() == Material.COAL);
            if (!drops) {
                return;}
            double chance = XingchenCoin.instance.getConfig().getDouble("coal_ores.chance");
            int amount = XingchenCoin.instance.getConfig().getInt("coal_ores.amount");
            CoinDrop.DropCoin(e,chance,amount);
        }
        //注意!目前远古残骸无法防止刷金币!所以配置文件中的残骸获取金币概率&金币掉落量均已改为0
        else if (breakBlockType == Material.ANCIENT_DEBRIS){
            double chance = XingchenCoin.instance.getConfig().getDouble("ancient_debris.chance");
            int amount = XingchenCoin.instance.getConfig().getInt("ancient_debris.amount");
            CoinDrop.DropCoin(e,chance,amount);
        }
    }
}

