package org.cloudburstmc.server.item;

import org.cloudburstmc.server.utils.Identifier;

/**
 * author: MagicDroidX
 * Nukkit Project
 */
public class ItemBootsLeather extends ItemColorArmor {

    public ItemBootsLeather(Identifier id) {
        super(id);
    }

    @Override
    public int getTier() {
        return TIER_LEATHER;
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
        return 66;
    }
}
