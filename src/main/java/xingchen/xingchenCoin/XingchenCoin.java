package xingchen.xingchenCoin;


import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;



public final class XingchenCoin extends JavaPlugin {
    public static JavaPlugin instance;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        instance=this;
        Bukkit.getPluginManager().registerEvents(new BlockBreakListener(), this);
        instance.getLogger().info("Xingchen coin插件加载成功!");
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
