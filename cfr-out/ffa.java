/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ffa
extends feu {
    public static final MapCodec<ffa> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)euq.a.g.fieldOf("heightmap").forGetter($$0 -> $$0.c), (App)Codec.INT.optionalFieldOf("min_inclusive", (Object)Integer.MIN_VALUE).forGetter($$0 -> $$0.d), (App)Codec.INT.optionalFieldOf("max_inclusive", (Object)Integer.MAX_VALUE).forGetter($$0 -> $$0.e)).apply((Applicative)$$02, ffa::new));
    private final euq.a c;
    private final int d;
    private final int e;

    private ffa(euq.a $$0, int $$1, int $$2) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    public static ffa a(euq.a $$0, int $$1, int $$2) {
        return new ffa($$0, $$1, $$2);
    }

    @Override
    protected boolean a(fet $$0, bgr $$1, is $$2) {
        long $$3 = $$0.a(this.c, $$2.u(), $$2.w());
        long $$4 = $$3 + (long)this.d;
        long $$5 = $$3 + (long)this.e;
        return $$4 <= (long)$$2.v() && (long)$$2.v() <= $$5;
    }

    @Override
    public few<?> b() {
        return few.c;
    }
}

