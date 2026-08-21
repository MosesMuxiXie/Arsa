/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class ein
extends dzq {
    public static final MapCodec<ein> a = ein.b(ein::new);
    private static final eph b = eox.aX;
    private static final int c = 20;
    private static final int d = 8;

    public MapCodec<ein> a() {
        return a;
    }

    public ein(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(b, 0));
    }

    @Override
    protected void a(dwo $$0, eoh $$1, fti $$2, dec $$3) {
        int $$4 = ein.a((dwp)$$0, $$1, $$2, $$3);
        cgk $$5 = $$3.p();
        if ($$5 instanceof axg) {
            axg $$6 = (axg)$$5;
            $$6.a(bdk.aG);
            aj.N.a($$6, $$3, $$2.g(), $$4);
        }
    }

    private static int a(dwp $$0, eoh $$1, fti $$2, cgk $$3) {
        int $$5;
        int $$4 = ein.a($$2, $$2.g());
        int n2 = $$5 = $$3 instanceof deh ? 20 : 8;
        if (!$$0.af().a($$2.b(), $$1.b())) {
            ein.a($$0, $$1, $$4, $$2.b(), $$5);
        }
        return $$4;
    }

    private static int a(fti $$0, ftm $$1) {
        double $$9;
        iz $$2 = $$0.c();
        double $$3 = Math.abs(bgj.h($$1.g) - 0.5);
        double $$4 = Math.abs(bgj.h($$1.h) - 0.5);
        double $$5 = Math.abs(bgj.h($$1.i) - 0.5);
        iz.a $$6 = $$2.o();
        if ($$6 == iz.a.b) {
            double $$7 = Math.max($$3, $$5);
        } else if ($$6 == iz.a.c) {
            double $$8 = Math.max($$3, $$4);
        } else {
            $$9 = Math.max($$4, $$5);
        }
        return Math.max(1, bgj.e(15.0 * bgj.a((0.5 - $$9) / 0.5, 0.0, 1.0)));
    }

    private static void a(dwp $$0, eoh $$1, int $$2, is $$3, int $$4) {
        $$0.a($$3, (eoh)$$1.b(b, $$2), 3);
        $$0.a($$3, $$1.b(), $$4);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if ($$0.c(b) != 0) {
            $$1.a($$2, (eoh)$$0.b(b, 0), 3);
        }
    }

    @Override
    protected int a(eoh $$0, dvt $$1, is $$2, iz $$3) {
        return $$0.c(b);
    }

    @Override
    protected boolean f_(eoh $$0) {
        return true;
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        if ($$1.B_() || $$0.a($$3.b())) {
            return;
        }
        if ($$0.c(b) > 0 && !$$1.af().a($$2, this)) {
            $$1.a($$2, (eoh)$$0.b(b, 0), 18);
        }
    }
}

