/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public abstract class fle
extends fkz {
    public static final float e = 0.44444445f;

    @Override
    public fla d() {
        return flc.d;
    }

    @Override
    public fla e() {
        return flc.e;
    }

    @Override
    public dlp a() {
        return dlx.sm;
    }

    @Override
    public void a(dwo $$0, is $$1, flb $$2, bgr $$3) {
        is $$4 = $$1.d();
        if ($$0.a_($$4).l() && !$$0.a_($$4).s()) {
            if ($$3.a(100) == 0) {
                double $$5 = (double)$$1.u() + $$3.j();
                double $$6 = (double)$$1.v() + 1.0;
                double $$7 = (double)$$1.w() + $$3.j();
                $$0.a(ly.ac, $$5, $$6, $$7, 0.0, 0.0, 0.0);
                $$0.a($$5, $$6, $$7, bda.pV, bdb.i, 0.2f + $$3.i() * 0.2f, 0.9f + $$3.i() * 0.15f, false);
            }
            if ($$3.a(200) == 0) {
                $$0.a($$1.u(), (double)$$1.v(), (double)$$1.w(), bda.pT, bdb.i, 0.2f + $$3.i() * 0.2f, 0.9f + $$3.i() * 0.15f, false);
            }
        }
    }

    @Override
    public void a(axf $$0, is $$1, flb $$2, bgr $$3) {
        if (!$$0.j($$1)) {
            return;
        }
        int $$4 = $$3.a(3);
        if ($$4 > 0) {
            is $$5 = $$1;
            for (int $$6 = 0; $$6 < $$4; ++$$6) {
                if (!$$0.t($$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1))) {
                    return;
                }
                eoh $$7 = $$0.a_($$5);
                if ($$7.l()) {
                    if (!this.a((dwr)$$0, $$5)) continue;
                    $$0.c($$5, dzd.a($$0, $$5));
                    return;
                }
                if (!$$7.d()) continue;
                return;
            }
        } else {
            for (int $$8 = 0; $$8 < 3; ++$$8) {
                is $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
                if (!$$0.t($$9)) {
                    return;
                }
                if (!$$0.A($$9.d()) || !this.b($$0, $$9)) continue;
                $$0.c($$9.d(), dzd.a($$0, $$9));
            }
        }
    }

    @Override
    protected void a(dwo $$0, is $$1, cgk $$2, chc $$3) {
        $$3.a(chd.b);
        $$3.a(chd.d);
        $$3.b(chd.d, cgk::aQ);
    }

    private boolean a(dwr $$0, is $$1) {
        for (iz $$2 : iz.values()) {
            if (!this.b($$0, $$1.a($$2))) continue;
            return true;
        }
        return false;
    }

    private boolean b(dwr $$0, is $$1) {
        if ($$0.d($$1.v()) && !$$0.H($$1)) {
            return false;
        }
        return $$0.a_($$1).m();
    }

    @Override
    public @Nullable lw h() {
        return ly.j;
    }

    @Override
    protected void a(dwp $$0, is $$1, eoh $$2) {
        this.a($$0, $$1);
    }

    @Override
    public int b(dwr $$0) {
        return fle.d($$0) ? 4 : 2;
    }

    @Override
    public eoh b(flb $$0) {
        return (eoh)dzs.K.m().b(eeo.b, fle.e($$0));
    }

    @Override
    public boolean a(fla $$0) {
        return $$0 == flc.e || $$0 == flc.d;
    }

    @Override
    public int c(dwr $$0) {
        return fle.d($$0) ? 1 : 2;
    }

    @Override
    public boolean a(flb $$0, dvt $$1, is $$2, fla $$3, iz $$4) {
        return $$0.a($$1, $$2) >= 0.44444445f && $$3.a(bdv.a);
    }

    @Override
    public int a(dwr $$0) {
        return fle.d($$0) ? 10 : 30;
    }

    @Override
    public int a(dwo $$0, is $$1, flb $$2, flb $$3) {
        int $$4 = this.a($$0);
        if (!($$2.c() || $$3.c() || $$2.c(a).booleanValue() || $$3.c(a).booleanValue() || !($$3.a($$0, $$1) > $$2.a($$0, $$1)) || $$0.G_().a(4) == 0)) {
            $$4 *= 4;
        }
        return $$4;
    }

    private void a(dwp $$0, is $$1) {
        $$0.c(1501, $$1, 0);
    }

    @Override
    protected boolean a(axf $$0) {
        return $$0.U().a(eua.t);
    }

    @Override
    protected void a(dwp $$0, is $$1, eoh $$2, iz $$3, flb $$4) {
        if ($$3 == iz.a) {
            flb $$5 = $$0.b_($$1);
            if (this.a(bdv.b) && $$5.a(bdv.a)) {
                if ($$2.b() instanceof eeo) {
                    $$0.a($$1, dzs.b.m(), 3);
                }
                this.a($$0, $$1);
                return;
            }
        }
        super.a($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    protected boolean i() {
        return true;
    }

    @Override
    protected float c() {
        return 100.0f;
    }

    @Override
    public Optional<bcz> j() {
        return Optional.of(bda.dy);
    }

    private static boolean d(dwr $$0) {
        return $$0.ad().a(ceg.F);
    }

    public static class a
    extends fle {
        @Override
        protected void a(eoi.a<fla, flb> $$0) {
            super.a($$0);
            $$0.a(new epk[]{b});
        }

        @Override
        public int d(flb $$0) {
            return $$0.c(b);
        }

        @Override
        public boolean c(flb $$0) {
            return false;
        }
    }

    public static class b
    extends fle {
        @Override
        public int d(flb $$0) {
            return 8;
        }

        @Override
        public boolean c(flb $$0) {
            return true;
        }
    }
}

