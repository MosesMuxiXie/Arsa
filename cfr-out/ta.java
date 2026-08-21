/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.Object2LongMap
 *  it.unimi.dsi.fastutil.objects.Object2LongMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class ta {
    private final jd.c<tb> a;
    private @Nullable is b;
    private final axf c;
    private final Collection<td> d = Lists.newArrayList();
    private final int e;
    private final Collection<tg> f = Lists.newCopyOnWriteArrayList();
    private final Object2LongMap<Runnable> g = new Object2LongOpenHashMap();
    private boolean h;
    private boolean i;
    private int j;
    private boolean k;
    private final tq l;
    private final Stopwatch m = Stopwatch.createUnstarted();
    private boolean n;
    private final egm o;
    private @Nullable sy p;
    private @Nullable emz q;

    public ta(jd.c<tb> $$0, egm $$1, axf $$2, tq $$3) {
        this.a = $$0;
        this.c = $$2;
        this.l = $$3;
        this.e = $$0.a().f();
        this.o = $$1;
    }

    public void a(@Nullable is $$0) {
        this.b = $$0;
    }

    public ta a(int $$0) {
        this.j = -(this.a.a().g() + $$0 + 1);
        return this;
    }

    public void a() {
        if (this.h) {
            return;
        }
        emz $$02 = this.f();
        if (!$$02.C()) {
            this.a(yh.a("test.error.structure.failure", new Object[]{$$02.k().getString()}));
        }
        this.h = true;
        $$02.E();
        ffg $$1 = $$02.d();
        this.c.q().a($$1);
        this.c.a($$1);
        this.d.forEach($$0 -> $$0.a(this));
    }

    public void a(tf $$0) {
        if (this.k()) {
            return;
        }
        if (!this.h) {
            this.a(yh.c("test.error.ticking_without_structure"));
        }
        if (this.q == null) {
            this.a(yh.c("test.error.missing_block_entity"));
        }
        if (this.p != null) {
            this.G();
        }
        if (!this.i) {
            if (!this.q.d().b().allMatch(this.c::a)) {
                return;
            }
        }
        this.i = true;
        this.E();
        if (this.k()) {
            if (this.p != null) {
                this.d.forEach($$1 -> $$1.b(this, $$0));
            } else {
                this.d.forEach($$1 -> $$1.a(this, $$0));
            }
        }
    }

    private void E() {
        ++this.j;
        if (this.j < 0) {
            return;
        }
        if (!this.k) {
            this.F();
        }
        ObjectIterator $$02 = this.g.object2LongEntrySet().iterator();
        while ($$02.hasNext()) {
            Object2LongMap.Entry $$1 = (Object2LongMap.Entry)$$02.next();
            if ($$1.getLongValue() > (long)this.j) continue;
            try {
                ((Runnable)$$1.getKey()).run();
            }
            catch (sy $$2) {
                this.a($$2);
            }
            catch (Exception $$3) {
                this.a(new ub($$3));
            }
            $$02.remove();
        }
        if (this.j > this.e) {
            if (this.f.isEmpty()) {
                this.a(new tj(yh.a("test.error.timeout.no_result", this.a.a().f())));
            } else {
                this.f.forEach($$0 -> $$0.c(this.j));
                if (this.p == null) {
                    this.a(new tj(yh.a("test.error.timeout.no_sequences_finished", this.a.a().f())));
                }
            }
        } else {
            this.f.forEach($$0 -> $$0.b(this.j));
        }
    }

    private void F() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.m.start();
        this.f().z();
        try {
            this.a.a().a(new sz(this));
        }
        catch (sy $$0) {
            this.a($$0);
        }
        catch (Exception $$1) {
            this.a(new ub($$1));
        }
    }

    public void a(long $$0, Runnable $$1) {
        this.g.put((Object)$$1, $$0);
    }

    public amo b() {
        return this.a.h().a();
    }

    public @Nullable is c() {
        return this.b;
    }

    public is d() {
        return this.q.D();
    }

    public fth e() {
        emz $$0 = this.f();
        return $$0.f();
    }

    public emz f() {
        if (this.q == null) {
            if (this.b == null) {
                throw new IllegalStateException("This GameTestInfo has no position");
            }
            elb elb2 = this.c.c_(this.b);
            if (elb2 instanceof emz) {
                emz $$0;
                this.q = $$0 = (emz)elb2;
            }
            if (this.q == null) {
                throw new IllegalStateException("Could not find a test instance block entity at the given coordinate " + String.valueOf(this.b));
            }
        }
        return this.q;
    }

    public axf g() {
        return this.c;
    }

    public boolean h() {
        return this.n && this.p == null;
    }

    public boolean i() {
        return this.p != null;
    }

    public boolean j() {
        return this.k;
    }

    public boolean k() {
        return this.n;
    }

    public long l() {
        return this.m.elapsed(TimeUnit.MILLISECONDS);
    }

    private void G() {
        if (!this.n) {
            this.n = true;
            if (this.m.isRunning()) {
                this.m.stop();
            }
        }
    }

    public void m() {
        if (this.p == null) {
            this.G();
            fth $$02 = this.e();
            List<cgk> $$1 = this.g().a(cgk.class, $$02.g(1.0), (? super T $$0) -> !($$0 instanceof ddm));
            $$1.forEach($$0 -> $$0.a(cgk.e.b));
        }
    }

    public void a(yh $$0) {
        this.a(new sr($$0, this.j));
    }

    public void a(sy $$0) {
        this.p = $$0;
    }

    public @Nullable sy n() {
        return this.p;
    }

    public String toString() {
        return this.b().toString();
    }

    public void a(td $$0) {
        this.d.add($$0);
    }

    public @Nullable ta o() {
        emz $$0 = this.a(Objects.requireNonNull(this.b), this.o, this.c);
        if ($$0 != null) {
            this.q = $$0;
            this.a();
            return this;
        }
        return null;
    }

    private @Nullable emz a(is $$0, egm $$1, axf $$2) {
        $$2.c($$0, dzs.qb.m());
        elb elb2 = $$2.c_($$0);
        if (elb2 instanceof emz) {
            emz $$3 = (emz)elb2;
            amt<tb> $$4 = this.w().h();
            jy $$5 = emz.a($$2, $$4).orElse(new jy(1, 1, 1));
            $$3.a(new emz.a(Optional.of($$4), $$5, $$1, false, emz.c.a, Optional.empty()));
            return $$3;
        }
        return null;
    }

    int p() {
        return this.j;
    }

    tg q() {
        tg $$0 = new tg(this);
        this.f.add($$0);
        return $$0;
    }

    public boolean r() {
        return this.a.a().h();
    }

    public boolean s() {
        return !this.a.a().h();
    }

    public amo t() {
        return this.a.a().e();
    }

    public egm u() {
        return this.a.a().n().f().a(this.o);
    }

    public tb v() {
        return this.a.a();
    }

    public jd.c<tb> w() {
        return this.a;
    }

    public int x() {
        return this.e;
    }

    public boolean y() {
        return this.a.a().j() > 1;
    }

    public int z() {
        return this.a.a().j();
    }

    public int A() {
        return this.a.a().k();
    }

    public tq B() {
        return this.l;
    }

    public Stream<td> C() {
        return this.d.stream();
    }

    public ta D() {
        ta $$0 = new ta(this.a, this.o, this.c, this.B());
        if (this.b != null) {
            $$0.a(this.b);
        }
        return $$0;
    }
}

