package com.github.Kef0O.moreingots;

import init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MoreIngots.MODID)
public class MoreIngots {
    public static final String MODID = "moreingots";

    public MoreIngots() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);


    }
}
