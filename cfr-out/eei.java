/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public abstract class eei
extends dzq
implements ehg {
    public static final int a = 7;
    public static final eph b = eox.aG;
    public static final eoy c = eox.z;
    public static final eoy d = eox.I;
    protected final float e;
    private static final int f = 1;
    private static boolean g = true;

    public abstract MapCodec<? extends eei> a();

    public eei(float $$0, eog.d $$1) {
        super($$1);
        this.e = $$0;
        this.l((eoh)((eoh)((eoh)((eoh)this.C.b()).b(b, 7)).b(c, false)).b(d, false));
    }

    @Override
    protected boolean b(eoh $$0, eoh $$1, iz $$2) {
        if (!g && $$1.b() instanceof eei) {
            return true;
        }
        return super.b($$0, $$1, $$2);
    }

    public static void a(boolean $$0) {
        g = $$0;
    }

    @Override
    protected fug b_(eoh $$0, dvt $$1, is $$2) {
        return fud.a();
    }

    @Override
    protected boolean f(eoh $$0) {
        return $$0.c(b) == 7 && $$0.c(c) == false;
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (this.p($$0)) {
            eei.b($$0, $$1, $$2);
            $$1.a($$2, false);
        }
    }

    protected boolean p(eoh $$0) {
        return $$0.c(c) == false && $$0.c(b) == 7;
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        $$1.a($$2, eei.a($$0, $$1, $$2), 3);
    }

    @Override
    protected int i_(eoh $$0) {
        return 1;
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        int $$8;
        if ($$0.c(d).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        if (($$8 = eei.s($$6) + 1) != 1 || $$0.c(b) != $$8) {
            $$2.a($$3, this, 1);
        }
        return $$0;
    }

    private static eoh a(eoh $$0, dwp $$1, is $$2) {
        int $$3 = 7;
        is.a $$4 = new is.a();
        for (iz $$5 : iz.values()) {
            $$4.a((jy)$$2, $$5);
            $$3 = Math.min($$3, eei.s($$1.a_($$4)) + 1);
            if ($$3 == 1) break;
        }
        return (eoh)$$0.b(b, $$3);
    }

    private static int s(eoh $$0) {
        return eei.r($$0).orElse(7);
    }

    public static OptionalInt r(eoh $$0) {
        if ($$0.a(bdp.E)) {
            return OptionalInt.of(0);
        }
        if ($$0.b(b)) {
            return OptionalInt.of($$0.c(b));
        }
        return OptionalInt.empty();
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(d).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        super.a($$0, $$1, $$2, $$3);
        is $$4 = $$2.e();
        eoh $$5 = $$1.a_($$4);
        eei.a($$1, $$2, $$3, $$5, $$4);
        this.b($$1, $$2, $$3, $$5, $$4);
    }

    private static void a(dwo $$0, is $$1, bgr $$2, eoh $$3, is $$4) {
        if (!$$0.v($$1.d())) {
            return;
        }
        if ($$2.a(15) != 1) {
            return;
        }
        if ($$3.t() && $$3.c((dvt)$$0, $$4, iz.b)) {
            return;
        }
        bgm.a($$0, $$1, $$2, (lw)ly.m);
    }

    private void b(dwo $$0, is $$1, bgr $$2, eoh $$3, is $$4) {
        if ($$2.i() >= this.e) {
            return;
        }
        if (eei.a($$3.g($$0, $$4), iz.b)) {
            return;
        }
        this.a($$0, $$1, $$2);
    }

    protected abstract void a(dwo var1, is var2, bgr var3);

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, c, d);
    }

    @Override
    public eoh a(dpu $$0) {
        flb $$1 = $$0.q().b_($$0.a());
        eoh $$2 = (eoh)((eoh)this.m().b(c, true)).b(d, $$1.a() == flc.c);
        return eei.a($$2, $$0.q(), $$0.a());
    }
}

