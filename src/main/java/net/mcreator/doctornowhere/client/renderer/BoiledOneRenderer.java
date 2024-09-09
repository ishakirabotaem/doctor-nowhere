
package net.mcreator.doctornowhere.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.doctornowhere.entity.model.BoiledOneModel;
import net.mcreator.doctornowhere.entity.BoiledOneEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BoiledOneRenderer extends GeoEntityRenderer<BoiledOneEntity> {
	public BoiledOneRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new BoiledOneModel());
		this.shadowRadius = 0f;
	}

	@Override
	public RenderType getRenderType(BoiledOneEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(0.4f, 0.4f, 0.4f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
