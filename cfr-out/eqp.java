/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class eqp
extends erb {
    private final eqq m;
    private final boolean n;

    public eqp(eqq $$0, boolean $$1) {
        super($$0.f(), erf.a, $$0.k, $$0.I().at(), $$0.v());
        this.m = $$0;
        this.n = $$1;
    }

    @Override
    public @Nullable elb c_(is $$0) {
        return this.m.c_($$0);
    }

    @Override
    public eoh a_(is $$0) {
        return this.m.a_($$0);
    }

    @Override
    public flb b_(is $$0) {
        return this.m.b_($$0);
    }

    @Override
    public eqr b(int $$0) {
        if (this.n) {
            return this.m.b($$0);
        }
        return super.b($$0);
    }

    @Override
    public @Nullable eoh a(is $$0, eoh $$1, @dzq.b int $$2) {
        if (this.n) {
            return this.m.a($$0, $$1, $$2);
        }
        return null;
    }

    @Override
    public void a(elb $$0) {
        if (this.n) {
            this.m.a($$0);
        }
    }

    @Override
    public void a(cgk $$0) {
        if (this.n) {
            this.m.a($$0);
        }
    }

    @Override
    public void a(erj $$0) {
        if (this.n) {
            super.a($$0);
        }
    }

    @Override
    public eqr[] d() {
        return this.m.d();
    }

    @Override
    public void a(euq.a $$0, long[] $$1) {
    }

    private euq.a c(euq.a $$0) {
        if ($$0 == euq.a.a) {
            return euq.a.b;
        }
        if ($$0 == euq.a.c) {
            return euq.a.d;
        }
        return $$0;
    }

    @Override
    public euq a(euq.a $$0) {
        return this.m.a($$0);
    }

    @Override
    public int a(euq.a $$0, int $$1, int $$2) {
        return this.m.a(this.c($$0), $$1, $$2);
    }

    @Override
    public jd<dxo> getNoiseBiome(int $$0, int $$1, int $$2) {
        return this.m.getNoiseBiome($$0, $$1, $$2);
    }

    @Override
    public dvu f() {
        return this.m.f();
    }

    @Override
    public @Nullable ffw a(ffo $$0) {
        return this.m.a($$0);
    }

    @Override
    public void a(ffo $$0, ffw $$1) {
    }

    @Override
    public Map<ffo, ffw> g() {
        return this.m.g();
    }

    @Override
    public void a(Map<ffo, ffw> $$0) {
    }

    @Override
    public LongSet b(ffo $$0) {
        return this.m.b($$0);
    }

    @Override
    public void a(ffo $$0, long $$1) {
    }

    @Override
    public Map<ffo, LongSet> h() {
        return this.m.h();
    }

    @Override
    public void b(Map<ffo, LongSet> $$0) {
    }

    @Override
    public void i() {
        this.m.i();
    }

    @Override
    public boolean s() {
        return false;
    }

    @Override
    public boolean j() {
        return false;
    }

    @Override
    public boolean m() {
        return false;
    }

    @Override
    public erj n() {
        return this.m.n();
    }

    @Override
    public void c(is $$0) {
    }

    @Override
    public void e(is $$0) {
    }

    @Override
    public void a(uz $$0) {
    }

    @Override
    public @Nullable uz f(is $$0) {
        return this.m.f($$0);
    }

    @Override
    public @Nullable uz a(is $$0, jf.a $$1) {
        return this.m.a($$0, $$1);
    }

    @Override
    public void a(Predicate<eoh> $$0, BiConsumer<is, eoh> $$1) {
        this.m.a($$0, $$1);
    }

    @Override
    public fvh<dzq> q() {
        if (this.n) {
            return this.m.q();
        }
        return fux.a();
    }

    @Override
    public fvh<fla> r() {
        if (this.n) {
            return this.m.r();
        }
        return fux.a();
    }

    @Override
    public eqf.b a(long $$0) {
        return this.m.a($$0);
    }

    @Override
    public @Nullable evt v() {
        return this.m.v();
    }

    @Override
    public eqe F() {
        if (this.n) {
            return super.F();
        }
        throw bhs.b(new UnsupportedOperationException("Meaningless in this context"));
    }

    @Override
    public eqe G() {
        if (this.n) {
            return super.G();
        }
        throw bhs.b(new UnsupportedOperationException("Meaningless in this context"));
    }

    public eqq H() {
        return this.m;
    }

    @Override
    public boolean x() {
        return this.m.x();
    }

    @Override
    public void a(boolean $$0) {
        this.m.a($$0);
    }

    @Override
    public void a(dxr $$0, dxx.f $$1) {
        if (this.n) {
            this.m.a($$0, $$1);
        }
    }

    @Override
    public void C() {
        this.m.C();
    }

    @Override
    public fkl D() {
        return this.m.D();
    }
}

