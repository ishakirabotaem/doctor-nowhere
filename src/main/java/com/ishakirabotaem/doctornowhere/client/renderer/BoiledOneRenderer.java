
package com.ishakirabotaem.doctornowhere.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

import com.ishakirabotaem.doctornowhere.entity.model.BoiledOneModel;
import com.ishakirabotaem.doctornowhere.entity.BoiledOneEntity;

public class BoiledOneRenderer extends GeoEntityRenderer<BoiledOneEntity> {
	public BoiledOneRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new BoiledOneModel());
		this.shadowRadius = 0f;
	}

	@Override
	public RenderType getRenderType(BoiledOneEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, BoiledOneEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 0.4f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
