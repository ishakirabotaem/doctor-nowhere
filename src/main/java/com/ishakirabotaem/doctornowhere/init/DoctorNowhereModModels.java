
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.ishakirabotaem.doctornowhere.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.ishakirabotaem.doctornowhere.client.model.Modelmodel;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class DoctorNowhereModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelmodel.LAYER_LOCATION, Modelmodel::createBodyLayer);
	}
}
