
package net.mcreator.prettierchests.gui;

import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.network.IContainerFactory;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.gui.ScreenManager;

import net.mcreator.prettierchests.procedures.WoodLogicProcedure;
import net.mcreator.prettierchests.procedures.TorchLogicProcedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot9Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot8Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot7Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot6Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot5Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot4Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot43Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot42Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot41Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot40Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot3Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot39Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot38Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot37Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot36Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot35Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot34Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot33Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot32Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot31Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot30Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot2Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot29Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot28Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot27Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot26Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot25Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot24Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot23Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot22Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot21Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot20Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot1Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot19Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot18Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot17Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot16Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot15Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot14Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot13Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot12Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot11Procedure;
import net.mcreator.prettierchests.procedures.SubtractCountFromSlot10Procedure;
import net.mcreator.prettierchests.procedures.Slot0ClearAllItemsProcedure;
import net.mcreator.prettierchests.procedures.DecorationLogicProcedure;
import net.mcreator.prettierchests.procedures.BarnDoorLogicProcedure;
import net.mcreator.prettierchests.PrettierchestsModElements;
import net.mcreator.prettierchests.PrettierchestsMod;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

@PrettierchestsModElements.ModElement.Tag
public class CraftingTableGUIGui extends PrettierchestsModElements.ModElement {
	public static HashMap guistate = new HashMap();
	private static ContainerType<GuiContainerMod> containerType = null;
	public CraftingTableGUIGui(PrettierchestsModElements instance) {
		super(instance, 121);
		elements.addNetworkMessage(ButtonPressedMessage.class, ButtonPressedMessage::buffer, ButtonPressedMessage::new,
				ButtonPressedMessage::handler);
		elements.addNetworkMessage(GUISlotChangedMessage.class, GUISlotChangedMessage::buffer, GUISlotChangedMessage::new,
				GUISlotChangedMessage::handler);
		containerType = new ContainerType<>(new GuiContainerModFactory());
		FMLJavaModLoadingContext.get().getModEventBus().register(new ContainerRegisterHandler());
	}
	private static class ContainerRegisterHandler {
		@SubscribeEvent
		public void registerContainer(RegistryEvent.Register<ContainerType<?>> event) {
			event.getRegistry().register(containerType.setRegistryName("crafting_table_gui"));
		}
	}
	@OnlyIn(Dist.CLIENT)
	public void initElements() {
		DeferredWorkQueue.runLater(() -> ScreenManager.registerFactory(containerType, CraftingTableGUIGuiWindow::new));
	}
	public static class GuiContainerModFactory implements IContainerFactory {
		public GuiContainerMod create(int id, PlayerInventory inv, PacketBuffer extraData) {
			return new GuiContainerMod(id, inv, extraData);
		}
	}

