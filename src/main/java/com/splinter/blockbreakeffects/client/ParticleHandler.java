package com.splinter.blockbreakeffects.client;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;

public class ParticleHandler {

    public static void spawnFancyParticles(ServerLevel level, BlockPos pos) {
        for (int i = 0; i < 16; i++) {
            double angle = Math.toRadians((360.0 / 16) * i);
            double radius = 0.5;
            double dx = radius * Math.cos(angle);
            double dz = radius * Math.sin(angle);

            level.sendParticles(
                    ParticleTypes.END_ROD,
                    pos.getX() + 0.5 + dx,
                    pos.getY() + 0.3,
                    pos.getZ() + 0.5 + dz,
                    1, 0, 0.1, 0, 0
            );
        }

        level.sendParticles(
                ParticleTypes.EXPLOSION,
                pos.getX() + 0.5,
                pos.getY() + 0.5,
                pos.getZ() + 0.5,
                1, 0, 0, 0, 0
        );
    }
}
