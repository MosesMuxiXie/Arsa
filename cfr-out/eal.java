/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class eal
extends dzq {
    public static final MapCodec<eal> a = eal.b(eal::new);
    private static final yh b = yh.c("container.cartography_table");

    public MapCodec<eal> a() {
        return a;
    }

    protected eal(eog.d $$0) {
        super($$0);
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        if (!$$1.B_()) {
            $$3.a($$0.a($$1, $$2));
            $$3.a(bdk.ay);
        }
        return cdc.a;
    }

    @Override
    protected @Nullable cdf a(eoh $$0, dwo $$1, is $$22) {
        return new cdl(($$2, $$3, $$4) -> new dhr($$2, $$3, dhw.a($$1, $$22)), b);
    }
}

