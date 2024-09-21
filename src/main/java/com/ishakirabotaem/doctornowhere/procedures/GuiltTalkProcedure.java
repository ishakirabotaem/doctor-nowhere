package com.ishakirabotaem.doctornowhere.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import com.ishakirabotaem.doctornowhere.entity.GuiltEntity;

public class GuiltTalkProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getPersistentData().getString("talked")).isEmpty()) {
			if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty() || !world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty()) {
				if (entity instanceof GuiltEntity) {
					entity.getPersistentData().putString("talked", "true");
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 680, 7, false, false));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 680, 7, false, false));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 680, 255, false, false));
					if (entity instanceof GuiltEntity) {
						((GuiltEntity) entity).setAnimation("thebath");
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("doctor_nowhere:entity.guilt.talk")), SoundSource.MASTER, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("doctor_nowhere:entity.guilt.talk")), SoundSource.MASTER, 1, 1, false);
						}
					}
				}
			}
		}
	}
}
