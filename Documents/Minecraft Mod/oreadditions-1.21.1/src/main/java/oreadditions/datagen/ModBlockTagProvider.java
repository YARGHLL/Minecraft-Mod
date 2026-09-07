package oreadditions.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import oreadditions.OreAdditions;
import oreadditions.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {

    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, OreAdditions.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
      tag(BlockTags.MINEABLE_WITH_PICKAXE)
              .add(ModBlocks.SILVER_ORE.get())
              .add(ModBlocks.TIN_ORE.get());

      tag(BlockTags.NEEDS_STONE_TOOL)
              .add(ModBlocks.TIN_ORE.get());

      tag(BlockTags.NEEDS_IRON_TOOL)
              .add(ModBlocks.SILVER_ORE.get());
    }
}
