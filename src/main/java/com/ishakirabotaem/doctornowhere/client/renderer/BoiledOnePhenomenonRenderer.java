
package com.ishakirabotaem.doctornowhere.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.mojang.blaze3d.vertex.PoseStack;

import com.ishakirabotaem.doctornowhere.entity.BoiledOnePhenomenonEntity;
import com.ishakirabotaem.doctornowhere.client.model.Modelmodel;

public class BoiledOnePhenomenonRenderer extends MobRenderer<BoiledOnePhenomenonEntity, Modelmodel<BoiledOnePhenomenonEntity>> {
	public BoiledOnePhenomenonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmodel(context.bakeLayer(Modelmodel.LAYER_LOCATION)), 0f);
	}

	@Override
	protected void scale(BoiledOnePhenomenonEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.1f, 0.1f, 0.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BoiledOnePhenomenonEntity entity) {
		return new ResourceLocation("doctor_nowhere:textures/entities/dark_boiled_one.png");
	}
}
