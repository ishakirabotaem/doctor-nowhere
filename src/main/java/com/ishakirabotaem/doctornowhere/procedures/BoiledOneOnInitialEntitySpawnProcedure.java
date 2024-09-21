package com.ishakirabotaem.doctornowhere.procedures;

import net.minecraft.world.entity.Entity;

public class BoiledOneOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setMaxUpStep(3);
	}
}
