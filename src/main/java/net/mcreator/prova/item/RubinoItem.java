
package net.mcreator.prova.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.prova.itemgroup.EternamodItemGroup;
import net.mcreator.prova.ProvaModElements;

@ProvaModElements.ModElement.Tag
public class RubinoItem extends ProvaModElements.ModElement {
	@ObjectHolder("prova:rubino")
	public static final Item block = null;
	public RubinoItem(ProvaModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(EternamodItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("rubino");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
