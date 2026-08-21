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
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class egb
extends dzq {
    public static final MapCodec<egb> a = egb.b(egb::new);
    public static final epf<epm> b = eox.ae;
    public static final epf<epm> c = eox.ad;
    public static final epf<epm> d = eox.af;
    public static final epf<epm> e = eox.ag;
    public static final eph f = eox.aX;
    public static final Map<iz, epf<epm>> g = ImmutableMap.copyOf((Map)Maps.newEnumMap(Map.of(iz.c, b, iz.f, c, iz.d, d, iz.e, e)));
    private static final int[] h = bhs.a(new int[16], (? super T $$0) -> {
        for (int $$1 = 0; $$1 <= 15; ++$$1) {
            float $$2;
            float $$3 = $$2 * 0.6f + (($$2 = (float)$$1 / 15.0f) > 0.0f ? 0.4f : 0.3f);
            float $$4 = bgj.a($$2 * $$2 * 0.7f - 0.5f, 0.0f, 1.0f);
            float $$5 = bgj.a($$2 * $$2 * 0.6f - 0.7f, 0.0f, 1.0f);
            $$0[$$1] = bel.a(1.0f, $$3, $$4, $$5);
        }
    });
    private static final float i = 0.2f;
    private final Function<eoh, fug> D;
    private final eoh R;
    private final fml S = new fme(this);
    private boolean T = true;

    public MapCodec<egb> a() {
        return a;
    }

    public egb(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)((eoh)((eoh)((eoh)this.C.b()).b(b, epm.c)).b(c, epm.c)).b(d, epm.c)).b(e, epm.c)).b(f, 0));
        this.D = this.b();
        this.R = (eoh)((eoh)((eoh)((eoh)this.m().b(b, epm.b)).b(c, epm.b)).b(d, epm.b)).b(e, epm.b);
    }

    private Function<eoh, fug> b() {
        boolean $$0 = true;
        int $$1 = 10;
        fug $$2 = dzq.b(10.0, 0.0, 1.0);
        Map<iz, fug> $$32 = fud.c(dzq.a(10.0, 0.0, 1.0, 0.0, 8.0));
        Map<iz, fug> $$4 = fud.c(dzq.b(10.0, 16.0, 0.0, 1.0));
        return this.a((eoh $$3) -> {
            fug $$4 = $$2;
            for (Map.Entry<iz, epf<epm>> $$5 : g.entrySet()) {
                $$4 = switch ((epm)$$3.c($$5.getValue())) {
                    default -> throw new MatchException(null, null);
                    case epm.a -> fud.a($$4, (fug)$$32.get($$5.getKey()), (fug)$$4.get($$5.getKey()));
                    case epm.b -> fud.a($$4, (fug)$$32.get($$5.getKey()));
                    case epm.c -> $$4;
                };
            }
            return $$4;
        }, f);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return this.D.apply($$0);
    }

    @Override
    public eoh a(dpu $$0) {
        return this.a((dvt)$$0.q(), this.R, $$0.a());
    }

    private eoh a(dvt $$0, eoh $$1, is $$2) {
        boolean $$9;
        boolean $$3 = egb.s($$1);
        $$1 = this.b($$0, (eoh)this.m().b(f, $$1.c(f)), $$2);
        if ($$3 && egb.s($$1)) {
            return $$1;
        }
        boolean $$4 = $$1.c(b).a();
        boolean $$5 = $$1.c(d).a();
        boolean $$6 = $$1.c(c).a();
        boolean $$7 = $$1.c(e).a();
        boolean $$8 = !$$4 && !$$5;
        boolean bl2 = $$9 = !$$6 && !$$7;
        if (!$$7 && $$8) {
            $$1 = (eoh)$$1.b(e, epm.b);
        }
        if (!$$6 && $$8) {
            $$1 = (eoh)$$1.b(c, epm.b);
        }
        if (!$$4 && $$9) {
            $$1 = (eoh)$$1.b(b, epm.b);
        }
        if (!$$5 && $$9) {
            $$1 = (eoh)$$1.b(d, epm.b);
        }
        return $$1;
    }

    private eoh b(dvt $$0, eoh $$1, is $$2) {
        boolean $$3 = !$$0.a_($$2.d()).d($$0, $$2);
        for (iz $$4 : iz.c.a) {
            if (((epm)$$1.c(g.get($$4))).a()) continue;
            epm $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = (eoh)$$1.b(g.get($$4), $$5);
        }
        return $$1;
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4 == iz.a) {
            if (!this.a((dvt)$$1, $$5, $$6)) {
                return dzs.a.m();
            }
            return $$0;
        }
        if ($$4 == iz.b) {
            return this.a((dvt)$$1, $$0, $$3);
        }
        epm $$8 = this.a((dvt)$$1, $$3, $$4);
        if ($$8.a() == ((epm)$$0.c(g.get($$4))).a() && !egb.r($$0)) {
            return (eoh)$$0.b(g.get($$4), $$8);
        }
        return this.a((dvt)$$1, (eoh)((eoh)this.R.b(f, $$0.c(f))).b(g.get($$4), $$8), $$3);
    }

    private static boolean r(eoh $$0) {
        return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
    }

    private static boolean s(eoh $$0) {
        return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
    }

    @Override
    protected void a(eoh $$0, dwp $$1, is $$2, @dzq.b int $$3, int $$4) {
        is.a $$5 = new is.a();
        for (iz $$6 : iz.c.a) {
            epm $$7 = (epm)$$0.c(g.get($$6));
            if ($$7 == epm.c || $$1.a_($$5.a((jy)$$2, $$6)).a(this)) continue;
            $$5.c(iz.a);
            eoh $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
                is $$9 = $$5.a($$6.g());
                $$1.a($$6.g(), (is)$$5, $$9, $$1.a_($$9), $$3, $$4);
            }
            $$5.a((jy)$$2, $$6).c(iz.b);
            eoh $$10 = $$1.a_($$5);
            if (!$$10.a(this)) continue;
            is $$11 = $$5.a($$6.g());
            $$1.a($$6.g(), (is)$$5, $$11, $$1.a_($$11), $$3, $$4);
        }
    }

    private epm a(dvt $$0, is $$1, iz $$2) {
        return this.a($$0, $$1, $$2, !$$0.a_($$1.d()).d($$0, $$1));
    }

    private epm a(dvt $$0, is $$1, iz $$2, boolean $$3) {
        is $$4 = $$1.a($$2);
        eoh $$5 = $$0.a_($$4);
        if ($$3) {
            boolean $$6;
            boolean bl2 = $$6 = $$5.b() instanceof eiw || this.a($$0, $$4, $$5);
            if ($$6 && egb.p($$0.a_($$4.d()))) {
                if ($$5.c($$0, $$4, $$2.g())) {
                    return epm.a;
                }
                return epm.b;
            }
        }
        if (egb.a($$5, $$2) || !$$5.d($$0, $$4) && egb.p($$0.a_($$4.e()))) {
            return epm.b;
        }
        return epm.c;
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        is $$3 = $$2.e();
        eoh $$4 = $$1.a_($$3);
        return this.a((dvt)$$1, $$3, $$4);
    }

    private boolean a(dvt $$0, is $$1, eoh $$2) {
        return $$2.c($$0, $$1, iz.b) || $$2.a(dzs.hT);
    }

    private void a(dwo $$0, is $$1, eoh $$2, @Nullable fmj $$3, boolean $$4) {
        if (egb.a($$0)) {
            new fmg(this).a($$0, $$1, $$2, $$3, $$4);
        } else {
            this.S.a($$0, $$1, $$2, $$3, $$4);
        }
    }

    public int a(dwo $$0, is $$1) {
        this.T = false;
        int $$2 = $$0.J($$1);
        this.T = true;
        return $$2;
    }

    private void b(dwo $$0, is $$1) {
        if (!$$0.a_($$1).a(this)) {
            return;
        }
        $$0.a($$1, this);
        for (iz $$2 : iz.values()) {
            $$0.a($$1.a($$2), this);
        }
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        if ($$3.a($$0.b()) || $$1.B_()) {
            return;
        }
        this.a($$1, $$2, $$0, null, true);
        for (iz $$5 : iz.c.b) {
            $$1.a($$2.a($$5), this);
        }
        this.c($$1, $$2);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, boolean $$3) {
        if ($$3) {
            return;
        }
        for (iz $$4 : iz.values()) {
            $$1.a($$2.a($$4), this);
        }
        this.a((dwo)$$1, $$2, $$0, null, false);
        this.c($$1, $$2);
    }

    private void c(dwo $$0, is $$1) {
        for (iz $$2 : iz.c.a) {
            this.b($$0, $$1.a($$2));
        }
        for (iz $$3 : iz.c.a) {
            is $$4 = $$1.a($$3);
            if ($$0.a_($$4).d($$0, $$4)) {
                this.b($$0, $$4.d());
                continue;
            }
            this.b($$0, $$4.e());
        }
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3, @Nullable fmj $$4, boolean $$5) {
        if ($$1.B_()) {
            return;
        }
        if ($$3 == this && egb.a($$1)) {
            return;
        }
        if ($$0.a((dwr)$$1, $$2)) {
            this.a($$1, $$2, $$0, $$4, false);
        } else {
            egb.b($$0, $$1, $$2);
            $$1.a($$2, false);
        }
    }

    private static boolean a(dwo $$0) {
        return $$0.Q().b(dhb.c);
    }

    @Override
    protected int b(eoh $$0, dvt $$1, is $$2, iz $$3) {
        if (!this.T) {
            return 0;
        }
        return $$0.a($$1, $$2, $$3);
    }

    @Override
    protected int a(eoh $$0, dvt $$1, is $$2, iz $$3) {
        if (!this.T || $$3 == iz.a) {
            return 0;
        }
        int $$4 = $$0.c(f);
        if ($$4 == 0) {
            return 0;
        }
        if ($$3 == iz.b || ((epm)this.a($$1, $$0, $$2).c(g.get($$3.g()))).a()) {
            return $$4;
        }
        return 0;
    }

    protected static boolean p(eoh $$0) {
        return egb.a($$0, null);
    }

    protected static boolean a(eoh $$0, @Nullable iz $$1) {
        if ($$0.a(dzs.cT)) {
            return true;
        }
        if ($$0.a(dzs.eM)) {
            iz $$2 = (iz)$$0.c(egg.f);
            return $$2 == $$1 || $$2.g() == $$1;
        }
        if ($$0.a(dzs.lK)) {
            return $$1 == $$0.c(efk.a);
        }
        return $$0.p() && $$1 != null;
    }

    @Override
    protected boolean f_(eoh $$0) {
        return this.T;
    }

    public static int b(int $$0) {
        return h[$$0];
    }

    private static void a(dwo $$0, bgr $$1, is $$2, int $$3, iz $$4, iz $$5, float $$6, float $$7) {
        float $$8 = $$7 - $$6;
        if ($$1.i() >= 0.2f * $$8) {
            return;
        }
        float $$9 = 0.4375f;
        float $$10 = $$6 + $$8 * $$1.i();
        double $$11 = 0.5 + (double)(0.4375f * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
        double $$12 = 0.5 + (double)(0.4375f * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
        double $$13 = 0.5 + (double)(0.4375f * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
        $$0.a(new ls($$3, 1.0f), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        int $$4 = $$0.c(f);
        if ($$4 == 0) {
            return;
        }
        block4: for (iz $$5 : iz.c.a) {
            epm $$6 = (epm)$$0.c(g.get($$5));
            switch ($$6) {
                case a: {
                    egb.a($$1, $$3, $$2, h[$$4], $$5, iz.b, -0.5f, 0.5f);
                }
                case b: {
                    egb.a($$1, $$3, $$2, h[$$4], iz.a, $$5, 0.0f, 0.5f);
                    continue block4;
                }
            }
            egb.a($$1, $$3, $$2, h[$$4], iz.a, $$5, 0.0f, 0.3f);
        }
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        switch ($$1) {
            case c: {
                return (eoh)((eoh)((eoh)((eoh)$$0.b(b, $$0.c(d))).b(c, $$0.c(e))).b(d, $$0.c(b))).b(e, $$0.c(c));
            }
            case d: {
                return (eoh)((eoh)((eoh)((eoh)$$0.b(b, $$0.c(c))).b(c, $$0.c(d))).b(d, $$0.c(e))).b(e, $$0.c(b));
            }
            case b: {
                return (eoh)((eoh)((eoh)((eoh)$$0.b(b, $$0.c(e))).b(c, $$0.c(b))).b(d, $$0.c(c))).b(e, $$0.c(d));
            }
        }
        return $$0;
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        switch ($$1) {
            case b: {
                return (eoh)((eoh)$$0.b(b, $$0.c(d))).b(d, $$0.c(b));
            }
            case c: {
                return (eoh)((eoh)$$0.b(c, $$0.c(e))).b(e, $$0.c(c));
            }
        }
        return super.a($$0, $$1);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, c, d, e, f);
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        if (!$$3.gL().e) {
            return cdc.e;
        }
        if (egb.r($$0) || egb.s($$0)) {
            eoh $$5 = egb.r($$0) ? this.m() : this.R;
            $$5 = (eoh)$$5.b(f, $$0.c(f));
            if (($$5 = this.a((dvt)$$1, $$5, $$2)) != $$0) {
                $$1.a($$2, $$5, 3);
                this.a($$1, $$2, $$0, $$5);
                return cdc.a;
            }
        }
        return cdc.e;
    }

    private void a(dwo $$0, is $$1, eoh $$2, eoh $$3) {
        fmj $$4 = fmf.a($$0, null, iz.b);
        for (iz $$5 : iz.c.a) {
            is $$6 = $$1.a($$5);
            if (((epm)$$2.c(g.get($$5))).a() == ((epm)$$3.c(g.get($$5))).a() || !$$0.a_($$6).d($$0, $$6)) continue;
            $$0.a($$6, $$3.b(), $$5.g(), fmf.a($$4, $$5));
        }
    }
}

