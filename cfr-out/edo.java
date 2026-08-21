/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class edo
extends dzq
implements ehg {
    public static final MapCodec<edo> a = edo.b(edo::new);
    private static final eoy b = eox.I;
    private static final fug c = dzq.b(12.0, 10.0, 16.0);

    public MapCodec<edo> a() {
        return a;
    }

    protected edo(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(b, false));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(b).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        eoh $$1 = super.a($$0);
        if ($$1 != null) {
            flb $$2 = $$0.q().b_($$0.a());
            return (eoh)$$1.b(b, $$2.a() == flc.c);
        }
        return null;
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        is $$3 = $$2.d();
        eoh $$4 = $$1.a_($$3);
        return $$4.c((dvt)$$1, $$3, iz.a);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return c;
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4 == iz.b && !this.a($$0, $$1, $$3)) {
            return dzs.a.m();
        }
        if ($$0.c(b).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }
}

