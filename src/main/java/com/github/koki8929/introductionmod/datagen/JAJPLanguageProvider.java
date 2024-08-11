package com.github.koki8929.introductionmod.datagen;

import com.github.koki8929.introductionmod.IntroductionMod;
import com.github.koki8929.introductionmod.block.IntroductionBlocks;
import com.github.koki8929.introductionmod.item.IntroductionItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.Locale;

public class JAJPLanguageProvider extends LanguageProvider {
    public JAJPLanguageProvider(PackOutput output) {
        super(output, IntroductionMod.MOD_ID, Locale.JAPAN.toString().toLowerCase());
    }

    @Override
    protected void addTranslations() {
        addItem(IntroductionItems.RAW_ORIHALCON,  "オリハルコンの原石");
        addItem(IntroductionItems.ORIHALCON_INGOT,  "オリハルコンインゴット");

        add("creative.introduction_tab","入門");

        addBlock(IntroductionBlocks.ORIHALCON_BLOCK, "オリハルコンブロック");
        addBlock(IntroductionBlocks.RAW_ORIHALCON_BLOCK, "オリハルコンの原石ブロック");



    }
}
