/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.shorts.ShortOpenHashSet
 *  it.unimi.dsi.fastutil.shorts.ShortSet
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.shorts.ShortOpenHashSet;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.util.BitSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import org.jspecify.annotations.Nullable;

public class awg
extends awv {
    public static final awk<eqq> a = awk.a("Unloaded level chunk");
    private static final CompletableFuture<awk<eqq>> e = CompletableFuture.completedFuture(a);
    private final dwq f;
    private volatile CompletableFuture<awk<eqq>> g = e;
    private volatile CompletableFuture<awk<eqq>> h = e;
    private volatile CompletableFuture<awk<eqq>> i = e;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private final @Nullable ShortSet[] n;
    private final BitSet o = new BitSet();
    private final BitSet p = new BitSet();
    private final fkq q;
    private final a r;
    private final b s;
    private boolean t;
    private CompletableFuture<?> u = CompletableFuture.completedFuture(null);
    private CompletableFuture<?> v = CompletableFuture.completedFuture(null);
    private CompletableFuture<?> w = CompletableFuture.completedFuture(null);

    public awg(dvu $$0, int $$1, dwq $$2, fkq $$3, a $$4, b $$5) {
        super($$0);
        this.f = $$2;
        this.q = $$3;
        this.r = $$4;
        this.s = $$5;
        this.k = this.j = awh.b + 1;
        this.l = this.j;
        this.a($$1);
        this.n = new ShortSet[$$2.ax()];
    }

    public CompletableFuture<awk<eqq>> a() {
        return this.h;
    }

    public CompletableFuture<awk<eqq>> b() {
        return this.i;
    }

    public CompletableFuture<awk<eqq>> c() {
        return this.g;
    }

    public @Nullable eqq d() {
        return this.a().getNow(a).b((eqq)null);
    }

    public @Nullable eqq e() {
        if (!this.v.isDone()) {
            return null;
        }
        return this.d();
    }

    public CompletableFuture<?> f() {
        return this.v;
    }

    public void a(CompletableFuture<?> $$02) {
        this.v = this.v.isDone() ? $$02 : this.v.thenCombine($$02, ($$0, $$1) -> null);
    }

    public CompletableFuture<?> g() {
        return this.w;
    }

    public boolean h() {
        return this.w.isDone();
    }

    @Override
    protected void b(CompletableFuture<?> $$02) {
        this.w = this.w.isDone() ? $$02 : this.w.thenCombine($$02, ($$0, $$1) -> null);
    }

    public boolean a(is $$0) {
        eqq $$1 = this.d();
        if ($$1 == null) {
            return false;
        }
        boolean $$2 = this.m;
        int $$3 = this.f.f($$0.v());
        ShortSet $$4 = this.n[$$3];
        if ($$4 == null) {
            this.m = true;
            this.n[$$3] = $$4 = new ShortOpenHashSet();
        }
        $$4.add(jw.b($$0));
        return !$$2;
    }

    public boolean a(dww $$0, int $$1) {
        int $$7;
        eqf $$2 = this.b(erj.k);
        if ($$2 == null) {
            return false;
        }
        $$2.i();
        eqq $$3 = this.d();
        if ($$3 == null) {
            return false;
        }
        int $$4 = this.q.d();
        int $$5 = this.q.e();
        if ($$1 < $$4 || $$1 > $$5) {
            return false;
        }
        BitSet $$6 = $$0 == dww.a ? this.p : this.o;
        if (!$$6.get($$7 = $$1 - $$4)) {
            $$6.set($$7);
            return true;
        }
        return false;
    }

    public boolean i() {
        return this.m || !this.p.isEmpty() || !this.o.isEmpty();
    }

    public void a(eqq $$0) {
        if (!this.i()) {
            return;
        }
        dwo $$1 = $$0.I();
        if (!this.p.isEmpty() || !this.o.isEmpty()) {
            List<axg> $$22 = this.s.a(this.d, true);
            if (!$$22.isEmpty()) {
                aeu $$32 = new aeu($$0.f(), this.q, this.p, this.o);
                this.a($$22, $$32);
            }
            this.p.clear();
            this.o.clear();
        }
        if (!this.m) {
            return;
        }
        List<axg> $$4 = this.s.a(this.d, false);
        for (int $$5 = 0; $$5 < this.n.length; ++$$5) {
            ShortSet $$6 = this.n[$$5];
            if ($$6 == null) continue;
            this.n[$$5] = null;
            if ($$4.isEmpty()) continue;
            int $$7 = this.f.h($$5);
            jw $$8 = jw.a($$0.f(), $$7);
            if ($$6.size() == 1) {
                is $$9 = $$8.g($$6.iterator().nextShort());
                eoh $$10 = $$1.a_($$9);
                this.a($$4, new adj($$9, $$10));
                this.a($$4, $$1, $$9, $$10);
                continue;
            }
            eqr $$11 = $$0.b($$5);
            aga $$12 = new aga($$8, $$6, $$11);
            this.a($$4, $$12);
            $$12.a((is $$2, eoh $$3) -> this.a($$4, $$1, (is)$$2, (eoh)$$3));
        }
        this.m = false;
    }

    private void a(List<axg> $$0, dwo $$1, is $$2, eoh $$3) {
        if ($$3.x()) {
            this.a($$0, $$1, $$2);
        }
    }

    private void a(List<axg> $$0, dwo $$1, is $$2) {
        aay<adb> $$4;
        elb $$3 = $$1.c_($$2);
        if ($$3 != null && ($$4 = $$3.ax_()) != null) {
            this.a($$0, $$4);
        }
    }

    private void a(List<axg> $$0, aay<?> $$12) {
        $$0.forEach($$1 -> $$1.g.b($$12));
    }

    @Override
    public int j() {
        return this.k;
    }

    @Override
    public int k() {
        return this.l;
    }

    private void b(int $$0) {
        this.l = $$0;
    }

    public void a(int $$0) {
        this.k = $$0;
    }

    private void a(awj $$0, CompletableFuture<awk<eqq>> $$1, Executor $$2, awt $$3) {
        this.u.cancel(false);
        CompletableFuture $$4 = new CompletableFuture();
        $$4.thenRunAsync(() -> $$0.a(this.d, $$3), $$2);
        this.u = $$4;
        $$1.thenAccept($$12 -> $$12.a((T $$1) -> $$4.complete(null)));
    }

    private void a(awj $$0, awt $$1) {
        this.u.cancel(false);
        $$0.a(this.d, $$1);
    }

    protected void a(awj $$0, Executor $$1) {
        awt $$2 = awh.c(this.j);
        awt $$3 = awh.c(this.k);
        boolean $$4 = $$2.a(awt.b);
        boolean $$5 = $$3.a(awt.b);
        this.t |= $$5;
        if (!$$4 && $$5) {
            this.g = $$0.c(this);
            this.a($$0, this.g, $$1, awt.b);
            this.b(this.g);
        }
        if ($$4 && !$$5) {
            this.g.complete(a);
            this.g = e;
        }
        boolean $$6 = $$2.a(awt.c);
        boolean $$7 = $$3.a(awt.c);
        if (!$$6 && $$7) {
            this.h = $$0.b(this);
            this.a($$0, this.h, $$1, awt.c);
            this.b(this.h);
        }
        if ($$6 && !$$7) {
            this.h.complete(a);
            this.h = e;
        }
        boolean $$8 = $$2.a(awt.d);
        boolean $$9 = $$3.a(awt.d);
        if (!$$8 && $$9) {
            if (this.i != e) {
                throw bhs.b(new IllegalStateException());
            }
            this.i = $$0.a(this);
            this.a($$0, this.i, $$1, awt.d);
            this.b(this.i);
        }
        if ($$8 && !$$9) {
            this.i.complete(a);
            this.i = e;
        }
        if (!$$3.a($$2)) {
            this.a($$0, $$3);
        }
        this.r.onLevelChange(this.d, this::k, this.k, this::b);
        this.j = this.k;
    }

    public boolean l() {
        return this.t;
    }

    public void m() {
        this.t = awh.c(this.k).a(awt.b);
    }

    @FunctionalInterface
    public static interface a {
        public void onLevelChange(dvu var1, IntSupplier var2, int var3, IntConsumer var4);
    }

    public static interface b {
        public List<axg> a(dvu var1, boolean var2);
    }
}

