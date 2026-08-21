/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class een
extends egi
implements ehg {
    public static final MapCodec<een> b = een.b(een::new);
    public static final eoy c = eox.I;
    public static final eoy d = eox.A;
    private static final int f = 8;
    public static final int e = 128;
    private static final int g = 200;

    public MapCodec<? extends een> a() {
        return b;
    }

    public een(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)((eoh)this.C.b()).b(a, iz.b)).b(c, false)).b(d, false));
    }

    @Override
    public eoh a(dpu $$0) {
        flb $$1 = $$0.q().b_($$0.a());
        boolean $$2 = $$1.a() == flc.c;
        return (eoh)((eoh)this.m().b(a, $$0.k())).b(c, $$2);
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
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    protected int a(eoh $$0, dvt $$1, is $$2, iz $$3) {
        return $$0.c(d) != false ? 15 : 0;
    }

    @Override
    protected int b(eoh $$0, dvt $$1, is $$2, iz $$3) {
        if ($$0.c(d).booleanValue() && $$0.c(a) == $$3) {
            return 15;
        }
        return 0;
    }

    public void c(eoh $$0, dwo $$1, is $$2) {
        $$1.a($$2, (eoh)$$0.b(d, true), 3);
        this.d($$0, $$1, $$2);
        $$1.a($$2, (dzq)this, 8);
        $$1.c(3002, $$2, ((iz)$$0.c(a)).o().ordinal());
    }

    private void d(eoh $$0, dwo $$1, is $$2) {
        iz $$3 = ((iz)$$0.c(a)).g();
        $$1.a($$2.a($$3), (dzq)this, fmf.a($$1, $$3, null));
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        $$1.a($$2, (eoh)$$0.b(d, false), 3);
        this.d($$0, $$1, $$2);
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        if (!$$1.an() || (long)$$1.y.a(200) > $$1.au() % 200L || $$2.v() != $$1.a(euq.a.b, $$2.u(), $$2.w()) - 1) {
            return;
        }
        bgm.a(((iz)$$0.c(a)).o(), $$1, $$2, 0.125, ly.aX, ccn.a(1, 2));
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, boolean $$3) {
        if ($$0.c(d).booleanValue()) {
            this.d($$0, $$1, $$2);
        }
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        if ($$0.a($$3.b())) {
            return;
        }
        if ($$0.c(d).booleanValue() && !$$1.af().a($$2, this)) {
            $$1.a($$2, (dzq)this, 8);
        }
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(a, d, c);
    }

    @Override
    protected boolean f_(eoh $$0) {
        return true;
    }
}

