/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class ehc
extends ecg
implements dzt {
    public static final MapCodec<ehc> b = ehc.b(ehc::new);
    private static final fug c = dzq.b(12.0, 0.0, 10.0);

    public MapCodec<ehc> a() {
        return b;
    }

    protected ehc(eog.d $$0) {
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
        return true;
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        $$0.c($$2, dzs.bF.m());
    }
}

