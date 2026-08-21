/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class ejh
extends dzq {
    public static final MapCodec<ejh> a = ejh.b(ejh::new);
    public static final eoy b = efm.f;
    public static final eoy c = efm.b;
    public static final eoy d = efm.c;
    public static final eoy e = efm.d;
    public static final eoy f = efm.e;
    public static final Map<iz, eoy> g = efm.h.entrySet().stream().filter($$0 -> $$0.getKey() != iz.a).collect(bhs.a());
    private final Function<eoh, fug> h;

    public MapCodec<ejh> a() {
        return a;
    }

    public ejh(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)((eoh)((eoh)((eoh)this.C.b()).b(b, false)).b(c, false)).b(d, false)).b(e, false)).b(f, false));
        this.h = this.b();
    }

    private Function<eoh, fug> b() {
        Map<iz, fug> $$0 = fud.d(dzq.c(16.0, 0.0, 1.0));
        return this.a((eoh $$1) -> {
            fug $$2 = fud.a();
            for (Map.Entry<iz, eoy> $$3 : g.entrySet()) {
                if (!((Boolean)$$1.c($$3.getValue())).booleanValue()) continue;
                $$2 = fud.a($$2, (fug)$$0.get($$3.getKey()));
            }
            return $$2.c() ? fud.b() : $$2;
        });
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return this.h.apply($$0);
    }

    @Override
    protected boolean e_(eoh $$0) {
        return true;
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        return this.p(this.e($$0, $$1, $$2));
    }

    private boolean p(eoh $$0) {
        return this.r($$0) > 0;
    }

    private int r(eoh $$0) {
        int $$1 = 0;
        for (eoy $$2 : g.values()) {
            if (!$$0.c($$2).booleanValue()) continue;
            ++$$1;
        }
        return $$1;
    }

    private boolean b(dvt $$0, is $$1, iz $$2) {
        if ($$2 == iz.a) {
            return false;
        }
        is $$3 = $$1.a($$2);
        if (ejh.a($$0, $$3, $$2)) {
            return true;
        }
        if ($$2.o() != iz.a.b) {
            eoy $$4 = g.get($$2);
            eoh $$5 = $$0.a_($$1.d());
            return $$5.a(this) && $$5.c($$4) != false;
        }
        return false;
    }

    public static boolean a(dvt $$0, is $$1, iz $$2) {
        return eey.a($$0, $$2, $$1, $$0.a_($$1));
    }

    private eoh e(eoh $$0, dvt $$1, is $$2) {
        is $$3 = $$2.d();
        if ($$0.c(b).booleanValue()) {
            $$0 = (eoh)$$0.b(b, ejh.a($$1, $$3, iz.a));
        }
        eog.a $$4 = null;
        for (iz $$5 : iz.c.a) {
            eoy $$6 = ejh.a($$5);
            if (!$$0.c($$6).booleanValue()) continue;
            boolean $$7 = this.b($$1, $$2, $$5);
            if (!$$7) {
                if ($$4 == null) {
                    $$4 = $$1.a_($$3);
                }
                $$7 = $$4.a(this) && $$4.c($$6) != false;
            }
            $$0 = (eoh)$$0.b($$6, $$7);
        }
        return $$0;
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4 == iz.a) {
            return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
        }
        eoh $$8 = this.e($$0, $$1, $$3);
        if (!this.p($$8)) {
            return dzs.a.m();
        }
        return $$8;
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        eoh $$20;
        eoh $$19;
        is $$17;
        eoh $$18;
        if (!$$1.U().a(eua.ac).booleanValue()) {
            return;
        }
        if ($$3.a(4) != 0) {
            return;
        }
        iz $$4 = iz.b($$3);
        is $$5 = $$2.d();
        if ($$4.o().d() && !$$0.c(ejh.a($$4)).booleanValue()) {
            if (!this.a((dvt)$$1, $$2)) {
                return;
            }
            is $$6 = $$2.a($$4);
            eoh $$7 = $$1.a_($$6);
            if ($$7.l()) {
                iz $$8 = $$4.h();
                iz $$9 = $$4.i();
                boolean $$10 = $$0.c(ejh.a($$8));
                boolean $$11 = $$0.c(ejh.a($$9));
                is $$12 = $$6.a($$8);
                is $$13 = $$6.a($$9);
                if ($$10 && ejh.a((dvt)$$1, $$12, $$8)) {
                    $$1.a($$6, (eoh)this.m().b(ejh.a($$8), true), 2);
                } else if ($$11 && ejh.a((dvt)$$1, $$13, $$9)) {
                    $$1.a($$6, (eoh)this.m().b(ejh.a($$9), true), 2);
                } else {
                    iz $$14 = $$4.g();
                    if ($$10 && $$1.A($$12) && ejh.a((dvt)$$1, $$2.a($$8), $$14)) {
                        $$1.a($$12, (eoh)this.m().b(ejh.a($$14), true), 2);
                    } else if ($$11 && $$1.A($$13) && ejh.a((dvt)$$1, $$2.a($$9), $$14)) {
                        $$1.a($$13, (eoh)this.m().b(ejh.a($$14), true), 2);
                    } else if ((double)$$3.i() < 0.05 && ejh.a((dvt)$$1, $$6.d(), iz.b)) {
                        $$1.a($$6, (eoh)this.m().b(b, true), 2);
                    }
                }
            } else if (ejh.a((dvt)$$1, $$6, $$4)) {
                $$1.a($$2, (eoh)$$0.b(ejh.a($$4), true), 2);
            }
            return;
        }
        if ($$4 == iz.b && $$2.v() < $$1.aw()) {
            if (this.b($$1, $$2, $$4)) {
                $$1.a($$2, (eoh)$$0.b(b, true), 2);
                return;
            }
            if ($$1.A($$5)) {
                if (!this.a((dvt)$$1, $$2)) {
                    return;
                }
                eoh $$15 = $$0;
                for (iz $$16 : iz.c.a) {
                    if (!$$3.h() && ejh.a((dvt)$$1, $$5.a($$16), $$16)) continue;
                    $$15 = (eoh)$$15.b(ejh.a($$16), false);
                }
                if (this.s($$15)) {
                    $$1.a($$5, $$15, 2);
                }
                return;
            }
        }
        if ($$2.v() > $$1.K_() && (($$18 = $$1.a_($$17 = $$2.e())).l() || $$18.a(this)) && ($$19 = $$18.l() ? this.m() : $$18) != ($$20 = this.a($$0, $$19, $$3)) && this.s($$20)) {
            $$1.a($$17, $$20, 2);
        }
    }

    private eoh a(eoh $$0, eoh $$1, bgr $$2) {
        for (iz $$3 : iz.c.a) {
            eoy $$4;
            if (!$$2.h() || !$$0.c($$4 = ejh.a($$3)).booleanValue()) continue;
            $$1 = (eoh)$$1.b($$4, true);
        }
        return $$1;
    }

    private boolean s(eoh $$0) {
        return $$0.c(c) != false || $$0.c(d) != false || $$0.c(e) != false || $$0.c(f) != false;
    }

    private boolean a(dvt $$0, is $$1) {
        int $$2 = 4;
        Iterable<is> $$3 = is.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
        int $$4 = 5;
        for (is $$5 : $$3) {
            if (!$$0.a_($$5).a(this) || --$$4 > 0) continue;
            return false;
        }
        return true;
    }

    @Override
    protected boolean a(eoh $$0, dpu $$1) {
        eoh $$2 = $$1.q().a_($$1.a());
        if ($$2.a(this)) {
            return this.r($$2) < g.size();
        }
        return super.a($$0, $$1);
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        eoh $$1 = $$0.q().a_($$0.a());
        boolean $$2 = $$1.a(this);
        eoh $$3 = $$2 ? $$1 : this.m();
        for (iz $$4 : $$0.f()) {
            boolean $$6;
            if ($$4 == iz.a) continue;
            eoy $$5 = ejh.a($$4);
            boolean bl2 = $$6 = $$2 && $$1.c($$5) != false;
            if ($$6 || !this.b($$0.q(), $$0.a(), $$4)) continue;
            return (eoh)$$3.b($$5, true);
        }
        return $$2 ? $$3 : null;
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, c, d, e, f);
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        switch ($$1) {
            case c: {
                return (eoh)((eoh)((eoh)((eoh)$$0.b(c, $$0.c(e))).b(d, $$0.c(f))).b(e, $$0.c(c))).b(f, $$0.c(d));
            }
            case d: {
                return (eoh)((eoh)((eoh)((eoh)$$0.b(c, $$0.c(d))).b(d, $$0.c(e))).b(e, $$0.c(f))).b(f, $$0.c(c));
            }
            case b: {
                return (eoh)((eoh)((eoh)((eoh)$$0.b(c, $$0.c(f))).b(d, $$0.c(c))).b(e, $$0.c(d))).b(f, $$0.c(e));
            }
        }
        return $$0;
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        switch ($$1) {
            case b: {
                return (eoh)((eoh)$$0.b(c, $$0.c(e))).b(e, $$0.c(c));
            }
            case c: {
                return (eoh)((eoh)$$0.b(d, $$0.c(f))).b(f, $$0.c(d));
            }
        }
        return super.a($$0, $$1);
    }

    public static eoy a(iz $$0) {
        return g.get($$0);
    }
}

