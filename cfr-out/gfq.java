/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public final class gfq
extends Enum<gfq> {
    public static final /* enum */ gfq a = new gfq(0, "options.prioritizeChunkUpdates.none");
    public static final /* enum */ gfq b = new gfq(1, "options.prioritizeChunkUpdates.byPlayer");
    public static final /* enum */ gfq c = new gfq(2, "options.prioritizeChunkUpdates.nearby");
    private static final IntFunction<gfq> e;
    public static final Codec<gfq> d;
    private final int f;
    private final yh g;
    private static final /* synthetic */ gfq[] h;

    public static gfq[] values() {
        return (gfq[])h.clone();
    }

    public static gfq valueOf(String $$0) {
        return Enum.valueOf(gfq.class, $$0);
    }

    private gfq(int $$0, String $$1) {
        this.f = $$0;
        this.g = yh.c($$1);
    }

    public yh a() {
        return this.g;
    }

    private static /* synthetic */ gfq[] b() {
        return new gfq[]{a, b, c};
    }

    static {
        h = gfq.b();
        e = beu.a($$0 -> $$0.f, gfq.values(), beu.a.b);
        d = Codec.INT.xmap(e::apply, $$0 -> $$0.f);
    }
}

