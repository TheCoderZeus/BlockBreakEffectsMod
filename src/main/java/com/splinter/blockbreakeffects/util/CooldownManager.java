package com.splinter.blockbreakeffects.util;

import java.util.HashMap;
import java.util.UUID;

public class CooldownManager {

    private static final long COOLDOWN = 250;
    private static final HashMap<UUID, Long> cooldowns = new HashMap<>();

    public static boolean canTrigger(UUID playerId) {
        long now = System.currentTimeMillis();
        long last = cooldowns.getOrDefault(playerId, 0L);
        if (now - last >= COOLDOWN) {
            cooldowns.put(playerId, now);
            return true;
        }
        return false;
    }
}
