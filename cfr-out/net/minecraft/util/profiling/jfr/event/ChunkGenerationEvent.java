/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util.profiling.jfr.event;

import jdk.jfr.Category;
import jdk.jfr.Enabled;
import jdk.jfr.Event;
import jdk.jfr.EventType;
import jdk.jfr.Label;
import jdk.jfr.Name;
import jdk.jfr.StackTrace;
import net.minecraft.obfuscate.DontObfuscate;

@Name(value="minecraft.ChunkGeneration")
@Label(value="Chunk Generation")
@Category(value={"Minecraft", "World Generation"})
@StackTrace(value=false)
@Enabled(value=false)
@DontObfuscate
public class ChunkGenerationEvent
extends Event {
    public static final String EVENT_NAME = "minecraft.ChunkGeneration";
    public static final EventType TYPE = EventType.getEventType(ChunkGenerationEvent.class);
    @Name(value="worldPosX")
    @Label(value="First Block X World Position")
    public final int worldPosX;
    @Name(value="worldPosZ")
    @Label(value="First Block Z World Position")
    public final int worldPosZ;
    @Name(value="chunkPosX")
    @Label(value="Chunk X Position")
    public final int chunkPosX;
    @Name(value="chunkPosZ")
    @Label(value="Chunk Z Position")
    public final int chunkPosZ;
    @Name(value="status")
    @Label(value="Status")
    public final String targetStatus;
    @Name(value="level")
    @Label(value="Level")
    public final String level;

    public ChunkGenerationEvent(dvu $$0, amt<dwo> $$1, String $$2) {
        this.targetStatus = $$2;
        this.level = $$1.a().toString();
        this.chunkPosX = $$0.h;
        this.chunkPosZ = $$0.i;
        this.worldPosX = $$0.e();
        this.worldPosZ = $$0.f();
    }

    public static class a {
        public static final String a = "worldPosX";
        public static final String b = "worldPosZ";
        public static final String c = "chunkPosX";
        public static final String d = "chunkPosZ";
        public static final String e = "status";
        public static final String f = "level";

        private a() {
        }
    }
}

