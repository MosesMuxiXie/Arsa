/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 */
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;

public class hxe
extends hxx<czx, ids, hek> {
    private static final amo a = amo.b("textures/entity/guardian.png");
    private static final amo i = amo.b("textures/entity/guardian_beam.png");
    private static final ijs j = ijt.g(i);

    public hxe(hwq.a $$0) {
        this($$0, 0.5f, hdf.bn);
    }

    protected hxe(hwq.a $$0, float $$1, hde $$2) {
        super($$0, new hek($$0.a($$2)), $$1);
    }

    @Override
    public boolean a(czx $$0, htx $$1, double $$2, double $$3, double $$4) {
        chl $$5;
        if (super.a($$0, $$1, $$2, $$3, $$4)) {
            return true;
        }
        if ($$0.gS() && ($$5 = $$0.gT()) != null) {
            ftm $$6 = this.a($$5, (double)$$5.dG() * 0.5, 1.0f);
            ftm $$7 = this.a((chl)$$0, $$0.dk(), 1.0f);
            return $$1.a(new fth($$7.g, $$7.h, $$7.i, $$6.g, $$6.h, $$6.i));
        }
        return false;
    }

    private ftm a(chl $$0, double $$1, float $$2) {
        double $$3 = bgj.d((double)$$2, $$0.ao, $$0.dP());
        double $$4 = bgj.d((double)$$2, $$0.ap, $$0.dR()) + $$1;
        double $$5 = bgj.d((double)$$2, $$0.aq, $$0.dV());
        return new ftm($$3, $$4, $$5);
    }

    @Override
    public void a(ids $$0, fzm $$1, hpo $$2, ikp $$3) {
        super.a($$0, $$1, $$2, $$3);
        ftm $$4 = $$0.f;
        if ($$4 != null) {
            float $$5 = $$0.g * 0.5f % 1.0f;
            $$1.a();
            $$1.a(0.0f, $$0.O, 0.0f);
            hxe.a($$1, $$2, $$4.d($$0.c), $$0.g, $$0.h, $$5);
            $$1.b();
        }
    }

    private static void a(fzm $$0, hpo $$1, ftm $$2, float $$3, float $$4, float $$5) {
        float $$6 = (float)($$2.g() + 1.0);
        $$2 = $$2.d();
        float $$7 = (float)Math.acos($$2.h);
        float $$8 = 1.5707964f - (float)Math.atan2($$2.i, $$2.g);
        $$0.a((Quaternionfc)a.d.rotationDegrees($$8 * 57.295776f));
        $$0.a((Quaternionfc)a.b.rotationDegrees($$7 * 57.295776f));
        float $$9 = $$3 * 0.05f * -1.5f;
        float $$10 = $$4 * $$4;
        int $$11 = 64 + (int)($$10 * 191.0f);
        int $$12 = 32 + (int)($$10 * 191.0f);
        int $$13 = 128 - (int)($$10 * 64.0f);
        float $$14 = 0.2f;
        float $$15 = 0.282f;
        float $$16 = bgj.b((double)($$9 + 2.3561945f)) * 0.282f;
        float $$17 = bgj.a((double)($$9 + 2.3561945f)) * 0.282f;
        float $$18 = bgj.b((double)($$9 + 0.7853982f)) * 0.282f;
        float $$19 = bgj.a((double)($$9 + 0.7853982f)) * 0.282f;
        float $$20 = bgj.b((double)($$9 + 3.926991f)) * 0.282f;
        float $$21 = bgj.a((double)($$9 + 3.926991f)) * 0.282f;
        float $$22 = bgj.b((double)($$9 + 5.4977875f)) * 0.282f;
        float $$232 = bgj.a((double)($$9 + 5.4977875f)) * 0.282f;
        float $$242 = bgj.b((double)($$9 + (float)Math.PI)) * 0.2f;
        float $$25 = bgj.a((double)($$9 + (float)Math.PI)) * 0.2f;
        float $$26 = bgj.b((double)($$9 + 0.0f)) * 0.2f;
        float $$27 = bgj.a((double)($$9 + 0.0f)) * 0.2f;
        float $$28 = bgj.b((double)($$9 + 1.5707964f)) * 0.2f;
        float $$29 = bgj.a((double)($$9 + 1.5707964f)) * 0.2f;
        float $$30 = bgj.b((double)($$9 + 4.712389f)) * 0.2f;
        float $$31 = bgj.a((double)($$9 + 4.712389f)) * 0.2f;
        float $$32 = $$6;
        float $$33 = 0.0f;
        float $$34 = 0.4999f;
        float $$35 = -1.0f + $$5;
        float $$36 = $$35 + $$6 * 2.5f;
        $$1.a($$0, j, ($$23, $$24) -> {
            hxe.a($$24, $$23, $$242, $$32, $$25, $$11, $$12, $$13, 0.4999f, $$36);
            hxe.a($$24, $$23, $$242, 0.0f, $$25, $$11, $$12, $$13, 0.4999f, $$35);
            hxe.a($$24, $$23, $$26, 0.0f, $$27, $$11, $$12, $$13, 0.0f, $$35);
            hxe.a($$24, $$23, $$26, $$32, $$27, $$11, $$12, $$13, 0.0f, $$36);
            hxe.a($$24, $$23, $$28, $$32, $$29, $$11, $$12, $$13, 0.4999f, $$36);
            hxe.a($$24, $$23, $$28, 0.0f, $$29, $$11, $$12, $$13, 0.4999f, $$35);
            hxe.a($$24, $$23, $$30, 0.0f, $$31, $$11, $$12, $$13, 0.0f, $$35);
            hxe.a($$24, $$23, $$30, $$32, $$31, $$11, $$12, $$13, 0.0f, $$36);
            float $$25 = bgj.b($$3) % 2 == 0 ? 0.5f : 0.0f;
            hxe.a($$24, $$23, $$16, $$32, $$17, $$11, $$12, $$13, 0.5f, $$25 + 0.5f);
            hxe.a($$24, $$23, $$18, $$32, $$19, $$11, $$12, $$13, 1.0f, $$25 + 0.5f);
            hxe.a($$24, $$23, $$22, $$32, $$232, $$11, $$12, $$13, 1.0f, $$25);
            hxe.a($$24, $$23, $$20, $$32, $$21, $$11, $$12, $$13, 0.5f, $$25);
        });
    }

    private static void a(fzp $$0, fzm.a $$1, float $$2, float $$3, float $$4, int $$5, int $$6, int $$7, float $$8, float $$9) {
        $$0.a($$1, $$2, $$3, $$4).a($$5, $$6, $$7, 255).a($$8, $$9).b(ilg.d).c(0xF000F0).b($$1, 0.0f, 1.0f, 0.0f);
    }

    public amo a(ids $$0) {
        return a;
    }

    public ids b() {
        return new ids();
    }

    @Override
    public void a(czx $$0, ids $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.M($$2);
        $$1.b = $$0.L($$2);
        $$1.c = $$0.n($$2);
        cgk $$3 = hxe.a($$0);
        if ($$3 != null) {
            $$1.d = $$0.h($$2);
            $$1.e = $$3.n($$2);
        } else {
            $$1.d = null;
            $$1.e = null;
        }
        chl $$4 = $$0.gT();
        if ($$4 != null) {
            $$1.h = $$0.N($$2);
            $$1.g = $$0.gU() + $$2;
            $$1.f = this.a($$4, (double)$$4.dG() * 0.5, $$2);
        } else {
            $$1.f = null;
        }
    }

    private static @Nullable cgk a(czx $$0) {
        cgk $$1 = gfj.V().au();
        if ($$0.gS()) {
            return $$0.gT();
        }
        return $$1;
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((ids)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

