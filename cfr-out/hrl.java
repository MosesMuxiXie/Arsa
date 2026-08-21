/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class hrl<T extends elb>
implements hri<T, hsn> {
    public static final int a = bel.a(0.2f, 0.75f, 0.75f, 1.0f);

    public hsn a() {
        return new hsn();
    }

    @Override
    public void a(T $$0, hsn $$1, float $$2, ftm $$3, @Nullable igi.a $$4) {
        hri.super.a($$0, $$1, $$2, $$3, $$4);
        hrl.a($$0, $$1);
    }

    public static <T extends elb> void a(T $$0, hsn $$1) {
        hnh $$2 = gfj.V().s;
        $$1.a = $$2.hi() || $$2.au();
        $$1.c = ((ele)((Object)$$0)).c();
        $$1.b = ((ele)((Object)$$0)).b();
        is $$3 = $$1.c.a();
        jy $$4 = $$1.c.b();
        is $$5 = $$1.f;
        is $$6 = $$5.a($$3);
        if ($$1.a && $$0.j() != null && $$1.b == ele.a.c) {
            $$1.d = new hsn.a[$$4.u() * $$4.v() * $$4.w()];
            for (int $$7 = 0; $$7 < $$4.u(); ++$$7) {
                for (int $$8 = 0; $$8 < $$4.v(); ++$$8) {
                    for (int $$9 = 0; $$9 < $$4.w(); ++$$9) {
                        int $$10 = $$9 * $$4.u() * $$4.v() + $$8 * $$4.u() + $$7;
                        eoh $$11 = $$0.j().a_($$6.b($$7, $$8, $$9));
                        if ($$11.l()) {
                            $$1.d[$$10] = hsn.a.a;
                            continue;
                        }
                        if ($$11.a(dzs.lJ)) {
                            $$1.d[$$10] = hsn.a.d;
                            continue;
                        }
                        if ($$11.a(dzs.iO)) {
                            $$1.d[$$10] = hsn.a.b;
                            continue;
                        }
                        if (!$$11.a(dzs.iP)) continue;
                        $$1.d[$$10] = hsn.a.c;
                    }
                }
            }
        } else {
            $$1.d = null;
        }
        if ($$1.a) {
            // empty if block
        }
        $$1.e = null;
    }

    @Override
    public void a(hsn $$0, fzm $$1, hpo $$2, ikp $$3) {
        if (!$$0.a) {
            return;
        }
        ele.a $$4 = $$0.b;
        if ($$4 == ele.a.a) {
            return;
        }
        ele.b $$5 = $$0.c;
        is $$6 = $$5.a();
        jy $$7 = $$5.b();
        if ($$7.u() < 1 || $$7.v() < 1 || $$7.w() < 1) {
            return;
        }
        float $$8 = 1.0f;
        float $$9 = 0.9f;
        is $$10 = $$6.a($$7);
        um.a(new fth($$6.u(), $$6.v(), $$6.w(), $$10.u(), $$10.v(), $$10.w()).a($$0.f), ul.a(bel.a(1.0f, 0.9f, 0.9f, 0.9f)), true);
        this.a($$0, $$6, $$7);
    }

    private void a(hsn $$0, is $$1, jy $$2) {
        if ($$0.d == null) {
            return;
        }
        is $$3 = $$0.f;
        is $$4 = $$3.a($$1);
        for (int $$5 = 0; $$5 < $$2.u(); ++$$5) {
            for (int $$6 = 0; $$6 < $$2.v(); ++$$6) {
                for (int $$7 = 0; $$7 < $$2.w(); ++$$7) {
                    int $$8 = $$7 * $$2.u() * $$2.v() + $$6 * $$2.u() + $$5;
                    hsn.a $$9 = $$0.d[$$8];
                    if ($$9 == null) continue;
                    float $$10 = $$9 == hsn.a.a ? 0.05f : 0.0f;
                    double $$11 = (float)($$4.u() + $$5) + 0.45f - $$10;
                    double $$12 = (float)($$4.v() + $$6) + 0.45f - $$10;
                    double $$13 = (float)($$4.w() + $$7) + 0.45f - $$10;
                    double $$14 = (float)($$4.u() + $$5) + 0.55f + $$10;
                    double $$15 = (float)($$4.v() + $$6) + 0.55f + $$10;
                    double $$16 = (float)($$4.w() + $$7) + 0.55f + $$10;
                    fth $$17 = new fth($$11, $$12, $$13, $$14, $$15, $$16);
                    if ($$9 == hsn.a.a) {
                        um.a($$17, ul.a(bel.a(1.0f, 0.5f, 0.5f, 1.0f)));
                        continue;
                    }
                    if ($$9 == hsn.a.d) {
                        um.a($$17, ul.a(bel.a(1.0f, 1.0f, 0.75f, 0.75f)));
                        continue;
                    }
                    if ($$9 == hsn.a.b) {
                        um.a($$17, ul.a(-65536));
                        continue;
                    }
                    if ($$9 != hsn.a.c) continue;
                    um.a($$17, ul.a(-256));
                }
            }
        }
    }

    private void b(hsn $$0, is $$12, jy $$22) {
        if ($$0.e == null) {
            return;
        }
        ftp $$32 = new ftp($$22.u(), $$22.v(), $$22.w());
        for (int $$42 = 0; $$42 < $$22.u(); ++$$42) {
            for (int $$5 = 0; $$5 < $$22.v(); ++$$5) {
                for (int $$6 = 0; $$6 < $$22.w(); ++$$6) {
                    int $$7 = $$6 * $$22.u() * $$22.v() + $$5 * $$22.u() + $$42;
                    if (!$$0.e[$$7]) continue;
                    ((ftv)$$32).c($$42, $$5, $$6);
                }
            }
        }
        $$32.a(($$1, $$2, $$3, $$4) -> {
            float $$5 = 0.48f;
            float $$6 = (float)($$2 + $$12.u()) + 0.5f - 0.48f;
            float $$7 = (float)($$3 + $$12.v()) + 0.5f - 0.48f;
            float $$8 = (float)($$4 + $$12.w()) + 0.5f - 0.48f;
            float $$9 = (float)($$2 + $$12.u()) + 0.5f + 0.48f;
            float $$10 = (float)($$3 + $$12.v()) + 0.5f + 0.48f;
            float $$11 = (float)($$4 + $$12.w()) + 0.5f + 0.48f;
            um.a(new ftm($$6, $$7, $$8), new ftm($$9, $$10, $$11), $$1, ul.b(a));
        });
    }

    @Override
    public boolean bk_() {
        return true;
    }

    @Override
    public int bl_() {
        return 96;
    }

    @Override
    public /* synthetic */ hsm e() {
        return this.a();
    }
}

