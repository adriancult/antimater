
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aaaa.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.aaaa.item.AntimaSwordItem;
import net.mcreator.aaaa.item.AntimaShovelItem;
import net.mcreator.aaaa.item.AntimaPickaxeItem;
import net.mcreator.aaaa.item.AntimaHoeItem;
import net.mcreator.aaaa.item.AntimaAxeItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AaaaModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item ANTIMA_PICKAXE = register(new AntimaPickaxeItem());
	public static final Item ANTIMA_AXE = register(new AntimaAxeItem());
	public static final Item ANTIMA_SWORD = register(new AntimaSwordItem());
	public static final Item ANTIMA_SHOVEL = register(new AntimaShovelItem());
	public static final Item ANTIMA_HOE = register(new AntimaHoeItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
