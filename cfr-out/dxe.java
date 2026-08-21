/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class dxe
implements dwi {
    private static final dwj a = new dwj();
    private static final int b = 16;
    private static final float c = 2.0f;
    private final boolean d;
    private final dwi.a e;
    private final axf f;
    private final ftm g;
    private final @Nullable cgk h;
    private final float i;
    private final cex j;
    private final dwj k;
    private final Map<ddm, ftm> l = new HashMap<ddm, ftm>();

    public dxe(axf $$0, @Nullable cgk $$1, @Nullable cex $$2, @Nullable dwj $$3, ftm $$4, float $$5, boolean $$6, dwi.a $$7) {
        this.f = $$0;
        this.h = $$1;
        this.i = $$5;
        this.g = $$4;
        this.d = $$6;
        this.e = $$7;
        this.j = $$2 == null ? $$0.as().a(this) : $$2;
        this.k = $$3 == null ? this.b($$1) : $$3;
    }

    private dwj b(@Nullable cgk $$0) {
        return $$0 == null ? a : new dwg($$0);
    }

    public static float a(ftm $$0, cgk $$1) {
        fth $$2 = $$1.dj();
        double $$3 = 1.0 / (($$2.d - $$2.a) * 2.0 + 1.0);
        double $$4 = 1.0 / (($$2.e - $$2.b) * 2.0 + 1.0);
        double $$5 = 1.0 / (($$2.f - $$2.c) * 2.0 + 1.0);
        double $$6 = (1.0 - Math.floor(1.0 / $$3) * $$3) / 2.0;
        double $$7 = (1.0 - Math.floor(1.0 / $$5) * $$5) / 2.0;
        if ($$3 < 0.0 || $$4 < 0.0 || $$5 < 0.0) {
            return 0.0f;
        }
        int $$8 = 0;
        int $$9 = 0;
        for (double $$10 = 0.0; $$10 <= 1.0; $$10 += $$3) {
            for (double $$11 = 0.0; $$11 <= 1.0; $$11 += $$4) {
                for (double $$12 = 0.0; $$12 <= 1.0; $$12 += $$5) {
                    double $$13 = bgj.d($$10, $$2.a, $$2.d);
                    double $$14 = bgj.d($$11, $$2.b, $$2.e);
                    double $$15 = bgj.d($$12, $$2.c, $$2.f);
                    ftm $$16 = new ftm($$13 + $$6, $$14, $$15 + $$7);
                    if ($$1.ao().a(new dvw($$16, $$0, dvw.a.a, dvw.b.a, $$1)).d() == ftk.a.a) {
                        ++$$8;
                    }
                    ++$$9;
                }
            }
        }
        return (float)$$8 / (float)$$9;
    }

    @Override
    public float e() {
        return this.i;
    }

    @Override
    public ftm f() {
        return this.g;
    }

    private List<is> m() {
        HashSet<is> $$0 = new HashSet<is>();
        int $$1 = 16;
        for (int $$2 = 0; $$2 < 16; ++$$2) {
            for (int $$3 = 0; $$3 < 16; ++$$3) {
                block2: for (int $$4 = 0; $$4 < 16; ++$$4) {
                    if ($$2 != 0 && $$2 != 15 && $$3 != 0 && $$3 != 15 && $$4 != 0 && $$4 != 15) continue;
                    double $$5 = (float)$$2 / 15.0f * 2.0f - 1.0f;
                    double $$6 = (float)$$3 / 15.0f * 2.0f - 1.0f;
                    double $$7 = (float)$$4 / 15.0f * 2.0f - 1.0f;
                    double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                    $$5 /= $$8;
                    $$6 /= $$8;
                    $$7 /= $$8;
                    double $$10 = this.g.g;
                    double $$11 = this.g.h;
                    double $$12 = this.g.i;
                    float $$13 = 0.3f;
                    for (float $$9 = this.i * (0.7f + this.f.y.i() * 0.6f); $$9 > 0.0f; $$9 -= 0.22500001f) {
                        is $$14 = is.a($$10, $$11, $$12);
                        eoh $$15 = this.f.a_($$14);
                        flb $$16 = this.f.b_($$14);
                        if (!this.f.n($$14)) continue block2;
                        Optional<Float> $$17 = this.k.a((dwi)this, (dvt)this.f, $$14, $$15, $$16);
                        if ($$17.isPresent()) {
                            $$9 -= ($$17.get().floatValue() + 0.3f) * 0.3f;
                        }
                        if ($$9 > 0.0f && this.k.a((dwi)this, (dvt)this.f, $$14, $$15, $$9)) {
                            $$0.add($$14);
                        }
                        $$10 += $$5 * (double)0.3f;
                        $$11 += $$6 * (double)0.3f;
                        $$12 += $$7 * (double)0.3f;
                    }
                }
            }
        }
        return new ObjectArrayList($$0);
    }

    private void n() {
        if (this.i < 1.0E-5f) {
            return;
        }
        float $$0 = this.i * 2.0f;
        int $$1 = bgj.c(this.g.g - (double)$$0 - 1.0);
        int $$2 = bgj.c(this.g.g + (double)$$0 + 1.0);
        int $$3 = bgj.c(this.g.h - (double)$$0 - 1.0);
        int $$4 = bgj.c(this.g.h + (double)$$0 + 1.0);
        int $$5 = bgj.c(this.g.i - (double)$$0 - 1.0);
        int $$6 = bgj.c(this.g.i + (double)$$0 + 1.0);
        List<cgk> $$7 = this.f.a_(this.h, new fth($$1, $$3, $$5, $$2, $$4, $$6));
        for (cgk $$8 : $$7) {
            ddm $$20;
            double d2;
            float $$14;
            double $$9;
            if ($$8.a(this) || ($$9 = Math.sqrt($$8.g(this.g)) / (double)$$0) > 1.0) continue;
            ftm $$10 = $$8 instanceof czm ? $$8.dI() : $$8.bV();
            ftm $$11 = $$10.d(this.g).d();
            boolean $$12 = this.k.a(this, $$8);
            float $$13 = this.k.a($$8);
            float f2 = $$14 = $$12 || $$13 != 0.0f ? dxe.a(this.g, $$8) : 0.0f;
            if ($$12) {
                $$8.a(this.f, this.j, this.k.a(this, $$8, $$14));
            }
            if ($$8 instanceof chl) {
                chl $$15 = (chl)$$8;
                d2 = $$15.i(cis.k);
            } else {
                d2 = 0.0;
            }
            double $$16 = d2;
            double $$17 = (1.0 - $$9) * (double)$$14 * (double)$$13 * (1.0 - $$16);
            ftm $$18 = $$11.c($$17);
            $$8.h($$18);
            if ($$8.ay().a(bdt.I) && $$8 instanceof dec) {
                dec $$19 = (dec)$$8;
                $$19.d(this.j.d());
            } else if (!(!($$8 instanceof ddm) || ($$20 = (ddm)$$8).au() || $$20.ha() && $$20.gL().b)) {
                this.l.put($$20, $$18);
            }
            $$8.a(this.h);
        }
    }

    private void a(List<is> $$0) {
        ArrayList $$12 = new ArrayList();
        bhs.c($$0, this.f.y);
        for (is $$22 : $$0) {
            this.f.a_($$22).a(this.f, $$22, this, ($$1, $$2) -> dxe.a($$12, $$1, $$2));
        }
        for (a $$3 : $$12) {
            dzq.a((dwo)this.f, $$3.a, $$3.b);
        }
    }

    private void b(List<is> $$0) {
        for (is $$1 : $$0) {
            if (this.f.y.a(3) != 0 || !this.f.a_($$1).l() || !this.f.a_($$1.e()).s()) continue;
            this.f.c($$1, dzd.a(this.f, $$1));
        }
    }

    public int i() {
        this.f.a(this.h, etk.w, this.g);
        List<is> $$0 = this.m();
        this.n();
        if (this.o()) {
            bzm $$1 = bzl.a();
            $$1.a("explosion_blocks");
            this.a($$0);
            $$1.c();
        }
        if (this.d) {
            this.b($$0);
        }
        return $$0.size();
    }

    private static void a(List<a> $$0, dlt $$1, is $$2) {
        for (a $$3 : $$0) {
            $$3.a($$1);
            if (!$$1.f()) continue;
            return;
        }
        $$0.add(new a($$2, $$1));
    }

    private boolean o() {
        return this.e != dwi.a.a;
    }

    public Map<ddm, ftm> j() {
        return this.l;
    }

    @Override
    public axf a() {
        return this.f;
    }

    @Override
    public @Nullable chl c() {
        return dwi.a(this.h);
    }

    @Override
    public @Nullable cgk d() {
        return this.h;
    }

    public cex k() {
        return this.j;
    }

    @Override
    public dwi.a b() {
        return this.e;
    }

    @Override
    public boolean g() {
        if (this.e != dwi.a.d) {
            return false;
        }
        if (this.h != null && this.h.ay() == cgu.u) {
            return this.f.U().a(eua.F);
        }
        return true;
    }

    @Override
    public boolean h() {
        boolean $$1;
        boolean $$0 = this.f.U().a(eua.F);
        boolean bl2 = $$1 = this.h == null || this.h.ay() != cgu.u && this.h.ay() != cgu.bP;
        if ($$0) {
            return $$1;
        }
        return this.e.a() && $$1;
    }

    public boolean l() {
        return this.i < 2.0f || !this.o();
    }

    static class a {
        final is a;
        dlt b;

        a(is $$0, dlt $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public void a(dlt $$0) {
            if (czl.a(this.b, $$0)) {
                this.b = czl.a(this.b, $$0, 16);
            }
        }
    }
}

