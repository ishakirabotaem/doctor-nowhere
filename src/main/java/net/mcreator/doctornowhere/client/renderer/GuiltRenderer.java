
package net.mcreator.doctornowhere.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.doctornowhere.entity.model.GuiltModel;
import net.mcreator.doctornowhere.entity.GuiltEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GuiltRenderer extends GeoEntityRenderer<GuiltEntity> {
	public GuiltRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new GuiltModel());
		this.shadowRadius = 0f;
	}

	@Override
	public RenderType getRenderType(GuiltEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(0.25f, 0.25f, 0.25f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
