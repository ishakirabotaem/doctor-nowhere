
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.ishakirabotaem.doctornowhere.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import com.ishakirabotaem.doctornowhere.DoctorNowhereMod;

public class DoctorNowhereModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, DoctorNowhereMod.MODID);
	public static final RegistryObject<SoundEvent> ENTITY_THE_LOCUST_AMBIENT = REGISTRY.register("entity.the_locust.ambient", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("doctor_nowhere", "entity.the_locust.ambient")));
	public static final RegistryObject<SoundEvent> ENTITY_GUILT_TALK = REGISTRY.register("entity.guilt.talk", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("doctor_nowhere", "entity.guilt.talk")));
	public static final RegistryObject<SoundEvent> AMBIENT_CHARACTER_BREATHING = REGISTRY.register("ambient.character.breathing", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("doctor_nowhere", "ambient.character.breathing")));
	public static final RegistryObject<SoundEvent> ENTITY_BOILED_ONE_TALK1 = REGISTRY.register("entity.boiled_one.talk1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("doctor_nowhere", "entity.boiled_one.talk1")));
	public static final RegistryObject<SoundEvent> ENTITY_BOILED_ONE_TALK = REGISTRY.register("entity.boiled_one.talk", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("doctor_nowhere", "entity.boiled_one.talk")));
}
