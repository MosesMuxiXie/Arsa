/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lu
implements lw {
    private static final Codec<dlt> a = Codec.withAlternative(dlt.c, dlp.e, dlt::new);
    private final lx<lu> b;
    private final dlt c;

    public static MapCodec<lu> a(lx<lu> $$02) {
        return a.xmap($$1 -> new lu($$02, (dlt)$$1), $$0 -> $$0.c).fieldOf("item");
    }

    public static aao<? super xq, lu> b(lx<lu> $$02) {
        return dlt.j.a($$1 -> new lu($$02, (dlt)$$1), $$0 -> $$0.c);
    }

    public lu(lx<lu> $$0, dlt $$1) {
        if ($$1.f()) {
            throw new IllegalArgumentException("Empty stacks are not allowed");
        }
        this.b = $$0;
        this.c = $$1;
    }

    public lx<lu> a() {
        return this.b;
    }

    public dlt b() {
        return this.c;
    }
}

