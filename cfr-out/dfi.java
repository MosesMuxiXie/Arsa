/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public abstract class dfi
extends daa {
    protected static final alw<Boolean> c = ama.a(dfi.class, aly.k);
    static final Predicate<czl> a = $$0 -> !$$0.n() && $$0.cb() && dlt.a($$0.e(), dfh.a($$0.eo().f(mj.aR)));
    private static final int b = 0;
    private static final boolean e = false;
    protected @Nullable dfh d;
    private int f = 0;
    private boolean cv = false;
    private int cw;

    protected dfi(cgu<? extends dfi> $$0, dwo $$1) {
        super((cgu<? extends daa>)$$0, $$1);
    }

    @Override
    protected void D() {
        super.D();
        this.cs.a(1, new b(this, this));
        this.cs.a(3, new cpj<dfi>(this));
        this.cs.a(4, new d(this, 1.05f, 1));
        this.cs.a(5, new c(this));
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(c, false);
    }

    public abstract void a(axf var1, int var2, boolean var3);

    public boolean hd() {
        return this.cv;
    }

    public void A(boolean $$0) {
        this.cv = $$0;
    }

    @Override
    public void d_() {
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$0 = (axf)dwo2;
            if (this.cb()) {
                dfh $$1 = this.he();
                if (this.hd()) {
                    if ($$1 == null) {
                        dfh $$2;
                        if (this.ao().au() % 20L == 0L && ($$2 = $$0.f(this.dK())) != null && dfj.a(this)) {
                            $$2.a($$0, $$2.j(), this, null, true);
                        }
                    } else {
                        chl $$3 = this.ag_();
                        if ($$3 != null && ($$3.ay() == cgu.cb || $$3.ay() == cgu.au)) {
                            this.bK = 0;
                        }
                    }
                }
            }
        }
        super.d_();
    }

    @Override
    protected void gV() {
        this.bK += 2;
    }

    @Override
    public void a(cex $$0) {
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$1 = (axf)dwo2;
            cgk $$2 = $$0.d();
            dfh $$3 = this.he();
            if ($$3 != null) {
                if (this.gR()) {
                    $$3.c(this.hi());
                }
                if ($$2 != null && $$2.ay() == cgu.cb) {
                    $$3.a($$2);
                }
                $$3.a($$1, this, false);
            }
        }
        super.a($$0);
    }

    @Override
    public boolean gS() {
        return !this.hh();
    }

    public void a(@Nullable dfh $$0) {
        this.d = $$0;
    }

    public @Nullable dfh he() {
        return this.d;
    }

    public boolean hf() {
        dlt $$0 = this.a(cgv.f);
        boolean $$1 = !$$0.f() && dlt.a($$0, dfh.a(this.eo().f(mj.aR)));
        boolean $$2 = this.gR();
        return $$1 && $$2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean hg() {
        void $$1;
        dwo dwo2 = this.ao();
        if (!(dwo2 instanceof axf)) {
            return false;
        }
        axf $$0 = (axf)dwo2;
        return this.he() != null || $$1.f(this.dK()) != null;
    }

    public boolean hh() {
        return this.he() != null && this.he().r();
    }

    public void a(int $$0) {
        this.f = $$0;
    }

    public int hi() {
        return this.f;
    }

    public boolean hj() {
        return this.az.a(c);
    }

    public void B(boolean $$0) {
        this.az.a(c, $$0);
    }

    @Override
    protected void a(fns $$0) {
        dwo dwo2;
        super.a($$0);
        $$0.a("Wave", this.f);
        $$0.a("CanJoinRaid", this.cv);
        if (this.d != null && (dwo2 = this.ao()) instanceof axf) {
            axf $$12 = (axf)dwo2;
            $$12.G().a(this.d).ifPresent($$1 -> $$0.a("RaidId", $$1));
        }
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.f = $$0.a("Wave", 0);
        this.cv = $$0.a("CanJoinRaid", false);
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$12 = (axf)dwo2;
            $$0.e("RaidId").ifPresent($$1 -> {
                this.d = $$12.G().a((int)$$1);
                if (this.d != null) {
                    this.d.a($$12, this.f, this, false);
                    if (this.gR()) {
                        this.d.a(this.f, this);
                    }
                }
            });
        }
    }

    @Override
    protected void a(axf $$0, czl $$1) {
        boolean $$3;
        dlt $$2 = $$1.e();
        boolean bl2 = $$3 = this.hh() && this.he().b(this.hi()) != null;
        if (this.hh() && !$$3 && dlt.a($$2, dfh.a(this.eo().f(mj.aR)))) {
            cgv $$4 = cgv.f;
            dlt $$5 = this.a($$4);
            double $$6 = this.an().b($$4);
            if (!$$5.f() && (double)Math.max(this.as.i() - 0.1f, 0.0f) < $$6) {
                this.a($$0, $$5);
            }
            this.a($$1);
            this.a($$4, $$2);
            this.a((cgk)$$1, $$2.N());
            $$1.aC();
            this.he().a(this.hi(), this);
            this.x(true);
        } else {
            super.a($$0, $$1);
        }
    }

    @Override
    public boolean i(double $$0) {
        if (this.he() == null) {
            return super.i($$0);
        }
        return false;
    }

    @Override
    public boolean ab() {
        return super.ab() || this.he() != null;
    }

    public int hk() {
        return this.cw;
    }

    public void b(int $$0) {
        this.cw = $$0;
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        if (this.hh()) {
            this.he().n();
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        this.A(this.ay() != cgu.bQ || $$2 != cgt.a);
        return super.a($$0, $$1, $$2, $$3);
    }

    public abstract bcz gX();

    public static class b<T extends dfi>
    extends cop {
        private final T b;
        private Int2LongOpenHashMap c = new Int2LongOpenHashMap();
        private @Nullable flp d;
        private @Nullable czl e;
        final /* synthetic */ dfi a;

        public b(T $$1) {
            this.a = $$0;
            this.b = $$1;
            this.a(EnumSet.of(cop.a.a));
        }

        @Override
        public boolean b() {
            if (this.h()) {
                return false;
            }
            Int2LongOpenHashMap $$0 = new Int2LongOpenHashMap();
            double $$1 = this.a.i(cis.o);
            List<czl> $$2 = ((cgk)this.b).ao().a(czl.class, ((cgk)this.b).dj().c($$1, 8.0, $$1), a);
            for (czl $$3 : $$2) {
                long $$4 = this.c.getOrDefault($$3.aA(), Long.MIN_VALUE);
                if (this.a.ao().au() < $$4) {
                    $$0.put($$3.aA(), $$4);
                    continue;
                }
                flp $$5 = ((chn)this.b).N().a((cgk)$$3, 1);
                if ($$5 != null && $$5.j()) {
                    this.d = $$5;
                    this.e = $$3;
                    return true;
                }
                $$0.put($$3.aA(), this.a.ao().au() + 600L);
            }
            this.c = $$0;
            return false;
        }

        @Override
        public boolean c() {
            if (this.e == null || this.d == null) {
                return false;
            }
            if (this.e.eh()) {
                return false;
            }
            if (this.d.c()) {
                return false;
            }
            return !this.h();
        }

        private boolean h() {
            if (!((dfi)this.b).hh()) {
                return true;
            }
            if (((dfi)this.b).he().a()) {
                return true;
            }
            if (!((daa)this.b).k()) {
                return true;
            }
            if (dlt.a(((chl)this.b).a(cgv.f), dfh.a(((cgk)this.b).eo().f(mj.aR)))) {
                return true;
            }
            dfi $$0 = this.a.d.b(((dfi)this.b).hi());
            return $$0 != null && $$0.cb();
        }

        @Override
        public void d() {
            ((chn)this.b).N().a(this.d, (double)1.15f);
        }

        @Override
        public void e() {
            this.d = null;
            this.e = null;
        }

        @Override
        public void a() {
            if (this.e != null && this.e.a((cgk)this.b, 1.414)) {
                ((dfi)this.b).a(dfi$b.a(this.a.ao()), this.e);
            }
        }
    }

    static class d
    extends cop {
        private final dfi a;
        private final double b;
        private is c;
        private final List<is> d = Lists.newArrayList();
        private final int e;
        private boolean f;

        public d(dfi $$0, double $$1, int $$2) {
            this.a = $$0;
            this.b = $$1;
            this.e = $$2;
            this.a(EnumSet.of(cop.a.a));
        }

        @Override
        public boolean b() {
            this.k();
            return this.h() && this.i() && this.a.ag_() == null;
        }

        private boolean h() {
            return this.a.hh() && !this.a.he().a();
        }

        private boolean i() {
            axf $$02 = (axf)this.a.ao();
            is $$1 = this.a.dK();
            Optional<is> $$2 = $$02.F().a($$0 -> $$0.a(ctb.n), this::a, csx.b.c, $$1, 48, this.a.as);
            if ($$2.isEmpty()) {
                return false;
            }
            this.c = $$2.get().j();
            return true;
        }

        @Override
        public boolean c() {
            if (this.a.N().l()) {
                return false;
            }
            return this.a.ag_() == null && !this.c.a(this.a.dI(), (double)(this.a.dF() + (float)this.e)) && !this.f;
        }

        @Override
        public void e() {
            if (this.c.a(this.a.dI(), (double)this.e)) {
                this.d.add(this.c);
            }
        }

        @Override
        public void d() {
            super.d();
            this.a.n(0);
            this.a.N().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), this.b);
            this.f = false;
        }

        @Override
        public void a() {
            if (this.a.N().l()) {
                ftm $$0 = ftm.c(this.c);
                ftm $$1 = cso.a((cht)this.a, 16, 7, $$0, 0.3141592741012573);
                if ($$1 == null) {
                    $$1 = cso.a((cht)this.a, 8, 7, $$0, 1.5707963705062866);
                }
                if ($$1 == null) {
                    this.f = true;
                    return;
                }
                this.a.N().a($$1.g, $$1.h, $$1.i, this.b);
            }
        }

        private boolean a(is $$0) {
            for (is $$1 : this.d) {
                if (!Objects.equals($$0, $$1)) continue;
                return false;
            }
            return true;
        }

        private void k() {
            if (this.d.size() > 2) {
                this.d.remove(0);
            }
        }
    }

    public class c
    extends cop {
        private final dfi b;

        c(dfi $$1) {
            this.b = $$1;
            this.a(EnumSet.of(cop.a.a));
        }

        @Override
        public boolean b() {
            dfh $$0 = this.b.he();
            return this.b.cb() && this.b.ag_() == null && $$0 != null && $$0.f();
        }

        @Override
        public void d() {
            this.b.B(true);
            super.d();
        }

        @Override
        public void e() {
            this.b.B(false);
            super.e();
        }

        @Override
        public void a() {
            if (!this.b.bq() && this.b.as.a(this.a(100)) == 0) {
                dfi.this.b(dfi.this.gX());
            }
            if (!this.b.cq() && this.b.as.a(this.a(50)) == 0) {
                this.b.L().a();
            }
            super.a();
        }
    }

    protected static class a
    extends cop {
        private final dfi b;
        private final float c;
        public final csk a = csk.b().a(8.0).d().e();

        public a(dba $$0, float $$1) {
            this.b = $$0;
            this.c = $$1 * $$1;
            this.a(EnumSet.of(cop.a.a, cop.a.b));
        }

        @Override
        public boolean b() {
            chl $$0 = this.b.eK();
            return this.b.he() == null && this.b.gU() && this.b.ag_() != null && !this.b.gI() && ($$0 == null || $$0.ay() != cgu.cb);
        }

        @Override
        public void d() {
            super.d();
            this.b.N().n();
            List<dfi> $$0 = dfi$a.a(this.b).a(dfi.class, this.a, this.b, this.b.dj().c(8.0, 8.0, 8.0));
            for (dfi $$1 : $$0) {
                $$1.g(this.b.ag_());
            }
        }

        @Override
        public void e() {
            super.e();
            chl $$0 = this.b.ag_();
            if ($$0 != null) {
                List<dfi> $$1 = dfi$a.a(this.b).a(dfi.class, this.a, this.b, this.b.dj().c(8.0, 8.0, 8.0));
                for (dfi $$2 : $$1) {
                    $$2.g($$0);
                    $$2.w(true);
                }
                this.b.w(true);
            }
        }

        @Override
        public boolean X_() {
            return true;
        }

        @Override
        public void a() {
            chl $$0 = this.b.ag_();
            if ($$0 == null) {
                return;
            }
            if (this.b.g((cgk)$$0) > (double)this.c) {
                this.b.J().a($$0, 30.0f, 30.0f);
                if (this.b.as.a(50) == 0) {
                    this.b.T();
                }
            } else {
                this.b.w(true);
            }
            super.a();
        }
    }
}

