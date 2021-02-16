
package net.mcreator.prova.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.prova.ProvaModElements;

@ProvaModElements.ModElement.Tag
public class TopazioAxeItem extends ProvaModElements.ModElement {
	@ObjectHolder("prova:topazio_axe")
	public static final Item block = null;
	public TopazioAxeItem(ProvaModElements instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1444;
			}

			public float getEfficiency() {
				return 13f;
			}

			public float getAttackDamage() {
				return 30f;
			}

			public int getHarvestLevel() {
				return 7;
			}

			public int getEnchantability() {
				return 49;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TopazioItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("topazio_axe"));
	}
}
