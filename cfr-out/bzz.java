/*
 * Decompiled with CFR 0.152.
 */
import jdk.jfr.Category;
import jdk.jfr.Enabled;
import jdk.jfr.Event;
import jdk.jfr.Label;
import jdk.jfr.Name;
import jdk.jfr.StackTrace;

@Category(value={"Minecraft", "Storage"})
@StackTrace(value=false)
@Enabled(value=false)
public abstract class bzz
extends Event {
    @Name(value="regionPosX")
    @Label(value="Region X Position")
    public final int regionPosX;
    @Name(value="regionPosZ")
    @Label(value="Region Z Position")
    public final int regionPosZ;
    @Name(value="localPosX")
    @Label(value="Local X Position")
    public final int localChunkPosX;
    @Name(value="localPosZ")
    @Label(value="Local Z Position")
    public final int localChunkPosZ;
    @Name(value="chunkPosX")
    @Label(value="Chunk X Position")
    public final int chunkPosX;
    @Name(value="chunkPosZ")
    @Label(value="Chunk Z Position")
    public final int chunkPosZ;
    @Name(value="level")
    @Label(value="Level Id")
    public final String levelId;
    @Name(value="dimension")
    @Label(value="Dimension")
    public final String dimension;
    @Name(value="type")
    @Label(value="Type")
    public final String type;
    @Name(value="compression")
    @Label(value="Compression")
    public final String compression;
    @Name(value="bytes")
    @Label(value="Bytes")
    public final int bytes;

    public bzz(esa $$0, dvu $$1, erz $$2, int $$3) {
        this.regionPosX = $$1.i();
        this.regionPosZ = $$1.j();
        this.localChunkPosX = $$1.k();
        this.localChunkPosZ = $$1.l();
        this.chunkPosX = $$1.h;
        this.chunkPosZ = $$1.i;
        this.levelId = $$0.a();
        this.dimension = $$0.b().a().toString();
        this.type = $$0.c();
        this.compression = "standard:" + $$2.b();
        this.bytes = $$3;
    }

    public static class a {
        public static final String a = "regionPosX";
        public static final String b = "regionPosZ";
        public static final String c = "localPosX";
        public static final String d = "localPosZ";
        public static final String e = "chunkPosX";
        public static final String f = "chunkPosZ";
        public static final String g = "level";
        public static final String h = "dimension";
        public static final String i = "type";
        public static final String j = "compression";
        public static final String k = "bytes";

        private a() {
        }
    }
}

