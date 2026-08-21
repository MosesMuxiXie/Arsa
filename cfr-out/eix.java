/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class eix
extends eau {
    public static final MapCodec<eix> g = eix.b(eix::new);

    @Override
    public MapCodec<eix> a() {
        return g;
    }

    public eix(eog.d $$0) {
        super(() -> eld.c, bda.fr, bda.fp, $$0);
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        return new end($$0, $$1);
    }

    @Override
    protected bdh<amo> d() {
        return bdk.i.b(bdk.ak);
    }

    @Override
    protected boolean f_(eoh $$0) {
        return true;
    }

    @Override
    protected int a(eoh $$0, dvt $$1, is $$2, iz $$3) {
        return bgj.a(elj.a($$1, $$2), 0, 15);
    }

    @Override
    protected int b(eoh $$0, dvt $$1, is $$2, iz $$3) {
        if ($$3 == iz.b) {
            return $$0.a($$1, $$2, $$3);
        }
        return 0;
    }
}

