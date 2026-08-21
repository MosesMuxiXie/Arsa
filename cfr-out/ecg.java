/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class ecg
extends ejg {
    public static final MapCodec<ecg> a = ecg.b(ecg::new);
    private static final fug b = dzq.b(12.0, 0.0, 13.0);

    public MapCodec<? extends ecg> a() {
        return a;
    }

    protected ecg(eog.d $$0) {
        super($$0);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return b;
    }

    @Override
    protected boolean b(eoh $$0, dvt $$1, is $$2) {
        return $$0.a(bdp.cC);
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        eoe.c($$1, $$2, $$3);
    }
}

