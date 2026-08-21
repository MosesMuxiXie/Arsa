/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.objects.Object2IntArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class dzn
extends edt
implements dzt,
ehg {
    public static final MapCodec<dzn> a = dzn.b(dzn::new);
    private static final eoy b = eox.I;
    private static final epf<epu> c = eox.bq;
    private static final int d = -1;
    private static final Object2IntMap<epu> e = (Object2IntMap)bhs.a(new Object2IntArrayMap(), (? super T $$0) -> {
        $$0.defaultReturnValue(-1);
        $$0.put((Object)epu.b, 10);
        $$0.put((Object)epu.c, 10);
        $$0.put((Object)epu.d, 100);
    });
    private static final int g = 5;
    private static final int h = 11;
    private static final int i = 13;
    private static final Map<epu, fug> D = Maps.newEnumMap(Map.of(epu.a, dzq.b(16.0, 11.0, 15.0), epu.b, dzq.b(16.0, 11.0, 15.0), epu.c, dzq.b(16.0, 11.0, 13.0), epu.d, fud.a()));
    private final Function<eoh, fug> R;

    public MapCodec<dzn> a() {
        return a;
    }

    protected dzn(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)((eoh)this.C.b()).b(b, false)).b(f, iz.c)).b(c, epu.a));
        this.R = this.q();
    }

    private Function<eoh, fug> q() {
        Map<iz, fug> $$0 = fud.c(dzq.b(6.0, 0.0, 13.0).a(0.0, 0.0, 0.25).d());
        return this.a((eoh $$1) -> fud.a(D.get($$1.c(c)), (fug)$$0.get($$1.c(f))), b);
    }

    public static void a(dwp $$0, bgr $$1, is $$2, iz $$3) {
        int $$6;
        int $$4 = bgj.a($$1, 2, 5);
        is.a $$5 = $$2.k();
        for ($$6 = 0; $$6 < $$4 && dzn.a((dwq)$$0, (is)$$5, $$0.a_($$5)); ++$$6) {
            $$5.c(iz.b);
        }
        int $$7 = $$2.v() + $$6 - 1;
        $$5.q($$2.v());
        while ($$5.v() < $$7) {
            dzo.a($$0, (is)$$5, $$0.b_($$5), $$3);
            $$5.c(iz.b);
        }
        dzn.a($$0, (is)$$5, $$0.b_($$5), $$3);
    }

    private static boolean p(eoh $$0) {
        return $$0.l() || $$0.a(dzs.J) || $$0.a(dzs.ue);
    }

    protected static boolean a(dwq $$0, is $$1, eoh $$2) {
        return !$$0.y($$1) && dzn.p($$2);
    }

    protected static boolean a(dwp $$0, is $$1, flb $$2, iz $$3) {
        eoh $$4 = (eoh)((eoh)dzs.uc.m().b(b, $$2.a(flc.c))).b(f, $$3);
        return $$0.a($$1, $$4, 3);
    }

    @Override
    protected void a(dwo $$0, eoh $$1, fti $$2, dec $$3) {
        this.a($$1, $$0, $$2.b(), epu.d, bda.jj);
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(b).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        is $$3 = $$2.e();
        eoh $$4 = $$1.a_($$3);
        return $$4.a(this) || $$4.a(dzs.ud) || $$4.a(bdp.bL);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4 == iz.a && !$$0.a($$1, $$3)) {
            return dzs.a.m();
        }
        if ($$0.c(b).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        if ($$4 == iz.b && $$6.a(this)) {
            return dzs.ud.m($$0);
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        eoh $$3 = $$0.a_($$1.d());
        return dzn.p($$3);
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        eoh $$5;
        is $$4 = $$2.d();
        if (dzn.a((dwq)$$0, $$4, $$5 = $$0.a_($$4))) {
            iz $$6 = (iz)$$3.c(f);
            dzo.a((dwp)$$0, $$2, $$3.y(), $$6);
            dzn.a((dwp)$$0, $$4, $$5.y(), $$6);
        }
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, cgk $$3, chc $$4, boolean $$5) {
        if ($$1.B_()) {
            return;
        }
        if ($$0.c(c) == epu.a && dzn.a($$2, $$3) && !$$1.I($$2)) {
            this.a($$0, $$1, $$2, epu.b, null);
        }
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if ($$1.I($$2)) {
            dzn.c($$0, $$1, $$2);
            return;
        }
        epu $$4 = $$0.c(c);
        if ($$4 == epu.b) {
            this.a($$0, (dwo)$$1, $$2, epu.c, bda.jj);
        } else if ($$4 == epu.c) {
            this.a($$0, (dwo)$$1, $$2, epu.d, bda.jj);
        } else if ($$4 == epu.d) {
            dzn.c($$0, $$1, $$2);
        }
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3, @Nullable fmj $$4, boolean $$5) {
        if ($$1.I($$2)) {
            dzn.c($$0, $$1, $$2);
        }
    }

    private static void a(dwo $$0, is $$1, bcz $$2) {
        float $$3 = bgj.b($$0.y, 0.8f, 1.2f);
        $$0.a(null, $$1, $$2, bdb.e, 1.0f, $$3);
    }

    private static boolean a(is $$0, cgk $$1) {
        return $$1.aV() && $$1.dI().h > (double)((float)$$0.v() + 0.6875f);
    }

    private void a(eoh $$0, dwo $$1, is $$2, epu $$3, @Nullable bcz $$4) {
        int $$5;
        dzn.a($$0, $$1, $$2, $$3);
        if ($$4 != null) {
            dzn.a($$1, $$2, $$4);
        }
        if (($$5 = e.getInt((Object)$$3)) != -1) {
            $$1.a($$2, (dzq)this, $$5);
        }
    }

    private static void c(eoh $$0, dwo $$1, is $$2) {
        dzn.a($$0, $$1, $$2, epu.a);
        if ($$0.c(c) != epu.a) {
            dzn.a($$1, $$2, bda.jk);
        }
    }

    private static void a(eoh $$0, dwo $$1, is $$2, epu $$3) {
        epu $$4 = $$0.c(c);
        $$1.a($$2, (eoh)$$0.b(c, $$3), 2);
        if ($$3.a() && $$3 != $$4) {
            $$1.a(null, etk.c, $$2);
        }
    }

    @Override
    protected fug b(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return D.get($$0.c(c));
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return this.R.apply($$0);
    }

    @Override
    public eoh a(dpu $$0) {
        eoh $$1 = $$0.q().a_($$0.a().e());
        flb $$2 = $$0.q().b_($$0.a());
        boolean $$3 = $$1.a(dzs.uc) || $$1.a(dzs.ud);
        return (eoh)((eoh)this.m().b(b, $$2.a(flc.c))).b(f, $$3 ? (iz)$$1.c(f) : $$0.g().g());
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, f, c);
    }
}

