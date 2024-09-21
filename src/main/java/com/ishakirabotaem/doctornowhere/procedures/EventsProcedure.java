package com.ishakirabotaem.doctornowhere.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import javax.annotation.Nullable;

import com.ishakirabotaem.doctornowhere.network.DoctorNowhereModVariables;
import com.ishakirabotaem.doctornowhere.init.DoctorNowhereModEntities;
import com.ishakirabotaem.doctornowhere.DoctorNowhereMod;

@Mod.EventBusSubscriber
public class EventsProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(DoctorNowhereModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DoctorNowhereModVariables.PlayerVariables())).armorstand_event == false) {
			if (Mth.nextInt(RandomSource.create(), 1, 648000) == 1) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = EntityType.ARMOR_STAND.create(_serverLevel, null, null, BlockPos.containing(x + 0.5, y + 3, z + 0.5), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						entityinstance.setNoGravity(true);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = EntityType.ARMOR_STAND.create(_serverLevel, null, null, BlockPos.containing(x + -0.5, y, z + 1.5), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						entityinstance.setNoGravity(true);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = EntityType.ARMOR_STAND.create(_serverLevel, null, null, BlockPos.containing(x + 1.5, y, z + 1.5), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						entityinstance.setNoGravity(true);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = EntityType.ARMOR_STAND.create(_serverLevel, null, null, BlockPos.containing(x + -0.5, y, z + -0.5), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						entityinstance.setNoGravity(true);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = EntityType.ARMOR_STAND.create(_serverLevel, null, null, BlockPos.containing(x + 1.5, y, z + -0.5), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						entityinstance.setNoGravity(true);
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
				{
					boolean _setval = true;
					entity.getCapability(DoctorNowhereModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.armorstand_event = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if ((entity.getCapability(DoctorNowhereModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DoctorNowhereModVariables.PlayerVariables())).armorstand_rain_event == false) {
			if (Mth.nextInt(RandomSource.create(), 1, 648000) == 1) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = EntityType.ARMOR_STAND.create(_serverLevel, null, null,
							BlockPos.containing(x + Mth.nextInt(RandomSource.create(), -5, 5), y + Mth.nextInt(RandomSource.create(), -5, 5), z + Mth.nextInt(RandomSource.create(), -5, 5)), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						entityinstance.setInvulnerable(true);
						DoctorNowhereMod.queueServerWork(200, () -> {
							if (!entityinstance.level().isClientSide())
								entityinstance.discard();
						});
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = EntityType.ARMOR_STAND.create(_serverLevel, null, null,
							BlockPos.containing(x + Mth.nextInt(RandomSource.create(), -5, 5), y + Mth.nextInt(RandomSource.create(), -5, 5), z + Mth.nextInt(RandomSource.create(), -5, 5)), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						entityinstance.setInvulnerable(true);
						DoctorNowhereMod.queueServerWork(200, () -> {
							if (!entityinstance.level().isClientSide())
								entityinstance.discard();
						});
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = EntityType.ARMOR_STAND.create(_serverLevel, null, null,
							BlockPos.containing(x + Mth.nextInt(RandomSource.create(), -5, 5), y + Mth.nextInt(RandomSource.create(), -5, 5), z + Mth.nextInt(RandomSource.create(), -5, 5)), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						entityinstance.setInvulnerable(true);
						DoctorNowhereMod.queueServerWork(200, () -> {
							if (!entityinstance.level().isClientSide())
								entityinstance.discard();
						});
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = EntityType.ARMOR_STAND.create(_serverLevel, null, null,
							BlockPos.containing(x + Mth.nextInt(RandomSource.create(), -5, 5), y + Mth.nextInt(RandomSource.create(), -5, 5), z + Mth.nextInt(RandomSource.create(), -5, 5)), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						entityinstance.setInvulnerable(true);
						DoctorNowhereMod.queueServerWork(200, () -> {
							if (!entityinstance.level().isClientSide())
								entityinstance.discard();
						});
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = EntityType.ARMOR_STAND.create(_serverLevel, null, null,
							BlockPos.containing(x + Mth.nextInt(RandomSource.create(), -5, 5), y + Mth.nextInt(RandomSource.create(), -5, 5), z + Mth.nextInt(RandomSource.create(), -5, 5)), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						entityinstance.setInvulnerable(true);
						DoctorNowhereMod.queueServerWork(200, () -> {
							if (!entityinstance.level().isClientSide())
								entityinstance.discard();
						});
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = EntityType.ARMOR_STAND.create(_serverLevel, null, null,
							BlockPos.containing(x + Mth.nextInt(RandomSource.create(), -5, 5), y + Mth.nextInt(RandomSource.create(), -5, 5), z + Mth.nextInt(RandomSource.create(), -5, 5)), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						entityinstance.setInvulnerable(true);
						DoctorNowhereMod.queueServerWork(200, () -> {
							if (!entityinstance.level().isClientSide())
								entityinstance.discard();
						});
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = EntityType.ARMOR_STAND.create(_serverLevel, null, null,
							BlockPos.containing(x + Mth.nextInt(RandomSource.create(), -5, 5), y + Mth.nextInt(RandomSource.create(), -5, 5), z + Mth.nextInt(RandomSource.create(), -5, 5)), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						entityinstance.setInvulnerable(true);
						DoctorNowhereMod.queueServerWork(200, () -> {
							if (!entityinstance.level().isClientSide())
								entityinstance.discard();
						});
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = EntityType.ARMOR_STAND.create(_serverLevel, null, null,
							BlockPos.containing(x + Mth.nextInt(RandomSource.create(), -5, 5), y + Mth.nextInt(RandomSource.create(), -5, 5), z + Mth.nextInt(RandomSource.create(), -5, 5)), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						entityinstance.setInvulnerable(true);
						DoctorNowhereMod.queueServerWork(200, () -> {
							if (!entityinstance.level().isClientSide())
								entityinstance.discard();
						});
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = EntityType.ARMOR_STAND.create(_serverLevel, null, null,
							BlockPos.containing(x + Mth.nextInt(RandomSource.create(), -5, 5), y + Mth.nextInt(RandomSource.create(), -5, 5), z + Mth.nextInt(RandomSource.create(), -5, 5)), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						entityinstance.setInvulnerable(true);
						DoctorNowhereMod.queueServerWork(200, () -> {
							if (!entityinstance.level().isClientSide())
								entityinstance.discard();
						});
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = EntityType.ARMOR_STAND.create(_serverLevel, null, null,
							BlockPos.containing(x + Mth.nextInt(RandomSource.create(), -5, 5), y + Mth.nextInt(RandomSource.create(), -5, 5), z + Mth.nextInt(RandomSource.create(), -5, 5)), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						entityinstance.setInvulnerable(true);
						DoctorNowhereMod.queueServerWork(200, () -> {
							if (!entityinstance.level().isClientSide())
								entityinstance.discard();
						});
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = EntityType.ARMOR_STAND.create(_serverLevel, null, null,
							BlockPos.containing(x + Mth.nextInt(RandomSource.create(), -5, 5), y + Mth.nextInt(RandomSource.create(), -5, 5), z + Mth.nextInt(RandomSource.create(), -5, 5)), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						entityinstance.setInvulnerable(true);
						DoctorNowhereMod.queueServerWork(200, () -> {
							if (!entityinstance.level().isClientSide())
								entityinstance.discard();
						});
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = EntityType.ARMOR_STAND.create(_serverLevel, null, null,
							BlockPos.containing(x + Mth.nextInt(RandomSource.create(), -5, 5), y + Mth.nextInt(RandomSource.create(), -5, 5), z + Mth.nextInt(RandomSource.create(), -5, 5)), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						entityinstance.setInvulnerable(true);
						DoctorNowhereMod.queueServerWork(200, () -> {
							if (!entityinstance.level().isClientSide())
								entityinstance.discard();
						});
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
				{
					boolean _setval = true;
					entity.getCapability(DoctorNowhereModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.armorstand_rain_event = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if ((entity.getCapability(DoctorNowhereModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DoctorNowhereModVariables.PlayerVariables())).boiled_one_spawn == false) {
			if (Mth.nextInt(RandomSource.create(), 1, 648000) == 1) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1440, 128, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 1440, 128, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 1440, 128, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 1440, 128, false, false));
				if ((entity.getDirection()) == Direction.NORTH) {
					if (world instanceof ServerLevel _serverLevel) {
						Entity entityinstance = DoctorNowhereModEntities.BOILED_ONE.get().create(_serverLevel, null, null, BlockPos.containing(x, y, z - 5), MobSpawnType.MOB_SUMMONED, false, false);
						if (entityinstance != null) {
							entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
							entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(x, (y + 5), (z - 5)));
							entityinstance.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y, (z + 5)));
							entityinstance.setNoGravity(true);
							_serverLevel.addFreshEntity(entityinstance);
						}
					}
				} else {
					if ((entity.getDirection()) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverLevel) {
							Entity entityinstance = DoctorNowhereModEntities.BOILED_ONE.get().create(_serverLevel, null, null, BlockPos.containing(x, y, z + 5), MobSpawnType.MOB_SUMMONED, false, false);
							if (entityinstance != null) {
								entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
								entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(x, (y + 5), (z + 5)));
								entityinstance.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y, (z - 5)));
								entityinstance.setNoGravity(true);
								_serverLevel.addFreshEntity(entityinstance);
							}
						}
					} else {
						if ((entity.getDirection()) == Direction.WEST) {
							if (world instanceof ServerLevel _serverLevel) {
								Entity entityinstance = DoctorNowhereModEntities.BOILED_ONE.get().create(_serverLevel, null, null, BlockPos.containing(x - 5, y, z), MobSpawnType.MOB_SUMMONED, false, false);
								if (entityinstance != null) {
									entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
									entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((x + 5), (y - 5), z));
									entityinstance.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((x + 5), y, z));
									entityinstance.setNoGravity(true);
									_serverLevel.addFreshEntity(entityinstance);
								}
							}
						} else {
							if ((entity.getDirection()) == Direction.EAST) {
								if (world instanceof ServerLevel _serverLevel) {
									Entity entityinstance = DoctorNowhereModEntities.BOILED_ONE.get().create(_serverLevel, null, null, BlockPos.containing(x + 5, y, z), MobSpawnType.MOB_SUMMONED, false, false);
									if (entityinstance != null) {
										entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
										entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((x + 5), (y + 5), z));
										entityinstance.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((x - 5), y, z));
										entityinstance.setNoGravity(true);
										_serverLevel.addFreshEntity(entityinstance);
									}
								}
							} else {
								if ((entity.getDirection()) == Direction.DOWN) {
									if (world instanceof ServerLevel _serverLevel) {
										Entity entityinstance = DoctorNowhereModEntities.BOILED_ONE.get().create(_serverLevel, null, null, BlockPos.containing(x, y, z - 5), MobSpawnType.MOB_SUMMONED, false, false);
										if (entityinstance != null) {
											entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
											entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(x, (y + 5), (z - 5)));
											entityinstance.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y, (z + 5)));
											entityinstance.setNoGravity(true);
											_serverLevel.addFreshEntity(entityinstance);
										}
									}
								} else {
									if ((entity.getDirection()) == Direction.DOWN) {
										if (world instanceof ServerLevel _serverLevel) {
											Entity entityinstance = DoctorNowhereModEntities.BOILED_ONE.get().create(_serverLevel, null, null, BlockPos.containing(x, y, z + 5), MobSpawnType.MOB_SUMMONED, false, false);
											if (entityinstance != null) {
												entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
												entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(x, (y + 5), (z + 5)));
												entityinstance.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y, (z - 5)));
												entityinstance.setNoGravity(true);
												_serverLevel.addFreshEntity(entityinstance);
											}
										}
									}
								}
							}
						}
					}
				}
				{
					boolean _setval = true;
					entity.getCapability(DoctorNowhereModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.boiled_one_spawn = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if ((entity.getCapability(DoctorNowhereModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DoctorNowhereModVariables.PlayerVariables())).pig_event == false) {
			if (Mth.nextInt(RandomSource.create(), 1, 648000) == 1) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.PIG.spawn(_level, BlockPos.containing(x, 300, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot((float) Mth.nextDouble(RandomSource.create(), 1, 360));
						entityToSpawn.setYBodyRot((float) Mth.nextDouble(RandomSource.create(), 1, 360));
						entityToSpawn.setYHeadRot((float) Mth.nextDouble(RandomSource.create(), 1, 360));
						entityToSpawn.setXRot((float) Mth.nextDouble(RandomSource.create(), 1, 360));
						entityToSpawn.setDeltaMovement(0, (-100), 0);
					}
				}
				{
					boolean _setval = true;
					entity.getCapability(DoctorNowhereModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.pig_event = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if ((entity.getCapability(DoctorNowhereModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DoctorNowhereModVariables.PlayerVariables())).dripstone_event == false) {
			if (Mth.nextInt(RandomSource.create(), 1, 648000) == 1) {
				{
					boolean _setval = true;
					entity.getCapability(DoctorNowhereModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.dripstone_event = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (world instanceof ServerLevel _level)
					FallingBlockEntity.fall(_level, BlockPos.containing(x, y + 5, z), Blocks.POINTED_DRIPSTONE.defaultBlockState());
			}
		}
		if ((entity.getCapability(DoctorNowhereModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DoctorNowhereModVariables.PlayerVariables())).midnght_event == false) {
			if (Mth.nextInt(RandomSource.create(), 1, 648000) == 1) {
				if (world instanceof ServerLevel _level)
					_level.setDayTime(18000);
				{
					boolean _setval = true;
					entity.getCapability(DoctorNowhereModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.midnght_event = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if ((entity.getCapability(DoctorNowhereModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DoctorNowhereModVariables.PlayerVariables())).lags1 == false) {
			if (Mth.nextInt(RandomSource.create(), 1, 648000) == 1) {
				for (int index0 = 0; index0 < 6; index0++) {
					if (world instanceof ServerLevel _level)
						_level.setDayTime(18000);
					DoctorNowhereMod.queueServerWork(1, () -> {
						if (world instanceof ServerLevel _level)
							_level.setDayTime(0);
					});
				}
				{
					boolean _setval = true;
					entity.getCapability(DoctorNowhereModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.lags1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if ((entity.getCapability(DoctorNowhereModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DoctorNowhereModVariables.PlayerVariables())).lags2 == false) {
			if (Mth.nextInt(RandomSource.create(), 1, 648000) == 1) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = EntityType.COW.create(_serverLevel, null, null, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						DoctorNowhereMod.queueServerWork(1, () -> {
							if (!entityinstance.level().isClientSide())
								entityinstance.discard();
						});
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
				DoctorNowhereMod.queueServerWork(6, () -> {
					if (world instanceof ServerLevel _serverLevel) {
						Entity entityinstance = EntityType.COW.create(_serverLevel, null, null, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED, false, false);
						if (entityinstance != null) {
							entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
							DoctorNowhereMod.queueServerWork(1, () -> {
								if (!entityinstance.level().isClientSide())
									entityinstance.discard();
							});
							_serverLevel.addFreshEntity(entityinstance);
						}
					}
					DoctorNowhereMod.queueServerWork(6, () -> {
						if (world instanceof ServerLevel _serverLevel) {
							Entity entityinstance = EntityType.COW.create(_serverLevel, null, null, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED, false, false);
							if (entityinstance != null) {
								entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
								DoctorNowhereMod.queueServerWork(1, () -> {
									if (!entityinstance.level().isClientSide())
										entityinstance.discard();
								});
								_serverLevel.addFreshEntity(entityinstance);
							}
						}
					});
				});
				{
					boolean _setval = true;
					entity.getCapability(DoctorNowhereModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.lags2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if ((entity.getCapability(DoctorNowhereModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DoctorNowhereModVariables.PlayerVariables())).lags3 == false) {
			if (Mth.nextInt(RandomSource.create(), 1, 648000) == 1) {
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = EntityType.VILLAGER.create(_serverLevel, null, null, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						entity.setInvulnerable(true);
						DoctorNowhereMod.queueServerWork(20, () -> {
							if (!entity.level().isClientSide())
								entity.discard();
						});
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
				{
					boolean _setval = true;
					entity.getCapability(DoctorNowhereModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.lags3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
