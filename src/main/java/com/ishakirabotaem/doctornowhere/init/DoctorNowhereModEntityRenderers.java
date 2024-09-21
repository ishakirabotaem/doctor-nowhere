
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.ishakirabotaem.doctornowhere.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.ishakirabotaem.doctornowhere.client.renderer.TheLocustRenderer;
import com.ishakirabotaem.doctornowhere.client.renderer.GuiltRenderer;
import com.ishakirabotaem.doctornowhere.client.renderer.BoiledOneRenderer;
import com.ishakirabotaem.doctornowhere.client.renderer.BoiledOnePhenomenonRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DoctorNowhereModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DoctorNowhereModEntities.GUILT.get(), GuiltRenderer::new);
		event.registerEntityRenderer(DoctorNowhereModEntities.THE_LOCUST.get(), TheLocustRenderer::new);
		event.registerEntityRenderer(DoctorNowhereModEntities.BOILED_ONE.get(), BoiledOneRenderer::new);
		event.registerEntityRenderer(DoctorNowhereModEntities.BOILED_ONE_PHENOMENON.get(), BoiledOnePhenomenonRenderer::new);
	}
}
