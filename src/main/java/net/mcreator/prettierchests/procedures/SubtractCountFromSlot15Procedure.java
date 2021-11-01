package net.mcreator.prettierchests.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.prettierchests.PrettierchestsMod;

import java.util.function.Supplier;
import java.util.Map;

public class SubtractCountFromSlot15Procedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PrettierchestsMod.LOGGER.warn("Failed to load dependency entity for procedure SubtractCountFromSlot15!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (2))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (3))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (4))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (5))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (6))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (7))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (8))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (9))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (10))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (11))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (12))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (13))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (14))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (16))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (17))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (18))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (19))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (20))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (21))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (22))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (23))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (24))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (25))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (26))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (27))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (28))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (29))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (30))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (31))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (32))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (33))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (34))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (35))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (36))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (37))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (38))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (39))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (40))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (41))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (42))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (43))).decrStackSize((int) ((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (15)))));
						_current.detectAndSendChanges();
					}
				}
			}
		}
	}
}
