/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public abstract class dza
extends dzq
implements ehg {
    public static final eoy b = eox.I;
    private static final fug a = dzq.b(12.0, 0.0, 4.0);

    protected dza(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(b, true));
    }

    protected abstract MapCodec<? extends dza> a();

    protected void a(eoh $$0, dvt $$1, dxd $$2, bgr $$3, is $$4) {
        if (!dza.d($$0, $$1, $$4)) {
            $$2.a($$4, this, 60 + $$3.a(40));
        }
    }

    protected static boolean d(eoh $$0, dvt $$1, is $$2) {
        if ($$0.c(b).booleanValue()) {
            return true;
        }
        for (iz $$3 : iz.values()) {
            if (!$$1.b_($$2.a($$3)).a(bdv.a)) continue;
            return true;
        }
        return false;
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        flb $$1 = $$0.q().b_($$0.a());
        return (eoh)this.m().b(b, $$1.a(bdv.a) && $$1.e() == 8);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return a;
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(b).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        if ($$4 == iz.a && !this.a($$0, $$1, $$3)) {
            return dzs.a.m();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        is $$3 = $$2.e();
        return $$1.a_($$3).c((dvt)$$1, $$3, iz.b);
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
}

