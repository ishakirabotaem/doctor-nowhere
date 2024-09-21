
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.ishakirabotaem.doctornowhere.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import com.ishakirabotaem.doctornowhere.DoctorNowhereMod;

public class DoctorNowhereModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DoctorNowhereMod.MODID);
	public static final RegistryObject<Item> GUILT_SPAWN_EGG = REGISTRY.register("guilt_spawn_egg", () -> new ForgeSpawnEggItem(DoctorNowhereModEntities.GUILT, -3355444, -1, new Item.Properties()));
	public static final RegistryObject<Item> THE_LOCUST_SPAWN_EGG = REGISTRY.register("the_locust_spawn_egg", () -> new ForgeSpawnEggItem(DoctorNowhereModEntities.THE_LOCUST, -16772856, -17825, new Item.Properties()));
	public static final RegistryObject<Item> BOILED_ONE_SPAWN_EGG = REGISTRY.register("boiled_one_spawn_egg", () -> new ForgeSpawnEggItem(DoctorNowhereModEntities.BOILED_ONE, -13421773, -65485, new Item.Properties()));
	public static final RegistryObject<Item> BOILED_ONE_PHENOMENON_SPAWN_EGG = REGISTRY.register("boiled_one_phenomenon_spawn_egg",
			() -> new ForgeSpawnEggItem(DoctorNowhereModEntities.BOILED_ONE_PHENOMENON, -13421773, -10092493, new Item.Properties()));
}
