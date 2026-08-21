/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class hxn
extends hwp<czl, iee> {
    private static final float a = 0.0625f;
    private static final float f = 0.15f;
    private static final float g = 0.0625f;
    private final ihk h;
    private final bgr i = bgr.a();

    public hxn(hwq.a $$0) {
        super($$0);
        this.h = $$0.b();
        this.d = 0.15f;
        this.e = 0.75f;
    }

    public iee a() {
        return new iee();
    }

    @Override
    public void a(czl $$0, iee $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.d = $$0.b;
        $$1.a($$0, $$0.e(), this.h);
    }

    @Override
    public void a(iee $$0, fzm $$1, hpo $$2, ikp $$3) {
        if ($$0.a.e()) {
            return;
        }
        $$1.a();
        fth $$4 = $$0.a.g();
        float $$5 = -((float)$$4.b) + 0.0625f;
        float $$6 = bgj.a((double)($$0.L / 10.0f + $$0.d)) * 0.1f + 0.1f;
        $$1.a(0.0f, $$6 + $$5, 0.0f);
        float $$7 = czl.f($$0.L, $$0.d);
        $$1.a((Quaternionfc)a.d.rotation($$7));
        hxn.a($$1, $$2, $$0.T, $$0, this.i, $$4);
        $$1.b();
        super.a($$0, $$1, $$2, $$3);
    }

    public static void a(fzm $$0, hpo $$1, int $$2, iec $$3, bgr $$4) {
        hxn.a($$0, $$1, $$2, $$3, $$4, $$3.a.g());
    }

    public static void a(fzm $$0, hpo $$1, int $$2, iec $$3, bgr $$4, fth $$5) {
        int $$6 = $$3.b;
        if ($$6 == 0) {
            return;
        }
        $$4.b((long)$$3.c);
        ihm $$7 = $$3.a;
        float $$8 = (float)$$5.d();
        if ($$8 > 0.0625f) {
            $$7.a($$0, $$1, $$2, ilg.d, $$3.U);
            for (int $$9 = 1; $$9 < $$6; ++$$9) {
                $$0.a();
                float $$10 = ($$4.i() * 2.0f - 1.0f) * 0.15f;
                float $$11 = ($$4.i() * 2.0f - 1.0f) * 0.15f;
                float $$12 = ($$4.i() * 2.0f - 1.0f) * 0.15f;
                $$0.a($$10, $$11, $$12);
                $$7.a($$0, $$1, $$2, ilg.d, $$3.U);
                $$0.b();
            }
        } else {
            float $$13 = $$8 * 1.5f;
            $$0.a(0.0f, 0.0f, -($$13 * (float)($$6 - 1) / 2.0f));
            $$7.a($$0, $$1, $$2, ilg.d, $$3.U);
            $$0.a(0.0f, 0.0f, $$13);
            for (int $$14 = 1; $$14 < $$6; ++$$14) {
                $$0.a();
                float $$15 = ($$4.i() * 2.0f - 1.0f) * 0.15f * 0.5f;
                float $$16 = ($$4.i() * 2.0f - 1.0f) * 0.15f * 0.5f;
                $$0.a($$15, $$16, 0.0f);
                $$7.a($$0, $$1, $$2, ilg.d, $$3.U);
                $$0.b();
                $$0.a(0.0f, 0.0f, $$13);
            }
        }
    }

    public static void b(fzm $$0, hpo $$1, int $$2, iec $$3, bgr $$4) {
        fth $$5 = $$3.a.g();
        int $$6 = $$3.b;
        if ($$6 == 0) {
            return;
        }
        $$4.b((long)$$3.c);
        ihm $$7 = $$3.a;
        float $$8 = (float)$$5.d();
        if ($$8 > 0.0625f) {
            $$7.a($$0, $$1, $$2, ilg.d, $$3.U);
            for (int $$9 = 1; $$9 < $$6; ++$$9) {
                $$0.a();
                float $$10 = ($$4.i() * 2.0f - 1.0f) * 0.15f;
                float $$11 = ($$4.i() * 2.0f - 1.0f) * 0.15f;
                float $$12 = ($$4.i() * 2.0f - 1.0f) * 0.15f;
                $$0.a($$10, $$11, $$12);
                $$7.a($$0, $$1, $$2, ilg.d, $$3.U);
                $$0.b();
            }
        } else {
            float $$13 = $$8 * 1.5f;
            $$0.a(0.0f, 0.0f, -($$13 * (float)($$6 - 1) / 2.0f));
            $$7.a($$0, $$1, $$2, ilg.d, $$3.U);
            $$0.a(0.0f, 0.0f, $$13);
            for (int $$14 = 1; $$14 < $$6; ++$$14) {
                $$0.a();
                float $$15 = ($$4.i() * 2.0f - 1.0f) * 0.15f * 0.5f;
                float $$16 = ($$4.i() * 2.0f - 1.0f) * 0.15f * 0.5f;
                $$0.a($$15, $$16, 0.0f);
                $$7.a($$0, $$1, $$2, ilg.d, $$3.U);
                $$0.b();
                $$0.a(0.0f, 0.0f, $$13);
            }
        }
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

