package com.github.koki8929.introductionmod.datagen;

import com.github.koki8929.introductionmod.IntroductionMod;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = IntroductionMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class IntroductionDataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        // アイテム用のモデルファイルの生成
        generator.addProvider(event.includeClient(), new IntroductionItemModeIProvider(packOutput
                , existingFileHelper));
        // ブロック用のモデルファイルの生成
        generator.addProvider(event.includeClient(),
                new IntroductionBlockStateProvider(packOutput, existingFileHelper));
        // 言語ファイル（英語）
        generator.addProvider(event.includeClient(), new ENUSLanguageProvider(packOutput));
        // 言語ファイル（日本語）
        generator.addProvider(event.includeClient(), new JAJPLanguageProvider(packOutput));

        // レシピ
        generator.addProvider(event.includeServer(), new IntroductionRecipeProvider(packOutput));
    }
}