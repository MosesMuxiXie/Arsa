/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  org.apache.commons.lang3.mutable.Mutable
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.UUID;
import org.apache.commons.lang3.mutable.Mutable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;

public class els
extends elb {
    private static final int b = 32;
    public static final int a = 32;
    private static final int c = 34;
    private static final int d = 16;
    private static final int e = 8;
    private static final int f = 5;
    private static final int g = 20;
    private static final int h = 5;
    private static final int i = 100;
    private static final int j = 10;
    private static final int k = 10;
    private static final int l = 50;
    private static final int m = 2;
    private static final int q = 64;
    private static final int r = 30;
    private static final Optional<dat> s = Optional.empty();
    private @Nullable Either<dat, UUID> t;
    private long u;
    private int v;
    private int w;
    private @Nullable ftm x;
    private int y;

    public els(is $$0, eoh $$1) {
        super(eld.k, $$0, $$1);
    }

    /*
     * WARNING - void declaration
     */
    public static void a(dwo $$0, is $$12, eoh $$2, els $$3) {
        dat $$16;
        void $$5;
        ++$$3.u;
        if (!($$0 instanceof axf)) {
            return;
        }
        axf $$4 = (axf)$$0;
        int $$6 = $$3.f();
        if ($$3.y != $$6) {
            $$3.y = $$6;
            $$0.b($$12, dzs.cQ);
        }
        if ($$3.w > 0) {
            if ($$3.w > 50) {
                $$3.a((axf)$$5, 1, true);
                $$3.a((axf)$$5, 1, false);
            }
            if ($$3.w % 10 == 0 && $$3.x != null) {
                $$3.l().ifPresent($$1 -> {
                    $$0.x = $$1.dj().f();
                });
                ftm $$7 = ftm.b($$12);
                float $$8 = 0.2f + 0.8f * (float)(100 - $$3.w) / 100.0f;
                ftm $$9 = $$7.d($$3.x).c((double)$$8).e($$3.x);
                is $$10 = is.a($$9);
                float $$11 = (float)$$3.w / 2.0f / 100.0f + 0.5f;
                $$5.a(null, $$10, bda.hB, bdb.e, $$11, 1.0f);
            }
            --$$3.w;
        }
        if ($$3.v-- >= 0) {
            return;
        }
        $$3.v = $$3.n == null ? 20 : $$3.n.y.a(5) + 20;
        eoh $$122 = els.a($$0, $$2, $$12, $$3);
        if ($$122 != $$2) {
            $$0.a($$12, $$122, 3);
            if ($$122.c(ebo.c) == epb.a) {
                return;
            }
        }
        if ($$3.t != null) {
            Optional<dat> $$13 = $$3.l();
            if ($$13.isPresent()) {
                dat $$14 = $$13.get();
                if ($$0.c().a(ceg.L, $$12) == false && !$$14.gA() || $$3.h() > 34.0 || $$14.gR()) {
                    $$3.a((cex)null);
                }
            }
            return;
        }
        if ($$122.c(ebo.c) != epb.c) {
            return;
        }
        if (!$$5.O()) {
            return;
        }
        ddm $$15 = $$0.a((double)$$12.u(), (double)$$12.v(), (double)$$12.w(), 32.0, false);
        if ($$15 != null && ($$16 = els.a((axf)$$5, $$3)) != null) {
            $$3.a($$16);
            $$16.b(bda.hv);
            $$0.a(null, $$3.aD_(), bda.hF, bdb.e, 1.0f, 1.0f);
        }
    }

    private static eoh a(dwo $$0, eoh $$1, is $$2, els $$3) {
        if (!ebo.b($$1, (dwr)$$0, $$2) && $$3.t == null) {
            return (eoh)$$1.b(ebo.c, epb.a);
        }
        epb $$4 = $$0.c().a(ceg.L, $$2) != false ? epb.c : epb.b;
        return (eoh)$$1.b(ebo.c, $$4);
    }

    private double h() {
        return this.l().map($$0 -> Math.sqrt($$0.g(ftm.c(this.aD_())))).orElse(0.0);
    }

    private void k() {
        this.t = null;
        this.e();
    }

    public void a(dat $$0) {
        this.t = Either.left((Object)$$0);
        this.e();
    }

    public void a(UUID $$0) {
        this.t = Either.right((Object)$$0);
        this.u = 0L;
        this.e();
    }

    private Optional<dat> l() {
        dwo dwo2;
        if (this.t == null) {
            return s;
        }
        if (this.t.left().isPresent()) {
            dat $$0 = (dat)this.t.left().get();
            if (!$$0.eh()) {
                return Optional.of($$0);
            }
            this.a($$0.cY());
        }
        if ((dwo2 = this.n) instanceof axf) {
            axf $$1 = (axf)dwo2;
            if (this.t.right().isPresent()) {
                UUID $$2 = (UUID)this.t.right().get();
                cgk $$3 = $$1.d($$2);
                if ($$3 instanceof dat) {
                    dat $$4 = (dat)$$3;
                    this.a($$4);
                    return Optional.of($$4);
                }
                if (this.u >= 30L) {
                    this.k();
                }
                return s;
            }
        }
        return s;
    }

    private static @Nullable dat a(axf $$0, els $$1) {
        is $$2 = $$1.aD_();
        Optional<dat> $$3 = bhc.a(cgu.H, cgt.c, $$0, $$2, 5, 16, 8, bhc.a.c, true);
        if ($$3.isEmpty()) {
            return null;
        }
        dat $$4 = $$3.get();
        $$0.a((cgk)$$4, etk.t, $$4.dI());
        $$0.a((cgk)$$4, (byte)60);
        $$4.h($$2);
        return $$4;
    }

    public adh a() {
        return adh.a(this);
    }

    @Override
    public uz a(jf.a $$0) {
        return this.d($$0);
    }

    /*
     * WARNING - void declaration
     */
    public void c() {
        void $$1;
        void $$3;
        Object var2_1 = this.l().orElse(null);
        if (!(var2_1 instanceof dat)) {
            return;
        }
        dat $$02 = var2_1;
        dwo dwo2 = this.n;
        if (!(dwo2 instanceof axf)) {
            return;
        }
        axf $$2 = (axf)dwo2;
        if (this.w > 0) {
            return;
        }
        this.a((axf)$$3, 20, false);
        if (this.o().c(ebo.c) == epb.c) {
            int $$4 = this.n.G_().a(2, 3);
            for (int $$5 = 0; $$5 < $$4; ++$$5) {
                this.a((axf)$$3).ifPresent($$0 -> {
                    this.n.a(null, (is)$$0, bda.yj, bdb.e, 1.0f, 1.0f);
                    this.n.a((jd<etk>)etk.i, (is)$$0, etk.a.a(this.o()));
                });
            }
        }
        this.w = 100;
        this.x = $$1.dj().f();
    }

    private Optional<is> a(axf $$0) {
        MutableObject $$12 = new MutableObject(null);
        is.a(this.o, 2, 64, ($$1, $$2) -> {
            for (iz $$3 : bhs.b(iz.values(), $$0.y)) {
                is $$4 = $$1.a($$3);
                if (!$$0.a_($$4).a(bdp.t)) continue;
                $$2.accept($$4);
            }
        }, arg_0 -> els.a($$0, (Mutable)$$12, arg_0));
        return Optional.ofNullable((is)$$12.get());
    }

    /*
     * WARNING - void declaration
     */
    private void a(axf $$0, int $$1, boolean $$2) {
        Object var5_4 = this.l().orElse(null);
        if (!(var5_4 instanceof dat)) {
            return;
        }
        dat $$3 = var5_4;
        int $$5 = $$2 ? 16545810 : 0x5F5F5F;
        bgr $$6 = $$0.y;
        for (double $$7 = 0.0; $$7 < (double)$$1; $$7 += 1.0) {
            void $$4;
            fth $$8 = $$4.dj();
            ftm $$9 = $$8.h().b($$6.j() * $$8.b(), $$6.j() * $$8.c(), $$6.j() * $$8.d());
            ftm $$10 = ftm.a(this.aD_()).b($$6.j(), $$6.j(), $$6.j());
            if ($$2) {
                ftm $$11 = $$9;
                $$9 = $$10;
                $$10 = $$11;
            }
            mf $$12 = new mf($$10, $$5, $$6.a(40) + 10);
            $$0.a($$12, true, true, $$9.g, $$9.h, $$9.i, 1, 0.0, 0.0, 0.0, 0.0);
        }
    }

    @Override
    public void a(is $$0, eoh $$1) {
        this.a((cex)null);
    }

    public void a(@Nullable cex $$0) {
        Object var3_2 = this.l().orElse(null);
        if (var3_2 instanceof dat) {
            dat $$1 = var3_2;
            if ($$0 == null) {
                $$1.gQ();
            } else {
                $$1.j($$0);
                $$1.gT();
                $$1.x(0.0f);
            }
            this.k();
        }
    }

    public boolean b(dat $$0) {
        return this.l().map($$1 -> $$1 == $$0).orElse(false);
    }

    public int d() {
        return this.y;
    }

    public int f() {
        if (this.t == null || this.l().isEmpty()) {
            return 0;
        }
        double $$0 = this.h();
        double $$1 = Math.clamp($$0, 0.0, 32.0) / 32.0;
        return 15 - (int)Math.floor($$1 * 15.0);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        $$0.a("creaking", jx.a).ifPresentOrElse(this::a, this::k);
    }

    @Override
    protected void a(fns $$02) {
        super.a($$02);
        if (this.t != null) {
            $$02.a("creaking", jx.a, (UUID)this.t.map(cgk::cY, $$0 -> $$0));
        }
    }

    public /* synthetic */ aay ax_() {
        return this.a();
    }

    private static /* synthetic */ is.b a(axf $$0, Mutable $$1, is $$2) {
        if (!$$0.a_($$2).a(bdp.t)) {
            return is.b.a;
        }
        for (iz $$3 : bhs.b(iz.values(), $$0.y)) {
            is $$4 = $$2.a($$3);
            eoh $$5 = $$0.a_($$4);
            iz $$6 = $$3.g();
            if ($$5.l()) {
                $$5 = dzs.fP.m();
            } else if ($$5.a(dzs.J) && $$5.y().b()) {
                $$5 = (eoh)dzs.fP.m().b(eey.c, true);
            }
            if (!$$5.a(dzs.fP) || eey.a($$5, $$6)) continue;
            $$0.a($$4, (eoh)$$5.b(eey.b($$6), true), 3);
            $$1.setValue((Object)$$4);
            return is.b.c;
        }
        return is.b.a;
    }
}

