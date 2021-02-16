
package net.mcreator.prova.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

import net.mcreator.prova.ProvaModElements;

@ProvaModElements.ModElement.Tag
public class EternamodItemGroup extends ProvaModElements.ModElement {
	public EternamodItemGroup(ProvaModElements instance) {
		super(instance, 41);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabeternamod") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.FIRE, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
