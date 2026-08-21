/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Queues;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.jspecify.annotations.Nullable;

public class hts {
    private final htk a = new htk();
    private final Queue<Runnable> b = Queues.newConcurrentLinkedQueue();
    final Executor c = this.b::add;
    final Queue<htr> d = Queues.newConcurrentLinkedQueue();
    final hpd e;
    private final hpe f;
    volatile boolean g;
    private final cbs h;
    private final z i;
    hif j;
    final hoh k;
    ftm l = ftm.c;
    final htp m;

    public hts(hif $$0, hoh $$1, z $$2, hoz $$3, hpw $$4, hrh $$5) {
        this.j = $$0;
        this.k = $$1;
        this.e = $$3.a();
        this.f = $$3.b();
        this.i = $$2;
        this.h = new cbs($$2, "Section Renderer");
        this.h.a_(this::i);
        this.m = new htp($$4, $$5);
    }

    public void a(hif $$0) {
        this.j = $$0;
    }

    private void i() {
        if (this.g || this.f.b()) {
            return;
        }
        a.a $$02 = this.a.a(this.l);
        if ($$02 == null) {
            return;
        }
        hpd $$1 = Objects.requireNonNull(this.f.a());
        ((CompletableFuture)CompletableFuture.supplyAsync(() -> $$02.a($$1), this.i.a($$02.b())).thenCompose($$0 -> $$0)).whenComplete(($$2, $$3) -> {
            if ($$3 != null) {
                gfj.V().a(m.a($$3, "Batching sections"));
                return;
            }
            $$0.b.set(true);
            this.h.a_(() -> {
                if ($$2 == hts$b.a) {
                    $$1.a();
                } else {
                    $$1.b();
                }
                this.f.a($$1);
                this.i();
            });
        });
    }

    public void a(ftm $$0) {
        this.l = $$0;
    }

    public void a() {
        htr $$1;
        Runnable $$0;
        while (($$0 = this.b.poll()) != null) {
            $$0.run();
        }
        while (($$1 = this.d.poll()) != null) {
            $$1.close();
        }
    }

    public void a(a $$0, htm $$1) {
        $$0.c($$1);
    }

    public void a(a.a $$0) {
        if (this.g) {
            return;
        }
        this.h.a_(() -> {
            if (this.g) {
                return;
            }
            this.a.a($$0);
            this.i();
        });
    }

    public void b() {
        this.a.b();
    }

    public boolean c() {
        return this.a.a() == 0 && this.b.isEmpty();
    }

    public void d() {
        this.g = true;
        this.b();
        this.a();
    }

    @bht
    public String e() {
        return String.format(Locale.ROOT, "pC: %03d, pU: %02d, aB: %02d", this.a.a(), this.b.size(), this.f.c());
    }

    @bht
    public int f() {
        return this.a.a();
    }

    @bht
    public int g() {
        return this.b.size();
    }

    @bht
    public int h() {
        return this.f.c();
    }

    public class hts$a {
        public static final int a = 16;
        public final int b;
        public final AtomicReference<htr> c = new AtomicReference<htr>(htl.a);
        private @Nullable b e;
        private @Nullable c f;
        private fth g;
        private boolean h = true;
        volatile long i = jw.b(-1, -1, -1);
        final is.a j = new is.a(-1, -1, -1);
        private boolean k;
        private long l;
        private long m;
        private boolean n;

        public hts$a(int $$1, long $$2) {
            this.b = $$1;
            this.c($$2);
        }

        public float a(long $$0) {
            long $$1 = $$0 - this.l;
            if ($$1 >= this.m) {
                return 1.0f;
            }
            return (float)$$1 / (float)this.m;
        }

        public void b(long $$0) {
            this.m = $$0;
        }

        public void a(boolean $$0) {
            this.n = $$0;
        }

        public boolean a() {
            return this.n;
        }

        private boolean d(long $$0) {
            eqf $$1 = hts.this.j.a(jw.b($$0), jw.d($$0), erj.n, false);
            return $$1 != null && hts.this.j.C_().a(jw.f($$0));
        }

