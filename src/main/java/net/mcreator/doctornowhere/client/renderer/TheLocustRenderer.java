
package net.mcreator.doctornowhere.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.doctornowhere.entity.model.TheLocustModel;
import net.mcreator.doctornowhere.entity.TheLocustEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class TheLocustRenderer extends GeoEntityRenderer<TheLocustEntity> {
	public TheLocustRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new TheLocustModel());
		this.shadowRadius = 0f;
	}

	@Override
	public RenderType getRenderType(TheLocustEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(0.5f, 0.5f, 0.5f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
