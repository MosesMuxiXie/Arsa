/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BiConsumer;
import org.jspecify.annotations.Nullable;

public class dzm
extends dzc {
    public static final MapCodec<dzm> a = dzm.b(dzm::new);
    public static final epf<iz> b = edt.f;
    public static final epf<eov> c = eox.Y;
    public static final eoy d = eox.A;
    private static final fug f = fud.a(dzq.b(6.0, 6.0, 13.0), dzq.b(8.0, 4.0, 6.0));
    private static final fug g = fud.a(f, dzq.b(2.0, 13.0, 16.0));
    private static final Map<iz.a, fug> h = fud.a(dzq.a(16.0, 16.0, 8.0));
    private static final Map<iz.a, fug> i = fud.a(fud.a(f, dzq.a(2.0, 16.0, 13.0, 15.0)));
    private static final Map<iz, fug> D = fud.c(fud.a(f, dzq.a(2.0, 13.0, 15.0, 0.0, 13.0)));
    public static final int e = 1;

    public MapCodec<dzm> a() {
        return a;
    }

    public dzm(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)((eoh)this.C.b()).b(b, iz.c)).b(c, eov.a)).b(d, false));
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3, @Nullable fmj $$4, boolean $$5) {
        boolean $$6 = $$1.I($$2);
        if ($$6 != $$0.c(d)) {
            if ($$6) {
                this.a($$1, $$2, null);
            }
            $$1.a($$2, (eoh)$$0.b(d, $$6), 3);
        }
    }

    @Override
    protected void a(dwo $$0, eoh $$1, fti $$2, dec $$3) {
        ddm $$5;
        cgk $$4 = $$3.p();
        ddm $$6 = $$4 instanceof ddm ? ($$5 = (ddm)$$4) : null;
        this.a($$0, $$1, $$2, $$6, true);
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        return this.a($$1, $$0, $$4, $$3, true) ? cdc.a : cdc.e;
    }

    public boolean a(dwo $$0, eoh $$1, fti $$2, @Nullable ddm $$3, boolean $$4) {
        boolean $$7;
        iz $$5 = $$2.c();
        is $$6 = $$2.b();
        boolean bl2 = $$7 = !$$4 || this.a($$1, $$5, $$2.g().h - (double)$$6.v());
        if ($$7) {
            boolean $$8 = this.a($$3, $$0, $$6, $$5);
            if ($$8 && $$3 != null) {
                $$3.a(bdk.aB);
            }
            return true;
        }
        return false;
    }

    private boolean a(eoh $$0, iz $$1, double $$2) {
        if ($$1.o() == iz.a.b || $$2 > (double)0.8124f) {
            return false;
        }
        iz $$3 = $$0.c(b);
        eov $$4 = $$0.c(c);
        switch ($$4) {
            case a: {
                return $$3.o() == $$1.o();
            }
            case c: 
            case d: {
                return $$3.o() != $$1.o();
            }
            case b: {
                return true;
            }
        }
        return false;
    }

    public boolean a(dwo $$0, is $$1, @Nullable iz $$2) {
        return this.a((cgk)null, $$0, $$1, $$2);
    }

    public boolean a(@Nullable cgk $$0, dwo $$1, is $$2, @Nullable iz $$3) {
        elb $$4 = $$1.c_($$2);
        if (!$$1.B_() && $$4 instanceof ekz) {
            if ($$3 == null) {
                $$3 = $$1.a_($$2).c(b);
            }
            ((ekz)$$4).a($$3);
            $$1.a(null, $$2, bda.cl, bdb.e, 2.0f, 1.0f);
            $$1.a($$0, etk.c, $$2);
            return true;
        }
        return false;
    }

    private fug p(eoh $$0) {
        iz $$1 = $$0.c(b);
        return switch ($$0.c(c)) {
            default -> throw new MatchException(null, null);
            case eov.a -> h.get($$1.o());
            case eov.b -> g;
            case eov.c -> D.get($$1);
            case eov.d -> i.get($$1.o());
        };
    }

    @Override
    protected fug b(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return this.p($$0);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return this.p($$0);
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        iz $$1 = $$0.k();
        is $$2 = $$0.a();
        dwo $$3 = $$0.q();
        iz.a $$4 = $$1.o();
        if ($$4 == iz.a.b) {
            eoh $$5 = (eoh)((eoh)this.m().b(c, $$1 == iz.a ? eov.b : eov.a)).b(b, $$0.g());
            if ($$5.a((dwr)$$0.q(), $$2)) {
                return $$5;
            }
        } else {
            boolean $$6 = $$4 == iz.a.a && $$3.a_($$2.h()).c((dvt)$$3, $$2.h(), iz.f) && $$3.a_($$2.i()).c((dvt)$$3, $$2.i(), iz.e) || $$4 == iz.a.c && $$3.a_($$2.f()).c((dvt)$$3, $$2.f(), iz.d) && $$3.a_($$2.g()).c((dvt)$$3, $$2.g(), iz.c);
            eoh $$7 = (eoh)((eoh)this.m().b(b, $$1.g())).b(c, $$6 ? eov.d : eov.c);
            if ($$7.a((dwr)$$0.q(), $$0.a())) {
                return $$7;
            }
            boolean $$8 = $$3.a_($$2.e()).c((dvt)$$3, $$2.e(), iz.b);
            if (($$7 = (eoh)$$7.b(c, $$8 ? eov.a : eov.b)).a((dwr)$$0.q(), $$0.a())) {
                return $$7;
            }
        }
        return null;
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, dwi $$3, BiConsumer<dlt, is> $$4) {
        if ($$3.g()) {
            this.a((dwo)$$1, $$2, null);
        }
        super.a($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        eov $$8 = $$0.c(c);
        iz $$9 = dzm.r($$0).g();
        if ($$9 == $$4 && !$$0.a($$1, $$3) && $$8 != eov.d) {
            return dzs.a.m();
        }
        if ($$4.o() == $$0.c(b).o()) {
            if ($$8 == eov.d && !$$6.c((dvt)$$1, $$5, $$4)) {
                return (eoh)((eoh)$$0.b(c, eov.c)).b(b, $$4.g());
            }
            if ($$8 == eov.c && $$9.g() == $$4 && $$6.c((dvt)$$1, $$5, $$0.c(b))) {
                return (eoh)$$0.b(c, eov.d);
            }
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        iz $$3 = dzm.r($$0).g();
        if ($$3 == iz.b) {
            return dzq.a($$1, $$2.d(), iz.a);
        }
        return ecp.b($$1, $$2, $$3);
    }

    private static iz r(eoh $$0) {
        switch ($$0.c(c)) {
            case b: {
                return iz.a;
            }
            case a: {
                return iz.b;
            }
        }
        return $$0.c(b).g();
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, c, d);
    }

    @Override
    public @Nullable elb a(is $$0, eoh $$1) {
        return new ekz($$0, $$1);
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$0, eoh $$1, eld<T> $$2) {
        return dzm.a($$2, eld.F, $$0.B_() ? ekz::a : ekz::b);
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }

    @Override
    public eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(b, $$1.a($$0.c(b)));
    }

    @Override
    public eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a($$0.c(b)));
    }
}

