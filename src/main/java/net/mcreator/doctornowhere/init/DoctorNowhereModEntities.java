
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doctornowhere.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.doctornowhere.entity.TheLocustEntity;
import net.mcreator.doctornowhere.entity.GuiltEntity;
import net.mcreator.doctornowhere.entity.BoiledOneEntity;
import net.mcreator.doctornowhere.DoctorNowhereMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DoctorNowhereModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DoctorNowhereMod.MODID);
	public static final RegistryObject<EntityType<GuiltEntity>> GUILT = register("guilt",
			EntityType.Builder.<GuiltEntity>of(GuiltEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GuiltEntity::new).fireImmune().sized(1f, 7f));
	public static final RegistryObject<EntityType<TheLocustEntity>> THE_LOCUST = register("the_locust", EntityType.Builder.<TheLocustEntity>of(TheLocustEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(TheLocustEntity::new).fireImmune().sized(0.45f, 2.5f));
	public static final RegistryObject<EntityType<BoiledOneEntity>> BOILED_ONE = register("boiled_one",
			EntityType.Builder.<BoiledOneEntity>of(BoiledOneEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BoiledOneEntity::new).fireImmune().sized(1.5f, 5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			GuiltEntity.init();
			TheLocustEntity.init();
			BoiledOneEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GUILT.get(), GuiltEntity.createAttributes().build());
		event.put(THE_LOCUST.get(), TheLocustEntity.createAttributes().build());
		event.put(BOILED_ONE.get(), BoiledOneEntity.createAttributes().build());
	}
}
