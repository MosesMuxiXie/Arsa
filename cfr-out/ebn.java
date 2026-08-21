/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class ebn
extends dzq {
    public static final MapCodec<ebn> a = ebn.b(ebn::new);
    private static final yh b = yh.c("container.crafting");

    public MapCodec<? extends ebn> a() {
        return a;
    }

    protected ebn(eog.d $$0) {
        super($$0);
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        if (!$$1.B_()) {
            $$3.a($$0.a($$1, $$2));
            $$3.a(bdk.ap);
        }
        return cdc.a;
    }

    @Override
    protected cdf a(eoh $$0, dwo $$1, is $$22) {
        return new cdl(($$2, $$3, $$4) -> new dic($$2, $$3, dhw.a($$1, $$22)), b);
    }
}

