/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.serialization.MapCodec
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class eda
extends dzq {
    public static final MapCodec<eda> a = eda.b(eda::new);
    private static final int b = 2;
    private static final int c = 5;
    private static final int d = 3600;
    private static final int e = 12000;
    private static final fug f = dzq.b(16.0, 0.0, 1.5);
    private static int g = 3600;
    private static int h = 12000;

    public MapCodec<eda> a() {
        return a;
    }

    public eda(eog.d $$0) {
        super($$0);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return f;
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        return eda.a($$1, $$2.e());
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        $$1.a($$2, (dzq)this, eda.a($$1.G_()));
    }

    private static int a(bgr $$0) {
        return $$0.b(g, h);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if (!this.a($$0, $$1, $$3)) {
            return dzs.a.m();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (!this.a($$0, (dwr)$$1, $$2)) {
            this.a($$1, $$2);
            return;
        }
        this.a($$1, $$2, $$3);
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, cgk $$3, chc $$4, boolean $$5) {
        if ($$3.ay().equals(cgu.ab)) {
            this.a($$1, $$2);
        }
    }

    private static boolean a(dvt $$0, is $$1) {
        flb $$2 = $$0.b_($$1);
        flb $$3 = $$0.b_($$1.d());
        return $$2.a() == flc.c && $$3.a() == flc.a;
    }

    private void a(axf $$0, is $$1, bgr $$2) {
        this.a($$0, $$1);
        $$0.a(null, $$1, bda.lw, bdb.e, 1.0f, 1.0f);
        this.b($$0, $$1, $$2);
    }

    private void a(dwo $$0, is $$1) {
        $$0.b($$1, false);
    }

    private void b(axf $$0, is $$1, bgr $$2) {
        int $$3 = $$2.b(2, 6);
        for (int $$4 = 1; $$4 <= $$3; ++$$4) {
            cvv $$5 = cgu.bC.a($$0, cgt.e);
            if ($$5 == null) continue;
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, $$8, 0.0f);
            $$5.gz();
            $$0.b($$5);
        }
    }

    private double b(bgr $$0) {
        double $$1 = 0.2f;
        return bgj.a($$0.j(), (double)0.2f, 0.7999999970197678);
    }

    @VisibleForTesting
    public static void a(int $$0, int $$1) {
        g = $$0;
        h = $$1;
    }

    @VisibleForTesting
    public static void b() {
        g = 3600;
        h = 12000;
    }
}

