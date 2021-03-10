package org.cloudburstmc.server.item.behavior;

import org.cloudburstmc.api.item.ItemStack;
import org.cloudburstmc.math.vector.Vector3f;
import org.cloudburstmc.server.player.CloudPlayer;

/**
 * Created by Leonidius20 on 20.08.18.
 */
public class ItemChorusFruitBehavior extends ItemEdibleBehavior {

    @Override
    public boolean onClickAir(ItemStack item, Vector3f directionVector, CloudPlayer player) {
        return player.getServer().getTick() - player.getLastChorusFruitTeleport() >= 20;
    }

    @Override
    public ItemStack onUse(ItemStack item, int ticksUsed, CloudPlayer player) {
        ItemStack successful = super.onUse(item, ticksUsed, player);
        if (successful != null) {
            player.onChorusFruitTeleport();
        }
        return successful;
    }
}