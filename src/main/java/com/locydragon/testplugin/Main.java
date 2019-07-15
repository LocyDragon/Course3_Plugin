package com.locydragon.testplugin;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
/**
 * @author LocyDragon
 */
public class Main extends JavaPlugin{
	public static void onCall(Player who, String message) {
		who.sendRawMessage("你收到了一条信息:");
		who.sendRawMessage(message);
		//这里用sendRawMessage，为了避免sendMessage又被监听，造成死循环
	}
}