        public boolean b() {
            return this.d(jw.a(this.i, iz.e)) && this.d(jw.a(this.i, iz.c)) && this.d(jw.a(this.i, iz.f)) && this.d(jw.a(this.i, iz.d)) && this.d(jw.a(this.i, -1, 0, -1)) && this.d(jw.a(this.i, -1, 0, 1)) && this.d(jw.a(this.i, 1, 0, -1)) && this.d(jw.a(this.i, 1, 0, 1));
        }

        public fth c() {
            return this.g;
        }

        public CompletableFuture<Void> a(Map<hth, fzl> $$0, htl $$1) {
            if (hts.this.g) {
                $$0.values().forEach(fzl::close);
                return CompletableFuture.completedFuture(null);
            }
            return CompletableFuture.runAsync(() -> $$0.forEach(($$1, $$2) -> {
                try (bzr $$3 = bzl.a().d("Upload Section Layer");){
                    $$1.a((hth)((Object)((Object)$$1)), (fzl)$$2, this.i);
                    $$2.close();
                }
                if (this.l == 0L) {
                    this.l = bhs.c();
                }
            }), hts.this.c);
        }

        public CompletableFuture<Void> a(htl $$0, fzi.a $$1, hth $$2) {
            if (hts.this.g) {
                $$1.close();
                return CompletableFuture.completedFuture(null);
            }
            return CompletableFuture.runAsync(() -> {
                try (bzr $$3 = bzl.a().d("Upload Section Indices");){
                    $$0.a($$2, $$1, this.i);
                    $$1.close();
                }
            }, hts.this.c);
        }

        public void c(long $$0) {
            this.e();
            this.i = $$0;
            int $$1 = jw.c(jw.b($$0));
            int $$2 = jw.c(jw.c($$0));
            int $$3 = jw.c(jw.d($$0));
            this.j.d($$1, $$2, $$3);
            this.g = new fth($$1, $$2, $$3, $$1 + 16, $$2 + 16, $$3 + 16);
        }

        public htr d() {
            return this.c.get();
        }

        public void e() {
            this.m();
            this.c.getAndSet(htl.a).close();
            this.h = true;
            this.l = 0L;
            this.n = false;
        }

        public is f() {
            return this.j;
        }

        public long g() {
            return this.i;
        }

        public void b(boolean $$0) {
            boolean $$1 = this.h;
            this.h = true;
            this.k = $$0 | ($$1 && this.k);
        }

        public void h() {
            this.h = false;
            this.k = false;
        }

        public boolean i() {
            return this.h;
        }

        public boolean j() {
            return this.h && this.k;
        }

        public long a(iz $$0) {
            return jw.a(this.i, $$0);
        }

        public void a(hts $$0) {
            htr htr2 = this.d();
            if (htr2 instanceof htl) {
                htl $$1 = (htl)htr2;
                this.f = new c($$1);
                $$0.a(this.f);
            }
        }

        public boolean k() {
            return this.d().c();
        }

        public boolean l() {
            return this.f != null && !this.f.b.get();
        }

        protected void m() {
            if (this.e != null) {
                this.e.a();
                this.e = null;
            }
            if (this.f != null) {
                this.f.a();
                this.f = null;
            }
        }

        public a a(htm $$0) {
            this.m();
            htn $$1 = $$0.a(hts.this.j, this.i);
            boolean $$2 = this.c.get() != htl.a;
            this.e = new b($$1, $$2);
            return this.e;
        }

        public void b(htm $$0) {
            a $$1 = this.a($$0);
            hts.this.a($$1);
        }

        public void c(htm $$0) {
            a $$1 = this.a($$0);
            $$1.a(hts.this.e);
        }

        void a(htr $$0) {
            htr $$1 = this.c.getAndSet($$0);
            hts.this.d.add($$1);
            hts.this.k.a(this);
        }

        fzr a(jw $$0) {
            ftm $$1 = hts.this.l;
            return fzr.a((float)($$1.g - (double)$$0.d()), (float)($$1.h - (double)$$0.e()), (float)($$1.i - (double)$$0.f()));
        }

