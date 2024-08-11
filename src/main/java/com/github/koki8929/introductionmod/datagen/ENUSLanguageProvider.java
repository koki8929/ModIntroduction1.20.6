package com.github.koki8929.introductionmod.datagen;

import com.github.koki8929.introductionmod.IntroductionMod;
import com.github.koki8929.introductionmod.block.IntroductionBlocks;
import com.github.koki8929.introductionmod.item.IntroductionItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.Locale;

public class ENUSLanguageProvider extends LanguageProvider {
    public ENUSLanguageProvider(PackOutput output) {
        super(output, IntroductionMod.MOD_ID, Locale.US.toString().toLowerCase());
    }

    @Override
    protected void addTranslations() {
        addItem(IntroductionItems.RAW_ORIHALCON,  "Raw Orihalcon");
        addItem(IntroductionItems.ORIHALCON_INGOT,  "Orihalcon Ingot");

        add("creative.introduction_tab","introduction");

        addBlock(IntroductionBlocks.ORIHALCON_BLOCK, "Orihalcon Block");
        addBlock(IntroductionBlocks.RAW_ORIHALCON_BLOCK, "Raw Orihalcon Block");



    }
}
