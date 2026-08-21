/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lp
implements lw {
    private static final Codec<eoh> a = Codec.withAlternative(eoh.a, mi.e.q(), dzq::m);
    private final lx<lp> b;
    private final eoh c;

    public static MapCodec<lp> a(lx<lp> $$02) {
        return a.xmap($$1 -> new lp($$02, (eoh)$$1), $$0 -> $$0.c).fieldOf("block_state");
    }

    public static aao<? super xq, lp> b(lx<lp> $$02) {
        return aam.a(dzq.k).a($$1 -> new lp($$02, (eoh)$$1), $$0 -> $$0.c);
    }

    public lp(lx<lp> $$0, eoh $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public lx<lp> a() {
        return this.b;
    }

    public eoh b() {
        return this.c;
    }
}

