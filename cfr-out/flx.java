/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class flx
extends flo {
    public static final double l = 0.5;
    private static final double a = 1.125;
    private final Long2ObjectMap<fls> m = new Long2ObjectOpenHashMap();
    private final Object2BooleanMap<fth> n = new Object2BooleanOpenHashMap();
    private final fln[] o = new fln[iz.c.a.b()];

    @Override
    public void a(dxb $$0, chn $$1) {
        super.a($$0, $$1);
        $$1.G();
    }

    @Override
    public void b() {
        this.c.H();
        this.m.clear();
        this.n.clear();
        super.b();
    }

    @Override
    public fln a() {
        is.a $$0 = new is.a();
        int $$1 = this.c.dQ();
        eoh $$2 = this.b.a($$0.b(this.c.dP(), (double)$$1, this.c.dV()));
        if (this.c.a($$2.y())) {
            while (this.c.a($$2.y())) {
                $$2 = this.b.a($$0.b(this.c.dP(), (double)(++$$1), this.c.dV()));
            }
            --$$1;
        } else if (this.f() && this.c.by()) {
            while ($$2.a(dzs.J) || $$2.y() == flc.c.a(false)) {
                $$2 = this.b.a($$0.b(this.c.dP(), (double)(++$$1), this.c.dV()));
            }
            --$$1;
        } else if (this.c.aV()) {
            $$1 = bgj.c(this.c.dR() + 0.5);
        } else {
            $$0.b(this.c.dP(), this.c.dR() + 1.0, this.c.dV());
            while ($$0.v() > this.b.a().K_()) {
                $$1 = $$0.v();
                $$0.q($$0.v() - 1);
                eoh $$3 = this.b.a($$0);
                if ($$3.l() || $$3.a(flq.a)) continue;
                break;
            }
        }
        is $$4 = this.c.dK();
        if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
            fth $$5 = this.c.dj();
            if (this.a($$0.b($$5.a, (double)$$1, $$5.c)) || this.a($$0.b($$5.a, (double)$$1, $$5.f)) || this.a($$0.b($$5.d, (double)$$1, $$5.c)) || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
                return this.c($$0);
            }
        }
        return this.c(new is($$4.u(), $$1, $$4.w()));
    }

    protected fln c(is $$0) {
        fln $$1 = this.b($$0);
        $$1.l = this.b($$1.a, $$1.b, $$1.c);
        $$1.k = this.c.a($$1.l);
        return $$1;
    }

    protected boolean a(is $$0) {
        fls $$1 = this.b($$0.u(), $$0.v(), $$0.w());
        return $$1 != fls.b && this.c.a($$1) >= 0.0f;
    }

    @Override
    public flw a(double $$0, double $$1, double $$2) {
        return this.b($$0, $$1, $$2);
    }

    @Override
    public int a(fln[] $$0, fln $$1) {
        int $$2 = 0;
        int $$3 = 0;
        fls $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
        fls $$5 = this.b($$1.a, $$1.b, $$1.c);
        if (this.c.a($$4) >= 0.0f && $$5 != fls.w) {
            $$3 = bgj.b(Math.max(1.0f, this.c.eg()));
        }
        double $$6 = this.d(new is($$1.a, $$1.b, $$1.c));
        for (iz $$7 : iz.c.a) {
            fln $$8;
            this.o[$$7.e()] = $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
            if (!this.a($$8, $$1)) continue;
            $$0[$$2++] = $$8;
        }
        for (iz $$9 : iz.c.a) {
            fln $$11;
            iz $$10 = $$9.h();
            if (!this.a($$1, this.o[$$9.e()], this.o[$$10.e()]) || !this.a($$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5))) continue;
            $$0[$$2++] = $$11;
        }
        return $$2;
    }

    protected boolean a(@Nullable fln $$0, fln $$1) {
        return $$0 != null && !$$0.i && ($$0.k >= 0.0f || $$1.k < 0.0f);
    }

    protected boolean a(fln $$0, @Nullable fln $$1, @Nullable fln $$2) {
        if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
            return false;
        }
        if ($$1.l == fls.d || $$2.l == fls.d) {
            return false;
        }
        boolean $$3 = $$2.l == fls.h && $$1.l == fls.h && (double)this.c.dF() < 0.5;
        return ($$2.b < $$0.b || $$2.k >= 0.0f || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0f || $$3);
    }

    protected boolean a(@Nullable fln $$0) {
        if ($$0 == null || $$0.i) {
            return false;
        }
        if ($$0.l == fls.d) {
            return false;
        }
        return $$0.k >= 0.0f;
    }

    private static boolean a(fls $$0) {
        return $$0 == fls.h || $$0 == fls.s || $$0 == fls.t;
    }

    private boolean b(fln $$0) {
        fth $$1 = this.c.dj();
        ftm $$2 = new ftm((double)$$0.a - this.c.dP() + $$1.b() / 2.0, (double)$$0.b - this.c.dR() + $$1.c() / 2.0, (double)$$0.c - this.c.dV() + $$1.d() / 2.0);
        int $$3 = bgj.e($$2.g() / $$1.a());
        $$2 = $$2.c((double)(1.0f / (float)$$3));
        for (int $$4 = 1; $$4 <= $$3; ++$$4) {
            if (!this.a($$1 = $$1.c($$2))) continue;
            return false;
        }
        return true;
    }

    protected double d(is $$0) {
        dvx $$1 = this.b.a();
        if ((this.f() || this.c()) && $$1.b_($$0).a(bdv.a)) {
            return (double)$$0.v() + 0.5;
        }
        return flx.a($$1, $$0);
    }

    public static double a(dvt $$0, is $$1) {
        is $$2 = $$1.e();
        fug $$3 = $$0.a_($$2).g($$0, $$2);
        return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(iz.a.b));
    }

    protected boolean c() {
        return false;
    }

    protected @Nullable fln a(int $$0, int $$1, int $$2, int $$3, double $$4, iz $$5, fls $$6) {
        fln $$7 = null;
        is.a $$8 = new is.a();
        double $$9 = this.d($$8.d($$0, $$1, $$2));
        if ($$9 - $$4 > this.h()) {
            return null;
        }
        fls $$10 = this.b($$0, $$1, $$2);
        float $$11 = this.c.a($$10);
        if ($$11 >= 0.0f) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
        }
        if (flx.a($$6) && $$7 != null && $$7.k >= 0.0f && !this.b($$7)) {
            $$7 = null;
        }
        if ($$10 == fls.c || this.c() && $$10 == fls.j) {
            return $$7;
        }
        if (($$7 == null || $$7.k < 0.0f) && $$3 > 0 && ($$10 != fls.h || this.g()) && $$10 != fls.m && $$10 != fls.e && $$10 != fls.f) {
            $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
        } else if (!this.c() && $$10 == fls.j && !this.f()) {
            $$7 = this.a($$0, $$1, $$2, $$7);
        } else if ($$10 == fls.b) {
            $$7 = this.d($$0, $$1, $$2);
        } else if (flx.a($$10) && $$7 == null) {
            $$7 = this.a($$0, $$1, $$2, $$10);
        }
        return $$7;
    }

    private double h() {
        return Math.max(1.125, (double)this.c.eg());
    }

    private fln a(int $$0, int $$1, int $$2, fls $$3, float $$4) {
        fln $$5 = this.c($$0, $$1, $$2);
        $$5.l = $$3;
        $$5.k = Math.max($$5.k, $$4);
        return $$5;
    }

    private fln a(int $$0, int $$1, int $$2) {
        fln $$3 = this.c($$0, $$1, $$2);
        $$3.l = fls.a;
        $$3.k = -1.0f;
        return $$3;
    }

    private fln a(int $$0, int $$1, int $$2, fls $$3) {
        fln $$4 = this.c($$0, $$1, $$2);
        $$4.i = true;
        $$4.l = $$3;
        $$4.k = $$3.a();
        return $$4;
    }

    private @Nullable fln a(int $$0, int $$1, int $$2, int $$3, double $$4, iz $$5, fls $$6, is.a $$7) {
        fln $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
        if ($$8 == null) {
            return null;
        }
        if (this.c.dF() >= 1.0f) {
            return $$8;
        }
        if ($$8.l != fls.b && $$8.l != fls.c) {
            return $$8;
        }
        double $$9 = (double)($$0 - $$5.j()) + 0.5;
        double $$10 = (double)($$2 - $$5.l()) + 0.5;
        double $$11 = (double)this.c.dF() / 2.0;
        fth $$12 = new fth($$9 - $$11, this.d($$7.b($$9, (double)($$1 + 1), $$10)) + 0.001, $$10 - $$11, $$9 + $$11, (double)this.c.dG() + this.d($$7.b((double)$$8.a, (double)$$8.b, (double)$$8.c)) - 0.002, $$10 + $$11);
        return this.a($$12) ? null : $$8;
    }

    private @Nullable fln a(int $$0, int $$1, int $$2, @Nullable fln $$3) {
        --$$1;
        while ($$1 > this.c.ao().K_()) {
            fls $$4 = this.b($$0, $$1, $$2);
            if ($$4 != fls.j) {
                return $$3;
            }
            $$3 = this.a($$0, $$1, $$2, $$4, this.c.a($$4));
            --$$1;
        }
        return $$3;
    }

    private fln d(int $$0, int $$1, int $$2) {
        for (int $$3 = $$1 - 1; $$3 >= this.c.ao().K_(); --$$3) {
            if ($$1 - $$3 > this.c.cW()) {
                return this.a($$0, $$3, $$2);
            }
            fls $$4 = this.b($$0, $$3, $$2);
            float $$5 = this.c.a($$4);
            if ($$4 == fls.b) continue;
            if ($$5 >= 0.0f) {
                return this.a($$0, $$3, $$2, $$4, $$5);
            }
            return this.a($$0, $$3, $$2);
        }
        return this.a($$0, $$1, $$2);
    }

    private boolean a(fth $$0) {
        return this.n.computeIfAbsent((Object)$$0, $$1 -> !this.b.a().a((cgk)this.c, $$0));
    }

    protected fls b(int $$0, int $$1, int $$2) {
        return (fls)((Object)this.m.computeIfAbsent(is.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2, this.c)));
    }

    @Override
    public fls a(flu $$0, int $$1, int $$2, int $$3, chn $$4) {
        Set<fls> $$5 = this.b($$0, $$1, $$2, $$3);
        if ($$5.contains((Object)fls.h)) {
            return fls.h;
        }
        if ($$5.contains((Object)fls.m)) {
            return fls.m;
        }
        fls $$6 = fls.a;
        for (fls $$7 : $$5) {
            if ($$4.a($$7) < 0.0f) {
                return $$7;
            }
            if (!($$4.a($$7) >= $$4.a($$6))) continue;
            $$6 = $$7;
        }
        if (this.e <= 1 && $$6 != fls.b && $$4.a($$6) == 0.0f && this.a($$0, $$1, $$2, $$3) == fls.b) {
            return fls.b;
        }
        return $$6;
    }

    public Set<fls> b(flu $$0, int $$1, int $$2, int $$3) {
        EnumSet<fls> $$4 = EnumSet.noneOf(fls.class);
        for (int $$5 = 0; $$5 < this.e; ++$$5) {
            for (int $$6 = 0; $$6 < this.f; ++$$6) {
                for (int $$7 = 0; $$7 < this.g; ++$$7) {
                    int $$8 = $$5 + $$1;
                    int $$9 = $$6 + $$2;
                    int $$10 = $$7 + $$3;
                    fls $$11 = this.a($$0, $$8, $$9, $$10);
                    is $$12 = this.c.dK();
                    boolean $$13 = this.d();
                    if ($$11 == fls.s && this.e() && $$13) {
                        $$11 = fls.d;
                    }
                    if ($$11 == fls.r && !$$13) {
                        $$11 = fls.a;
                    }
                    if ($$11 == fls.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != fls.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != fls.l) {
                        $$11 = fls.m;
                    }
                    $$4.add($$11);
                }
            }
        }
        return $$4;
    }

    @Override
    public fls a(flu $$0, int $$1, int $$2, int $$3) {
        return flx.a($$0, new is.a($$1, $$2, $$3));
    }

    public static fls b(chn $$0, is $$1) {
        return flx.a(new flu($$0.ao(), $$0), $$1.k());
    }

    public static fls a(flu $$0, is.a $$1) {
        int $$4;
        int $$3;
        int $$2 = $$1.u();
        fls $$5 = $$0.a($$2, $$3 = $$1.v(), $$4 = $$1.w());
        if ($$5 != fls.b || $$3 < $$0.a().K_() + 1) {
            return $$5;
        }
        return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case fls.b, fls.j, fls.i, fls.c -> fls.b;
            case fls.o -> fls.o;
            case fls.q -> fls.q;
            case fls.w -> fls.w;
            case fls.f -> fls.g;
            case fls.y -> fls.y;
            case fls.e -> fls.z;
            default -> flx.a($$0, $$2, $$3, $$4, fls.c);
        };
    }

    public static fls a(flu $$0, int $$1, int $$2, int $$3, fls $$4) {
        for (int $$5 = -1; $$5 <= 1; ++$$5) {
            for (int $$6 = -1; $$6 <= 1; ++$$6) {
                for (int $$7 = -1; $$7 <= 1; ++$$7) {
                    if ($$5 == 0 && $$7 == 0) continue;
                    fls $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                    if ($$8 == fls.q) {
                        return fls.p;
                    }
                    if ($$8 == fls.o || $$8 == fls.i) {
                        return fls.n;
                    }
                    if ($$8 == fls.j) {
                        return fls.k;
                    }
                    if ($$8 != fls.y) continue;
                    return fls.y;
                }
            }
        }
        return $$4;
    }

    protected static fls b(dvt $$0, is $$1) {
        eoh $$2 = $$0.a_($$1);
        dzq $$3 = $$2.b();
        if ($$2.l()) {
            return fls.b;
        }
        if ($$2.a(bdp.O) || $$2.a(dzs.fV) || $$2.a(dzs.uc)) {
            return fls.e;
        }
        if ($$2.a(dzs.rP)) {
            return fls.f;
        }
        if ($$2.a(dzs.es) || $$2.a(dzs.pg)) {
            return fls.q;
        }
        if ($$2.a(dzs.qg)) {
            return fls.w;
        }
        if ($$2.a(dzs.gr)) {
            return fls.x;
        }
        if ($$2.a(dzs.cn) || $$2.a(dzs.tQ)) {
            return fls.y;
        }
        flb $$4 = $$2.y();
        if ($$4.a(bdv.b)) {
            return fls.i;
        }
        if (flx.a($$2)) {
            return fls.o;
        }
        if ($$3 instanceof ebz) {
            ebz $$5 = (ebz)$$3;
            if ($$2.c(ebz.e).booleanValue()) {
                return fls.r;
            }
            return $$5.b().c() ? fls.s : fls.t;
        }
        if ($$3 instanceof dzf) {
            return fls.l;
        }
        if ($$3 instanceof eei) {
            return fls.v;
        }
        if ($$2.a(bdp.S) || $$2.a(bdp.I) || $$3 instanceof ecu && !$$2.c(ecu.b).booleanValue()) {
            return fls.h;
        }
        if (!$$2.a(flq.a)) {
            return fls.a;
        }
        if ($$4.a(bdv.a)) {
            return fls.j;
        }
        return fls.b;
    }
}

