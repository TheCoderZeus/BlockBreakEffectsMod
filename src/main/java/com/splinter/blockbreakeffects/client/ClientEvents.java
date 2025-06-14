package com.splinter.blockbreakeffects.client;

import com.splinter.blockbreakeffects.util.CooldownManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.KeyMapping;
import net.minecraft.world.InteractionHand;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ClientEvents {

    @SubscribeEvent
    public void onKeyPress(InputEvent.Key event) {
        Minecraft mc = Minecraft.getInstance();

        if (mc.player == null || mc.level == null || mc.screen != null)
            return;

        KeyMapping attackKey = mc.options.keyAttack;

        if (attackKey.isDown()) {
            LocalPlayer player = mc.player;

            if (CooldownManager.canTrigger(player.getUUID())) {
                player.swing(InteractionHand.MAIN_HAND, true);
            }
        }
    }
}
