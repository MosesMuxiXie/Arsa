/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class eex
extends dzq {
    public static final MapCodec<eex> a = eex.b(eex::new);
    private static final fug b = dzq.b(16.0, 0.0, 14.0);

    public MapCodec<eex> a() {
        return a;
    }

    public eex(eog.d $$0) {
        super($$0);
    }

    @Override
    protected fug b(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return b;
    }

    @Override
    protected fug b_(eoh $$0, dvt $$1, is $$2) {
        return fud.b();
    }

    @Override
    protected fug c(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return fud.b();
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }

    @Override
    protected float c(eoh $$0, dvt $$1, is $$2) {
        return 0.2f;
    }
}

