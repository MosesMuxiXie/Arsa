/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class eil
extends ejg
implements dzt {
    public static final MapCodec<eil> a = eil.b(eil::new);
    private static final fug b = dzq.b(12.0, 0.0, 13.0);

    public MapCodec<eil> a() {
        return a;
    }

    protected eil(eog.d $$0) {
        super($$0);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return b;
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        return eil.p($$2).m().a($$0, $$1) && $$0.A($$1.d());
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        ecb.a((dwp)$$0, eil.p($$3).m(), $$2, 2);
    }

    private static ecb p(eoh $$0) {
        return (ecb)($$0.a(dzs.bB) ? dzs.jA : dzs.jz);
    }
}

