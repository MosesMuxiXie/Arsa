/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class eew
extends dzq
implements dzt {
    public static final MapCodec<eew> a = eew.b(eew::new);
    public static final eoy b = eox.d;
    public static final epf<epv> c = eox.aa;
    public static final epf<epv> d = eox.Z;
    public static final epf<epv> e = eox.ab;
    public static final epf<epv> f = eox.ac;
    public static final Map<iz, epf<epv>> g = ImmutableMap.copyOf((Map)Maps.newEnumMap(Map.of(iz.c, c, iz.f, d, iz.d, e, iz.e, f)));
    private final Function<eoh, fug> h;

    public MapCodec<eew> a() {
        return a;
    }

    public eew(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)((eoh)((eoh)((eoh)this.C.b()).b(b, true)).b(c, epv.a)).b(d, epv.a)).b(e, epv.a)).b(f, epv.a));
        this.h = this.b();
    }

    public Function<eoh, fug> b() {
        Map<iz, fug> $$0 = fud.c(dzq.a(16.0, 0.0, 10.0, 0.0, 1.0));
        Map<iz, fug> $$1 = fud.d(dzq.c(16.0, 0.0, 1.0));
        return this.a((eoh $$2) -> {
            fug $$3 = $$2.c(b) != false ? (fug)$$1.get(iz.a) : fud.a();
            for (Map.Entry<iz, epf<epv>> $$4 : g.entrySet()) {
                switch ((epv)$$2.c($$4.getValue())) {
                    case a: {
                        break;
                    }
                    case b: {
                        $$3 = fud.a($$3, (fug)$$0.get($$4.getKey()));
                        break;
                    }
                    case c: {
                        $$3 = fud.a($$3, (fug)$$1.get($$4.getKey()));
                    }
                }
            }
            return $$3.c() ? fud.b() : $$3;
        });
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return this.h.apply($$0);
    }

    @Override
    protected fug b(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return $$0.c(b) != false ? this.h.apply(this.m()) : fud.a();
    }

    @Override
    protected boolean e_(eoh $$0) {
        return true;
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        eoh $$3 = $$1.a_($$2.e());
        if ($$0.c(b).booleanValue()) {
            return !$$3.l();
        }
        return $$3.a(this) && $$3.c(b) != false;
    }

    private static boolean p(eoh $$0) {
        if ($$0.c(b).booleanValue()) {
            return true;
        }
        for (epf<epv> $$1 : g.values()) {
            if ($$0.c($$1) == epv.a) continue;
            return true;
        }
        return false;
    }

    private static boolean a(dvt $$0, is $$1, iz $$2) {
        if ($$2 == iz.b) {
            return false;
        }
        return eey.a($$0, $$1, $$2);
    }

    private static eoh a(eoh $$0, dvt $$1, is $$2, boolean $$3) {
        eog.a $$4 = null;
        eog.a $$5 = null;
        $$3 |= $$0.c(b).booleanValue();
        for (iz $$6 : iz.c.a) {
            epv $$8;
            epf<epv> $$7 = eew.a($$6);
            epv epv2 = eew.a($$1, $$2, $$6) ? ($$3 ? epv.b : $$0.c($$7)) : ($$8 = epv.a);
            if ($$8 == epv.b) {
                if ($$4 == null) {
                    $$4 = $$1.a_($$2.d());
                }
                if ($$4.a(dzs.uU) && $$4.c($$7) != epv.a && !$$4.c(b).booleanValue()) {
                    $$8 = epv.c;
                }
                if (!$$0.c(b).booleanValue()) {
                    if ($$5 == null) {
                        $$5 = $$1.a_($$2.e());
                    }
                    if ($$5.a(dzs.uU) && $$5.c($$7) == epv.a) {
                        $$8 = epv.a;
                    }
                }
            }
            $$0 = (eoh)$$0.b($$7, $$8);
        }
        return $$0;
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        return eew.a(this.m(), (dvt)$$0.q(), $$0.a(), true);
    }

    public static void a(dwp $$0, is $$1, bgr $$2, @dzq.b int $$3) {
        eoh $$4 = dzs.uU.m();
        eoh $$5 = eew.a($$4, (dvt)$$0, $$1, true);
        $$0.a($$1, $$5, $$3);
        eoh $$6 = eew.a((dvt)$$0, $$1, $$2::h);
        if (!$$6.l()) {
            $$0.a($$1.d(), $$6, $$3);
            eoh $$7 = eew.a($$5, (dvt)$$0, $$1, true);
            $$0.a($$1, $$7, $$3);
        }
    }

    @Override
    public void a(dwo $$0, is $$1, eoh $$2, @Nullable chl $$3, dlt $$4) {
        if ($$0.B_()) {
            return;
        }
        bgr $$5 = $$0.G_();
        eoh $$6 = eew.a((dvt)$$0, $$1, $$5::h);
        if (!$$6.l()) {
            $$0.a($$1.d(), $$6, 3);
        }
    }

    private static eoh a(dvt $$0, is $$1, BooleanSupplier $$2) {
        is $$3 = $$1.d();
        eoh $$4 = $$0.a_($$3);
        boolean $$5 = $$4.a(dzs.uU);
        if ($$5 && $$4.c(b).booleanValue() || !$$5 && !$$4.v()) {
            return dzs.a.m();
        }
        eoh $$6 = (eoh)dzs.uU.m().b(b, false);
        eoh $$7 = eew.a($$6, $$0, $$1.d(), true);
        for (iz $$8 : iz.c.a) {
            epf<epv> $$9 = eew.a($$8);
            if ($$7.c($$9) == epv.a || $$2.getAsBoolean()) continue;
            $$7 = (eoh)$$7.b($$9, epv.a);
        }
        if (eew.p($$7) && $$7 != $$4) {
            return $$7;
        }
        return dzs.a.m();
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if (!$$0.a($$1, $$3)) {
            return dzs.a.m();
        }
        eoh $$8 = eew.a($$0, $$1, $$3, false);
        if (!eew.p($$8)) {
            return dzs.a.m();
        }
        return $$8;
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, c, d, e, f);
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return switch ($$1) {
            case egm.c -> (eoh)((eoh)((eoh)((eoh)$$0.b(c, $$0.c(e))).b(d, $$0.c(f))).b(e, $$0.c(c))).b(f, $$0.c(d));
            case egm.d -> (eoh)((eoh)((eoh)((eoh)$$0.b(c, $$0.c(d))).b(d, $$0.c(e))).b(e, $$0.c(f))).b(f, $$0.c(c));
            case egm.b -> (eoh)((eoh)((eoh)((eoh)$$0.b(c, $$0.c(f))).b(d, $$0.c(c))).b(e, $$0.c(d))).b(f, $$0.c(e));
            default -> $$0;
        };
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return switch ($$1) {
            case eev.b -> (eoh)((eoh)$$0.b(c, $$0.c(e))).b(e, $$0.c(c));
            case eev.c -> (eoh)((eoh)$$0.b(d, $$0.c(f))).b(f, $$0.c(d));
            default -> super.a($$0, $$1);
        };
    }

    public static @Nullable epf<epv> a(iz $$0) {
        return g.get($$0);
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        return $$2.c(b) != false && !eew.a((dvt)$$0, $$1, () -> true).l();
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        eoh $$4 = eew.a((dvt)$$0, $$2, () -> true);
        if (!$$4.l()) {
            $$0.a($$2.d(), $$4, 3);
        }
    }
}

