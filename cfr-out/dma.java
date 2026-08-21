/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class dma {
    public static final int a = 20;
    private long b;
    private @Nullable jd<dlz> c;
    private final is d;
    private final a e;

    public dma(a $$0, is $$1) {
        this.e = $$0;
        this.d = $$1;
    }

    public boolean a() {
        return this.c != null;
    }

    public @Nullable dlz b() {
        if (this.c == null) {
            return null;
        }
        return this.c.a();
    }

    public long c() {
        return this.b;
    }

    public void a(jd<dlz> $$0, long $$1) {
        if ($$0.a().a($$1)) {
            return;
        }
        this.c = $$0;
        this.b = $$1;
    }

    public void a(dwp $$0, jd<dlz> $$1) {
        this.c = $$1;
        this.b = 0L;
        int $$2 = $$0.J_().f(mj.bj).a(this.c.a());
        $$0.a(null, 1010, this.d, $$2);
        this.e.notifyChange();
    }

    public void a(dwp $$0, @Nullable eoh $$1) {
        if (this.c == null) {
            return;
        }
        this.c = null;
        this.b = 0L;
        $$0.a(etk.F, this.d, etk.a.a($$1));
        $$0.c(1011, this.d, 0);
        this.e.notifyChange();
    }

    public void b(dwp $$0, @Nullable eoh $$1) {
        if (this.c == null) {
            return;
        }
        if (this.c.a().a(this.b)) {
            this.a($$0, $$1);
            return;
        }
        if (this.d()) {
            $$0.a(etk.E, this.d, etk.a.a($$1));
            dma.a($$0, this.d);
        }
        ++this.b;
    }

    private boolean d() {
        return this.b % 20L == 0L;
    }

    private static void a(dwp $$0, is $$1) {
        if ($$0 instanceof axf) {
            axf $$2 = (axf)$$0;
            ftm $$3 = ftm.c($$1).b(0.0, 1.2f, 0.0);
            float $$4 = (float)$$0.G_().a(4) / 24.0f;
            $$2.a(ly.ae, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
        }
    }

    @FunctionalInterface
    public static interface a {
        public void notifyChange();
    }
}

