package xingchen.xingchenCoin;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemCoin {


    public static final int CUSTOM_MODEL_DATA = 50815;


    public static ItemStack create() {
        ItemStack coin = new ItemStack(Material.GOLD_INGOT);
        ItemMeta meta = coin.getItemMeta();
        if (meta != null) {
            String displayName = XingchenCoin.instance.getConfig().getString("coin.name");
            String loreInfo = XingchenCoin.instance.getConfig().getString("coin.lore");
            meta.setCustomModelData(CUSTOM_MODEL_DATA);
            List<String> lore = new ArrayList<>();
            lore.add(loreInfo);
            meta.setLore(lore);
            meta.setDisplayName(displayName);
            coin.setItemMeta(meta);
        }
        return coin;
    }
}
