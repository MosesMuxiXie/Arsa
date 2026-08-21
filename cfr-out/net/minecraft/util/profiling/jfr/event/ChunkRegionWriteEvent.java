/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util.profiling.jfr.event;

import jdk.jfr.EventType;
import jdk.jfr.Label;
import jdk.jfr.Name;
import net.minecraft.obfuscate.DontObfuscate;

@Name(value="minecraft.ChunkRegionWrite")
@Label(value="Region File Write")
@DontObfuscate
public class ChunkRegionWriteEvent
extends bzz {
    public static final String EVENT_NAME = "minecraft.ChunkRegionWrite";
    public static final EventType TYPE = EventType.getEventType(ChunkRegionWriteEvent.class);

    public ChunkRegionWriteEvent(esa $$0, dvu $$1, erz $$2, int $$3) {
        super($$0, $$1, $$2, $$3);
    }
}

