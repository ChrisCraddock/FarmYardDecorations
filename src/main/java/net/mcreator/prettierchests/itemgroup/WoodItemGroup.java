
package net.mcreator.prettierchests.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.prettierchests.block.BananaWood1Block;
import net.mcreator.prettierchests.PrettierchestsModElements;

@PrettierchestsModElements.ModElement.Tag
public class WoodItemGroup extends PrettierchestsModElements.ModElement {
	public WoodItemGroup(PrettierchestsModElements instance) {
		super(instance, 64);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabwood") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BananaWood1Block.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
