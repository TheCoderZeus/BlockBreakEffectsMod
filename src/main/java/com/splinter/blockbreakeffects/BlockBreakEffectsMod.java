package com.splinter.blockbreakeffects;

import com.splinter.blockbreakeffects.client.ClientProxy;
import com.splinter.blockbreakeffects.common.BlockBreakHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("blockbreakeffects")
public class BlockBreakEffectsMod {

    public BlockBreakEffectsMod() {
        MinecraftForge.EVENT_BUS.register(new BlockBreakHandler());
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onClientSetup);
    }

    private void onClientSetup(final FMLClientSetupEvent event) {
        ClientProxy.init();
    }
}
