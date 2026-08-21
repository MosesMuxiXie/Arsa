/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class ehl
extends ebn {
    public static final MapCodec<ehl> b = ehl.b(ehl::new);
    private static final yh c = yh.c("container.upgrade");

    public MapCodec<ehl> a() {
        return b;
    }

    protected ehl(eog.d $$0) {
        super($$0);
    }

    @Override
    protected cdf a(eoh $$0, dwo $$1, is $$22) {
        return new cdl(($$2, $$3, $$4) -> new djl($$2, $$3, dhw.a($$1, $$22)), c);
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        if (!$$1.B_()) {
            $$3.a($$0.a($$1, $$2));
            $$3.a(bdk.aH);
        }
        return cdc.a;
    }
}

