package com.splinter.blockbreakeffects.client;

import net.minecraftforge.common.MinecraftForge;

public class ClientProxy {
    public static void init() {
        MinecraftForge.EVENT_BUS.register(new ClientEvents());
    }
}
