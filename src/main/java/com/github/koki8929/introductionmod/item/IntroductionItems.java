package com.github.koki8929.introductionmod.item;

import com.github.koki8929.introductionmod.IntroductionMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class IntroductionItems {
    //レジストリを作成
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, IntroductionMod.MOD_ID);

    //レジストリにアイテムを追加
    public static final RegistryObject<Item> RAW_ORIHALCON = ITEMS.register("raw_orihalcon", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ORIHALCON_INGOT = ITEMS.register("orihalcon_ingot", () -> new Item(new Item.Properties()));


    public static  void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
