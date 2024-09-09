package net.mcreator.doctornowhere.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.doctornowhere.entity.GuiltEntity;

public class GuiltModel extends AnimatedGeoModel<GuiltEntity> {
	@Override
	public ResourceLocation getAnimationResource(GuiltEntity entity) {
		return new ResourceLocation("doctor_nowhere", "animations/guilt.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GuiltEntity entity) {
		return new ResourceLocation("doctor_nowhere", "geo/guilt.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GuiltEntity entity) {
		return new ResourceLocation("doctor_nowhere", "textures/entities/" + entity.getTexture() + ".png");
	}

}
