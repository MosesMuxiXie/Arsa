/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class ega
extends dzq {
    public static final MapCodec<ega> a = ega.b(ega::new);
    public static final eoy b = egd.b;

    public MapCodec<ega> a() {
        return a;
    }

    public ega(eog.d $$0) {
        super($$0);
        this.l((eoh)this.m().b(b, false));
    }

    @Override
    protected void a_(eoh $$0, dwo $$1, is $$2, ddm $$3) {
        ega.c($$0, $$1, $$2);
        super.a_($$0, $$1, $$2, $$3);
    }

    @Override
    public void a(dwo $$0, is $$1, eoh $$2, cgk $$3) {
        if (!$$3.cv()) {
            ega.c($$2, $$0, $$1);
        }
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    protected cdc a(dlt $$0, eoh $$1, dwo $$2, is $$3, ddm $$4, cdb $$5, fti $$6) {
        if ($$2.B_()) {
            ega.a($$2, $$3);
        } else {
            ega.c($$1, $$2, $$3);
        }
        if ($$0.h() instanceof dkb && new dpu($$4, $$5, $$0, $$6).b()) {
            return cdc.e;
        }
        return cdc.a;
    }

    private static void c(eoh $$0, dwo $$1, is $$2) {
        ega.a($$1, $$2);
        if (!$$0.c(b).booleanValue()) {
            $$1.a($$2, (eoh)$$0.b(b, true), 3);
        }
    }

    @Override
    protected boolean f(eoh $$0) {
        return $$0.c(b);
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if ($$0.c(b).booleanValue()) {
            $$1.a($$2, (eoh)$$0.b(b, false), 3);
        }
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, dlt $$3, boolean $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        if ($$4) {
            this.a($$1, $$2, $$3, ccn.a(1, 5));
        }
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        if ($$0.c(b).booleanValue()) {
            ega.a($$1, $$2);
        }
    }

    private static void a(dwo $$0, is $$1) {
        double $$2 = 0.5625;
        bgr $$3 = $$0.y;
        for (iz $$4 : iz.values()) {
            is $$5 = $$1.a($$4);
            if ($$0.a_($$5).s()) continue;
            iz.a $$6 = $$4.o();
            double $$7 = $$6 == iz.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == iz.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == iz.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(ls.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
        }
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
    }
}

