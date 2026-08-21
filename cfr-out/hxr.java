/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public class hxr
extends hwp<chk, ieg> {
    public hxr(hwq.a $$0) {
        super($$0);
    }

    @Override
    public void a(ieg $$0, fzm $$1, hpo $$2, ikp $$3) {
        float[] $$4 = new float[8];
        float[] $$52 = new float[8];
        float $$62 = 0.0f;
        float $$7 = 0.0f;
        bgr $$8 = bgr.a($$0.a);
        for (int $$9 = 7; $$9 >= 0; --$$9) {
            $$4[$$9] = $$62;
            $$52[$$9] = $$7;
            $$62 += (float)($$8.a(11) - 5);
            $$7 += (float)($$8.a(11) - 5);
        }
        float $$10 = $$62;
        float $$11 = $$7;
        $$2.a($$1, ijt.l(), ($$5, $$6) -> {
            Matrix4f $$7 = $$5.a();
            for (int $$8 = 0; $$8 < 4; ++$$8) {
                bgr $$9 = bgr.a($$0.a);
                for (int $$10 = 0; $$10 < 3; ++$$10) {
                    int $$11 = 7;
                    int $$12 = 0;
                    if ($$10 > 0) {
                        $$11 = 7 - $$10;
                    }
                    if ($$10 > 0) {
                        $$12 = $$11 - 2;
                    }
                    float $$13 = $$4[$$11] - $$10;
                    float $$14 = $$52[$$11] - $$11;
                    for (int $$15 = $$11; $$15 >= $$12; --$$15) {
                        float $$16 = $$13;
                        float $$17 = $$14;
                        if ($$10 == 0) {
                            $$13 += (float)($$9.a(11) - 5);
                            $$14 += (float)($$9.a(11) - 5);
                        } else {
                            $$13 += (float)($$9.a(31) - 15);
                            $$14 += (float)($$9.a(31) - 15);
                        }
                        float $$18 = 0.5f;
                        float $$19 = 0.45f;
                        float $$20 = 0.45f;
                        float $$21 = 0.5f;
                        float $$22 = 0.1f + (float)$$8 * 0.2f;
                        if ($$10 == 0) {
                            $$22 *= (float)$$15 * 0.1f + 1.0f;
                        }
                        float $$23 = 0.1f + (float)$$8 * 0.2f;
                        if ($$10 == 0) {
                            $$23 *= ((float)$$15 - 1.0f) * 0.1f + 1.0f;
                        }
                        hxr.a($$7, $$6, $$13, $$14, $$15, $$16, $$17, 0.45f, 0.45f, 0.5f, $$22, $$23, false, false, true, false);
                        hxr.a($$7, $$6, $$13, $$14, $$15, $$16, $$17, 0.45f, 0.45f, 0.5f, $$22, $$23, true, false, true, true);
                        hxr.a($$7, $$6, $$13, $$14, $$15, $$16, $$17, 0.45f, 0.45f, 0.5f, $$22, $$23, true, true, false, true);
                        hxr.a($$7, $$6, $$13, $$14, $$15, $$16, $$17, 0.45f, 0.45f, 0.5f, $$22, $$23, false, true, false, false);
                    }
                }
            }
        });
    }

    private static void a(Matrix4f $$0, fzp $$1, float $$2, float $$3, int $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, float $$11, boolean $$12, boolean $$13, boolean $$14, boolean $$15) {
        $$1.a((Matrix4fc)$$0, $$2 + ($$12 ? $$11 : -$$11), (float)($$4 * 16), $$3 + ($$13 ? $$11 : -$$11)).a($$7, $$8, $$9, 0.3f);
        $$1.a((Matrix4fc)$$0, $$5 + ($$12 ? $$10 : -$$10), (float)(($$4 + 1) * 16), $$6 + ($$13 ? $$10 : -$$10)).a($$7, $$8, $$9, 0.3f);
        $$1.a((Matrix4fc)$$0, $$5 + ($$14 ? $$10 : -$$10), (float)(($$4 + 1) * 16), $$6 + ($$15 ? $$10 : -$$10)).a($$7, $$8, $$9, 0.3f);
        $$1.a((Matrix4fc)$$0, $$2 + ($$14 ? $$11 : -$$11), (float)($$4 * 16), $$3 + ($$15 ? $$11 : -$$11)).a($$7, $$8, $$9, 0.3f);
    }

    public ieg a() {
        return new ieg();
    }

    @Override
    public void a(chk $$0, ieg $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.a;
    }

    protected boolean a(chk $$0) {
        return false;
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }

    @Override
    protected /* synthetic */ boolean b(cgk cgk2) {
        return this.a((chk)cgk2);
    }
}

