/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class egx
extends ejg
implements dzt,
ehg {
    public static final MapCodec<egx> a = egx.b(egx::new);
    public static final int b = 4;
    public static final eph c = eox.aW;
    public static final eoy d = eox.I;
    private static final fug e = dzq.b(4.0, 0.0, 6.0);
    private static final fug f = dzq.b(10.0, 0.0, 6.0);
    private static final fug g = dzq.b(12.0, 0.0, 6.0);
    private static final fug h = dzq.b(12.0, 0.0, 7.0);

    public MapCodec<egx> a() {
        return a;
    }

    protected egx(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)this.C.b()).b(c, 1)).b(d, true));
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        eoh $$1 = $$0.q().a_($$0.a());
        if ($$1.a(this)) {
            return (eoh)$$1.b(c, Math.min(4, $$1.c(c) + 1));
        }
        flb $$2 = $$0.q().b_($$0.a());
        boolean $$3 = $$2.a() == flc.c;
        return (eoh)super.a($$0).b(d, $$3);
    }

    public static boolean p(eoh $$0) {
        return $$0.c(d) == false;
    }

    @Override
    protected boolean b(eoh $$0, dvt $$1, is $$2) {
        return !$$0.g($$1, $$2).a(iz.b).c() || $$0.c($$1, $$2, iz.b);
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        is $$3 = $$2.e();
        return this.b($$1.a_($$3), $$1, $$3);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if (!$$0.a($$1, $$3)) {
            return dzs.a.m();
        }
        if ($$0.c(d).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected boolean a(eoh $$0, dpu $$1) {
        if (!$$1.h() && $$1.n().a(this.h()) && $$0.c(c) < 4) {
            return true;
        }
        return super.a($$0, $$1);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return switch ($$0.c(c)) {
            default -> e;
            case 2 -> f;
            case 3 -> g;
            case 4 -> h;
        };
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(d).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(c, d);
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        return !egx.p($$2) && $$0.a_($$1.e()).a(bdp.aG);
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        int $$4 = 5;
        int $$5 = 1;
        int $$6 = 2;
        int $$7 = 0;
        int $$8 = $$2.u() - 2;
        int $$9 = 0;
        for (int $$10 = 0; $$10 < 5; ++$$10) {
            for (int $$11 = 0; $$11 < $$5; ++$$11) {
                int $$12 = 2 + $$2.v() - 1;
                for (int $$13 = $$12 - 2; $$13 < $$12; ++$$13) {
                    eoh $$15;
                    is $$14 = new is($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
                    if ($$14.equals($$2) || $$1.a(6) != 0 || !$$0.a_($$14).a(dzs.J) || !($$15 = $$0.a_($$14.e())).a(bdp.aG)) continue;
                    $$0.a($$14, (eoh)dzs.nS.m().b(c, $$1.a(4) + 1), 3);
                }
            }
            if ($$7 < 2) {
                $$5 += 2;
                ++$$9;
            } else {
                $$5 -= 2;
                --$$9;
            }
            ++$$7;
        }
        $$0.a($$2, (eoh)$$3.b(c, 4), 2);
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }
}

