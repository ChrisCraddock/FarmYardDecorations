
package net.mcreator.prettierchests.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.prettierchests.block.RedBarnDoorTopLeftBlock;
import net.mcreator.prettierchests.PrettierchestsModElements;

@PrettierchestsModElements.ModElement.Tag
public class BarnDoorItemGroup extends PrettierchestsModElements.ModElement {
	public BarnDoorItemGroup(PrettierchestsModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabbarn_door") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RedBarnDoorTopLeftBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
