
package net.mcreator.prettierchests.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.prettierchests.block.Wood0Block;
import net.mcreator.prettierchests.PrettierchestsModElements;

@PrettierchestsModElements.ModElement.Tag
public class VerticalWoodItemGroup extends PrettierchestsModElements.ModElement {
	public VerticalWoodItemGroup(PrettierchestsModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabvertical_wood") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Wood0Block.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
