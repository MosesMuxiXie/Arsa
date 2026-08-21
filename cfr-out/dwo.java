/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.jspecify.annotations.Nullable;

public abstract class dwo
implements dwp,
AutoCloseable {
    public static final Codec<amt<dwo>> g = amt.a(mj.bE);
    public static final amt<dwo> h = amt.a(mj.bE, amo.b("overworld"));
    public static final amt<dwo> i = amt.a(mj.bE, amo.b("the_nether"));
    public static final amt<dwo> j = amt.a(mj.bE, amo.b("the_end"));
    public static final int k = 30000000;
    public static final int l = 512;
    public static final int m = 32;
    public static final int n = 15;
    public static final int o = 20000000;
    public static final int p = -20000000;
    private static final cbn<lt> a = cbn.b().a(new lt(ly.af, 0.5f, 1.0f)).a(new lt(ly.ai, 1.0f, 1.0f)).a();
    protected final List<enc> q = Lists.newArrayList();
    protected final fmd r;
    private final List<enc> b = Lists.newArrayList();
    private boolean c;
    private final Thread d;
    private final boolean e;
    private int f;
    protected int s = bgr.a().f();
    protected final int t = 1013904223;
    protected float u;
    protected float v;
    protected float w;
    protected float x;
    public final bgr y = bgr.a();
    @Deprecated
    private final bgr B = bgr.b();
    private final jd<esh> C;
    protected final fnu z;
    private final boolean D;
    private final dxq E;
    private final amt<dwo> F;
    private final jr G;
    private final cey H;
    private final eqz I;
    private long J;

    protected dwo(fnu $$0, amt<dwo> $$1, jr $$2, jd<esh> $$3, boolean $$4, boolean $$5, long $$6, int $$7) {
        this.z = $$0;
        this.C = $$3;
        this.F = $$1;
        this.D = $$4;
        this.d = Thread.currentThread();
        this.E = new dxq(this, $$6);
        this.e = $$5;
        this.r = new fmd(this, $$7);
        this.G = $$2;
        this.I = eqz.a($$2);
        this.H = new cey($$2);
    }

    @Override
    public boolean B_() {
        return this.D;
    }

    @Override
    public @Nullable MinecraftServer s() {
        return null;
    }

    public boolean n(is $$0) {
        return !this.y($$0) && dwo.c($$0);
    }

    public boolean o(is $$0) {
        return !this.y($$0) && dwo.g($$0);
    }

    public static boolean p(is $$0) {
        return !dwo.b($$0.v()) && dwo.c($$0);
    }

    private static boolean c(is $$0) {
        return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
    }

    private static boolean g(is $$0) {
        int $$1 = jw.a($$0.u());
        int $$2 = jw.a($$0.w());
        return dvu.c($$1, $$2);
    }

    private static boolean b(int $$0) {
        return $$0 < -20000000 || $$0 >= 20000000;
    }

    public eqq q(is $$0) {
        return this.d(jw.a($$0.u()), jw.a($$0.w()));
    }

    public eqq d(int $$0, int $$1) {
        return (eqq)this.a($$0, $$1, erj.n);
    }

    @Override
    public @Nullable eqf a(int $$0, int $$1, erj $$2, boolean $$3) {
        eqf $$4 = this.ac().a($$0, $$1, $$2, $$3);
        if ($$4 == null && $$3) {
            throw new IllegalStateException("Should always be able to create a chunk!");
        }
        return $$4;
    }

    @Override
    public boolean a(is $$0, eoh $$1, @dzq.b int $$2) {
        return this.a($$0, $$1, $$2, 512);
    }

    @Override
    public boolean a(is $$0, eoh $$1, @dzq.b int $$2, int $$3) {
        if (!this.o($$0)) {
            return false;
        }
        if (!this.B_() && this.ar()) {
            return false;
        }
        eqq $$4 = this.q($$0);
        dzq $$5 = $$1.b();
        eoh $$6 = $$4.a($$0, $$1, $$2);
        if ($$6 != null) {
            eoh $$7 = this.a_($$0);
            if ($$7 == $$1) {
                if ($$6 != $$7) {
                    this.b($$0, $$6, $$7);
                }
                if (($$2 & 2) != 0 && (!this.B_() || ($$2 & 4) == 0) && (this.B_() || $$4.G() != null && $$4.G().a(awt.c))) {
                    this.a($$0, $$6, $$1, $$2);
                }
                if (($$2 & 1) != 0) {
                    this.a($$0, $$6.b());
                    if (!this.B_() && $$1.q()) {
                        this.b($$0, $$5);
                    }
                }
                if (($$2 & 0x10) == 0 && $$3 > 0) {
                    int $$8 = $$2 & 0xFFFFFFDE;
                    $$6.b(this, $$0, $$8, $$3 - 1);
                    $$1.a((dwp)this, $$0, $$8, $$3 - 1);
                    $$1.b(this, $$0, $$8, $$3 - 1);
                }
                this.a($$0, $$6, $$7);
            }
            return true;
        }
        return false;
    }

    public void a(is $$0, eoh $$1, eoh $$2) {
    }

    @Override
    public boolean a(is $$0, boolean $$1) {
        flb $$2 = this.b_($$0);
        return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
    }

    @Override
    public boolean a(is $$0, boolean $$1, @Nullable cgk $$2, int $$3) {
        boolean $$7;
        eoh $$4 = this.a_($$0);
        if ($$4.l()) {
            return false;
        }
        flb $$5 = this.b_($$0);
        if (!($$4.b() instanceof dzd)) {
            this.c(2001, $$0, dzq.j($$4));
        }
        if ($$1) {
            elb $$6 = $$4.x() ? this.c_($$0) : null;
            dzq.a($$4, this, $$0, $$6, $$2, dlt.l);
        }
        if ($$7 = this.a($$0, $$5.g(), 3, $$3)) {
            this.a(etk.f, $$0, etk.a.a($$2, $$4));
        }
        return $$7;
    }

    public void b(is $$0, eoh $$1) {
    }

    public boolean c(is $$0, eoh $$1) {
        return this.a($$0, $$1, 3);
    }

    public abstract void a(is var1, eoh var2, eoh var3, @dzq.b int var4);

    public void b(is $$0, eoh $$1, eoh $$2) {
    }

    public void a(is $$0, dzq $$1, @Nullable fmj $$2) {
    }

    public void a(is $$0, dzq $$1, iz $$2, @Nullable fmj $$3) {
    }

    public void b(is $$0, dzq $$1, @Nullable fmj $$2) {
    }

    public void a(eoh $$0, is $$1, dzq $$2, @Nullable fmj $$3, boolean $$4) {
    }

    @Override
    public void a(iz $$0, is $$1, is $$2, eoh $$3, @dzq.b int $$4, int $$5) {
        this.r.a($$0, $$3, $$1, $$2, $$4, $$5);
    }

    @Override
    public int a(euq.a $$0, int $$1, int $$2) {
        int $$5;
        if ($$1 < -30000000 || $$2 < -30000000 || $$1 >= 30000000 || $$2 >= 30000000) {
            int $$3 = this.V() + 1;
        } else if (this.b(jw.a($$1), jw.a($$2))) {
            int $$4 = this.d(jw.a($$1), jw.a($$2)).a($$0, $$1 & 0xF, $$2 & 0xF) + 1;
        } else {
            $$5 = this.K_();
        }
        return $$5;
    }

    @Override
    public fkq C_() {
        return this.ac().r();
    }

    @Override
    public eoh a_(is $$0) {
        if (!this.o($$0)) {
            return dzs.nY.m();
        }
        eqq $$1 = this.d(jw.a($$0.u()), jw.a($$0.w()));
        return $$1.a_($$0);
    }

    @Override
    public flb b_(is $$0) {
        if (!this.o($$0)) {
            return flc.a.g();
        }
        eqq $$1 = this.q($$0);
        return $$1.b_($$0);
    }

    public boolean ag() {
        return !this.F_().d() && this.f < 4;
    }

    public boolean ah() {
        return !this.F_().d() && !this.ag();
    }

    @Override
    public void a(@Nullable cgk $$0, is $$1, bcz $$2, bdb $$3, float $$4, float $$5) {
        this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
    }

    public abstract void a(@Nullable cgk var1, double var2, double var4, double var6, jd<bcz> var8, bdb var9, float var10, float var11, long var12);

    public void a(@Nullable cgk $$0, double $$1, double $$2, double $$3, bcz $$4, bdb $$5, float $$6, float $$7, long $$8) {
        this.a($$0, $$1, $$2, $$3, mi.b.e($$4), $$5, $$6, $$7, $$8);
    }

    public abstract void a(@Nullable cgk var1, cgk var2, jd<bcz> var3, bdb var4, float var5, float var6, long var7);

    public void a(@Nullable cgk $$0, double $$1, double $$2, double $$3, bcz $$4, bdb $$5) {
        this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0f, 1.0f);
    }

    public void a(@Nullable cgk $$0, double $$1, double $$2, double $$3, bcz $$4, bdb $$5, float $$6, float $$7) {
        this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.B.g());
    }

    public void a(@Nullable cgk $$0, double $$1, double $$2, double $$3, jd<bcz> $$4, bdb $$5, float $$6, float $$7) {
        this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.B.g());
    }

    public void a(@Nullable cgk $$0, cgk $$1, bcz $$2, bdb $$3, float $$4, float $$5) {
        this.a($$0, $$1, mi.b.e($$2), $$3, $$4, $$5, this.B.g());
    }

    public void a(is $$0, bcz $$1, bdb $$2, float $$3, float $$4, boolean $$5) {
        this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
    }

    public void a(cgk $$0, bcz $$1, bdb $$2, float $$3, float $$4) {
    }

    public void a(double $$0, double $$1, double $$2, bcz $$3, bdb $$4, float $$5, float $$6, boolean $$7) {
    }

    public void a(bcz $$0, bdb $$1, float $$2, float $$3) {
    }

    @Override
    public void a(lw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
    }

    public void a(lw $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
    }

    public void b(lw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
    }

    public void a(lw $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
    }

    public void a(enc $$0) {
        (this.c ? this.b : this.q).add($$0);
    }

    public void ai() {
        this.c = true;
        if (!this.b.isEmpty()) {
            this.q.addAll(this.b);
            this.b.clear();
        }
        Iterator<enc> $$0 = this.q.iterator();
        boolean $$1 = this.y().i();
        while ($$0.hasNext()) {
            enc $$2 = $$0.next();
            if ($$2.b()) {
                $$0.remove();
                continue;
            }
            if (!$$1 || !this.r($$2.c())) continue;
            $$2.a();
        }
        this.c = false;
    }

    public <T extends cgk> void a(Consumer<T> $$0, T $$1) {
        try {
            $$0.accept($$1);
        }
        catch (Throwable $$2) {
            m $$3 = m.a($$2, "Ticking entity");
            n $$4 = $$3.a("Entity being ticked");
            $$1.a($$4);
            throw new v($$3);
        }
    }

    public boolean h(cgk $$0) {
        return true;
    }

    public boolean a(long $$0) {
        return true;
    }

    public boolean r(is $$0) {
        return this.a(dvu.a($$0));
    }

    public void a(@Nullable cgk $$0, double $$1, double $$2, double $$3, float $$4, a $$5) {
        this.a($$0, dwi.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, ly.x, ly.w, a, bda.lS);
    }

    public void a(@Nullable cgk $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, a $$6) {
        this.a($$0, dwi.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, ly.x, ly.w, a, bda.lS);
    }

    public void a(@Nullable cgk $$0, @Nullable cex $$1, @Nullable dwj $$2, ftm $$3, float $$4, boolean $$5, a $$6) {
        this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, ly.x, ly.w, a, bda.lS);
    }

    public void a(@Nullable cgk $$0, @Nullable cex $$1, @Nullable dwj $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, a $$8) {
        this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, ly.x, ly.w, a, bda.lS);
    }

    public abstract void a(@Nullable cgk var1, @Nullable cex var2, @Nullable dwj var3, double var4, double var6, double var8, float var10, boolean var11, a var12, lw var13, lw var14, cbn<lt> var15, jd<bcz> var16);

    public abstract String P();

    @Override
    public @Nullable elb c_(is $$0) {
        if (!this.o($$0)) {
            return null;
        }
        if (!this.B_() && Thread.currentThread() != this.d) {
            return null;
        }
        return this.q($$0).a($$0, eqq.b.a);
    }

    public void b(elb $$0) {
        is $$1 = $$0.aD_();
        if (!this.o($$1)) {
            return;
        }
        this.q($$1).b($$0);
    }

    public void s(is $$0) {
        if (!this.o($$0)) {
            return;
        }
        this.q($$0).c($$0);
    }

    public boolean t(is $$0) {
        if (!this.o($$0)) {
            return false;
        }
        return this.ac().b(jw.a($$0.u()), jw.a($$0.w()));
    }

    public boolean a(is $$0, cgk $$1, iz $$2) {
        if (!this.o($$0)) {
            return false;
        }
        eqf $$3 = this.a(jw.a($$0.u()), jw.a($$0.w()), erj.n, false);
        if ($$3 == null) {
            return false;
        }
        return $$3.a_($$0).a((dvt)this, $$0, $$1, $$2);
    }

    public boolean a(is $$0, cgk $$1) {
        return this.a($$0, $$1, iz.b);
    }

    public void aj() {
        this.f = (int)(15.0f - this.c().a(ceg.z).floatValue());
    }

    public void b(boolean $$0) {
        this.ac().b($$0);
    }

    public abstract void a(fne.a var1);

    public abstract fne.a C();

    public fne.a b(fne.a $$0) {
        eqa $$1 = this.w();
        if (!$$1.a($$0.b())) {
            is $$2 = this.a(euq.a.e, is.a($$1.h(), 0.0, $$1.i()));
            return fne.a.a($$0.a(), $$2, $$0.d(), $$0.e());
        }
        return $$0;
    }

    protected void ak() {
        if (this.z.h()) {
            this.v = 1.0f;
            if (this.z.f()) {
                this.x = 1.0f;
            }
        }
    }

    @Override
    public void close() throws IOException {
        this.ac().close();
    }

    @Override
    public @Nullable dvt c(int $$0, int $$1) {
        return this.a($$0, $$1, erj.n, false);
    }

    @Override
    public List<cgk> a(@Nullable cgk $$0, fth $$1, Predicate<? super cgk> $$2) {
        bzl.a().f("getEntities");
        ArrayList $$32 = Lists.newArrayList();
        this.M().a($$1, (T $$3) -> {
            if ($$3 != $$0 && $$2.test((cgk)$$3)) {
                $$32.add($$3);
            }
        });
        for (cyd $$4 : this.v()) {
            if ($$4 == $$0 || $$4.a == $$0 || !$$2.test($$4) || !$$1.c($$4.dj())) continue;
            $$32.add($$4);
        }
        return $$32;
    }

    @Override
    public <T extends cgk> List<T> a(esw<cgk, T> $$0, fth $$1, Predicate<? super T> $$2) {
        ArrayList $$3 = Lists.newArrayList();
        this.a($$0, $$1, $$2, $$3);
        return $$3;
    }

    public <T extends cgk> void a(esw<cgk, T> $$0, fth $$1, Predicate<? super T> $$2, List<? super T> $$3) {
        this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
    }

    public <T extends cgk> void a(esw<cgk, T> $$0, fth $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$42) {
        bzl.a().f("getEntities");
        this.M().a($$0, $$1, (U $$4) -> {
            if ($$2.test($$4)) {
                $$3.add((Object)$$4);
                if ($$3.size() >= $$42) {
                    return bem.a.b;
                }
            }
            if ($$4 instanceof cyc) {
                cyc $$5 = (cyc)$$4;
                for (cyd $$6 : $$5.gM()) {
                    cgk $$7 = (cgk)$$0.a($$6);
                    if ($$7 == null || !$$2.test($$7)) continue;
                    $$3.add((Object)$$7);
                    if ($$3.size() < $$42) continue;
                    return bem.a.b;
                }
            }
            return bem.a.a;
        });
    }

    public <T extends cgk> boolean b(esw<cgk, T> $$0, fth $$1, Predicate<? super T> $$2) {
        bzl.a().f("hasEntities");
        MutableBoolean $$32 = new MutableBoolean();
        this.M().a($$0, $$1, (U $$3) -> {
            if ($$2.test($$3)) {
                $$32.setTrue();
                return bem.a.b;
            }
            if ($$3 instanceof cyc) {
                cyc $$4 = (cyc)$$3;
                for (cyd $$5 : $$4.gM()) {
                    cgk $$6 = (cgk)$$0.a($$5);
                    if ($$6 == null || !$$2.test($$6)) continue;
                    $$32.setTrue();
                    return bem.a.b;
                }
            }
            return bem.a.a;
        });
        return $$32.isTrue();
    }

    public List<cgk> k(cgk $$0, fth $$1) {
        return this.a($$0, $$1, cgs.a($$0));
    }

    public abstract @Nullable cgk a(int var1);

    public @Nullable cgk d(UUID $$0) {
        return this.M().a($$0);
    }

    public @Nullable cgk a(UUID $$0) {
        return this.d($$0);
    }

    public @Nullable ddm b(UUID $$0) {
        return this.c($$0);
    }

    public abstract Collection<cyd> v();

    public void u(is $$0) {
        if (this.H($$0)) {
            this.q($$0).i();
        }
    }

    public void a(elb $$0) {
    }

    public long al() {
        return this.z.c();
    }

    public boolean a(cgk $$0, is $$1) {
        return true;
    }

    public void a(cgk $$0, byte $$1) {
    }

    public void a(cgk $$0, cex $$1) {
    }

    public void a(is $$0, dzq $$1, int $$2, int $$3) {
        this.a_($$0).a(this, $$0, $$2, $$3);
    }

    @Override
    public fne D_() {
        return this.z;
    }

    public abstract cdo y();

    public float a(float $$0) {
        return bgj.h($$0, this.w, this.x) * this.c($$0);
    }

    public void b(float $$0) {
        float $$1;
        this.w = $$1 = bgj.a($$0, 0.0f, 1.0f);
        this.x = $$1;
    }

    public float c(float $$0) {
        return bgj.h($$0, this.u, this.v);
    }

    public void d(float $$0) {
        float $$1;
        this.u = $$1 = bgj.a($$0, 0.0f, 1.0f);
        this.v = $$1;
    }

    public boolean am() {
        return this.F_().e() && !this.F_().f() && this.aq() != j;
    }

    public boolean an() {
        return this.am() && (double)this.a(1.0f) > 0.9;
    }

    public boolean ao() {
        return this.am() && (double)this.c(1.0f) > 0.2;
    }

    public boolean v(is $$0) {
        return this.w($$0) == dxo.c.b;
    }

    public dxo.c w(is $$0) {
        if (!this.ao()) {
            return dxo.c.a;
        }
        if (!this.k($$0)) {
            return dxo.c.a;
        }
        if (this.a(euq.a.e, $$0).v() > $$0.v()) {
            return dxo.c.a;
        }
        dxo $$1 = this.z($$0).a();
        return $$1.a($$0, this.V());
    }

    public abstract @Nullable fmw a(fmu var1);

    public void b(int $$0, is $$1, int $$2) {
    }

    public n a(m $$0) {
        n $$1 = $$0.a("Affected level", 1);
        $$1.a("All players", () -> {
            List<? extends ddm> $$0 = this.E();
            return $$0.size() + " total; " + $$0.stream().map(ddm::ht).collect(Collectors.joining(", "));
        });
        $$1.a("Chunk stats", this.ac()::e);
        $$1.a("Level dimension", () -> this.aq().a().toString());
        try {
            this.z.a($$1, this);
        }
        catch (Throwable $$2) {
            $$1.a("Level Data Unobtainable", $$2);
        }
        return $$1;
    }

    public abstract void a(int var1, is var2, int var3);

    public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<dok> $$6) {
    }

    public abstract fur ab();

    public void b(is $$0, dzq $$1) {
        for (iz $$2 : iz.c.a) {
            is $$3 = $$0.a($$2);
            if (!this.H($$3)) continue;
            eoh $$4 = this.a_($$3);
            if ($$4.a(dzs.hP)) {
                this.a($$4, $$3, $$1, null, false);
                continue;
            }
            if (!$$4.d(this, $$3) || !($$4 = this.a_($$3 = $$3.a($$2))).a(dzs.hP)) continue;
            this.a($$4, $$3, $$1, null, false);
        }
    }

    @Override
    public int E_() {
        return this.f;
    }

    public void c(int $$0) {
    }

    public void a(aay<?> $$0) {
        throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
    }

    @Override
    public esh F_() {
        return this.C.a();
    }

    public jd<esh> ap() {
        return this.C;
    }

    public amt<dwo> aq() {
        return this.F;
    }

    @Override
    public bgr G_() {
        return this.y;
    }

    @Override
    public boolean a(is $$0, Predicate<eoh> $$1) {
        return $$1.test(this.a_($$0));
    }

    @Override
    public boolean b(is $$0, Predicate<flb> $$1) {
        return $$1.test(this.b_($$0));
    }

    public abstract dqt aa();

    public is a(int $$0, int $$1, int $$2, int $$3) {
        this.s = this.s * 3 + 1013904223;
        int $$4 = this.s >> 2;
        return new is($$0 + ($$4 & 0xF), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 0xF));
    }

    public boolean z() {
        return false;
    }

    @Override
    public dxq H_() {
        return this.E;
    }

    public final boolean ar() {
        return this.e;
    }

    protected abstract esy<cgk> M();

    @Override
    public long I_() {
        return this.J++;
    }

    @Override
    public jr J_() {
        return this.G;
    }

    public cey as() {
        return this.H;
    }

    public abstract cef c();

    public abstract dnq R();

    public abstract emb S();

    public int x(is $$0) {
        return 0;
    }

    public eqz at() {
        return this.I;
    }

    @Override
    public /* synthetic */ cee ad() {
        return this.c();
    }

    @Override
    public /* synthetic */ eqf a(int n2, int n3) {
        return this.d(n2, n3);
    }

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("none");
        public static final /* enum */ a b = new a("block");
        public static final /* enum */ a c = new a("mob");
        public static final /* enum */ a d = new a("tnt");
        public static final /* enum */ a e = new a("trigger");
        public static final Codec<a> f;
        private final String g;
        private static final /* synthetic */ a[] h;

        public static a[] values() {
            return (a[])h.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0) {
            this.g = $$0;
        }

        @Override
        public String c() {
            return this.g;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e};
        }

        static {
            h = dwo$a.a();
            f = bhh.a(a::values);
        }
    }
}

