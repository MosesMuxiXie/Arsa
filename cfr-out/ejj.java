/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.MapCodec
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;

public class ejj
extends dzq
implements ehg {
    public static final MapCodec<ejj> a = ejj.b(ejj::new);
    public static final eoy b = eox.L;
    public static final epf<epv> c = eox.Z;
    public static final epf<epv> d = eox.aa;
    public static final epf<epv> e = eox.ab;
    public static final epf<epv> f = eox.ac;
    public static final Map<iz, epf<epv>> g = ImmutableMap.copyOf((Map)Maps.newEnumMap(Map.of(iz.c, d, iz.f, c, iz.d, e, iz.e, f)));
    public static final eoy h = eox.I;
    private final Function<eoh, fug> i;
    private final Function<eoh, fug> D;
    private static final fug R = dzq.b(2.0, 0.0, 16.0);
    private static final Map<iz, fug> S = fud.c(dzq.b(2.0, 16.0, 0.0, 9.0));

    public MapCodec<ejj> a() {
        return a;
    }

    public ejj(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)((eoh)((eoh)((eoh)((eoh)this.C.b()).b(b, true)).b(d, epv.a)).b(c, epv.a)).b(e, epv.a)).b(f, epv.a)).b(h, false));
        this.i = this.a(16.0f, 14.0f);
        this.D = this.a(24.0f, 24.0f);
    }

    private Function<eoh, fug> a(float $$0, float $$1) {
        fug $$2 = dzq.b(8.0, 0.0, $$0);
        int $$32 = 6;
        Map<iz, fug> $$4 = fud.c(dzq.a(6.0, 0.0, (double)$$1, 0.0, 11.0));
        Map<iz, fug> $$5 = fud.c(dzq.a(6.0, 0.0, (double)$$0, 0.0, 11.0));
        return this.a((eoh $$3) -> {
            fug $$4 = $$3.c(b) != false ? $$2 : fud.a();
            for (Map.Entry<iz, epf<epv>> $$5 : g.entrySet()) {
                $$4 = fud.a($$4, switch ((epv)$$3.c($$5.getValue())) {
                    default -> throw new MatchException(null, null);
                    case epv.a -> fud.a();
                    case epv.b -> (fug)$$4.get($$5.getKey());
                    case epv.c -> (fug)$$5.get($$5.getKey());
                });
            }
            return $$4;
        }, h);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return this.i.apply($$0);
    }

    @Override
    protected fug b(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return this.D.apply($$0);
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }

    private boolean a(eoh $$0, boolean $$1, iz $$2) {
        dzq $$3 = $$0.b();
        boolean $$4 = $$3 instanceof ecu && ecu.a($$0, $$2);
        return $$0.a(bdp.I) || !ejj.k($$0) && $$1 || $$3 instanceof edy || $$4;
    }

    @Override
    public eoh a(dpu $$0) {
        dwo $$1 = $$0.q();
        is $$2 = $$0.a();
        flb $$3 = $$0.q().b_($$0.a());
        is $$4 = $$2.f();
        is $$5 = $$2.i();
        is $$6 = $$2.g();
        is $$7 = $$2.h();
        is $$8 = $$2.d();
        eoh $$9 = $$1.a_($$4);
        eoh $$10 = $$1.a_($$5);
        eoh $$11 = $$1.a_($$6);
        eoh $$12 = $$1.a_($$7);
        eoh $$13 = $$1.a_($$8);
        boolean $$14 = this.a($$9, $$9.c((dvt)$$1, $$4, iz.d), iz.d);
        boolean $$15 = this.a($$10, $$10.c((dvt)$$1, $$5, iz.e), iz.e);
        boolean $$16 = this.a($$11, $$11.c((dvt)$$1, $$6, iz.c), iz.c);
        boolean $$17 = this.a($$12, $$12.c((dvt)$$1, $$7, iz.f), iz.f);
        eoh $$18 = (eoh)this.m().b(h, $$3.a() == flc.c);
        return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(h).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        if ($$4 == iz.a) {
            return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
        }
        if ($$4 == iz.b) {
            return this.a($$1, $$0, $$5, $$6);
        }
        return this.a($$1, $$3, $$0, $$5, $$6, $$4);
    }

    private static boolean a(eoh $$0, epk<epv> $$1) {
        return $$0.c($$1) != epv.a;
    }

    private static boolean a(fug $$0, fug $$1) {
        return !fud.c($$1, $$0, ftq.e);
    }

    private eoh a(dwr $$0, eoh $$1, is $$2, eoh $$3) {
        boolean $$4 = ejj.a($$1, d);
        boolean $$5 = ejj.a($$1, c);
        boolean $$6 = ejj.a($$1, e);
        boolean $$7 = ejj.a($$1, f);
        return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    private eoh a(dwr $$0, is $$1, eoh $$2, is $$3, eoh $$4, iz $$5) {
        iz $$6 = $$5.g();
        boolean $$7 = $$5 == iz.c ? this.a($$4, $$4.c((dvt)$$0, $$3, $$6), $$6) : ejj.a($$2, d);
        boolean $$8 = $$5 == iz.f ? this.a($$4, $$4.c((dvt)$$0, $$3, $$6), $$6) : ejj.a($$2, c);
        boolean $$9 = $$5 == iz.d ? this.a($$4, $$4.c((dvt)$$0, $$3, $$6), $$6) : ejj.a($$2, e);
        boolean $$10 = $$5 == iz.e ? this.a($$4, $$4.c((dvt)$$0, $$3, $$6), $$6) : ejj.a($$2, f);
        is $$11 = $$1.d();
        eoh $$12 = $$0.a_($$11);
        return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
    }

    private eoh a(dwr $$0, eoh $$1, is $$2, eoh $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
        fug $$8 = $$3.g($$0, $$2).a(iz.a);
        eoh $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
        return (eoh)$$9.b(b, this.a($$9, $$3, $$8));
    }

    private boolean a(eoh $$0, eoh $$1, fug $$2) {
        boolean $$13;
        boolean $$12;
        boolean $$3;
        boolean bl2 = $$3 = $$1.b() instanceof ejj && $$1.c(b) != false;
        if ($$3) {
            return true;
        }
        epv $$4 = $$0.c(d);
        epv $$5 = $$0.c(e);
        epv $$6 = $$0.c(c);
        epv $$7 = $$0.c(f);
        boolean $$8 = $$5 == epv.a;
        boolean $$9 = $$7 == epv.a;
        boolean $$10 = $$6 == epv.a;
        boolean $$11 = $$4 == epv.a;
        boolean bl3 = $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
        if ($$12) {
            return true;
        }
        boolean bl4 = $$13 = $$4 == epv.c && $$5 == epv.c || $$6 == epv.c && $$7 == epv.c;
        if ($$13) {
            return false;
        }
        return $$1.a(bdp.bc) || ejj.a($$2, R);
    }

    private eoh a(eoh $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, fug $$5) {
        return (eoh)((eoh)((eoh)((eoh)$$0.b(d, this.a($$1, $$5, S.get(iz.c)))).b(c, this.a($$2, $$5, S.get(iz.f)))).b(e, this.a($$3, $$5, S.get(iz.d)))).b(f, this.a($$4, $$5, S.get(iz.e)));
    }

    private epv a(boolean $$0, fug $$1, fug $$2) {
        if ($$0) {
            if (ejj.a($$1, $$2)) {
                return epv.c;
            }
            return epv.b;
        }
        return epv.a;
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(h).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    protected boolean e_(eoh $$0) {
        return $$0.c(h) == false;
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, d, c, f, e, h);
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        switch ($$1) {
            case c: {
                return (eoh)((eoh)((eoh)((eoh)$$0.b(d, $$0.c(e))).b(c, $$0.c(f))).b(e, $$0.c(d))).b(f, $$0.c(c));
            }
            case d: {
                return (eoh)((eoh)((eoh)((eoh)$$0.b(d, $$0.c(c))).b(c, $$0.c(e))).b(e, $$0.c(f))).b(f, $$0.c(d));
            }
            case b: {
                return (eoh)((eoh)((eoh)((eoh)$$0.b(d, $$0.c(f))).b(c, $$0.c(d))).b(e, $$0.c(c))).b(f, $$0.c(e));
            }
        }
        return $$0;
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        switch ($$1) {
            case b: {
                return (eoh)((eoh)$$0.b(d, $$0.c(e))).b(e, $$0.c(d));
            }
            case c: {
                return (eoh)((eoh)$$0.b(c, $$0.c(f))).b(f, $$0.c(c));
            }
        }
        return super.a($$0, $$1);
    }
}

