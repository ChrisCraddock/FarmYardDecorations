
package net.mcreator.prettierchests.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.prettierchests.block.BrownWoodHoneyBlock;
import net.mcreator.prettierchests.PrettierchestsModElements;

@PrettierchestsModElements.ModElement.Tag
public class SpecialDesignsItemGroup extends PrettierchestsModElements.ModElement {
	public SpecialDesignsItemGroup(PrettierchestsModElements instance) {
		super(instance, 67);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabspecial_designs") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BrownWoodHoneyBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
