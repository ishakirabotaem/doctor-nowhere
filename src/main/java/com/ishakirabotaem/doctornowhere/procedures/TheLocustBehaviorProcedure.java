package com.ishakirabotaem.doctornowhere.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;

import com.ishakirabotaem.doctornowhere.entity.TheLocustEntity;
import com.ishakirabotaem.doctornowhere.DoctorNowhereMod;

public class TheLocustBehaviorProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("aggresive") == false) {
			if (!(entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(MobEffects.INVISIBILITY)) && !(entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(MobEffects.MOVEMENT_SLOWDOWN))) {
				if (Mth.nextInt(RandomSource.create(), 1, 10) <= 5) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 2, false, false));
				} else {
					if (Mth.nextInt(RandomSource.create(), 1, 64000) <= 1) {
						if (!entity.level().isClientSide())
							entity.discard();
					} else {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 80, 255, false, false));
					}
				}
			}
			if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).isEmpty() || !world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).isEmpty()) {
				entity.getPersistentData().putBoolean("aggresive", true);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
			}
		}
		if (entity.getPersistentData().getBoolean("aggresive") == true) {
			if (!(entity instanceof LivingEntity _livEnt13 && _livEnt13.hasEffect(MobEffects.MOVEMENT_SPEED))) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 120, 4, false, false));
			}
			if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).isEmpty() || !world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).isEmpty()) {
				if (Mth.nextInt(RandomSource.create(), 1, 640) <= 1) {
					if (!entity.level().isClientSide())
						entity.discard();
				}
			}
		}
		if (!(entity instanceof LivingEntity _livEnt19 && _livEnt19.hasEffect(MobEffects.DOLPHINS_GRACE))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 120, 1, false, false));
		}
		if (Mth.nextInt(RandomSource.create(), 1, 640000) == 1) {
			if (entity instanceof TheLocustEntity) {
				((TheLocustEntity) entity).setAnimation("bug");
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 120, 2, false, false));
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.MOVEMENT_SPEED);
			DoctorNowhereMod.queueServerWork(60, () -> {
				if (!entity.level().isClientSide())
					entity.discard();
			});
		}
	}
}
