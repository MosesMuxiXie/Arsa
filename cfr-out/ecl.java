/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class ecl
extends egi {
    public static final MapCodec<ecl> b = ecl.b(ecl::new);

    public MapCodec<ecl> a() {
        return b;
    }

    protected ecl(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(a, iz.b));
    }

    @Override
    public eoh a(dpu $$0) {
        iz $$1 = $$0.k();
        eoh $$2 = $$0.q().a_($$0.a().a($$1.g()));
        if ($$2.a(this) && $$2.c(a) == $$1) {
            return (eoh)this.m().b(a, $$1.g());
        }
        return (eoh)this.m().b(a, $$1);
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        iz $$4 = (iz)$$0.c(a);
        double $$5 = (double)$$2.u() + 0.55 - (double)($$3.i() * 0.1f);
        double $$6 = (double)$$2.v() + 0.55 - (double)($$3.i() * 0.1f);
        double $$7 = (double)$$2.w() + 0.55 - (double)($$3.i() * 0.1f);
        double $$8 = 0.4f - ($$3.i() + $$3.i()) * 0.4f;
        if ($$3.a(5) == 0) {
            $$1.a(ly.u, $$5 + (double)$$4.j() * $$8, $$6 + (double)$$4.k() * $$8, $$7 + (double)$$4.l() * $$8, $$3.k() * 0.005, $$3.k() * 0.005, $$3.k() * 0.005);
        }
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{a});
    }
}

