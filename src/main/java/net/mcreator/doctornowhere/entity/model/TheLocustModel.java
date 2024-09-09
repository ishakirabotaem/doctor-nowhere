package net.mcreator.doctornowhere.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.doctornowhere.entity.TheLocustEntity;

public class TheLocustModel extends AnimatedGeoModel<TheLocustEntity> {
	@Override
	public ResourceLocation getAnimationResource(TheLocustEntity entity) {
		return new ResourceLocation("doctor_nowhere", "animations/thelocust.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TheLocustEntity entity) {
		return new ResourceLocation("doctor_nowhere", "geo/thelocust.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TheLocustEntity entity) {
		return new ResourceLocation("doctor_nowhere", "textures/entities/" + entity.getTexture() + ".png");
	}

}
