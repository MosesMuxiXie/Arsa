/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class eiv
extends edm {
    public static final MapCodec<eiv> b = eiv.b(eiv::new);

    protected eiv(eog.d $$0) {
        super($$0);
    }

    protected MapCodec<? extends eiv> a() {
        return b;
    }

    @Override
    protected fug c(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return fud.a();
    }

    @Override
    protected float c(eoh $$0, dvt $$1, is $$2) {
        return 1.0f;
    }

    @Override
    protected boolean e_(eoh $$0) {
        return true;
    }
}

