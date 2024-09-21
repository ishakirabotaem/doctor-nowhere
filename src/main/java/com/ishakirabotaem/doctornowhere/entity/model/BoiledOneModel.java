package com.ishakirabotaem.doctornowhere.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import com.ishakirabotaem.doctornowhere.entity.BoiledOneEntity;

public class BoiledOneModel extends GeoModel<BoiledOneEntity> {
	@Override
	public ResourceLocation getAnimationResource(BoiledOneEntity entity) {
		return new ResourceLocation("doctor_nowhere", "animations/boiled_one.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BoiledOneEntity entity) {
		return new ResourceLocation("doctor_nowhere", "geo/boiled_one.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BoiledOneEntity entity) {
		return new ResourceLocation("doctor_nowhere", "textures/entities/" + entity.getTexture() + ".png");
	}

}
