/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class egc
extends dzq {
    public static final MapCodec<egc> a = egc.b(egc::new);
    public static final eoy b = egd.b;

    public MapCodec<egc> a() {
        return a;
    }

    public egc(eog.d $$0) {
        super($$0);
        this.l((eoh)this.m().b(b, false));
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        return (eoh)this.m().b(b, $$0.q().I($$0.a()));
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3, @Nullable fmj $$4, boolean $$5) {
        if ($$1.B_()) {
            return;
        }
        boolean $$6 = $$0.c(b);
        if ($$6 != $$1.I($$2)) {
            if ($$6) {
                $$1.a($$2, (dzq)this, 4);
            } else {
                $$1.a($$2, (eoh)$$0.a(b), 2);
            }
        }
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if ($$0.c(b).booleanValue() && !$$1.I($$2)) {
            $$1.a($$2, (eoh)$$0.a(b), 2);
        }
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
    }
}

