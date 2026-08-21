/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Dynamic
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import org.jspecify.annotations.Nullable;

public class cvq
extends cth {
    protected static final ImmutableList<cse<? extends csd<? super cvq>>> cv = ImmutableList.of(cse.c, cse.f, cse.u, cse.s, cse.v);
    protected static final ImmutableList<cqw<?>> cw = ImmutableList.of(cqw.o, cqw.g, cqw.h, cqw.n, cqw.F, cqw.u, cqw.s, cqw.T, cqw.U, cqw.p, cqw.P, cqw.Q, (Object[])new cqw[]{cqw.S, cqw.y, cqw.z, cqw.C, cqw.Y, cqw.Z, cqw.aa, cqw.ab});
    private static final alw<jd<cvs>> cC = ama.a(cvq.class, aly.B);
    private static final alw<OptionalInt> cD = ama.a(cvq.class, aly.u);
    private static final int cE = 5;
    private static final amt<cvs> cF = cvt.a;
    public final cfz cx = new cfz();
    public final cfz cz = new cfz();
    public final cfz cA = new cfz();
    public final cfz cB = new cfz();

    public cvq(cgu<? extends cth> $$0, dwo $$1) {
        super($$0, $$1);
        this.co = new a(this);
        this.a(fls.j, 4.0f);
        this.a(fls.e, -1.0f);
        this.cp = new cns(this, 85, 10, 0.02f, 0.1f, true);
    }

    protected cim.b<cvq> ew() {
        return cim.a(cw, cv);
    }

    @Override
    protected cim<?> a(Dynamic<?> $$0) {
        return cvr.a(this.ew().a($$0));
    }

    public cim<cvq> ev() {
        return super.ev();
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        jq<cvs> $$1 = this.eo().f(mj.bh);
        $$0.a(cC, dfw.a(this.eo(), cF));
        $$0.a(cD, OptionalInt.empty());
    }

    public void p() {
        this.az.a(cD, OptionalInt.empty());
    }

    public Optional<cgk> gP() {
        return this.az.a(cD).stream().mapToObj(this.ao()::a).filter(Objects::nonNull).findFirst();
    }

    public void H(cgk $$0) {
        this.az.a(cD, OptionalInt.of($$0.aA()));
    }

    @Override
    public int ai() {
        return 35;
    }

    @Override
    public int ae() {
        return 5;
    }

    public jd<cvs> gQ() {
        return this.az.a(cC);
    }

    private void b(jd<cvs> $$0) {
        this.az.a(cC, $$0);
    }

    @Override
    public <T> @Nullable T a(kh<? extends T> $$0) {
        if ($$0 == ki.aS) {
            return cvq.c($$0, this.gQ());
        }
        return super.a($$0);
    }

    @Override
    protected void a(kd $$0) {
        this.a($$0, ki.aS);
        super.a($$0);
    }

    @Override
    protected <T> boolean b(kh<T> $$0, T $$1) {
        if ($$0 == ki.aS) {
            this.b(cvq.c(ki.aS, $$1));
            return true;
        }
        return super.b($$0, $$1);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        dfw.a($$0, this.gQ());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        dfw.a($$0, mj.bh).ifPresent(this::b);
    }

    @Override
    protected void a(axf $$0) {
        bzm $$1 = bzl.a();
        $$1.a("frogBrain");
        this.ev().a($$0, this);
        $$1.c();
        $$1.a("frogActivityUpdate");
        cvr.a(this);
        $$1.c();
        super.a($$0);
    }

    @Override
    public void g() {
        if (this.ao().B_()) {
            this.cB.a(this.by() && !this.bB.d(), this.at);
        }
        super.g();
    }

    @Override
    public void a(alw<?> $$0) {
        if (aE.equals($$0)) {
            chx $$1 = this.aF();
            if ($$1 == chx.g) {
                this.cx.a(this.at);
            } else {
                this.cx.a();
            }
            if ($$1 == chx.i) {
                this.cz.a(this.at);
            } else {
                this.cz.a();
            }
            if ($$1 == chx.j) {
                this.cA.a(this.at);
            } else {
                this.cA.a();
            }
        }
        super.a($$0);
    }

    @Override
    protected void B(float $$0) {
        float $$2;
        if (this.cx.b()) {
            float $$1 = 0.0f;
        } else {
            $$2 = Math.min($$0 * 25.0f, 1.0f);
        }
        this.bB.a($$2, 0.4f, this.e_() ? 3.0f : 1.0f);
    }

    @Override
    public void gX() {
        this.ao().a(null, this, bda.lB, bdb.g, 2.0f, 1.0f);
    }

    @Override
    public @Nullable cfy a(axf $$0, cfy $$1) {
        cvq $$2 = cgu.af.a($$0, cgt.e);
        if ($$2 != null) {
            cvr.a($$2, $$0.G_());
        }
        return $$2;
    }

    @Override
    public boolean e_() {
        return false;
    }

    @Override
    public void a_(boolean $$0) {
    }

    @Override
    public void a(axf $$0, cth $$1) {
        this.a($$0, $$1, null);
        this.ev().a(cqw.Z, bhr.a);
    }

    @Override
    public cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        dfw.a(dft.a($$0, this.dK()), mj.bh).ifPresent(this::b);
        cvr.a(this, $$0.G_());
        return super.a($$0, $$1, $$2, $$3);
    }

    public static cir.a gR() {
        return cth.gW().a(cis.x, 1.0).a(cis.u, 10.0).a(cis.d, 10.0).a(cis.D, 1.0);
    }

    @Override
    protected @Nullable bcz W() {
        return bda.lz;
    }

    @Override
    protected @Nullable bcz h(cex $$0) {
        return bda.lC;
    }

    @Override
    protected @Nullable bcz fd() {
        return bda.lA;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        this.a(bda.lF, 0.15f, 1.0f);
    }

    @Override
    public boolean db() {
        return false;
    }

    @Override
    protected int a(double $$0, float $$1) {
        return super.a($$0, $$1) - 5;
    }

    @Override
    protected void a(ftm $$0, double $$1, boolean $$2, double $$3) {
        this.a(this.fM(), $$0);
        this.a(chp.a, this.dN());
        this.k(this.dN().c(0.9));
    }

    public static boolean i(chl $$0) {
        dag $$1;
        if ($$0 instanceof dag && ($$1 = (dag)$$0).gR() != 1) {
            return false;
        }
        return $$0.ay().a(bdt.o);
    }

    @Override
    protected cre b(dwo $$0) {
        return new c(this, $$0);
    }

    @Override
    public @Nullable chl ag_() {
        return this.Q();
    }

    @Override
    public boolean j(dlt $$0) {
        return $$0.a(bdy.aT);
    }

    public static boolean c(cgu<? extends cth> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        return $$1.a_($$3.e()).a(bdp.cv) && cvq.a($$1, $$3);
    }

    class a
    extends cnp {
        a(chn $$0) {
            super($$0);
        }

        @Override
        protected boolean c() {
            return cvq.this.gP().isEmpty();
        }
    }

    static class c
    extends crb {
        c(cvq $$0, dwo $$1) {
            super($$0, $$1);
        }

        @Override
        public boolean b(fls $$0) {
            return $$0 != fls.k && super.b($$0);
        }

        @Override
        protected flr a(int $$0) {
            this.o = new b(true);
            return new flr(this.o, $$0);
        }
    }

    static class b
    extends flk {
        private final is.a a = new is.a();

        public b(boolean $$0) {
            super($$0);
        }

        @Override
        public fln a() {
            if (!this.c.by()) {
                return super.a();
            }
            return this.c(new is(bgj.c(this.c.dj().a), bgj.c(this.c.dj().b), bgj.c(this.c.dj().c)));
        }

        @Override
        public fls a(flu $$0, int $$1, int $$2, int $$3) {
            this.a.d($$1, $$2 - 1, $$3);
            eoh $$4 = $$0.a(this.a);
            if ($$4.a(bdp.cg)) {
                return fls.b;
            }
            return super.a($$0, $$1, $$2, $$3);
        }
    }
}

