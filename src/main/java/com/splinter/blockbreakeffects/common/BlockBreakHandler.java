package com.splinter.blockbreakeffects.common;

import com.splinter.blockbreakeffects.client.ParticleHandler;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class BlockBreakHandler {

    @SubscribeEvent
    public void onBlockBreak(BlockEvent.BreakEvent event) {
        Level level = (Level) event.getLevel();
        if (level.isClientSide) return;

        BlockPos pos = event.getPos();
        Player player = event.getPlayer();
        ServerLevel serverLevel = (ServerLevel) level;

        level.playSound(null, pos, SoundEvents.AMETHYST_BLOCK_BREAK, SoundSource.PLAYERS, 1.0f, 1.2f);
        ParticleHandler.spawnFancyParticles(serverLevel, pos);
    }
}
