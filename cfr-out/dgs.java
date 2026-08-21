/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  io.netty.buffer.ByteBuf
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.util.Pair;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.LinkedList;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class dgs
extends dgl {
    public static final int b = 3;
    public static final double c = 0.1;
    public static final double d = 0.005;
    private @Nullable b i;
    private int j;
    private float k;
    private int l = 0;
    public final List<a> e = new LinkedList<a>();
    public final List<a> f = new LinkedList<a>();
    public double g = 0.0;
    public a h = dgs$a.b;

    public dgs(dgi $$0) {
        super($$0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void b() {
        void $$2;
        dwo dwo2 = this.c();
        if (!(dwo2 instanceof axf)) {
            this.p();
            boolean $$1 = dzf.h(this.c().a_(this.a.s()));
            this.a.a($$1);
            return;
        }
        axf $$0 = (axf)dwo2;
        is $$3 = this.a.s();
        eoh $$4 = this.c().a_($$3);
        if (this.a.r()) {
            this.a.a(dzf.h($$4));
            this.a($$3, $$4, true);
        }
        this.a.bu();
        this.a.b((axf)$$2);
    }

    private void p() {
        if (--this.l <= 0) {
            this.n();
            this.f.clear();
            if (!this.e.isEmpty()) {
                this.f.addAll(this.e);
                this.e.clear();
                this.g = 0.0;
                for (a $$0 : this.f) {
                    this.g += (double)$$0.g;
                }
                int n2 = this.l = this.g == 0.0 ? 0 : 3;
            }
        }
        if (this.o()) {
            this.c(this.e(1.0f));
            this.b(this.f(1.0f));
            this.a(this.c(1.0f));
            this.b(this.d(1.0f));
        }
    }

    public void n() {
        this.h = new a(this.f(), this.e(), this.k(), this.j(), 0.0f);
    }

    public boolean o() {
        return !this.f.isEmpty();
    }

    public float c(float $$0) {
        b $$1 = this.g($$0);
        return bgj.i($$1.a, $$1.c.f, $$1.b.f);
    }

    public float d(float $$0) {
        b $$1 = this.g($$0);
        return bgj.i($$1.a, $$1.c.e, $$1.b.e);
    }

    public ftm e(float $$0) {
        b $$1 = this.g($$0);
        return bgj.a((double)$$1.a, $$1.c.c, $$1.b.c);
    }

    public ftm f(float $$0) {
        b $$1 = this.g($$0);
        return bgj.a((double)$$1.a, $$1.c.d, $$1.b.d);
    }

    private b g(float $$0) {
        int $$5;
        if ($$0 == this.k && this.l == this.j && this.i != null) {
            return this.i;
        }
        float $$1 = ((float)(3 - this.l) + $$0) / 3.0f;
        float $$2 = 0.0f;
        float $$3 = 1.0f;
        boolean $$4 = false;
        for ($$5 = 0; $$5 < this.f.size(); ++$$5) {
            float $$6 = this.f.get((int)$$5).g;
            if ($$6 <= 0.0f || !((double)($$2 += $$6) >= this.g * (double)$$1)) continue;
            float $$7 = $$2 - $$6;
            $$3 = (float)(((double)$$1 * this.g - (double)$$7) / (double)$$6);
            $$4 = true;
            break;
        }
        if (!$$4) {
            $$5 = this.f.size() - 1;
        }
        a $$8 = this.f.get($$5);
        a $$9 = $$5 > 0 ? this.f.get($$5 - 1) : this.h;
        this.i = new b($$3, $$8, $$9);
        this.j = this.l;
        this.k = $$0;
        return this.i;
    }

    public void a(is $$0, eoh $$1, boolean $$2) {
        boolean $$22;
        ftm $$19;
        boolean $$12;
        if (!dzf.h($$1)) {
            return;
        }
        epl $$3 = $$1.c(((dzf)$$1.b()).c());
        Pair<jy, jy> $$4 = dgi.a($$3);
        ftm $$5 = new ftm((jy)$$4.getFirst()).c(0.5);
        ftm $$6 = new ftm((jy)$$4.getSecond()).c(0.5);
        ftm $$7 = $$5.f();
        ftm $$8 = $$6.f();
        if (this.e().g() > (double)1.0E-5f && this.e().b($$7) < this.e().b($$8) || this.b($$8, $$3)) {
            ftm $$9 = $$7;
            $$7 = $$8;
            $$8 = $$9;
        }
        float $$10 = 180.0f - (float)(Math.atan2($$7.i, $$7.g) * 180.0 / Math.PI);
        $$10 += this.a.u() ? 180.0f : 0.0f;
        ftm $$11 = this.f();
        boolean bl2 = $$12 = $$5.a() != $$6.a() && $$5.c() != $$6.c();
        if ($$12) {
            ftm $$13 = $$6.d($$5);
            ftm $$14 = $$11.d($$0.c()).d($$5);
            ftm $$15 = $$13.c($$13.b($$14) / $$13.b($$13));
            ftm $$16 = $$0.c().e($$5).e($$15);
            $$10 = 180.0f - (float)(Math.atan2($$15.i, $$15.g) * 180.0 / Math.PI);
            $$10 += this.a.u() ? 180.0f : 0.0f;
        } else {
            boolean $$17 = $$5.d((ftm)$$6).g != 0.0;
            boolean $$18 = $$5.d((ftm)$$6).i != 0.0;
            $$19 = new ftm($$18 ? $$0.b().g : $$11.g, $$0.v(), $$17 ? $$0.b().i : $$11.i);
        }
        ftm $$20 = $$19.d($$11);
        this.c($$11.e($$20));
        float $$21 = 0.0f;
        boolean bl3 = $$22 = $$5.b() != $$6.b();
        if ($$22) {
            ftm $$23 = $$0.c().e($$8);
            double $$24 = $$23.f(this.f());
            this.c(this.f().b(0.0, $$24 + 0.1, 0.0));
            $$21 = this.a.u() ? 45.0f : -45.0f;
        } else {
            this.c(this.f().b(0.0, 0.1, 0.0));
        }
        this.a($$10, $$21);
        double $$25 = $$11.f(this.f());
        if ($$25 > 0.0) {
            this.e.add(new a(this.f(), this.e(), this.k(), this.j(), $$2 ? 0.0f : (float)$$25));
        }
    }

    private void a(float $$0, float $$1) {
        double $$2 = Math.abs($$0 - this.k());
        if ($$2 >= 175.0 && $$2 <= 185.0) {
            this.a.b(!this.a.u());
            $$0 -= 180.0f;
            $$1 *= -1.0f;
        }
        $$1 = Math.clamp($$1, -45.0f, 45.0f);
        this.a($$1 % 360.0f);
        this.b($$0 % 360.0f);
    }

    @Override
    public void a(axf $$0) {
        c $$1 = new c();
        while ($$1.a() && this.a.cb()) {
            ftm $$2 = this.e();
            is $$3 = this.a.s();
            eoh $$4 = this.c().a_($$3);
            boolean $$5 = dzf.h($$4);
            if (this.a.cH() != $$5) {
                this.a.a($$5);
                this.a($$3, $$4, false);
            }
            if ($$5) {
                this.a.l();
                this.a.bP();
                if ($$4.a(dzs.hY)) {
                    this.a.a($$0, $$3.u(), $$3.v(), $$3.w(), $$4.c(efv.d));
                }
                epl $$6 = $$4.c(((dzf)$$4.b()).c());
                ftm $$7 = this.a($$0, $$2.f(), $$1, $$3, $$4, $$6);
                $$1.a = $$1.b ? $$7.i() : ($$1.a += $$7.i() - $$2.i());
                this.b($$7);
                $$1.a = this.a.a($$3, $$6, $$1.a);
            } else {
                this.a.e($$0);
                $$1.a = 0.0;
            }
            ftm $$8 = this.f();
            ftm $$9 = $$8.d(this.a.bS());
            double $$10 = $$9.g();
            if ($$10 > (double)1.0E-5f) {
                if ($$9.j() > (double)1.0E-5f) {
                    float $$11 = 180.0f - (float)(Math.atan2($$9.i, $$9.g) * 180.0 / Math.PI);
                    float $$12 = this.a.aV() && !this.a.cH() ? 0.0f : 90.0f - (float)(Math.atan2($$9.i(), $$9.h) * 180.0 / Math.PI);
                    this.a($$11 += this.a.u() ? 180.0f : 0.0f, $$12 *= this.a.u() ? -1.0f : 1.0f);
                } else if (!this.a.cH()) {
                    this.a(this.a.aV() ? 0.0f : bgj.i(0.2f, this.j(), 0.0f));
                }
                this.e.add(new a($$8, this.e(), this.k(), this.j(), (float)Math.min($$10, this.b($$0))));
            } else if ($$2.j() > 0.0) {
                this.e.add(new a($$8, this.e(), this.k(), this.j(), 1.0f));
            }
            if ($$10 > (double)1.0E-5f || $$1.b) {
                this.a.aW();
                this.a.aW();
            }
            $$1.b = false;
        }
    }

    private ftm a(axf $$0, ftm $$1, c $$2, is $$3, eoh $$4, epl $$5) {
        ftm $$11;
        ftm $$9;
        ftm $$8;
        ftm $$7;
        ftm $$6 = $$1;
        if (!$$2.c && ($$7 = this.a($$6, $$5)).j() != $$6.j()) {
            $$2.c = true;
            $$6 = $$7;
        }
        if ($$2.b && ($$8 = this.e($$6)).j() != $$6.j()) {
            $$2.d = true;
            $$6 = $$8;
        }
        if (!$$2.d && ($$9 = this.a($$6, $$4)).j() != $$6.j()) {
            $$2.d = true;
            $$6 = $$9;
        }
        if ($$2.b && ($$6 = this.a.a($$6)).h() > 0.0) {
            double $$10 = Math.min($$6.g(), this.a.a($$0));
            $$6 = $$6.d().c($$10);
        }
        if (!$$2.e && ($$11 = this.a($$6, $$3, $$4)).j() != $$6.j()) {
            $$2.e = true;
            $$6 = $$11;
        }
        return $$6;
    }

    private ftm a(ftm $$0, epl $$1) {
        double $$2 = Math.max(0.0078125, $$0.i() * 0.02);
        if (this.a.by()) {
            $$2 *= 0.2;
        }
        return switch ($$1) {
            case epl.c -> $$0.b(-$$2, 0.0, 0.0);
            case epl.d -> $$0.b($$2, 0.0, 0.0);
            case epl.e -> $$0.b(0.0, 0.0, $$2);
            case epl.f -> $$0.b(0.0, 0.0, -$$2);
            default -> $$0;
        };
    }

    /*
     * WARNING - void declaration
     */
    private ftm e(ftm $$0) {
        void $$2;
        cgk cgk2 = this.a.do();
        if (!(cgk2 instanceof axg)) {
            return $$0;
        }
        axg $$1 = (axg)cgk2;
        ftm $$3 = $$2.aj();
        if ($$3.h() > 0.0) {
            ftm $$4 = $$3.d();
            double $$5 = $$0.j();
            if ($$4.h() > 0.0 && $$5 < 0.01) {
                return $$0.e(new ftm($$4.g, 0.0, $$4.i).d().c(0.001));
            }
        }
        return $$0;
    }

    private ftm a(ftm $$0, eoh $$1) {
        if (!$$1.a(dzs.bw) || $$1.c(efv.d).booleanValue()) {
            return $$0;
        }
        if ($$0.g() < 0.03) {
            return ftm.c;
        }
        return $$0.c(0.5);
    }

    private ftm a(ftm $$0, is $$1, eoh $$2) {
        if (!$$2.a(dzs.bw) || !$$2.c(efv.d).booleanValue()) {
            return $$0;
        }
        if ($$0.g() > 0.01) {
            return $$0.d().c($$0.g() + 0.06);
        }
        ftm $$3 = this.a.a($$1);
        if ($$3.h() <= 0.0) {
            return $$0;
        }
        return $$3.c($$0.g() + 0.2);
    }

    @Override
    public double a(is $$0, epl $$1, double $$2) {
        if ($$2 < (double)1.0E-5f) {
            return 0.0;
        }
        ftm $$3 = this.f();
        Pair<jy, jy> $$4 = dgi.a($$1);
        jy $$5 = (jy)$$4.getFirst();
        jy $$6 = (jy)$$4.getSecond();
        ftm $$7 = this.e().f();
        if ($$7.g() < (double)1.0E-5f) {
            this.b(ftm.c);
            return 0.0;
        }
        boolean $$8 = $$5.v() != $$6.v();
        ftm $$9 = new ftm($$6).c(0.5).f();
        ftm $$10 = new ftm($$5).c(0.5).f();
        if ($$7.b($$10) < $$7.b($$9)) {
            $$10 = $$9;
        }
        ftm $$11 = $$0.c().e($$10).b(0.0, 0.1, 0.0).e($$10.d().c((double)1.0E-5f));
        if ($$8 && !this.b($$7, $$1)) {
            $$11 = $$11.b(0.0, 1.0, 0.0);
        }
        ftm $$12 = $$11.d(this.f()).d();
        $$7 = $$12.c($$7.g() / $$12.i());
        ftm $$13 = $$3.e($$7.d().c($$2 * (double)($$8 ? bgj.g : 1.0f)));
        if ($$3.g($$11) <= $$3.g($$13)) {
            $$2 = $$11.d($$13).i();
            $$13 = $$11;
        } else {
            $$2 = 0.0;
        }
        this.a.a(chp.a, $$13.d($$3));
        eoh $$14 = this.c().a_(is.a($$13));
        if ($$8) {
            epl $$15;
            if (dzf.h($$14) && this.a($$1, $$15 = $$14.c(((dzf)$$14.b()).c()))) {
                return 0.0;
            }
            double $$16 = $$11.f().f(this.f().f());
            double $$17 = $$11.h + (this.b($$7, $$1) ? $$16 : -$$16);
            if (this.f().h < $$17) {
                this.b(this.f().g, $$17, this.f().i);
            }
        }
        if (this.f().f($$3) < (double)1.0E-5f && $$13.f($$3) > (double)1.0E-5f) {
            this.b(ftm.c);
            return 0.0;
        }
        this.b($$7);
        return $$2;
    }

    private boolean a(epl $$0, epl $$1) {
        if (this.e().h() < 0.005 && $$1.b() && this.b(this.e(), $$0) && !this.b(this.e(), $$1)) {
            this.b(ftm.c);
            return true;
        }
        return false;
    }

    @Override
    public double b(axf $$0) {
        return (double)$$0.U().a(eua.B).intValue() * (this.a.by() ? 0.5 : 1.0) / 20.0;
    }

    private boolean b(ftm $$0, epl $$1) {
        return switch ($$1) {
            case epl.c -> {
                if ($$0.g < 0.0) {
                    yield true;
                }
                yield false;
            }
            case epl.d -> {
                if ($$0.g > 0.0) {
                    yield true;
                }
                yield false;
            }
            case epl.e -> {
                if ($$0.i > 0.0) {
                    yield true;
                }
                yield false;
            }
            case epl.f -> {
                if ($$0.i < 0.0) {
                    yield true;
                }
                yield false;
            }
            default -> false;
        };
    }

    @Override
    public double m() {
        return this.a.cr() ? 0.997 : 0.975;
    }

    @Override
    public boolean d() {
        boolean $$0 = this.a(this.a.dj().c(0.2, 0.0, 0.2));
        if (this.a.ad || this.a.ae) {
            boolean $$1 = this.b(this.a.dj().g(1.0E-7));
            return $$0 && !$$1;
        }
        return false;
    }

    public boolean a(fth $$0) {
        List<cgk> $$1;
        if (this.a.z() && !this.a.cr() && !($$1 = this.c().a((cgk)this.a, $$0, cgs.a(this.a))).isEmpty()) {
            for (cgk $$2 : $$1) {
                boolean $$3;
                if ($$2 instanceof ddm || $$2 instanceof cwh || $$2 instanceof dgi || this.a.cr() || $$2.cq() || !($$3 = $$2.o(this.a))) continue;
                return true;
            }
        }
        return false;
    }

    public boolean b(fth $$0) {
        boolean $$1;
        block3: {
            block2: {
                $$1 = false;
                if (!this.a.z()) break block2;
                List<cgk> $$2 = this.c().a((cgk)this.a, $$0, cgs.a(this.a));
                if ($$2.isEmpty()) break block3;
                for (cgk $$3 : $$2) {
                    if (!($$3 instanceof ddm) && !($$3 instanceof cwh) && !($$3 instanceof dgi) && !this.a.cr() && !$$3.cq()) continue;
                    $$3.h(this.a);
                    $$1 = true;
                }
                break block3;
            }
            for (cgk $$4 : this.c().a_(this.a, $$0)) {
                if (this.a.z($$4) || !$$4.bY() || !($$4 instanceof dgi)) continue;
                $$4.h(this.a);
                $$1 = true;
            }
        }
        return $$1;
    }

    public static final class a
    extends Record {
        final ftm c;
        final ftm d;
        final float e;
        final float f;
        final float g;
        public static final aao<ByteBuf, a> a = aao.a(ftm.b, a::a, ftm.b, a::b, aam.d, a::c, aam.d, a::d, aam.l, a::e, a::new);
        public static a b = new a(ftm.c, ftm.c, 0.0f, 0.0f, 0.0f);

        public a(ftm $$0, ftm $$1, float $$2, float $$3, float $$4) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
            this.f = $$3;
            this.g = $$4;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "position;movement;yRot;xRot;weight", "c", "d", "e", "f", "g"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "position;movement;yRot;xRot;weight", "c", "d", "e", "f", "g"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "position;movement;yRot;xRot;weight", "c", "d", "e", "f", "g"}, this, $$0);
        }

        public ftm a() {
            return this.c;
        }

        public ftm b() {
            return this.d;
        }

        public float c() {
            return this.e;
        }

        public float d() {
            return this.f;
        }

        public float e() {
            return this.g;
        }
    }

    static final class b
    extends Record {
        final float a;
        final a b;
        final a c;

        b(float $$0, a $$1, a $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "partialTicksInStep;currentStep;previousStep", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "partialTicksInStep;currentStep;previousStep", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "partialTicksInStep;currentStep;previousStep", "a", "b", "c"}, this, $$0);
        }

        public float a() {
            return this.a;
        }

        public a b() {
            return this.b;
        }

        public a c() {
            return this.c;
        }
    }

    static class c {
        double a = 0.0;
        boolean b = true;
        boolean c = false;
        boolean d = false;
        boolean e = false;

        c() {
        }

        public boolean a() {
            return this.b || this.a > (double)1.0E-5f;
        }
    }
}

