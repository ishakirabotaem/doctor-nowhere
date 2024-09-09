package net.mcreator.doctornowhere.procedures;

import net.minecraft.world.entity.Entity;

public class TheLocustOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.maxUpStep = (float) 3.6;
	}
}
