/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class iru {
    private final gfj a;
    private @Nullable irv b;

    public iru(gfj $$0, gfo $$1) {
        this.a = $$0;
    }

    public void a(hnf $$0) {
        if (this.b != null) {
            this.b.a($$0);
        }
    }

    public void a(double $$0, double $$1) {
        if (this.b != null) {
            this.b.a($$0, $$1);
        }
    }

    public void a(@Nullable hif $$0, @Nullable ftk $$1) {
        if (this.b != null && $$1 != null && $$0 != null) {
            this.b.a($$0, $$1);
        }
    }

    public void a(hif $$0, is $$1, eoh $$2, float $$3) {
        if (this.b != null) {
            this.b.a($$0, $$1, $$2, $$3);
        }
    }

    public void a() {
        if (this.b != null) {
            this.b.c();
        }
    }

    public void a(dlt $$0) {
        if (this.b != null) {
            this.b.a($$0);
        }
    }

    public void b() {
        if (this.b == null) {
            return;
        }
        this.b.b();
        this.b = null;
    }

    public void c() {
        if (this.b != null) {
            this.b();
        }
        this.b = this.a.k.o.a(this);
    }

    public void d() {
        if (this.b != null) {
            if (this.a.r != null) {
                this.b.a();
            } else {
                this.b();
            }
        } else if (this.a.r != null) {
            this.c();
        }
    }

    public void a(irw $$0) {
        this.a.k.o = $$0;
        this.a.k.aQ();
        if (this.b != null) {
            this.b.b();
            this.b = $$0.a(this);
        }
    }

    public gfj e() {
        return this.a;
    }

    public boolean f() {
        if (this.a.q == null) {
            return false;
        }
        return this.a.q.i() == dwl.a;
    }

    public static yh a(String $$0) {
        return yh.d("key." + $$0).a(l.r);
    }

    public void a(dlt $$0, dlt $$1, dht $$2) {
    }
}