	public static class GuiContainerMod extends Container implements Supplier<Map<Integer, Slot>> {
		World world;
		PlayerEntity entity;
		int x, y, z;
		private IItemHandler internal;
		private Map<Integer, Slot> customSlots = new HashMap<>();
		private boolean bound = false;
		public GuiContainerMod(int id, PlayerInventory inv, PacketBuffer extraData) {
			super(containerType, id);
			this.entity = inv.player;
			this.world = inv.player.world;
			this.internal = new ItemStackHandler(44);
			BlockPos pos = null;
			if (extraData != null) {
				pos = extraData.readBlockPos();
				this.x = pos.getX();
				this.y = pos.getY();
				this.z = pos.getZ();
			}
			if (pos != null) {
				if (extraData.readableBytes() == 1) { // bound to item
					byte hand = extraData.readByte();
					ItemStack itemstack;
					if (hand == 0)
						itemstack = this.entity.getHeldItemMainhand();
					else
						itemstack = this.entity.getHeldItemOffhand();
					itemstack.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
				} else if (extraData.readableBytes() > 1) {
					extraData.readByte(); // drop padding
					Entity entity = world.getEntityByID(extraData.readVarInt());
					if (entity != null)
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							this.internal = capability;
							this.bound = true;
						});
				} else { // might be bound to block
					TileEntity ent = inv.player != null ? inv.player.world.getTileEntity(pos) : null;
					if (ent != null) {
						ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							this.internal = capability;
							this.bound = true;
						});
					}
				}
			}
			this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 11, 59) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(0, 1, 0);
					return retval;
				}
			}));
			this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 11, 86) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(1, 1, 0);
					return retval;
				}
			}));
			this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 47, 5) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(2, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 47, 23) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(3, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 47, 41) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(4, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 47, 59) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(5, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 47, 77) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(6, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 47, 95) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(7, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 47, 113) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(8, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 65, 5) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(9, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 65, 23) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(10, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 65, 41) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(11, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 65, 59) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(12, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 65, 77) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(13, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 65, 95) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(14, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, 65, 113) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(15, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 83, 5) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(16, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(17, this.addSlot(new SlotItemHandler(internal, 17, 83, 23) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(17, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(18, this.addSlot(new SlotItemHandler(internal, 18, 83, 41) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(18, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(19, this.addSlot(new SlotItemHandler(internal, 19, 83, 59) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(19, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(20, this.addSlot(new SlotItemHandler(internal, 20, 83, 77) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(20, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(21, this.addSlot(new SlotItemHandler(internal, 21, 83, 95) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(21, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(22, this.addSlot(new SlotItemHandler(internal, 22, 83, 113) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(22, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(23, this.addSlot(new SlotItemHandler(internal, 23, 101, 5) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(23, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(24, this.addSlot(new SlotItemHandler(internal, 24, 101, 23) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(24, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(25, this.addSlot(new SlotItemHandler(internal, 25, 101, 41) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(25, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(26, this.addSlot(new SlotItemHandler(internal, 26, 101, 59) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(26, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(27, this.addSlot(new SlotItemHandler(internal, 27, 101, 77) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(27, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(28, this.addSlot(new SlotItemHandler(internal, 28, 101, 95) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(28, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(29, this.addSlot(new SlotItemHandler(internal, 29, 101, 113) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(29, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(30, this.addSlot(new SlotItemHandler(internal, 30, 119, 5) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(30, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(31, this.addSlot(new SlotItemHandler(internal, 31, 119, 23) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(31, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(32, this.addSlot(new SlotItemHandler(internal, 32, 119, 41) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(32, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(33, this.addSlot(new SlotItemHandler(internal, 33, 119, 59) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(33, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(34, this.addSlot(new SlotItemHandler(internal, 34, 119, 77) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(34, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(35, this.addSlot(new SlotItemHandler(internal, 35, 119, 95) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(35, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(36, this.addSlot(new SlotItemHandler(internal, 36, 119, 113) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(36, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(37, this.addSlot(new SlotItemHandler(internal, 37, 137, 5) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(37, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(38, this.addSlot(new SlotItemHandler(internal, 38, 137, 23) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(38, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(39, this.addSlot(new SlotItemHandler(internal, 39, 137, 41) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(39, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(40, this.addSlot(new SlotItemHandler(internal, 40, 137, 59) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(40, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(41, this.addSlot(new SlotItemHandler(internal, 41, 137, 77) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(41, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(42, this.addSlot(new SlotItemHandler(internal, 42, 137, 95) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(42, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			this.customSlots.put(43, this.addSlot(new SlotItemHandler(internal, 43, 137, 113) {
				@Override
				public ItemStack onTake(PlayerEntity entity, ItemStack stack) {
					ItemStack retval = super.onTake(entity, stack);
					GuiContainerMod.this.slotChanged(43, 1, 0);
					return retval;
				}

				@Override
				public boolean isItemValid(ItemStack stack) {
					return false;
				}
			}));
			int si;
			int sj;
			for (si = 0; si < 3; ++si)
				for (sj = 0; sj < 9; ++sj)
					this.addSlot(new Slot(inv, sj + (si + 1) * 9, 4 + 8 + sj * 18, 56 + 84 + si * 18));
			for (si = 0; si < 9; ++si)
				this.addSlot(new Slot(inv, si, 4 + 8 + si * 18, 56 + 142));
		}

		public Map<Integer, Slot> get() {
			return customSlots;
		}

		@Override
		public boolean canInteractWith(PlayerEntity player) {
			return true;
		}

		@Override
		public ItemStack transferStackInSlot(PlayerEntity playerIn, int index) {
			ItemStack itemstack = ItemStack.EMPTY;
			Slot slot = (Slot) this.inventorySlots.get(index);
			if (slot != null && slot.getHasStack()) {
				ItemStack itemstack1 = slot.getStack();
				itemstack = itemstack1.copy();
				if (index < 44) {
					if (!this.mergeItemStack(itemstack1, 44, this.inventorySlots.size(), true)) {
						return ItemStack.EMPTY;
					}
					slot.onSlotChange(itemstack1, itemstack);
				} else if (!this.mergeItemStack(itemstack1, 0, 44, false)) {
					if (index < 44 + 27) {
						if (!this.mergeItemStack(itemstack1, 44 + 27, this.inventorySlots.size(), true)) {
							return ItemStack.EMPTY;
						}
					} else {
						if (!this.mergeItemStack(itemstack1, 44, 44 + 27, false)) {
							return ItemStack.EMPTY;
						}
					}
					return ItemStack.EMPTY;
				}
				if (itemstack1.getCount() == 0) {
					slot.putStack(ItemStack.EMPTY);
				} else {
					slot.onSlotChanged();
				}
				if (itemstack1.getCount() == itemstack.getCount()) {
					return ItemStack.EMPTY;
				}
				slot.onTake(playerIn, itemstack1);
			}
			return itemstack;
		}

		@Override /**
					 * Merges provided ItemStack with the first avaliable one in the
					 * container/player inventor between minIndex (included) and maxIndex
					 * (excluded). Args : stack, minIndex, maxIndex, negativDirection. /!\ the
					 * Container implementation do not check if the item is valid for the slot
					 */
		protected boolean mergeItemStack(ItemStack stack, int startIndex, int endIndex, boolean reverseDirection) {
			boolean flag = false;
			int i = startIndex;
			if (reverseDirection) {
				i = endIndex - 1;
			}
			if (stack.isStackable()) {
				while (!stack.isEmpty()) {
					if (reverseDirection) {
						if (i < startIndex) {
							break;
						}
					} else if (i >= endIndex) {
						break;
					}
					Slot slot = this.inventorySlots.get(i);
					ItemStack itemstack = slot.getStack();
					if (slot.isItemValid(itemstack) && !itemstack.isEmpty() && areItemsAndTagsEqual(stack, itemstack)) {
						int j = itemstack.getCount() + stack.getCount();
						int maxSize = Math.min(slot.getSlotStackLimit(), stack.getMaxStackSize());
						if (j <= maxSize) {
							stack.setCount(0);
							itemstack.setCount(j);
							slot.putStack(itemstack);
							flag = true;
						} else if (itemstack.getCount() < maxSize) {
							stack.shrink(maxSize - itemstack.getCount());
							itemstack.setCount(maxSize);
							slot.putStack(itemstack);
							flag = true;
						}
					}
					if (reverseDirection) {
						--i;
					} else {
						++i;
					}
				}
			}
			if (!stack.isEmpty()) {
				if (reverseDirection) {
					i = endIndex - 1;
				} else {
					i = startIndex;
				}
				while (true) {
					if (reverseDirection) {
						if (i < startIndex) {
							break;
						}
					} else if (i >= endIndex) {
						break;
					}
					Slot slot1 = this.inventorySlots.get(i);
					ItemStack itemstack1 = slot1.getStack();
					if (itemstack1.isEmpty() && slot1.isItemValid(stack)) {
						if (stack.getCount() > slot1.getSlotStackLimit()) {
							slot1.putStack(stack.split(slot1.getSlotStackLimit()));
						} else {
							slot1.putStack(stack.split(stack.getCount()));
						}
						slot1.onSlotChanged();
						flag = true;
						break;
					}
					if (reverseDirection) {
						--i;
					} else {
						++i;
					}
				}
			}
			return flag;
		}

		@Override
		public void onContainerClosed(PlayerEntity playerIn) {
			super.onContainerClosed(playerIn);
			if (!bound && (playerIn instanceof ServerPlayerEntity)) {
				if (!playerIn.isAlive() || playerIn instanceof ServerPlayerEntity && ((ServerPlayerEntity) playerIn).hasDisconnected()) {
					for (int j = 0; j < internal.getSlots(); ++j) {
						playerIn.dropItem(internal.extractItem(j, internal.getStackInSlot(j).getCount(), false), false);
					}
				} else {
					for (int i = 0; i < internal.getSlots(); ++i) {
						playerIn.inventory.placeItemBackInInventory(playerIn.world,
								internal.extractItem(i, internal.getStackInSlot(i).getCount(), false));
					}
				}
			}
		}

		private void slotChanged(int slotid, int ctype, int meta) {
			if (this.world != null && this.world.isRemote()) {
				PrettierchestsMod.PACKET_HANDLER.sendToServer(new GUISlotChangedMessage(slotid, x, y, z, ctype, meta));
				handleSlotAction(entity, slotid, ctype, meta, x, y, z);
			}
		}
	}

	public static class ButtonPressedMessage {
		int buttonID, x, y, z;
		public ButtonPressedMessage(PacketBuffer buffer) {
			this.buttonID = buffer.readInt();
			this.x = buffer.readInt();
			this.y = buffer.readInt();
			this.z = buffer.readInt();
		}

		public ButtonPressedMessage(int buttonID, int x, int y, int z) {
			this.buttonID = buttonID;
			this.x = x;
			this.y = y;
			this.z = z;
		}

		public static void buffer(ButtonPressedMessage message, PacketBuffer buffer) {
			buffer.writeInt(message.buttonID);
			buffer.writeInt(message.x);
			buffer.writeInt(message.y);
			buffer.writeInt(message.z);
		}

		public static void handler(ButtonPressedMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				PlayerEntity entity = context.getSender();
				int buttonID = message.buttonID;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleButtonAction(entity, buttonID, x, y, z);
			});
			context.setPacketHandled(true);
		}
	}

	public static class GUISlotChangedMessage {
		int slotID, x, y, z, changeType, meta;
		public GUISlotChangedMessage(int slotID, int x, int y, int z, int changeType, int meta) {
			this.slotID = slotID;
			this.x = x;
			this.y = y;
			this.z = z;
			this.changeType = changeType;
			this.meta = meta;
		}

		public GUISlotChangedMessage(PacketBuffer buffer) {
			this.slotID = buffer.readInt();
			this.x = buffer.readInt();
			this.y = buffer.readInt();
			this.z = buffer.readInt();
			this.changeType = buffer.readInt();
			this.meta = buffer.readInt();
		}

		public static void buffer(GUISlotChangedMessage message, PacketBuffer buffer) {
			buffer.writeInt(message.slotID);
			buffer.writeInt(message.x);
			buffer.writeInt(message.y);
			buffer.writeInt(message.z);
			buffer.writeInt(message.changeType);
			buffer.writeInt(message.meta);
		}

		public static void handler(GUISlotChangedMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				PlayerEntity entity = context.getSender();
				int slotID = message.slotID;
				int changeType = message.changeType;
				int meta = message.meta;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleSlotAction(entity, slotID, changeType, meta, x, y, z);
			});
			context.setPacketHandled(true);
		}
	}
	static void handleButtonAction(PlayerEntity entity, int buttonID, int x, int y, int z) {
		World world = entity.world;
		// security measure to prevent arbitrary chunk generation
		if (!world.isBlockLoaded(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				BarnDoorLogicProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				TorchLogicProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 2) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				WoodLogicProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 3) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				DecorationLogicProcedure.executeProcedure($_dependencies);
			}
		}
	}

	private static void handleSlotAction(PlayerEntity entity, int slotID, int changeType, int meta, int x, int y, int z) {
		World world = entity.world;
		// security measure to prevent arbitrary chunk generation
		if (!world.isBlockLoaded(new BlockPos(x, y, z)))
			return;
		if (slotID == 0 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				Slot0ClearAllItemsProcedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 1 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot1Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 2 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot2Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 3 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot3Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 4 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot4Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 5 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot5Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 6 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot6Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 7 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot7Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 8 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot8Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 9 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot9Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 10 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot10Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 11 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot11Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 12 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot12Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 13 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot13Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 14 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot14Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 15 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot15Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 16 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot16Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 17 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot17Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 18 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot18Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 19 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot19Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 20 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot20Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 21 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot21Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 22 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot22Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 23 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot23Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 24 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot24Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 25 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot25Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 26 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot26Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 27 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot27Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 28 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot28Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 29 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot29Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 30 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot30Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 31 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot31Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 32 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot32Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 33 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot33Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 34 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot34Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 35 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot35Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 36 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot36Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 37 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot37Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 38 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot38Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 39 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot39Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 40 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot40Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 41 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot41Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 42 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot42Procedure.executeProcedure($_dependencies);
			}
		}
		if (slotID == 43 && changeType == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SubtractCountFromSlot43Procedure.executeProcedure($_dependencies);
			}
		}
	}
}
