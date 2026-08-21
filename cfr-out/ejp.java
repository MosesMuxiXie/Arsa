/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class ejp
extends eiv
implements ehg {
    public static final MapCodec<ejp> a = ejp.b(ejp::new);
    public static final eoy c = eox.I;

    protected MapCodec<? extends ejp> a() {
        return a;
    }

    protected ejp(eog.d $$0) {
        super($$0);
        this.l((eoh)this.m().b(c, false));
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        flb $$1 = $$0.q().b_($$0.a());
        return (eoh)super.a($$0).b(c, $$1.b(flc.c));
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(c).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(c).booleanValue()) {
            return flc.c.a(true);
        }
        return super.b_($$0);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{c});
    }
}

