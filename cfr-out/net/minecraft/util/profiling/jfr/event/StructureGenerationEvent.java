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

@Name(value="minecraft.StructureGeneration")
@Label(value="Structure Generation")
@Category(value={"Minecraft", "World Generation"})
@StackTrace(value=false)
@Enabled(value=false)
@DontObfuscate
public class StructureGenerationEvent
extends Event {
    public static final String EVENT_NAME = "minecraft.StructureGeneration";
    public static final EventType TYPE = EventType.getEventType(StructureGenerationEvent.class);
    @Name(value="chunkPosX")
    @Label(value="Chunk X Position")
    public final int chunkPosX;
    @Name(value="chunkPosZ")
    @Label(value="Chunk Z Position")
    public final int chunkPosZ;
    @Name(value="structure")
    @Label(value="Structure")
    public final String structure;
    @Name(value="level")
    @Label(value="Level")
    public final String level;
    @Name(value="success")
    @Label(value="Success")
    public boolean success;

    public StructureGenerationEvent(dvu $$0, jd<ffo> $$1, amt<dwo> $$2) {
        this.chunkPosX = $$0.h;
        this.chunkPosZ = $$0.i;
        this.structure = $$1.g();
        this.level = $$2.a().toString();
    }

    public static interface a {
        public static final String a = "chunkPosX";
        public static final String b = "chunkPosZ";
        public static final String c = "structure";
        public static final String d = "level";
        public static final String e = "success";
    }
}

