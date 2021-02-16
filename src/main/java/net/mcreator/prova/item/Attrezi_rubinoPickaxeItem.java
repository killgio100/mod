
package net.mcreator.prova.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.prova.itemgroup.EternamodItemGroup;
import net.mcreator.prova.ProvaModElements;

@ProvaModElements.ModElement.Tag
public class Attrezi_rubinoPickaxeItem extends ProvaModElements.ModElement {
	@ObjectHolder("prova:rubino_pickaxe")
	public static final Item block = null;
	public Attrezi_rubinoPickaxeItem(ProvaModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 42;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RubinoItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(EternamodItemGroup.tab)) {
		}.setRegistryName("rubino_pickaxe"));
	}
}
