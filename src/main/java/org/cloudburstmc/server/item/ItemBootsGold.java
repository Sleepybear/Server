package org.cloudburstmc.server.item;

import org.cloudburstmc.server.utils.Identifier;

/**
 * author: MagicDroidX
 * Nukkit Project
 */
public class ItemBootsGold extends ItemArmor {

    public ItemBootsGold(Identifier id) {
        super(id);
    }

    @Override
    public int getTier() {
        return TIER_GOLD;
    }

    @Override
    public boolean isBoots() {
        return true;
    }

    @Override
    public int getArmorPoints() {
        return 1;
    }

    @Override
    public int getMaxDurability() {
        return 92;
    }
}
