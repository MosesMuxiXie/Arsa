/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public abstract class flh
extends fkz {
    @Override
    public fla d() {
        return flc.b;
    }

    @Override
    public fla e() {
        return flc.c;
    }

    @Override
    public dlp a() {
        return dlx.sl;
    }

    @Override
    public void a(dwo $$0, is $$1, flb $$2, bgr $$3) {
        if (!$$2.b() && !$$2.c(a).booleanValue()) {
            if ($$3.a(64) == 0) {
                $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, bda.Fu, bdb.i, $$3.i() * 0.25f + 0.75f, $$3.i() + 0.5f, false);
            }
        } else if ($$3.a(10) == 0) {
            $$0.a(ly.ap, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
        }
    }

    @Override
    public @Nullable lw h() {
        return ly.m;
    }

    @Override
    protected boolean a(axf $$0) {
        return $$0.U().a(eua.ag);
    }

    @Override
    protected void a(dwp $$0, is $$1, eoh $$2) {
        elb $$3 = $$2.x() ? $$0.c_($$1) : null;
        dzq.a($$2, $$0, $$1, $$3);
    }

    @Override
    protected void a(dwo $$0, is $$1, cgk $$2, chc $$3) {
        $$3.a(chd.e);
    }

    @Override
    public int b(dwr $$0) {
        return 4;
    }

    @Override
    public eoh b(flb $$0) {
        return (eoh)dzs.J.m().b(eeo.b, flh.e($$0));
    }

    @Override
    public boolean a(fla $$0) {
        return $$0 == flc.c || $$0 == flc.b;
    }

    @Override
    public int c(dwr $$0) {
        return 1;
    }

    @Override
    public int a(dwr $$0) {
        return 5;
    }

    @Override
    public boolean a(flb $$0, dvt $$1, is $$2, fla $$3, iz $$4) {
        return $$4 == iz.a && !$$3.a(bdv.a);
    }

    @Override
    protected float c() {
        return 100.0f;
    }

    @Override
    public Optional<bcz> j() {
        return Optional.of(bda.dv);
    }

    public static class a
    extends flh {
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
    extends flh {
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

