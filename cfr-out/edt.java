/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public abstract class edt
extends dzq {
    public static final epf<iz> f = eox.T;

    protected edt(eog.d $$0) {
        super($$0);
    }

    protected abstract MapCodec<? extends edt> a();

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(f, $$1.a($$0.c(f)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a($$0.c(f)));
    }
}

