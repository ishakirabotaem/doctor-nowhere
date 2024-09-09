
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doctornowhere.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.doctornowhere.DoctorNowhereMod;

public class DoctorNowhereModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, DoctorNowhereMod.MODID);
	public static final RegistryObject<SoundEvent> ENTITY_THE_LOCUST_AMBIENT = REGISTRY.register("entity.the_locust.ambient", () -> new SoundEvent(new ResourceLocation("doctor_nowhere", "entity.the_locust.ambient")));
	public static final RegistryObject<SoundEvent> ENTITY_BOILED_ONE_TALK = REGISTRY.register("entity.boiled_one.talk", () -> new SoundEvent(new ResourceLocation("doctor_nowhere", "entity.boiled_one.talk")));
	public static final RegistryObject<SoundEvent> ENTITY_GUILT_TALK = REGISTRY.register("entity.guilt.talk", () -> new SoundEvent(new ResourceLocation("doctor_nowhere", "entity.guilt.talk")));
}
