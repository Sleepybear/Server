package org.cloudburstmc.server.level.particle;

import com.nukkitx.math.vector.Vector3f;
import com.nukkitx.protocol.bedrock.data.LevelEventType;
import org.cloudburstmc.server.item.Item;
import org.cloudburstmc.server.registry.ItemRegistry;

/**
 * Created on 2015/11/21 by xtypr.
 * Package cn.nukkit.level.particle in project Nukkit .
 */
public class ItemBreakParticle extends GenericParticle {
    public ItemBreakParticle(Vector3f pos, Item item) {
        super(pos, LevelEventType.PARTICLE_ITEM_BREAK, (ItemRegistry.get().getRuntimeId(item.getId()) << 16) | item.getMeta());
    }
}
