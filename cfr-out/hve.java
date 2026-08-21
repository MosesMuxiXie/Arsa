/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import java.util.Objects;
import org.joml.Quaternionfc;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class hve<T extends dgi, S extends iek>
extends hwp<T, S> {
    private static final amo f = amo.b("textures/entity/minecart.png");
    private static final float g = 0.75f;
    protected final hgt a;

    public hve(hwq.a $$0, hde $$1) {
        super($$0);
        this.d = 0.7f;
        this.a = new hgt($$0.a($$1));
    }

    @Override
    public void a(S $$0, fzm $$1, hpo $$2, ikp $$3) {
        eoh $$9;
        super.a($$0, $$1, $$2, $$3);
        $$1.a();
        long $$4 = ((iek)$$0).c;
        float $$5 = (((float)($$4 >> 16 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        float $$6 = (((float)($$4 >> 20 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        float $$7 = (((float)($$4 >> 24 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        $$1.a($$5, $$6, $$7);
        if (((iek)$$0).i) {
            hve.a($$0, $$1);
        } else {
            hve.b($$0, $$1);
        }
        float $$8 = ((iek)$$0).e;
        if ($$8 > 0.0f) {
            $$1.a((Quaternionfc)a.b.rotationDegrees(bgj.a((double)$$8) * $$8 * ((iek)$$0).f / 10.0f * (float)((iek)$$0).d));
        }
        if (($$9 = ((iek)$$0).h).o() != egf.a) {
            $$1.a();
            $$1.b(0.75f, 0.75f, 0.75f);
            $$1.a(-0.5f, (float)(((iek)$$0).g - 8) / 16.0f, 0.5f);
            $$1.a((Quaternionfc)a.d.rotationDegrees(90.0f));
            this.a($$0, $$9, $$1, $$2, ((iek)$$0).T);
            $$1.b();
        }
        $$1.b(-1.0f, -1.0f, 1.0f);
        $$2.a(this.a, $$0, $$1, this.a.a(f), ((iek)$$0).T, ilg.d, ((iek)$$0).U, null);
        $$1.b();
    }

    private static <S extends iek> void a(S $$0, fzm $$1) {
        $$1.a((Quaternionfc)a.d.rotationDegrees($$0.b));
        $$1.a((Quaternionfc)a.f.rotationDegrees(-$$0.a));
        $$1.a(0.0f, 0.375f, 0.0f);
    }

    private static <S extends iek> void b(S $$0, fzm $$1) {
        double $$2 = $$0.I;
        double $$3 = $$0.J;
        double $$4 = $$0.K;
        float $$5 = $$0.a;
        float $$6 = $$0.b;
        if ($$0.k != null && $$0.l != null && $$0.m != null) {
            ftm $$7 = $$0.l;
            ftm $$8 = $$0.m;
            $$1.a($$0.k.g - $$2, ($$7.h + $$8.h) / 2.0 - $$3, $$0.k.i - $$4);
            ftm $$9 = $$8.b(-$$7.g, -$$7.h, -$$7.i);
            if ($$9.g() != 0.0) {
                $$9 = $$9.d();
                $$6 = (float)(Math.atan2($$9.i, $$9.g) * 180.0 / Math.PI);
                $$5 = (float)(Math.atan($$9.h) * 73.0);
            }
        }
        $$1.a(0.0f, 0.375f, 0.0f);
        $$1.a((Quaternionfc)a.d.rotationDegrees(180.0f - $$6));
        $$1.a((Quaternionfc)a.f.rotationDegrees(-$$5));
    }

    @Override
    public void a(T $$0, S $$1, float $$2) {
        super.a($$0, $$1, $$2);
        dgl dgl2 = ((dgi)$$0).q();
        if (dgl2 instanceof dgs) {
            dgs $$3 = (dgs)dgl2;
            hve.a($$0, $$3, $$1, $$2);
            ((iek)$$1).i = true;
        } else {
            dgl2 = ((dgi)$$0).q();
            if (dgl2 instanceof dgt) {
                dgt $$4 = (dgt)dgl2;
                hve.a($$0, $$4, $$1, $$2);
                ((iek)$$1).i = false;
            }
        }
        long $$5 = (long)((cgk)$$0).aA() * 493286711L;
        ((iek)$$1).c = $$5 * $$5 * 4392167121L + $$5 * 98761L;
        ((iek)$$1).e = (float)((dga)$$0).m() - $$2;
        ((iek)$$1).d = ((dga)$$0).n();
        ((iek)$$1).f = Math.max(((dga)$$0).f() - $$2, 0.0f);
        ((iek)$$1).g = ((dgi)$$0).x();
        ((iek)$$1).h = ((dgi)$$0).v();
    }

    private static <T extends dgi, S extends iek> void a(T $$0, dgs $$1, S $$2, float $$3) {
        if ($$1.o()) {
            $$2.j = $$1.e($$3);
            $$2.a = $$1.c($$3);
            $$2.b = $$1.d($$3);
        } else {
            $$2.j = null;
            $$2.a = $$0.ee();
            $$2.b = $$0.ec();
        }
    }

    private static <T extends dgi, S extends iek> void a(T $$0, dgt $$1, S $$2, float $$3) {
        float $$4 = 0.3f;
        $$2.a = $$0.k($$3);
        $$2.b = $$0.l($$3);
        double $$5 = $$2.I;
        double $$6 = $$2.J;
        double $$7 = $$2.K;
        ftm $$8 = $$1.c($$5, $$6, $$7);
        if ($$8 != null) {
            $$2.k = $$8;
            ftm $$9 = $$1.a($$5, $$6, $$7, 0.3f);
            ftm $$10 = $$1.a($$5, $$6, $$7, -0.3f);
            $$2.l = Objects.requireNonNullElse($$9, $$8);
            $$2.m = Objects.requireNonNullElse($$10, $$8);
        } else {
            $$2.k = null;
            $$2.l = null;
            $$2.m = null;
        }
    }

    protected void a(S $$0, eoh $$1, fzm $$2, hpo $$3, int $$4) {
        $$3.a($$2, $$1, $$4, ilg.d, ((iek)$$0).U);
    }

    @Override
    protected fth a(T $$0) {
        fth $$1 = super.a($$0);
        if (!((dgi)$$0).v().l()) {
            return $$1.b(0.0, (float)((dgi)$$0).x() * 0.75f / 16.0f, 0.0);
        }
        return $$1;
    }

    @Override
    public ftm a(S $$0) {
        ftm $$1 = super.a($$0);
        if (((iek)$$0).i && ((iek)$$0).j != null) {
            return $$1.b(((iek)$$0).j.g - ((iek)$$0).I, ((iek)$$0).j.h - ((iek)$$0).J, ((iek)$$0).j.i - ((iek)$$0).K);
        }
        return $$1;
    }
}

