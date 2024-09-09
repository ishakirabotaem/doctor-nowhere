
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doctornowhere.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.doctornowhere.DoctorNowhereMod;

public class DoctorNowhereModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DoctorNowhereMod.MODID);
	public static final RegistryObject<Item> GUILT_SPAWN_EGG = REGISTRY.register("guilt_spawn_egg", () -> new ForgeSpawnEggItem(DoctorNowhereModEntities.GUILT, -3355444, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> THE_LOCUST_SPAWN_EGG = REGISTRY.register("the_locust_spawn_egg", () -> new ForgeSpawnEggItem(DoctorNowhereModEntities.THE_LOCUST, -16777216, -26317, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BOILED_ONE_SPAWN_EGG = REGISTRY.register("boiled_one_spawn_egg", () -> new ForgeSpawnEggItem(DoctorNowhereModEntities.BOILED_ONE, -13421773, -65485, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
