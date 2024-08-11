package com.github.koki8929.introductionmod.datagen;

import com.github.koki8929.introductionmod.IntroductionMod;
import com.github.koki8929.introductionmod.item.IntroductionItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class IntroductionItemModeIProvider extends ItemModelProvider {
    public IntroductionItemModeIProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, IntroductionMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(IntroductionItems.RAW_ORIHALCON.get());
        basicItem(IntroductionItems.ORIHALCON_INGOT.get());

    }
}
