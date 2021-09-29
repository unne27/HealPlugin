package io.github.unne27.Heal;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.ChatColor;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.EventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;



public class Heal implements CommandExecutor, Listener {
    HealPlugin plugin;

    public Heal(HealPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void PlayerChatEvent(AsyncPlayerChatEvent event) {
        Player target = event.getPlayer();
        if (true){
            event.setCancelled(true);
          //  event.getPlayer().sendMessage(Strings.MuteMsg);
        }
    }

    
    
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	if (cmd.getName().equalsIgnoreCase("heal")) {
    	    Player target = Bukkit.getPlayer(args[0]);
    	    sender.sendMessage(ChatColor.GREEN + "Healed " + ChatColor.YELLOW + ""+args[0]+"" + ChatColor.GREEN + "!");
    	    if(target != null)
    	    {
    	    target.setHealth(20);
    	    target.sendMessage(ChatColor.GREEN + "You have been healed!");
    	    }
    	    else
    	    {
    	    sender.sendMessage(ChatColor.RED + "Player "+args[0]+" is not online");
    	    
    		}
    	}
        
        return true;
 
    }
}



