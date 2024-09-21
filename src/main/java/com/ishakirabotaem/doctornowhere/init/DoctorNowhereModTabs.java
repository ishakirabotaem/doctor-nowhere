
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.ishakirabotaem.doctornowhere.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import com.ishakirabotaem.doctornowhere.DoctorNowhereMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DoctorNowhereModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DoctorNowhereMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(DoctorNowhereModItems.GUILT_SPAWN_EGG.get());
			tabData.accept(DoctorNowhereModItems.THE_LOCUST_SPAWN_EGG.get());
			tabData.accept(DoctorNowhereModItems.BOILED_ONE_SPAWN_EGG.get());
			tabData.accept(DoctorNowhereModItems.BOILED_ONE_PHENOMENON_SPAWN_EGG.get());
		}
	}
}
