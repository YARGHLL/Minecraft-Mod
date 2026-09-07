package oreadditions.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import oreadditions.OreAdditions;
import oreadditions.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider{
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, OreAdditions.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
      basicItem(ModItems.SILVER.get());
      basicItem(ModItems.RAW_SILVER.get());
      basicItem(ModItems.TIN.get());
      basicItem(ModItems.RAW_TIN.get());
      basicItem(ModItems.BRONZE.get());
    }
}
