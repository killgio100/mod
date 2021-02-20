
package net.mcreator.prova.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import net.mcreator.prova.ProvaModElements;

@ProvaModElements.ModElement.Tag
public class ThisisbohPainting extends ProvaModElements.ModElement {
	public ThisisbohPainting(ProvaModElements instance) {
		super(instance, 64);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(64, 64).setRegistryName("thisisboh"));
	}
}
