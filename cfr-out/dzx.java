/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class dzx
extends dzq
implements dzy {
    public static final MapCodec<dzx> a = dzx.b(dzx::new);
    public static final eoy b = eox.h;
    private static final int c = 5;

    public MapCodec<dzx> a() {
        return a;
    }

    public dzx(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(b, true));
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, cgk $$3, chc $$4, boolean $$5) {
        if ($$5) {
            boolean $$7;
            eoh $$6 = $$1.a_($$2.d());
            boolean bl2 = $$7 = $$6.g($$1, $$2).c() && $$6.y().c();
            if ($$7) {
                $$3.a((boolean)$$0.c(b), $$2);
            } else {
                $$3.m($$0.c(b));
            }
        }
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        dzx.a((dwp)$$1, $$2, $$0, $$1.a_($$2.e()));
    }

    @Override
    protected flb b_(eoh $$0) {
        return flc.c.a(false);
    }

    public static void b(dwp $$0, is $$1, eoh $$2) {
        dzx.a($$0, $$1, $$0.a_($$1), $$2);
    }

    public static void a(dwp $$0, is $$1, eoh $$2, eoh $$3) {
        if (!dzx.p($$2)) {
            return;
        }
        eoh $$4 = dzx.r($$3);
        $$0.a($$1, $$4, 2);
        is.a $$5 = $$1.k().c(iz.b);
        while (dzx.p($$0.a_($$5))) {
            if (!$$0.a((is)$$5, $$4, 2)) {
                return;
            }
            $$5.c(iz.b);
        }
    }

    private static boolean p(eoh $$0) {
        return $$0.a(dzs.oa) || $$0.a(dzs.J) && $$0.y().e() >= 8 && $$0.y().b();
    }

    private static eoh r(eoh $$0) {
        if ($$0.a(dzs.oa)) {
            return $$0;
        }
        if ($$0.a(dzs.ez)) {
            return (eoh)dzs.oa.m().b(b, false);
        }
        if ($$0.a(dzs.lF)) {
            return (eoh)dzs.oa.m().b(b, true);
        }
        return dzs.J.m();
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        double $$4 = $$2.u();
        double $$5 = $$2.v();
        double $$6 = $$2.w();
        if ($$0.c(b).booleanValue()) {
            $$1.b(ly.at, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
            if ($$3.a(200) == 0) {
                $$1.a($$4, $$5, $$6, bda.dm, bdb.e, 0.2f + $$3.i() * 0.2f, 0.9f + $$3.i() * 0.15f, false);
            }
        } else {
            $$1.b(ly.au, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
            $$1.b(ly.au, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
            if ($$3.a(200) == 0) {
                $$1.a($$4, $$5, $$6, bda.dk, bdb.e, 0.2f + $$3.i() * 0.2f, 0.9f + $$3.i() * 0.15f, false);
            }
        }
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        $$2.a($$3, flc.c, flc.c.a($$1));
        if (!$$0.a($$1, $$3) || $$4 == iz.a || $$4 == iz.b && !$$6.a(dzs.oa) && dzx.p($$6)) {
            $$2.a($$3, this, 5);
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        eoh $$3 = $$1.a_($$2.e());
        return $$3.a(dzs.oa) || $$3.a(dzs.lF) || $$3.a(dzs.ez);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return fud.a();
    }

    @Override
    protected egf a_(eoh $$0) {
        return egf.a;
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
    }

    @Override
    public dlt a(@Nullable chl $$0, dwp $$1, is $$2, eoh $$3) {
        $$1.a($$2, dzs.a.m(), 11);
        return new dlt(dlx.sl);
    }

    @Override
    public Optional<bcz> au_() {
        return flc.c.j();
    }
}