        class c
        extends a {
            private final htl f;

            public c(htl $$0) {
                super(true);
                this.f = $$0;
            }

            @Override
            protected String b() {
                return "rend_chk_sort";
            }

            @Override
            public CompletableFuture<hts$b> a(hpd $$0) {
                if (this.a.get()) {
                    return CompletableFuture.completedFuture(hts$b.b);
                }
                fzl.b $$12 = this.f.d();
                if ($$12 == null || this.f.a(hth.c)) {
                    return CompletableFuture.completedFuture(hts$b.b);
                }
                long $$22 = a.this.i;
                fzr $$3 = a.this.a(jw.a($$22));
                htt $$4 = htt.a(hts.this.l, $$22);
                if (!this.f.b($$4) && !$$4.a()) {
                    return CompletableFuture.completedFuture(hts$b.b);
                }
                fzi.a $$5 = $$12.a($$0.a(hth.c), $$3);
                if ($$5 == null) {
                    return CompletableFuture.completedFuture(hts$b.b);
                }
                if (this.a.get()) {
                    $$5.close();
                    return CompletableFuture.completedFuture(hts$b.b);
                }
                CompletableFuture<Void> $$6 = a.this.a(this.f, $$5, hth.c);
                return $$6.handle(($$1, $$2) -> {
                    if ($$2 != null && !($$2 instanceof CancellationException) && !($$2 instanceof InterruptedException)) {
                        gfj.V().a(m.a($$2, "Rendering section"));
                    }
                    if (this.a.get()) {
                        return hts$b.b;
                    }
                    this.f.a($$4);
                    return hts$b.a;
                });
            }

            @Override
            public void a() {
                this.a.set(true);
            }
        }

        public abstract class a {
            protected final AtomicBoolean a = new AtomicBoolean(false);
            protected final AtomicBoolean b = new AtomicBoolean(false);
            protected final boolean c;

            public a(boolean $$1) {
                this.c = $$1;
            }

            public abstract CompletableFuture<hts$b> a(hpd var1);

            public abstract void a();

            protected abstract String b();

            public boolean c() {
                return this.c;
            }

            public is d() {
                return a.this.j;
            }
        }

        class b
        extends a {
            protected final htn e;

            public b(htn $$0, boolean $$1) {
                super($$1);
                this.e = $$0;
            }

            @Override
            protected String b() {
                return "rend_chk_rebuild";
            }

            /*
             * WARNING - void declaration
             */
            @Override
            public CompletableFuture<hts$b> a(hpd $$0) {
                void $$5;
                if (this.a.get()) {
                    return CompletableFuture.completedFuture(hts$b.b);
                }
                long $$12 = a.this.i;
                jw $$22 = jw.a($$12);
                if (this.a.get()) {
                    return CompletableFuture.completedFuture(hts$b.b);
                }
                try (bzr $$3 = bzl.a().d("Compile Section");){
                    htp.a $$4 = hts.this.m.a($$22, this.e, a.this.a($$22), $$0);
                }
                htt $$6 = htt.a(hts.this.l, $$12);
                if (this.a.get()) {
                    $$5.a();
                    return CompletableFuture.completedFuture(hts$b.b);
                }
                htl $$7 = new htl($$6, (htp.a)$$5);
                CompletableFuture<Void> $$8 = a.this.a($$5.b, $$7);
                return $$8.handle(($$1, $$2) -> {
                    if ($$2 != null && !($$2 instanceof CancellationException) && !($$2 instanceof InterruptedException)) {
                        gfj.V().a(m.a($$2, "Rendering section"));
                    }
                    if (this.a.get() || hts.this.g) {
                        hts.this.d.add($$7);
                        return hts$b.b;
                    }
                    a.this.a($$7);
                    return hts$b.a;
                });
            }

            @Override
            public void a() {
                if (this.a.compareAndSet(false, true)) {
                    a.this.b(false);
                }
            }
        }
    }

    static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        private static final /* synthetic */ b[] c;

        public static b[] values() {
            return (b[])c.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b};
        }

        static {
            c = hts$b.a();
        }
    }
}

