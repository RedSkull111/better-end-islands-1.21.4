package net.maninthebag.better_end_islands;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.maninthebag.better_end_islands.datagen.*;
import net.minecraft.registry.RegistryWrapper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class BetterEndIslandsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModItemTagProvider::new);

		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModModelProvider::new);

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
	}

	private static class BlockItemTagProvider extends FabricTagProvider.ItemTagProvider {

		public BlockItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture, @Nullable BlockTagProvider blockTagProvider) {
			super(output, completableFuture, blockTagProvider);
		}

		@Override
		protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

		}
	}
}
