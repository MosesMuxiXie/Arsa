/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class cyy
extends chl {
    public static final int a = 5;
    private static final boolean cd = true;
    public static final jv b = new jv(0.0f, 0.0f, 0.0f);
    public static final jv c = new jv(0.0f, 0.0f, 0.0f);
    public static final jv d = new jv(-10.0f, 0.0f, -10.0f);
    public static final jv e = new jv(-15.0f, 0.0f, 10.0f);
    public static final jv f = new jv(-1.0f, 0.0f, -1.0f);
    public static final jv g = new jv(1.0f, 0.0f, 1.0f);
    private static final cgn ce = cgn.c(0.0f, 0.0f);
    private static final cgn cf = cgu.h.n().a(0.5f).b(0.9875f);
    private static final double cg = 0.1;
    private static final double ch = 0.9;
    private static final double ci = 0.4;
    private static final double cj = 1.6;
    public static final int h = 8;
    public static final int i = 16;
    public static final int j = 1;
    public static final int k = 4;
    public static final int l = 8;
    public static final int m = 16;
    public static final alw<Byte> n = ama.a(cyy.class, aly.a);
    public static final alw<jv> o = ama.a(cyy.class, aly.n);
    public static final alw<jv> p = ama.a(cyy.class, aly.n);
    public static final alw<jv> q = ama.a(cyy.class, aly.n);
    public static final alw<jv> r = ama.a(cyy.class, aly.n);
    public static final alw<jv> s = ama.a(cyy.class, aly.n);
    public static final alw<jv> t = ama.a(cyy.class, aly.n);
    private static final Predicate<cgk> ck = $$0 -> {
        dgi $$1;
        return $$0 instanceof dgi && ($$1 = (dgi)$$0).z();
    };
    private static final boolean cl = false;
    private static final int cm = 0;
    private static final boolean cn = false;
    private static final boolean co = false;
    private static final boolean cp = false;
    private static final boolean cq = false;
    private boolean cr = false;
    public long cc;
    private int cs = 0;

    public cyy(cgu<? extends cyy> $$0, dwo $$1) {
        super((cgu<? extends chl>)$$0, $$1);
    }

    public cyy(dwo $$0, double $$1, double $$2, double $$3) {
        this((cgu<? extends cyy>)cgu.h, $$0);
        this.a_($$1, $$2, $$3);
    }

    public static cir.a k() {
        return cyy.ex().a(cis.D, 0.0);
    }

    @Override
    public void j_() {
        double $$0 = this.dP();
        double $$1 = this.dR();
        double $$2 = this.dV();
        super.j_();
        this.a_($$0, $$1, $$2);
    }

    private boolean C() {
        return !this.r() && !this.br();
    }

    @Override
    public boolean dy() {
        return super.dy() && this.C();
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(n, (byte)0);
        $$0.a(o, b);
        $$0.a(p, c);
        $$0.a(q, d);
        $$0.a(r, e);
        $$0.a(s, f);
        $$0.a(t, g);
    }

    @Override
    public boolean e(cgv $$0) {
        return $$0 != cgv.g && $$0 != cgv.h && !this.g($$0);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("Invisible", this.cG());
        $$0.a("Small", this.m());
        $$0.a("ShowArms", this.n());
        $$0.a("DisabledSlots", this.cs);
        $$0.a("NoBasePlate", !this.p());
        if (this.r()) {
            $$0.a("Marker", this.r());
        }
        $$0.a("Pose", cyy$a.b, this.B());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.l($$0.a("Invisible", false));
        this.u($$0.a("Small", false));
        this.a($$0.a("ShowArms", false));
        this.cs = $$0.a("DisabledSlots", 0);
        this.b($$0.a("NoBasePlate", false));
        this.v($$0.a("Marker", false));
        this.ar = !this.C();
        $$0.a("Pose", cyy$a.b).ifPresent(this::a);
    }

    @Override
    public boolean bY() {
        return false;
    }

    @Override
    protected void F(cgk $$0) {
    }

    @Override
    protected void q() {
        List<cgk> $$0 = this.ao().a((cgk)this, this.dj(), ck);
        for (cgk $$1 : $$0) {
            if (!(this.g($$1) <= 0.2)) continue;
            $$1.h(this);
        }
    }

    @Override
    public cdc a(ddm $$0, ftm $$1, cdb $$2) {
        dlt $$3 = $$0.b($$2);
        if (this.r() || $$3.a(dlx.xa)) {
            return cdc.e;
        }
        if ($$0.au()) {
            return cdc.a;
        }
        if ($$0.ao().B_()) {
            return cdc.b;
        }
        cgv $$4 = this.f($$3);
        if ($$3.f()) {
            cgv $$6;
            cgv $$5 = this.a($$1);
            cgv cgv2 = $$6 = this.g($$5) ? $$4 : $$5;
            if (this.d($$6) && this.a($$0, $$6, $$3, $$2)) {
                return cdc.b;
            }
        } else {
            if (this.g($$4)) {
                return cdc.d;
            }
            if ($$4.a() == cgv.a.a && !this.n()) {
                return cdc.d;
            }
            if (this.a($$0, $$4, $$3, $$2)) {
                return cdc.b;
            }
        }
        return cdc.e;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private cgv a(ftm $$0) {
        cgv $$1 = cgv.a;
        boolean $$2 = this.m();
        double $$3 = $$0.h / (double)(this.eF() * this.eE());
        cgv $$4 = cgv.c;
        if ($$3 >= 0.1) {
            double d2 = $$2 ? 0.8 : 0.45;
            if ($$3 < 0.1 + d2 && this.d($$4)) {
                return cgv.c;
            }
        }
        double d3 = $$2 ? 0.3 : 0.0;
        if ($$3 >= 0.9 + d3) {
            double d4 = $$2 ? 1.0 : 0.7;
            if ($$3 < 0.9 + d4 && this.d(cgv.e)) {
                return cgv.e;
            }
        }
        if ($$3 >= 0.4) {
            double d5 = $$2 ? 1.0 : 0.8;
            if ($$3 < 0.4 + d5 && this.d(cgv.d)) {
                return cgv.d;
            }
        }
        if ($$3 >= 1.6 && this.d(cgv.f)) {
            return cgv.f;
        }
        if (this.d(cgv.a)) return $$1;
        if (!this.d(cgv.b)) return $$1;
        return cgv.b;
    }

    private boolean g(cgv $$0) {
        return (this.cs & 1 << $$0.b(0)) != 0 || $$0.a() == cgv.a.a && !this.n();
    }

    private boolean a(ddm $$0, cgv $$1, dlt $$2, cdb $$3) {
        dlt $$4 = this.a($$1);
        if (!$$4.f() && (this.cs & 1 << $$1.b(8)) != 0) {
            return false;
        }
        if ($$4.f() && (this.cs & 1 << $$1.b(16)) != 0) {
            return false;
        }
        if ($$0.gv() && $$4.f() && !$$2.f()) {
            this.a($$1, $$2.c(1));
            return true;
        }
        if (!$$2.f() && $$2.N() > 1) {
            if (!$$4.f()) {
                return false;
            }
            this.a($$1, $$2.a(1));
            return true;
        }
        this.a($$1, $$2);
        $$0.a($$3, $$4);
        return true;
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        if (this.eh()) {
            return false;
        }
        if (!$$0.U().a(eua.F).booleanValue() && $$1.d() instanceof chn) {
            return false;
        }
        if ($$1.a(bdq.d)) {
            this.c($$0);
            return false;
        }
        if (this.a($$0, $$1) || this.cr || this.r()) {
            return false;
        }
        if ($$1.a(bdq.l)) {
            this.d($$0, $$1);
            this.c($$0);
            return false;
        }
        if ($$1.a(bdq.u)) {
            if (this.cp()) {
                this.d($$0, $$1, 0.15f);
            } else {
                this.e(5.0f);
            }
            return false;
        }
        if ($$1.a(bdq.v) && this.eZ() > 0.5f) {
            this.d($$0, $$1, 4.0f);
            return false;
        }
        boolean $$3 = $$1.a(bdq.B);
        boolean $$4 = $$1.a(bdq.A);
        if (!$$3 && !$$4) {
            return false;
        }
        cgk cgk2 = $$1.d();
        if (cgk2 instanceof ddm) {
            ddm $$5 = (ddm)cgk2;
            if (!$$5.gL().e) {
                return false;
            }
        }
        if ($$1.h()) {
            this.E();
            this.D();
            this.c($$0);
            return true;
        }
        long $$6 = $$0.au();
        if ($$6 - this.cc <= 5L || $$4) {
            this.c($$0, $$1);
            this.D();
            this.c($$0);
        } else {
            $$0.a((cgk)this, (byte)32);
            this.a(etk.o, $$1.d());
            this.cc = $$6;
        }
        return true;
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 32) {
            if (this.ao().B_()) {
                this.ao().a(this.dP(), this.dR(), this.dV(), bda.aF, this.dB(), 0.3f, 1.0f, false);
                this.cc = this.ao().au();
            }
        } else {
            super.b($$0);
        }
    }

    @Override
    public boolean a(double $$0) {
        double $$1 = this.dj().a() * 4.0;
        if (Double.isNaN($$1) || $$1 == 0.0) {
            $$1 = 4.0;
        }
        return $$0 < ($$1 *= 64.0) * $$1;
    }

    private void D() {
        if (this.ao() instanceof axf) {
            ((axf)this.ao()).a(new lp(ly.b, dzs.n.m()), this.dP(), this.f(0.6666666666666666), this.dV(), 10, (double)(this.dF() / 4.0f), (double)(this.dG() / 4.0f), (double)(this.dF() / 4.0f), 0.05);
        }
    }

    private void d(axf $$0, cex $$1, float $$2) {
        float $$3 = this.eZ();
        if (($$3 -= $$2) <= 0.5f) {
            this.d($$0, $$1);
            this.c($$0);
        } else {
            this.x($$3);
            this.a(etk.o, $$1.d());
        }
    }

    private void c(axf $$0, cex $$1) {
        dlt $$2 = new dlt(dlx.wS);
        $$2.b(ki.h, this.as());
        dzq.a(this.ao(), this.dK(), $$2);
        this.d($$0, $$1);
    }

    private void d(axf $$0, cex $$1) {
        this.E();
        this.b($$0, $$1);
        for (cgv $$2 : cgv.j) {
            dlt $$3 = this.cb.a($$2, dlt.l);
            if ($$3.f()) continue;
            dzq.a(this.ao(), this.dK().d(), $$3);
        }
    }

    private void E() {
        this.ao().a(null, this.dP(), this.dR(), this.dV(), bda.aD, this.dB(), 1.0f, 1.0f);
    }

    @Override
    protected void D(float $$0) {
        this.bD = this.ab;
        this.bC = this.ec();
    }

    @Override
    public void m(ftm $$0) {
        if (!this.C()) {
            return;
        }
        super.m($$0);
    }

    @Override
    public void s(float $$0) {
        this.bD = this.ab = $$0;
        this.bF = this.bE = $$0;
    }

    @Override
    public void r(float $$0) {
        this.bD = this.ab = $$0;
        this.bF = this.bE = $$0;
    }

    @Override
    protected void M() {
        this.l(this.cr);
    }

    @Override
    public void l(boolean $$0) {
        this.cr = $$0;
        super.l($$0);
    }

    @Override
    public boolean e_() {
        return this.m();
    }

    @Override
    public void c(axf $$0) {
        this.a(cgk.e.a);
        this.c(etk.p);
    }

    @Override
    public boolean a(dwi $$0) {
        if ($$0.h()) {
            return this.cG();
        }
        return true;
    }

    @Override
    public flg n_() {
        if (this.r()) {
            return flg.d;
        }
        return super.n_();
    }

    @Override
    public boolean m_() {
        return this.r();
    }

    private void u(boolean $$0) {
        this.az.a(n, this.a(this.az.a(n), 1, $$0));
    }

    public boolean m() {
        return (this.az.a(n) & 1) != 0;
    }

    public void a(boolean $$0) {
        this.az.a(n, this.a(this.az.a(n), 4, $$0));
    }

    public boolean n() {
        return (this.az.a(n) & 4) != 0;
    }

    public void b(boolean $$0) {
        this.az.a(n, this.a(this.az.a(n), 8, $$0));
    }

    public boolean p() {
        return (this.az.a(n) & 8) == 0;
    }

    private void v(boolean $$0) {
        this.az.a(n, this.a(this.az.a(n), 16, $$0));
    }

    public boolean r() {
        return (this.az.a(n) & 0x10) != 0;
    }

    private byte a(byte $$0, int $$1, boolean $$2) {
        $$0 = $$2 ? (byte)($$0 | $$1) : (byte)($$0 & ~$$1);
        return $$0;
    }

    public void a(jv $$0) {
        this.az.a(o, $$0);
    }

    public void b(jv $$0) {
        this.az.a(p, $$0);
    }

    public void c(jv $$0) {
        this.az.a(q, $$0);
    }

    public void d(jv $$0) {
        this.az.a(r, $$0);
    }

    public void e(jv $$0) {
        this.az.a(s, $$0);
    }

    public void f(jv $$0) {
        this.az.a(t, $$0);
    }

    public jv s() {
        return this.az.a(o);
    }

    public jv v() {
        return this.az.a(p);
    }

    public jv w() {
        return this.az.a(q);
    }

    public jv x() {
        return this.az.a(r);
    }

    public jv z() {
        return this.az.a(s);
    }

    public jv A() {
        return this.az.a(t);
    }

    @Override
    public boolean bX() {
        return super.bX() && !this.r();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean w(cgk $$0) {
        if (!($$0 instanceof ddm)) return false;
        ddm $$1 = (ddm)$$0;
        if (this.ao().a((cgk)$$1, this.dK())) return false;
        return true;
    }

    @Override
    public chb at() {
        return chb.b;
    }

    @Override
    public chl.a fj() {
        return new chl.a(bda.aE, bda.aE);
    }

    @Override
    protected @Nullable bcz h(cex $$0) {
        return bda.aF;
    }

    @Override
    protected @Nullable bcz fd() {
        return bda.aD;
    }

    @Override
    public void a(axf $$0, chk $$1) {
    }

    @Override
    public boolean gl() {
        return false;
    }

    @Override
    public void a(alw<?> $$0) {
        if (n.equals($$0)) {
            this.j_();
            this.W = !this.r();
        }
        super.a($$0);
    }

    @Override
    public boolean gm() {
        return false;
    }

    @Override
    public cgn b(chx $$0) {
        return this.w(this.r());
    }

    private cgn w(boolean $$0) {
        if ($$0) {
            return ce;
        }
        return this.e_() ? cf : this.ay().n();
    }

    @Override
    public ftm o(float $$0) {
        if (this.r()) {
            fth $$1 = this.w(false).a(this.dI());
            is $$2 = this.dK();
            int $$3 = Integer.MIN_VALUE;
            for (is $$4 : is.c(is.a($$1.a, $$1.b, $$1.c), is.a($$1.d, $$1.e, $$1.f))) {
                int $$5 = Math.max(this.ao().a(dww.b, $$4), this.ao().a(dww.a, $$4));
                if ($$5 == 15) {
                    return ftm.b($$4);
                }
                if ($$5 <= $$3) continue;
                $$3 = $$5;
                $$2 = $$4.j();
            }
            return ftm.b($$2);
        }
        return super.o($$0);
    }

    @Override
    public dlt dZ() {
        return new dlt(dlx.wS);
    }

    @Override
    public boolean eT() {
        return !this.cG() && !this.r();
    }

    public void a(a $$0) {
        this.a($$0.a());
        this.b($$0.b());
        this.c($$0.c());
        this.d($$0.d());
        this.e($$0.e());
        this.f($$0.f());
    }

    public a B() {
        return new a(this.s(), this.v(), this.w(), this.x(), this.z(), this.A());
    }

    public static final class a
    extends Record {
        private final jv c;
        private final jv d;
        private final jv e;
        private final jv f;
        private final jv g;
        private final jv h;
        public static final a a = new a(b, c, d, e, f, g);
        public static final Codec<a> b = RecordCodecBuilder.create($$0 -> $$0.group((App)jv.a.optionalFieldOf("Head", (Object)b).forGetter(a::a), (App)jv.a.optionalFieldOf("Body", (Object)c).forGetter(a::b), (App)jv.a.optionalFieldOf("LeftArm", (Object)d).forGetter(a::c), (App)jv.a.optionalFieldOf("RightArm", (Object)e).forGetter(a::d), (App)jv.a.optionalFieldOf("LeftLeg", (Object)f).forGetter(a::e), (App)jv.a.optionalFieldOf("RightLeg", (Object)g).forGetter(a::f)).apply((Applicative)$$0, a::new));

        public a(jv $$0, jv $$1, jv $$2, jv $$3, jv $$4, jv $$5) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
            this.f = $$3;
            this.g = $$4;
            this.h = $$5;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "head;body;leftArm;rightArm;leftLeg;rightLeg", "c", "d", "e", "f", "g", "h"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "head;body;leftArm;rightArm;leftLeg;rightLeg", "c", "d", "e", "f", "g", "h"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "head;body;leftArm;rightArm;leftLeg;rightLeg", "c", "d", "e", "f", "g", "h"}, this, $$0);
        }

        public jv a() {
            return this.c;
        }

        public jv b() {
            return this.d;
        }

        public jv c() {
            return this.e;
        }

        public jv d() {
            return this.f;
        }

        public jv e() {
            return this.g;
        }

        public jv f() {
            return this.h;
        }
    }
}

