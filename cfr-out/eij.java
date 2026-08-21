/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class eij
extends ecg
implements dzt {
    public static final MapCodec<eij> b = eij.b(eij::new);
    private static final fug c = dzq.b(14.0, 0.0, 16.0);

    public MapCodec<eij> a() {
        return b;
    }

    protected eij(eog.d $$0) {
        super($$0);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return c;
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        eoe.b($$1, $$2, $$3);
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        return dzt.a_($$0, $$1, dzs.bE.m());
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$0, bgr $$12, is $$2, eoh $$3) {
        dzt.a($$0, $$2, dzs.bE.m()).ifPresent($$1 -> $$0.c((is)$$1, dzs.bE.m()));
    }
}

