/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.ArrayList;
import org.jspecify.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class hwp<T extends cgk, S extends idf> {
    private static final float a = 0.5f;
    private static final float f = 32.0f;
    public static final float b = 0.025f;
    protected final hwo c;
    private final gio g;
    protected float d;
    protected float e = 1.0f;

    protected hwp(hwq.a $$0) {
        this.c = $$0.a();
        this.g = $$0.j();
    }

    public final int a(T $$0, float $$1) {
        is $$2 = is.a(((cgk)$$0).o($$1));
        return hoj.a(this.a($$0, $$2), this.b($$0, $$2));
    }

    protected int b(T $$0, is $$1) {
        return ((cgk)$$0).ao().a(dww.a, $$1);
    }

    protected int a(T $$0, is $$1) {
        if (((cgk)$$0).cp()) {
            return 15;
        }
        return ((cgk)$$0).ao().a(dww.b, $$1);
    }

    public boolean a(T $$0, htx $$1, double $$2, double $$3, double $$4) {
        chj $$6;
        cgk $$7;
        if (!((cgk)$$0).j($$2, $$3, $$4)) {
            return false;
        }
        if (!this.b($$0)) {
            return true;
        }
        fth $$5 = this.a($$0).g(0.5);
        if ($$5.e() || $$5.a() == 0.0) {
            $$5 = new fth(((cgk)$$0).dP() - 2.0, ((cgk)$$0).dR() - 2.0, ((cgk)$$0).dV() - 2.0, ((cgk)$$0).dP() + 2.0, ((cgk)$$0).dR() + 2.0, ((cgk)$$0).dV() + 2.0);
        }
        if ($$1.a($$5)) {
            return true;
        }
        if ($$0 instanceof chj && ($$7 = ($$6 = (chj)$$0).C()) != null) {
            fth $$8 = this.c.a($$7).a($$7);
            return $$1.a($$8) || $$1.a($$5.b($$8));
        }
        return false;
    }

    protected fth a(T $$0) {
        return ((cgk)$$0).dj();
    }

    protected boolean b(T $$0) {
        return true;
    }

    public ftm a(S $$0) {
        if (((idf)$$0).V != null) {
            return ((idf)$$0).V;
        }
        return ftm.c;
    }

    public void a(S $$0, fzm $$1, hpo $$2, ikp $$3) {
        if (((idf)$$0).Y != null) {
            for (idf.a $$4 : ((idf)$$0).Y) {
                $$2.a($$1, $$4);
            }
        }
        this.b($$0, $$1, $$2, $$3);
    }

    protected boolean a(T $$0, double $$1) {
        return ((cgk)$$0).de() || ((cgk)$$0).i_() && $$0 == this.c.c;
    }

    public gio e() {
        return this.g;
    }

    protected void b(S $$0, fzm $$1, hpo $$2, ikp $$3) {
        if (((idf)$$0).W != null) {
            $$2.a($$1, ((idf)$$0).X, 0, ((idf)$$0).W, !((idf)$$0).R, ((idf)$$0).T, ((idf)$$0).P, $$3);
        }
    }

    protected @Nullable yh c(T $$0) {
        return ((cgk)$$0).R_();
    }

    protected float c(S $$0) {
        return this.d;
    }

    protected float b(S $$0) {
        return this.e;
    }

    public abstract S d();

    public final S b(T $$0, float $$1) {
        S $$2 = this.d();
        this.a($$0, $$2, $$1);
        this.a($$0, $$2);
        return $$2;
    }

    public void a(T $$0, S $$1, float $$2) {
        chj $$10;
        cgk cgk2;
        dgs $$4;
        dgi $$3;
        Object object;
        ((idf)$$1).H = ((cgk)$$0).ay();
        ((idf)$$1).I = bgj.d((double)$$2, ((cgk)$$0).ao, ((cgk)$$0).dP());
        ((idf)$$1).J = bgj.d((double)$$2, ((cgk)$$0).ap, ((cgk)$$0).dR());
        ((idf)$$1).K = bgj.d((double)$$2, ((cgk)$$0).aq, ((cgk)$$0).dV());
        ((idf)$$1).Q = ((cgk)$$0).cG();
        ((idf)$$1).L = (float)((cgk)$$0).at + $$2;
        ((idf)$$1).M = ((cgk)$$0).dF();
        ((idf)$$1).N = ((cgk)$$0).dG();
        ((idf)$$1).O = ((cgk)$$0).dk();
        if (((cgk)$$0).cq() && (object = ((cgk)$$0).dz()) instanceof dgi && (object = ($$3 = (dgi)object).q()) instanceof dgs && ($$4 = (dgs)object).o()) {
            double $$5 = bgj.d((double)$$2, $$3.ao, $$3.dP());
            double $$6 = bgj.d((double)$$2, $$3.ap, $$3.dR());
            double $$7 = bgj.d((double)$$2, $$3.aq, $$3.dV());
            ((idf)$$1).V = $$4.e($$2).d(new ftm($$5, $$6, $$7));
        } else {
            ((idf)$$1).V = null;
        }
        if (this.c.b != null) {
            boolean $$8;
            ((idf)$$1).P = this.c.b((cgk)$$0);
            boolean bl2 = $$8 = ((idf)$$1).P < 4096.0 && this.a($$0, ((idf)$$1).P);
            if ($$8) {
                ((idf)$$1).W = this.c($$0);
                ((idf)$$1).X = ((cgk)$$0).dH().a(cgl.c, 0, ((cgk)$$0).l($$2));
            } else {
                ((idf)$$1).W = null;
            }
        }
        ((idf)$$1).R = ((cgk)$$0).cx();
        dwo $$9 = ((cgk)$$0).ao();
        if ($$0 instanceof chj && (cgk2 = ($$10 = (chj)$$0).C()) instanceof cgk) {
            int $$21;
            cgk $$11 = cgk2;
            float $$12 = ((cgk)$$0).t($$2) * ((float)Math.PI / 180);
            ftm $$13 = $$10.a_($$2);
            is $$14 = is.a(((cgk)$$0).n($$2));
            is $$15 = is.a($$11.n($$2));
            int $$16 = this.a($$0, $$14);
            int $$17 = this.c.a($$11).a($$11, $$15);
            int $$18 = $$9.a(dww.a, $$14);
            int $$19 = $$9.a(dww.a, $$15);
            boolean $$20 = $$11.dY() && $$10.z();
            int n2 = $$21 = $$20 ? 4 : 1;
            if (((idf)$$1).Y == null || ((idf)$$1).Y.size() != $$21) {
                ((idf)$$1).Y = new ArrayList<idf.a>($$21);
                for (int $$22 = 0; $$22 < $$21; ++$$22) {
                    ((idf)$$1).Y.add(new idf.a());
                }
            }
            if ($$20) {
                float $$23 = $$11.t($$2) * ((float)Math.PI / 180);
                ftm $$24 = $$11.p($$2);
                ftm[] $$25 = $$10.A();
                ftm[] $$26 = $$11.dX();
                for (int $$27 = 0; $$27 < $$21; ++$$27) {
                    idf.a $$28 = ((idf)$$1).Y.get($$27);
                    $$28.a = $$25[$$27].b(-$$12);
                    $$28.b = ((cgk)$$0).p($$2).e($$28.a);
                    $$28.c = $$24.e($$26[$$27].b(-$$23));
                    $$28.d = $$16;
                    $$28.e = $$17;
                    $$28.f = $$18;
                    $$28.g = $$19;
                    $$28.h = false;
                }
            } else {
                ftm $$29 = $$13.b(-$$12);
                idf.a $$30 = ((idf)$$1).Y.getFirst();
                $$30.a = $$29;
                $$30.b = ((cgk)$$0).p($$2).e($$29);
                $$30.c = $$11.u($$2);
                $$30.d = $$16;
                $$30.e = $$17;
                $$30.f = $$18;
                $$30.g = $$19;
            }
        } else {
            ((idf)$$1).Y = null;
        }
        ((idf)$$1).S = ((cgk)$$0).cX();
        gfj $$31 = gfj.V();
        boolean $$32 = $$31.b((cgk)$$0);
        ((idf)$$1).U = $$32 ? bel.g(((cgk)$$0).h_()) : 0;
        ((idf)$$1).T = this.a($$0, $$2);
    }

    protected void a(T $$0, S $$1) {
        gfj $$2 = gfj.V();
        dwo $$3 = ((cgk)$$0).ao();
        this.a($$1, $$2, $$3);
    }

    private void a(S $$0, gfj $$1, dwo $$2) {
        ((idf)$$0).aa.clear();
        if ($$1.k.ab().b().booleanValue() && !((idf)$$0).Q) {
            double $$4;
            float $$5;
            float $$3;
            ((idf)$$0).Z = $$3 = Math.min(this.c($$0), 32.0f);
            if ($$3 > 0.0f && ($$5 = (float)((1.0 - ($$4 = ((idf)$$0).P) / 256.0) * (double)this.b($$0))) > 0.0f) {
                int $$6 = bgj.c(((idf)$$0).I - (double)$$3);
                int $$7 = bgj.c(((idf)$$0).I + (double)$$3);
                int $$8 = bgj.c(((idf)$$0).K - (double)$$3);
                int $$9 = bgj.c(((idf)$$0).K + (double)$$3);
                float $$10 = Math.min($$5 / 0.5f - 1.0f, $$3);
                int $$11 = bgj.c(((idf)$$0).J - (double)$$10);
                int $$12 = bgj.c(((idf)$$0).J);
                is.a $$13 = new is.a();
                for (int $$14 = $$8; $$14 <= $$9; ++$$14) {
                    for (int $$15 = $$6; $$15 <= $$7; ++$$15) {
                        $$13.d($$15, 0, $$14);
                        eqf $$16 = $$2.E($$13);
                        for (int $$17 = $$11; $$17 <= $$12; ++$$17) {
                            $$13.q($$17);
                            this.a($$0, $$2, $$5, $$13, $$16);
                        }
                    }
                }
            }
        } else {
            ((idf)$$0).Z = 0.0f;
        }
    }

    private void a(S $$0, dwo $$1, float $$2, is.a $$3, eqf $$4) {
        float $$5 = $$2 - (float)(((idf)$$0).J - (double)$$3.v()) * 0.5f;
        is $$6 = $$3.e();
        eoh $$7 = $$4.a_($$6);
        if ($$7.o() == egf.a) {
            return;
        }
        int $$8 = $$1.G($$3);
        if ($$8 <= 3) {
            return;
        }
        if (!$$7.m($$4, $$6)) {
            return;
        }
        fug $$9 = $$7.f($$4, $$6);
        if ($$9.c()) {
            return;
        }
        float $$10 = bgj.a($$5 * 0.5f * hoj.a($$1.F_(), $$8), 0.0f, 1.0f);
        float $$11 = (float)((double)$$3.u() - ((idf)$$0).I);
        float $$12 = (float)((double)$$3.v() - ((idf)$$0).J);
        float $$13 = (float)((double)$$3.w() - ((idf)$$0).K);
        ((idf)$$0).aa.add(new idf.b($$11, $$12, $$13, $$9, $$10));
    }

    private static @Nullable cgk d(cgk $$0) {
        axf $$2;
        iqa $$1 = gfj.V().aa();
        if ($$1 != null && ($$2 = $$1.a($$0.ao().aq())) != null) {
            return $$2.a($$0.aA());
        }
        return null;
    }
}

