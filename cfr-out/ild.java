/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.platform.TextureUtil;

public class ild {
    private static final String a = "item/";
    private static final float b = 0.5f;
    private static final float c = 0.3f;

    private ild() {
    }

    private static float a(fyh $$0, float $$1, float $$2) {
        int $$3 = $$0.a();
        int $$4 = $$0.b();
        float $$5 = 0.0f;
        int $$6 = 4;
        for (int $$7 = 0; $$7 < $$4 - 1; ++$$7) {
            for (int $$8 = 0; $$8 < $$3 - 1; ++$$8) {
                float $$9 = Math.clamp(bel.m($$0.a($$8, $$7)) * $$2, 0.0f, 1.0f);
                float $$10 = Math.clamp(bel.m($$0.a($$8 + 1, $$7)) * $$2, 0.0f, 1.0f);
                float $$11 = Math.clamp(bel.m($$0.a($$8, $$7 + 1)) * $$2, 0.0f, 1.0f);
                float $$12 = Math.clamp(bel.m($$0.a($$8 + 1, $$7 + 1)) * $$2, 0.0f, 1.0f);
                float $$13 = 0.0f;
                for (int $$14 = 0; $$14 < 4; ++$$14) {
                    float $$15 = ((float)$$14 + 0.5f) / 4.0f;
                    for (int $$16 = 0; $$16 < 4; ++$$16) {
                        float $$17 = ((float)$$16 + 0.5f) / 4.0f;
                        float $$18 = $$9 * (1.0f - $$17) * (1.0f - $$15) + $$10 * $$17 * (1.0f - $$15) + $$11 * (1.0f - $$17) * $$15 + $$12 * $$17 * $$15;
                        if (!($$18 > $$1)) continue;
                        $$13 += 1.0f;
                    }
                }
                $$5 += $$13 / 16.0f;
            }
        }
        return $$5 / (float)(($$3 - 1) * ($$4 - 1));
    }

    private static void a(fyh $$0, float $$1, float $$2, float $$3) {
        float $$4 = 0.0f;
        float $$5 = 4.0f;
        float $$6 = 1.0f;
        float $$7 = 1.0f;
        float $$8 = Float.MAX_VALUE;
        int $$9 = $$0.a();
        int $$10 = $$0.b();
        for (int $$11 = 0; $$11 < 5; ++$$11) {
            float $$12 = ild.a($$0, $$2, $$6);
            float $$13 = Math.abs($$12 - $$1);
            if ($$13 < $$8) {
                $$8 = $$13;
                $$7 = $$6;
            }
            if ($$12 < $$1) {
                $$4 = $$6;
            } else {
                if (!($$12 > $$1)) break;
                $$5 = $$6;
            }
            $$6 = ($$4 + $$5) * 0.5f;
        }
        for (int $$14 = 0; $$14 < $$10; ++$$14) {
            for (int $$15 = 0; $$15 < $$9; ++$$15) {
                int $$16 = $$0.a($$15, $$14);
                float $$17 = bel.m($$16);
                $$17 = $$17 * $$7 + $$3 + 0.025f;
                $$17 = Math.clamp($$17, 0.0f, 1.0f);
                $$0.b($$15, $$14, bel.a($$17, $$16));
            }
        }
    }

    public static fyh[] a(amo $$0, fyh[] $$1, int $$2, ile $$3, float $$4) {
        if ($$3 == ile.a) {
            ile ile2 = $$3 = ild.a($$1[0]) ? ile.c : ile.b;
        }
        if ($$1.length == 1 && !$$0.a().startsWith(a)) {
            if ($$3 == ile.c || $$3 == ile.d) {
                TextureUtil.solidify($$1[0]);
            } else if ($$3 == ile.e) {
                TextureUtil.fillEmptyAreasWithDarkColor($$1[0]);
            }
        }
        if ($$2 + 1 <= $$1.length) {
            return $$1;
        }
        fyh[] $$5 = new fyh[$$2 + 1];
        $$5[0] = $$1[0];
        boolean $$6 = $$3 == ile.c || $$3 == ile.d || $$3 == ile.e;
        float $$7 = $$3 == ile.d ? 0.3f : 0.5f;
        float $$8 = $$6 ? ild.a($$1[0], $$7, 1.0f) : 0.0f;
        for (int $$9 = 1; $$9 <= $$2; ++$$9) {
            if ($$9 < $$1.length) {
                $$5[$$9] = $$1[$$9];
            } else {
                fyh $$10 = $$5[$$9 - 1];
                fyh $$11 = new fyh($$10.a() >> 1, $$10.b() >> 1, false);
                int $$12 = $$11.a();
                int $$13 = $$11.b();
                for (int $$14 = 0; $$14 < $$12; ++$$14) {
                    for (int $$15 = 0; $$15 < $$13; ++$$15) {
                        int $$21;
                        int $$16 = $$10.a($$14 * 2 + 0, $$15 * 2 + 0);
                        int $$17 = $$10.a($$14 * 2 + 1, $$15 * 2 + 0);
                        int $$18 = $$10.a($$14 * 2 + 0, $$15 * 2 + 1);
                        int $$19 = $$10.a($$14 * 2 + 1, $$15 * 2 + 1);
                        if ($$3 == ile.e) {
                            int $$20 = ild.a($$16, $$17, $$18, $$19);
                        } else {
                            $$21 = bel.a($$16, $$17, $$18, $$19);
                        }
                        $$11.b($$14, $$15, $$21);
                    }
                }
                $$5[$$9] = $$11;
            }
            if (!$$6) continue;
            ild.a($$5[$$9], $$8, $$7, $$4);
        }
        return $$5;
    }

    private static boolean a(fyh $$0) {
        for (int $$1 = 0; $$1 < $$0.a(); ++$$1) {
            for (int $$2 = 0; $$2 < $$0.b(); ++$$2) {
                if (bel.b($$0.a($$1, $$2)) != 0) continue;
                return true;
            }
        }
        return false;
    }

    private static int a(int $$0, int $$1, int $$2, int $$3) {
        float $$4 = 0.0f;
        float $$5 = 0.0f;
        float $$6 = 0.0f;
        float $$7 = 0.0f;
        if (bel.b($$0) != 0) {
            $$4 += bel.a(bel.b($$0));
            $$5 += bel.a(bel.c($$0));
            $$6 += bel.a(bel.d($$0));
            $$7 += bel.a(bel.e($$0));
        }
        if (bel.b($$1) != 0) {
            $$4 += bel.a(bel.b($$1));
            $$5 += bel.a(bel.c($$1));
            $$6 += bel.a(bel.d($$1));
            $$7 += bel.a(bel.e($$1));
        }
        if (bel.b($$2) != 0) {
            $$4 += bel.a(bel.b($$2));
            $$5 += bel.a(bel.c($$2));
            $$6 += bel.a(bel.d($$2));
            $$7 += bel.a(bel.e($$2));
        }
        if (bel.b($$3) != 0) {
            $$4 += bel.a(bel.b($$3));
            $$5 += bel.a(bel.c($$3));
            $$6 += bel.a(bel.d($$3));
            $$7 += bel.a(bel.e($$3));
        }
        return bel.b(bel.a($$4 /= 4.0f), bel.a($$5 /= 4.0f), bel.a($$6 /= 4.0f), bel.a($$7 /= 4.0f));
    }
}

