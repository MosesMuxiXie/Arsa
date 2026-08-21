/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.util.Pair;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class dgt
extends dgl {
    private static final double b = 0.01;
    private static final double c = 0.2;
    private static final double d = 0.4;
    private static final double e = 0.4;
    private final chf f;
    private ftm g = ftm.c;

    public dgt(dgi $$0) {
        super($$0);
        this.f = new chf((cgk)$$0, this::a);
    }

    @Override
    public chf a() {
        return this.f;
    }

    public void a(chf $$0) {
        this.b(this.g);
    }

    @Override
    public void a(ftm $$0) {
        this.g = $$0;
        this.b(this.g);
    }

    @Override
    public void b() {
        double $$7;
        dwo dwo2 = this.c();
        if (!(dwo2 instanceof axf)) {
            if (this.f.d()) {
                this.f.e();
            } else {
                this.a.aH();
                this.a(this.j() % 360.0f);
                this.b(this.k() % 360.0f);
            }
            return;
        }
        axf $$0 = (axf)dwo2;
        this.a.bu();
        is $$2 = this.a.s();
        eoh $$3 = this.c().a_($$2);
        boolean $$4 = dzf.h($$3);
        this.a.a($$4);
        if ($$4) {
            this.a((axf)$$1);
            if ($$3.a(dzs.hY)) {
                this.a.a((axf)$$1, $$2.u(), $$2.v(), $$2.w(), $$3.c(efv.d));
            }
        } else {
            this.a.e((axf)$$1);
        }
        this.a.aW();
        this.a(0.0f);
        double $$5 = this.a.Y - this.g();
        double $$6 = this.a.aa - this.i();
        if ($$5 * $$5 + $$6 * $$6 > 0.001) {
            this.b((float)(bgj.d($$6, $$5) * 180.0 / Math.PI));
            if (this.a.u()) {
                this.b(this.k() + 180.0f);
            }
        }
        if (($$7 = (double)bgj.f(this.k() - this.a.ab)) < -170.0 || $$7 >= 170.0) {
            this.b(this.k() + 180.0f);
            this.a.b(!this.a.u());
        }
        this.a(this.j() % 360.0f);
        this.b(this.k() % 360.0f);
        this.d();
    }

    @Override
    public void a(axf $$0) {
        double $$35;
        ftm $$23;
        is $$1 = this.a.s();
        eoh $$2 = this.c().a_($$1);
        this.a.l();
        double $$3 = this.a.dP();
        double $$4 = this.a.dR();
        double $$5 = this.a.dV();
        ftm $$6 = this.c($$3, $$4, $$5);
        $$4 = $$1.v();
        boolean $$7 = false;
        boolean $$8 = false;
        if ($$2.a(dzs.bw)) {
            $$7 = $$2.c(efv.d);
            $$8 = !$$7;
        }
        double $$9 = 0.0078125;
        if (this.a.by()) {
            $$9 *= 0.2;
        }
        ftm $$10 = this.e();
        epl $$11 = $$2.c(((dzf)$$2.b()).c());
        switch ($$11) {
            case c: {
                this.b($$10.b(-$$9, 0.0, 0.0));
                $$4 += 1.0;
                break;
            }
            case d: {
                this.b($$10.b($$9, 0.0, 0.0));
                $$4 += 1.0;
                break;
            }
            case e: {
                this.b($$10.b(0.0, 0.0, $$9));
                $$4 += 1.0;
                break;
            }
            case f: {
                this.b($$10.b(0.0, 0.0, -$$9));
                $$4 += 1.0;
            }
        }
        $$10 = this.e();
        Pair<jy, jy> $$12 = dgi.a($$11);
        jy $$13 = (jy)$$12.getFirst();
        jy $$14 = (jy)$$12.getSecond();
        double $$15 = $$14.u() - $$13.u();
        double $$16 = $$14.w() - $$13.w();
        double $$17 = Math.sqrt($$15 * $$15 + $$16 * $$16);
        double $$18 = $$10.g * $$15 + $$10.i * $$16;
        if ($$18 < 0.0) {
            $$15 = -$$15;
            $$16 = -$$16;
        }
        double $$19 = Math.min(2.0, $$10.i());
        $$10 = new ftm($$19 * $$15 / $$17, $$10.h, $$19 * $$16 / $$17);
        this.b($$10);
        cgk $$20 = this.a.do();
        cgk cgk2 = this.a.do();
        if (cgk2 instanceof axg) {
            axg $$21 = (axg)cgk2;
            ftm $$22 = $$21.aj();
        } else {
            $$23 = ftm.c;
        }
        if ($$20 instanceof ddm && $$23.h() > 0.0) {
            ftm $$24 = $$23.d();
            double $$25 = this.e().j();
            if ($$24.h() > 0.0 && $$25 < 0.01) {
                this.b(this.e().b($$23.g * 0.001, 0.0, $$23.i * 0.001));
                $$8 = false;
            }
        }
        if ($$8) {
            double $$26 = this.e().i();
            if ($$26 < 0.03) {
                this.b(ftm.c);
            } else {
                this.b(this.e().d(0.5, 0.0, 0.5));
            }
        }
        double $$27 = (double)$$1.u() + 0.5 + (double)$$13.u() * 0.5;
        double $$28 = (double)$$1.w() + 0.5 + (double)$$13.w() * 0.5;
        double $$29 = (double)$$1.u() + 0.5 + (double)$$14.u() * 0.5;
        double $$30 = (double)$$1.w() + 0.5 + (double)$$14.w() * 0.5;
        $$15 = $$29 - $$27;
        $$16 = $$30 - $$28;
        if ($$15 == 0.0) {
            double $$31 = $$5 - (double)$$1.w();
        } else if ($$16 == 0.0) {
            double $$32 = $$3 - (double)$$1.u();
        } else {
            double $$33 = $$3 - $$27;
            double $$34 = $$5 - $$28;
            $$35 = ($$33 * $$15 + $$34 * $$16) * 2.0;
        }
        $$3 = $$27 + $$15 * $$35;
        $$5 = $$28 + $$16 * $$35;
        this.b($$3, $$4, $$5);
        double $$36 = this.a.cr() ? 0.75 : 1.0;
        double $$37 = this.a.a($$0);
        $$10 = this.e();
        this.a.a(chp.a, new ftm(bgj.a($$36 * $$10.g, -$$37, $$37), 0.0, bgj.a($$36 * $$10.i, -$$37, $$37)));
        if ($$13.v() != 0 && bgj.c(this.a.dP()) - $$1.u() == $$13.u() && bgj.c(this.a.dV()) - $$1.w() == $$13.w()) {
            this.b(this.a.dP(), this.a.dR() + (double)$$13.v(), this.a.dV());
        } else if ($$14.v() != 0 && bgj.c(this.a.dP()) - $$1.u() == $$14.u() && bgj.c(this.a.dV()) - $$1.w() == $$14.w()) {
            this.b(this.a.dP(), this.a.dR() + (double)$$14.v(), this.a.dV());
        }
        this.b(this.a.a(this.e()));
        ftm $$38 = this.c(this.a.dP(), this.a.dR(), this.a.dV());
        if ($$38 != null && $$6 != null) {
            double $$39 = ($$6.h - $$38.h) * 0.05;
            ftm $$40 = this.e();
            double $$41 = $$40.i();
            if ($$41 > 0.0) {
                this.b($$40.d(($$41 + $$39) / $$41, 1.0, ($$41 + $$39) / $$41));
            }
            this.b(this.a.dP(), $$38.h, this.a.dV());
        }
        int $$42 = bgj.c(this.a.dP());
        int $$43 = bgj.c(this.a.dV());
        if ($$42 != $$1.u() || $$43 != $$1.w()) {
            ftm $$44 = this.e();
            double $$45 = $$44.i();
            this.a($$45 * (double)($$42 - $$1.u()), $$44.h, $$45 * (double)($$43 - $$1.w()));
        }
        if ($$7) {
            ftm $$46 = this.e();
            double $$47 = $$46.i();
            if ($$47 > 0.01) {
                double $$48 = 0.06;
                this.b($$46.b($$46.g / $$47 * 0.06, 0.0, $$46.i / $$47 * 0.06));
            } else {
                ftm $$49 = this.e();
                double $$50 = $$49.g;
                double $$51 = $$49.i;
                if ($$11 == epl.b) {
                    if (this.a.b($$1.h())) {
                        $$50 = 0.02;
                    } else if (this.a.b($$1.i())) {
                        $$50 = -0.02;
                    }
                } else if ($$11 == epl.a) {
                    if (this.a.b($$1.f())) {
                        $$51 = 0.02;
                    } else if (this.a.b($$1.g())) {
                        $$51 = -0.02;
                    }
                } else {
                    return;
                }
                this.a($$50, $$49.h, $$51);
            }
        }
    }

    public @Nullable ftm a(double $$0, double $$1, double $$2, double $$3) {
        eoh $$7;
        int $$4 = bgj.c($$0);
        int $$5 = bgj.c($$1);
        int $$6 = bgj.c($$2);
        if (this.c().a_(new is($$4, $$5 - 1, $$6)).a(bdp.L)) {
            --$$5;
        }
        if (dzf.h($$7 = this.c().a_(new is($$4, $$5, $$6)))) {
            epl $$8 = $$7.c(((dzf)$$7.b()).c());
            $$1 = $$5;
            if ($$8.b()) {
                $$1 = $$5 + 1;
            }
            Pair<jy, jy> $$9 = dgi.a($$8);
            jy $$10 = (jy)$$9.getFirst();
            jy $$11 = (jy)$$9.getSecond();
            double $$12 = $$11.u() - $$10.u();
            double $$13 = $$11.w() - $$10.w();
            double $$14 = Math.sqrt($$12 * $$12 + $$13 * $$13);
            if ($$10.v() != 0 && bgj.c($$0 += ($$12 /= $$14) * $$3) - $$4 == $$10.u() && bgj.c($$2 += ($$13 /= $$14) * $$3) - $$6 == $$10.w()) {
                $$1 += (double)$$10.v();
            } else if ($$11.v() != 0 && bgj.c($$0) - $$4 == $$11.u() && bgj.c($$2) - $$6 == $$11.w()) {
                $$1 += (double)$$11.v();
            }
            return this.c($$0, $$1, $$2);
        }
        return null;
    }

    public @Nullable ftm c(double $$0, double $$1, double $$2) {
        eoh $$6;
        int $$3 = bgj.c($$0);
        int $$4 = bgj.c($$1);
        int $$5 = bgj.c($$2);
        if (this.c().a_(new is($$3, $$4 - 1, $$5)).a(bdp.L)) {
            --$$4;
        }
        if (dzf.h($$6 = this.c().a_(new is($$3, $$4, $$5)))) {
            double $$24;
            epl $$7 = $$6.c(((dzf)$$6.b()).c());
            Pair<jy, jy> $$8 = dgi.a($$7);
            jy $$9 = (jy)$$8.getFirst();
            jy $$10 = (jy)$$8.getSecond();
            double $$11 = (double)$$3 + 0.5 + (double)$$9.u() * 0.5;
            double $$12 = (double)$$4 + 0.0625 + (double)$$9.v() * 0.5;
            double $$13 = (double)$$5 + 0.5 + (double)$$9.w() * 0.5;
            double $$14 = (double)$$3 + 0.5 + (double)$$10.u() * 0.5;
            double $$15 = (double)$$4 + 0.0625 + (double)$$10.v() * 0.5;
            double $$16 = (double)$$5 + 0.5 + (double)$$10.w() * 0.5;
            double $$17 = $$14 - $$11;
            double $$18 = ($$15 - $$12) * 2.0;
            double $$19 = $$16 - $$13;
            if ($$17 == 0.0) {
                double $$20 = $$2 - (double)$$5;
            } else if ($$19 == 0.0) {
                double $$21 = $$0 - (double)$$3;
            } else {
                double $$22 = $$0 - $$11;
                double $$23 = $$2 - $$13;
                $$24 = ($$22 * $$17 + $$23 * $$19) * 2.0;
            }
            $$0 = $$11 + $$17 * $$24;
            $$1 = $$12 + $$18 * $$24;
            $$2 = $$13 + $$19 * $$24;
            if ($$18 < 0.0) {
                $$1 += 1.0;
            } else if ($$18 > 0.0) {
                $$1 += 0.5;
            }
            return new ftm($$0, $$1, $$2);
        }
        return null;
    }

    @Override
    public double a(is $$0, epl $$1, double $$2) {
        return 0.0;
    }

    @Override
    public boolean d() {
        block4: {
            fth $$0;
            block3: {
                $$0 = this.a.dj().c(0.2f, 0.0, 0.2f);
                if (!this.a.z() || !(this.e().j() >= 0.01)) break block3;
                List<cgk> $$1 = this.c().a((cgk)this.a, $$0, cgs.a(this.a));
                if ($$1.isEmpty()) break block4;
                for (cgk $$2 : $$1) {
                    if ($$2 instanceof ddm || $$2 instanceof cwh || $$2 instanceof dgi || this.a.cr() || $$2.cq()) {
                        $$2.h(this.a);
                        continue;
                    }
                    $$2.o(this.a);
                }
                break block4;
            }
            for (cgk $$3 : this.c().a_(this.a, $$0)) {
                if (this.a.z($$3) || !$$3.bY() || !($$3 instanceof dgi)) continue;
                $$3.h(this.a);
            }
        }
        return false;
    }

    @Override
    public iz l() {
        return this.a.u() ? this.a.dg().g().h() : this.a.dg().h();
    }

    @Override
    public ftm d(ftm $$0) {
        if (Double.isNaN($$0.g) || Double.isNaN($$0.h) || Double.isNaN($$0.i)) {
            return ftm.c;
        }
        return new ftm(bgj.a($$0.g, -0.4, 0.4), $$0.h, bgj.a($$0.i, -0.4, 0.4));
    }

    @Override
    public double b(axf $$0) {
        return this.a.by() ? 0.2 : 0.4;
    }

    @Override
    public double m() {
        return this.a.cr() ? 0.997 : 0.96;
    }
}

