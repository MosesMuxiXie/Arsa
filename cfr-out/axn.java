/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Predicate;
import java.util.function.Supplier;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class axn
implements dxn {
    private static final Logger a = LogUtils.getLogger();
    private final bhe<awv> b;
    private final eqf c;
    private final axf d;
    private final long e;
    private final fne f;
    private final bgr g;
    private final esh h;
    private final fvj<dzq> i = new fvj($$0 -> this.E((is)$$0).q());
    private final fvj<fla> j = new fvj($$0 -> this.E((is)$$0).r());
    private final dxq k;
    private final erm l;
    private @Nullable Supplier<String> m;
    private final AtomicLong n = new AtomicLong();
    private static final amo o = amo.b("worldgen_region_random");

    public axn(axf $$02, bhe<awv> $$1, erm $$2, eqf $$3) {
        this.l = $$2;
        this.b = $$1;
        this.c = $$3;
        this.d = $$02;
        this.e = $$02.J();
        this.f = $$02.D_();
        this.g = $$02.p().i().a(o).a(this.c.f().m());
        this.h = $$02.F_();
        this.k = new dxq(this, dxq.a(this.e));
    }

    public boolean a(dvu $$0, int $$1) {
        return this.d.p().a.b($$0, $$1);
    }

    public dvu b() {
        return this.c.f();
    }

    @Override
    public void a(@Nullable Supplier<String> $$0) {
        this.m = $$0;
    }

    @Override
    public eqf a(int $$0, int $$1) {
        return this.a($$0, $$1, erj.c);
    }

    @Override
    public @Nullable eqf a(int $$0, int $$1, erj $$2, boolean $$3) {
        awv $$8;
        erj $$5;
        int $$4 = this.c.f().f($$0, $$1);
        erj erj2 = $$5 = $$4 >= this.l.b().b() ? null : this.l.b().a($$4);
        if ($$5 != null) {
            eqf $$7;
            awv $$6 = this.b.a($$0, $$1);
            if ($$2.c($$5) && ($$7 = $$6.a($$5)) != null) {
                return $$7;
            }
        } else {
            $$8 = null;
        }
        m $$9 = m.a(new IllegalStateException("Requested chunk unavailable during world generation"), "Exception generating new chunk");
        n $$10 = $$9.a("Chunk request details");
        $$10.a("Requested chunk", String.format(Locale.ROOT, "%d, %d", $$0, $$1));
        $$10.a("Generating status", () -> this.l.a().f());
        $$10.a("Requested status", $$2::f);
        $$10.a("Actual status", () -> $$8 == null ? "[out of cache bounds]" : $$8.q().f());
        $$10.a("Maximum allowed status", () -> $$5 == null ? "null" : $$5.f());
        $$10.a("Dependencies", this.l.b()::toString);
        $$10.a("Requested distance", $$4);
        $$10.a("Generating chunk", this.c.f()::toString);
        throw new v($$9);
    }

    @Override
    public boolean b(int $$0, int $$1) {
        int $$2 = this.c.f().f($$0, $$1);
        return $$2 < this.l.b().b();
    }

    @Override
    public eoh a_(is $$0) {
        return this.a(jw.a($$0.u()), jw.a($$0.w())).a_($$0);
    }

    @Override
    public flb b_(is $$0) {
        return this.E($$0).b_($$0);
    }

    @Override
    public @Nullable ddm a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<cgk> $$4) {
        return null;
    }

    @Override
    public int E_() {
        return 0;
    }

    @Override
    public dxq H_() {
        return this.k;
    }

    @Override
    public jd<dxo> a(int $$0, int $$1, int $$2) {
        return this.d.a($$0, $$1, $$2);
    }

    @Override
    public float a(iz $$0, boolean $$1) {
        return 1.0f;
    }

    @Override
    public fkq C_() {
        return this.d.C_();
    }

    @Override
    public boolean a(is $$0, boolean $$1, @Nullable cgk $$2, int $$3) {
        eoh $$4 = this.a_($$0);
        if ($$4.l()) {
            return false;
        }
        if ($$1) {
            elb $$5 = $$4.x() ? this.c_($$0) : null;
            dzq.a($$4, (dwo)this.d, $$0, $$5, $$2, dlt.l);
        }
        return this.a($$0, dzs.a.m(), 3, $$3);
    }

    @Override
    public @Nullable elb c_(is $$0) {
        eqf $$1 = this.E($$0);
        elb $$2 = $$1.c_($$0);
        if ($$2 != null) {
            return $$2;
        }
        uz $$3 = $$1.f($$0);
        eoh $$4 = $$1.a_($$0);
        if ($$3 != null) {
            if ("DUMMY".equals($$3.b("id", ""))) {
                if (!$$4.x()) {
                    return null;
                }
                $$2 = ((ecn)((Object)$$4.b())).a($$0, $$4);
            } else {
                $$2 = elb.a($$0, $$4, $$3, this.d.J_());
            }
            if ($$2 != null) {
                $$1.a($$2);
                return $$2;
            }
        }
        if ($$4.x()) {
            a.warn("Tried to access a block entity before it was created. {}", (Object)$$0);
        }
        return null;
    }

    @Override
    public boolean e_(is $$0) {
        dwq $$6;
        int $$1 = jw.a($$0.u());
        int $$2 = jw.a($$0.w());
        dvu $$3 = this.b();
        int $$4 = Math.abs($$3.h - $$1);
        int $$5 = Math.abs($$3.i - $$2);
        if ($$4 > this.l.d() || $$5 > this.l.d()) {
            bhs.b("Detected setBlock in a far chunk [" + $$1 + ", " + $$2 + "], pos: " + String.valueOf($$0) + ", status: " + String.valueOf(this.l.a()) + (String)(this.m == null ? "" : ", currently generating: " + this.m.get()));
            return false;
        }
        return !this.c.A() || !($$6 = this.c.B()).e($$0.v());
    }

    @Override
    public boolean a(is $$0, eoh $$1, @dzq.b int $$2, int $$3) {
        if (!this.e_($$0)) {
            return false;
        }
        eqf $$4 = this.E($$0);
        eoh $$5 = $$4.a($$0, $$1, $$2);
        if ($$5 != null) {
            this.d.a($$0, $$5, $$1);
        }
        if ($$1.x()) {
            if ($$4.n().d() == ern.b) {
                elb $$6 = ((ecn)((Object)$$1.b())).a($$0, $$1);
                if ($$6 != null) {
                    $$4.a($$6);
                } else {
                    $$4.c($$0);
                }
            } else {
                uz $$7 = new uz();
                $$7.a("x", $$0.u());
                $$7.a("y", $$0.v());
                $$7.a("z", $$0.w());
                $$7.a("id", "DUMMY");
                $$4.a($$7);
            }
        } else if ($$5 != null && $$5.x()) {
            $$4.c($$0);
        }
        if ($$1.l(this, $$0) && ($$2 & 0x10) == 0) {
            this.f($$0);
        }
        return true;
    }

    private void f(is $$0) {
        this.E($$0).e($$0);
    }

    @Override
    public boolean b(cgk $$0) {
        int $$1 = jw.a($$0.dO());
        int $$2 = jw.a($$0.dU());
        this.a($$1, $$2).a($$0);
        return true;
    }

    @Override
    public boolean a(is $$0, boolean $$1) {
        return this.a($$0, dzs.a.m(), 3);
    }

    @Override
    public eqa w() {
        return this.d.w();
    }

    @Override
    public boolean B_() {
        return false;
    }

    @Override
    @Deprecated
    public axf a() {
        return this.d;
    }

    @Override
    public jr J_() {
        return this.d.J_();
    }

    @Override
    public dgz Q() {
        return this.d.Q();
    }

    @Override
    public fne D_() {
        return this.f;
    }

    @Override
    public cda c(is $$0) {
        if (!this.b(jw.a($$0.u()), jw.a($$0.w()))) {
            throw new RuntimeException("We are asking a region for a chunk out of bound");
        }
        return new cda(this.d.av(), this.d.al(), 0L, this.d.d($$0));
    }

    @Override
    public @Nullable MinecraftServer s() {
        return this.d.s();
    }

    @Override
    public eqj ac() {
        return this.d.p();
    }

    @Override
    public long J() {
        return this.e;
    }

    @Override
    public fva<dzq> af() {
        return this.i;
    }

    @Override
    public fva<fla> ae() {
        return this.j;
    }

    @Override
    public int V() {
        return this.d.V();
    }

    @Override
    public bgr G_() {
        return this.g;
    }

    @Override
    public int a(euq.a $$0, int $$1, int $$2) {
        return this.a(jw.a($$1), jw.a($$2)).a($$0, $$1 & 0xF, $$2 & 0xF) + 1;
    }

    @Override
    public void a(@Nullable cgk $$0, is $$1, bcz $$2, bdb $$3, float $$4, float $$5) {
    }

    @Override
    public void a(lw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
    }

    @Override
    public void a(@Nullable cgk $$0, int $$1, is $$2, int $$3) {
    }

    @Override
    public void a(jd<etk> $$0, ftm $$1, etk.a $$2) {
    }

    @Override
    public esh F_() {
        return this.h;
    }

    @Override
    public boolean a(is $$0, Predicate<eoh> $$1) {
        return $$1.test(this.a_($$0));
    }

    @Override
    public boolean b(is $$0, Predicate<flb> $$1) {
        return $$1.test(this.b_($$0));
    }

    @Override
    public <T extends cgk> List<T> a(esw<cgk, T> $$0, fth $$1, Predicate<? super T> $$2) {
        return Collections.emptyList();
    }

    @Override
    public List<cgk> a(@Nullable cgk $$0, fth $$1, @Nullable Predicate<? super cgk> $$2) {
        return Collections.emptyList();
    }

    public List<ddm> E() {
        return Collections.emptyList();
    }

    @Override
    public int K_() {
        return this.d.K_();
    }

    @Override
    public int L_() {
        return this.d.L_();
    }

    @Override
    public long I_() {
        return this.n.getAndIncrement();
    }

    @Override
    public cee ad() {
        return cee.a;
    }
}

