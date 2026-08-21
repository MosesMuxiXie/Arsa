/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.google.common.collect.UnmodifiableIterator
 *  com.mojang.datafixers.util.Pair
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public abstract class dgi
extends dga {
    private static final ftm e = new ftm(0.0, 0.0, 0.0);
    private static final alw<Optional<eoh>> f = ama.a(dgi.class, aly.j);
    private static final alw<Integer> g = ama.a(dgi.class, aly.b);
    private static final ImmutableMap<chx, ImmutableList<Integer>> h = ImmutableMap.of((Object)chx.a, (Object)ImmutableList.of((Object)0, (Object)1, (Object)-1), (Object)chx.f, (Object)ImmutableList.of((Object)0, (Object)1, (Object)-1), (Object)chx.d, (Object)ImmutableList.of((Object)0, (Object)1));
    protected static final float d = 0.95f;
    private static final boolean i = false;
    private boolean j;
    private boolean k = false;
    private final dgl l;
    private static final Map<epl, Pair<jy, jy>> m = Maps.newEnumMap((Map)((Map)bhs.a(() -> {
        jy $$0 = iz.e.q();
        jy $$1 = iz.f.q();
        jy $$2 = iz.c.q();
        jy $$3 = iz.d.q();
        jy $$4 = $$0.p();
        jy $$5 = $$1.p();
        jy $$6 = $$2.p();
        jy $$7 = $$3.p();
        return ImmutableMap.of((Object)epl.a, (Object)Pair.of((Object)$$2, (Object)$$3), (Object)epl.b, (Object)Pair.of((Object)$$0, (Object)$$1), (Object)epl.c, (Object)Pair.of((Object)$$4, (Object)$$1), (Object)epl.d, (Object)Pair.of((Object)$$0, (Object)$$5), (Object)epl.e, (Object)Pair.of((Object)$$2, (Object)$$7), (Object)epl.f, (Object)Pair.of((Object)$$6, (Object)$$3), (Object)epl.g, (Object)Pair.of((Object)$$3, (Object)$$1), (Object)epl.h, (Object)Pair.of((Object)$$3, (Object)$$0), (Object)epl.i, (Object)Pair.of((Object)$$2, (Object)$$0), (Object)epl.j, (Object)Pair.of((Object)$$2, (Object)$$1));
    })));

    protected dgi(cgu<?> $$0, dwo $$1) {
        super($$0, $$1);
        this.W = true;
        this.l = dgi.b($$1) ? new dgs(this) : new dgt(this);
    }

    protected dgi(cgu<?> $$0, dwo $$1, double $$2, double $$3, double $$4) {
        this($$0, $$1);
        this.o($$2, $$3, $$4);
    }

    public void o(double $$0, double $$1, double $$2) {
        this.a_($$0, $$1, $$2);
        this.Y = $$0;
        this.Z = $$1;
        this.aa = $$2;
    }

    public static <T extends dgi> @Nullable T a(dwo $$0, double $$1, double $$2, double $$3, cgu<T> $$4, cgt $$5, dlt $$6, @Nullable ddm $$7) {
        dgi $$8 = (dgi)$$4.a($$0, $$5);
        if ($$8 != null) {
            $$8.o($$1, $$2, $$3);
            cgu.a($$0, $$6, $$7).accept($$8);
            dgl dgl2 = $$8.q();
            if (dgl2 instanceof dgs) {
                dgs $$9 = (dgs)dgl2;
                is $$10 = $$8.s();
                eoh $$11 = $$0.a_($$10);
                $$9.a($$10, $$11, true);
            }
        }
        return (T)$$8;
    }

    public dgl q() {
        return this.l;
    }

    @Override
    protected cgk.d bv() {
        return cgk.d.c;
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(f, Optional.empty());
        $$0.a(g, this.y());
    }

    @Override
    public boolean i(cgk $$0) {
        return dgb.a((cgk)this, $$0);
    }

    @Override
    public boolean bY() {
        return true;
    }

    @Override
    public ftm a(iz.a $$0, ber.a $$1) {
        return chl.n(super.a($$0, $$1));
    }

    @Override
    protected ftm a(cgk $$0, cgn $$1, float $$2) {
        boolean $$3;
        boolean bl2 = $$3 = $$0 instanceof dcx || $$0 instanceof dde;
        if ($$3) {
            return e;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public ftm b(chl $$02) {
        iz $$1 = this.dh();
        if ($$1.o() == iz.a.b) {
            return super.b($$02);
        }
        int[][] $$2 = dfz.a($$1);
        is $$3 = this.dK();
        is.a $$4 = new is.a();
        ImmutableList<chx> $$5 = $$02.go();
        for (chx $$6 : $$5) {
            cgn $$7 = $$02.a($$6);
            float $$8 = Math.min($$7.a(), 1.0f) / 2.0f;
            UnmodifiableIterator unmodifiableIterator = ((ImmutableList)h.get((Object)$$6)).iterator();
            while (unmodifiableIterator.hasNext()) {
                int $$9 = (Integer)unmodifiableIterator.next();
                for (int[] $$10 : $$2) {
                    $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                    double $$11 = this.ao().a(dfz.a((dvt)this.ao(), (is)$$4), () -> dfz.a((dvt)this.ao(), $$4.e()));
                    if (!dfz.a($$11)) continue;
                    fth $$12 = new fth(-$$8, 0.0, -$$8, $$8, $$7.b(), $$8);
                    ftm $$13 = ftm.a($$4, $$11);
                    if (!dfz.a(this.ao(), $$02, $$12.c($$13))) continue;
                    $$02.c($$6);
                    return $$13;
                }
            }
        }
        double $$14 = this.dj().e;
        $$4.b((double)$$3.u(), $$14, (double)$$3.w());
        for (chx $$15 : $$5) {
            int $$17;
            double $$18;
            double $$16 = $$02.a($$15).b();
            if (!($$14 + $$16 <= ($$18 = dfz.a($$4, $$17 = bgj.e($$14 - (double)$$4.v() + $$16), (is $$0) -> this.ao().a_((is)$$0).g(this.ao(), (is)$$0))))) continue;
            $$02.c($$15);
            break;
        }
        return super.b($$02);
    }

    @Override
    protected float bi() {
        eoh $$0 = this.ao().a_(this.dK());
        if ($$0.a(bdp.L)) {
            return 1.0f;
        }
        return super.bi();
    }

    @Override
    public void q(float $$0) {
        this.l(-this.n());
        this.d(10);
        this.a(this.f() + this.f() * 10.0f);
    }

    @Override
    public boolean bX() {
        return !this.eh();
    }

    public static Pair<jy, jy> a(epl $$0) {
        return m.get($$0);
    }

    @Override
    public iz dh() {
        return this.l.l();
    }

    @Override
    protected double bs() {
        return this.by() ? 0.005 : 0.04;
    }

    @Override
    public void g() {
        if (this.m() > 0) {
            this.d(this.m() - 1);
        }
        if (this.f() > 0.0f) {
            this.a(this.f() - 1.0f);
        }
        this.aL();
        this.aK();
        this.cn();
        this.l.b();
        this.bG();
        if (this.bN()) {
            this.aP();
            this.aQ();
            this.an *= 0.5;
        }
        this.ay = false;
    }

    public boolean r() {
        return this.ay;
    }

    public is s() {
        int $$0 = bgj.c(this.dP());
        int $$1 = bgj.c(this.dR());
        int $$2 = bgj.c(this.dV());
        if (dgi.b(this.ao())) {
            double $$3 = this.dR() - 0.1 - (double)1.0E-5f;
            if (this.ao().a_(is.a((double)$$0, $$3, (double)$$2)).a(bdp.L)) {
                $$1 = bgj.c($$3);
            }
        } else if (this.ao().a_(new is($$0, $$1 - 1, $$2)).a(bdp.L)) {
            --$$1;
        }
        return new is($$0, $$1, $$2);
    }

    protected double a(axf $$0) {
        return this.l.b($$0);
    }

    public void a(axf $$0, int $$1, int $$2, int $$3, boolean $$4) {
    }

    @Override
    public void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public void bu() {
        super.bu();
    }

    @Override
    public void aH() {
        super.aH();
    }

    @Override
    public boolean bG() {
        return super.bG();
    }

    @Override
    public ftm ag() {
        return this.l.d(super.ag());
    }

    @Override
    public chf l_() {
        return this.l.a();
    }

    @Override
    public void a(adc $$0) {
        super.a($$0);
        this.l.a(this.dN());
    }

    @Override
    public void j(ftm $$0) {
        this.l.a($$0);
    }

    protected void b(axf $$0) {
        this.l.a($$0);
    }

    protected void e(axf $$0) {
        double $$1 = this.a($$0);
        ftm $$2 = this.dN();
        this.m(bgj.a($$2.g, -$$1, $$1), $$2.h, bgj.a($$2.i, -$$1, $$1));
        if (this.aV()) {
            this.k(this.dN().c(0.5));
        }
        this.a(chp.a, this.dN());
        if (!this.aV()) {
            this.k(this.dN().c(0.95));
        }
    }

    protected double a(is $$0, epl $$1, double $$2) {
        return this.l.a($$0, $$1, $$2);
    }

    @Override
    public void a(chp $$0, ftm $$1) {
        if (dgi.b(this.ao())) {
            ftm $$2 = this.dI().e($$1);
            super.a($$0, $$1);
            boolean $$3 = this.l.d();
            if ($$3) {
                super.a($$0, $$2.d(this.dI()));
            }
            if ($$0.equals((Object)chp.c)) {
                this.j = false;
            }
        } else {
            super.a($$0, $$1);
            this.aW();
        }
    }

    @Override
    public void aW() {
        if (dgi.b(this.ao())) {
            super.aW();
        } else {
            this.a(this.dI(), this.dI());
            this.aY();
        }
    }

    @Override
    public boolean cH() {
        return this.j;
    }

    public void a(boolean $$0) {
        this.j = $$0;
    }

    public boolean u() {
        return this.k;
    }

    public void b(boolean $$0) {
        this.k = $$0;
    }

    public ftm a(is $$0) {
        eoh $$1 = this.ao().a_($$0);
        if (!$$1.a(dzs.bw) || !$$1.c(efv.d).booleanValue()) {
            return ftm.c;
        }
        epl $$2 = $$1.c(((dzf)$$1.b()).c());
        if ($$2 == epl.b) {
            if (this.b($$0.h())) {
                return new ftm(1.0, 0.0, 0.0);
            }
            if (this.b($$0.i())) {
                return new ftm(-1.0, 0.0, 0.0);
            }
        } else if ($$2 == epl.a) {
            if (this.b($$0.f())) {
                return new ftm(0.0, 0.0, 1.0);
            }
            if (this.b($$0.g())) {
                return new ftm(0.0, 0.0, -1.0);
            }
        }
        return ftm.c;
    }

    public boolean b(is $$0) {
        return this.ao().a_($$0).d(this.ao(), $$0);
    }

    protected ftm a(ftm $$0) {
        double $$1 = this.l.m();
        ftm $$2 = $$0.d($$1, 0.0, $$1);
        if (this.by()) {
            $$2 = $$2.c((double)0.95f);
        }
        return $$2;
    }

    @Override
    protected void a(fnq $$0) {
        this.a($$0.a("DisplayState", eoh.a));
        this.m($$0.a("DisplayOffset", this.y()));
        this.k = $$0.a("FlippedRotation", false);
        this.ay = $$0.a("HasTicked", false);
    }

    @Override
    protected void a(fns $$0) {
        this.B().ifPresent($$1 -> $$0.a("DisplayState", eoh.a, $$1));
        int $$12 = this.x();
        if ($$12 != this.y()) {
            $$0.a("DisplayOffset", $$12);
        }
        $$0.a("FlippedRotation", this.k);
        $$0.a("HasTicked", this.ay);
    }

    @Override
    public void h(cgk $$0) {
        double $$2;
        if (this.ao().B_()) {
            return;
        }
        if ($$0.ar || this.ar) {
            return;
        }
        if (this.z($$0)) {
            return;
        }
        double $$1 = $$0.dP() - this.dP();
        double $$3 = $$1 * $$1 + ($$2 = $$0.dV() - this.dV()) * $$2;
        if ($$3 >= (double)1.0E-4f) {
            $$3 = Math.sqrt($$3);
            $$1 /= $$3;
            $$2 /= $$3;
            double $$4 = 1.0 / $$3;
            if ($$4 > 1.0) {
                $$4 = 1.0;
            }
            $$1 *= $$4;
            $$2 *= $$4;
            $$1 *= (double)0.1f;
            $$2 *= (double)0.1f;
            $$1 *= 0.5;
            $$2 *= 0.5;
            if ($$0 instanceof dgi) {
                dgi $$5 = (dgi)$$0;
                this.a($$5, $$1, $$2);
            } else {
                this.i(-$$1, 0.0, -$$2);
                $$0.i($$1 / 4.0, 0.0, $$2 / 4.0);
            }
        }
    }

    private void a(dgi $$0, double $$1, double $$2) {
        double $$6;
        double $$5;
        if (dgi.b(this.ao())) {
            double $$3 = this.dN().g;
            double $$4 = this.dN().i;
        } else {
            $$5 = $$0.dP() - this.dP();
            $$6 = $$0.dV() - this.dV();
        }
        ftm $$7 = new ftm($$5, 0.0, $$6).d();
        ftm $$8 = new ftm(bgj.b((double)(this.ec() * ((float)Math.PI / 180))), 0.0, bgj.a((double)(this.ec() * ((float)Math.PI / 180)))).d();
        double $$9 = Math.abs($$7.b($$8));
        if ($$9 < (double)0.8f && !dgi.b(this.ao())) {
            return;
        }
        ftm $$10 = this.dN();
        ftm $$11 = $$0.dN();
        if ($$0.A() && !this.A()) {
            this.k($$10.d(0.2, 1.0, 0.2));
            this.i($$11.g - $$1, 0.0, $$11.i - $$2);
            $$0.k($$11.d(0.95, 1.0, 0.95));
        } else if (!$$0.A() && this.A()) {
            $$0.k($$11.d(0.2, 1.0, 0.2));
            $$0.i($$10.g + $$1, 0.0, $$10.i + $$2);
            this.k($$10.d(0.95, 1.0, 0.95));
        } else {
            double $$12 = ($$11.g + $$10.g) / 2.0;
            double $$13 = ($$11.i + $$10.i) / 2.0;
            this.k($$10.d(0.2, 1.0, 0.2));
            this.i($$12 - $$1, 0.0, $$13 - $$2);
            $$0.k($$11.d(0.2, 1.0, 0.2));
            $$0.i($$12 + $$1, 0.0, $$13 + $$2);
        }
    }

    public eoh v() {
        return this.B().orElseGet(this::w);
    }

    private Optional<eoh> B() {
        return this.aD().a(f);
    }

    public eoh w() {
        return dzs.a.m();
    }

    public int x() {
        return this.aD().a(g);
    }

    public int y() {
        return 6;
    }

    public void a(Optional<eoh> $$0) {
        this.aD().a(f, $$0);
    }

    public void m(int $$0) {
        this.aD().a(g, $$0);
    }

    public static boolean b(dwo $$0) {
        return $$0.Q().b(dhb.d);
    }

    @Override
    public abstract dlt dZ();

    public boolean z() {
        return false;
    }

    public boolean A() {
        return false;
    }
}

