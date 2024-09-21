package com.ishakirabotaem.doctornowhere.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import java.util.function.Supplier;

import com.ishakirabotaem.doctornowhere.DoctorNowhereMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DoctorNowhereModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		DoctorNowhereMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.pig_event = original.pig_event;
			clone.boiled_one_spawn = original.boiled_one_spawn;
			clone.armorstand_rain_event = original.armorstand_rain_event;
			clone.armorstand_event = original.armorstand_event;
			clone.dripstone_event = original.dripstone_event;
			clone.distant_yell_event = original.distant_yell_event;
			clone.boiled_one_talk_1 = original.boiled_one_talk_1;
			clone.boiled_one_talk_2 = original.boiled_one_talk_2;
			clone.midnght_event = original.midnght_event;
			clone.lags1 = original.lags1;
			clone.lags2 = original.lags2;
			clone.lags3 = original.lags3;
			if (!event.isWasDeath()) {
			}
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("doctor_nowhere", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public boolean pig_event = false;
		public boolean boiled_one_spawn = false;
		public boolean armorstand_rain_event = false;
		public boolean armorstand_event = false;
		public boolean dripstone_event = false;
		public boolean distant_yell_event = false;
		public boolean boiled_one_talk_1 = false;
		public boolean boiled_one_talk_2 = false;
		public boolean midnght_event = false;
		public boolean lags1 = false;
		public boolean lags2 = false;
		public boolean lags3 = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				DoctorNowhereMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("pig_event", pig_event);
			nbt.putBoolean("boiled_one_spawn", boiled_one_spawn);
			nbt.putBoolean("armorstand_rain_event", armorstand_rain_event);
			nbt.putBoolean("armorstand_event", armorstand_event);
			nbt.putBoolean("dripstone_event", dripstone_event);
			nbt.putBoolean("distant_yell_event", distant_yell_event);
			nbt.putBoolean("boiled_one_talk_1", boiled_one_talk_1);
			nbt.putBoolean("boiled_one_talk_2", boiled_one_talk_2);
			nbt.putBoolean("midnght_event", midnght_event);
			nbt.putBoolean("lags1", lags1);
			nbt.putBoolean("lags2", lags2);
			nbt.putBoolean("lags3", lags3);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			pig_event = nbt.getBoolean("pig_event");
			boiled_one_spawn = nbt.getBoolean("boiled_one_spawn");
			armorstand_rain_event = nbt.getBoolean("armorstand_rain_event");
			armorstand_event = nbt.getBoolean("armorstand_event");
			dripstone_event = nbt.getBoolean("dripstone_event");
			distant_yell_event = nbt.getBoolean("distant_yell_event");
			boiled_one_talk_1 = nbt.getBoolean("boiled_one_talk_1");
			boiled_one_talk_2 = nbt.getBoolean("boiled_one_talk_2");
			midnght_event = nbt.getBoolean("midnght_event");
			lags1 = nbt.getBoolean("lags1");
			lags2 = nbt.getBoolean("lags2");
			lags3 = nbt.getBoolean("lags3");
		}
	}

	public static class PlayerVariablesSyncMessage {
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.pig_event = message.data.pig_event;
					variables.boiled_one_spawn = message.data.boiled_one_spawn;
					variables.armorstand_rain_event = message.data.armorstand_rain_event;
					variables.armorstand_event = message.data.armorstand_event;
					variables.dripstone_event = message.data.dripstone_event;
					variables.distant_yell_event = message.data.distant_yell_event;
					variables.boiled_one_talk_1 = message.data.boiled_one_talk_1;
					variables.boiled_one_talk_2 = message.data.boiled_one_talk_2;
					variables.midnght_event = message.data.midnght_event;
					variables.lags1 = message.data.lags1;
					variables.lags2 = message.data.lags2;
					variables.lags3 = message.data.lags3;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
