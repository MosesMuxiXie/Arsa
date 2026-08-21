/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class hpr {
    protected final hoh a;
    protected final dwo b;
    protected int c;
    protected int d;
    protected int e;
    private int g;
    private jw h;
    public hts.a[] f;

    public hpr(hts $$0, dwo $$1, int $$2, hoh $$3) {
        this.a = $$3;
        this.b = $$1;
        this.a($$2);
        this.a($$0);
        this.h = jw.a(this.g + 1, 0, this.g + 1);
    }

    protected void a(hts $$0) {
        if (!gfj.V().bK()) {
            throw new IllegalStateException("createSections called from wrong thread: " + Thread.currentThread().getName());
        }
        int $$1 = this.d * this.c * this.e;
        this.f = new hts.a[$$1];
        for (int $$2 = 0; $$2 < this.d; ++$$2) {
            for (int $$3 = 0; $$3 < this.c; ++$$3) {
                for (int $$4 = 0; $$4 < this.e; ++$$4) {
                    int $$5 = this.a($$2, $$3, $$4);
                    hts hts2 = $$0;
                    Objects.requireNonNull(hts2);
                    this.f[$$5] = new hts.a(hts2, $$5, jw.b($$2, $$3 + this.b.ay(), $$4));
                }
            }
        }
    }

    public void a() {
        for (hts.a $$0 : this.f) {
            $$0.e();
        }
    }

    private int a(int $$0, int $$1, int $$2) {
        return ($$2 * this.c + $$1) * this.d + $$0;
    }

    protected void a(int $$0) {
        int $$1;
        this.d = $$1 = $$0 * 2 + 1;
        this.c = this.b.ax();
        this.e = $$1;
        this.g = $$0;
    }

    public int b() {
        return this.g;
    }

    public dwq c() {
        return this.b;
    }

    public void a(jw $$0) {
        for (int $$1 = 0; $$1 < this.d; ++$$1) {
            int $$2 = $$0.a() - this.g;
            int $$3 = $$2 + Math.floorMod($$1 - $$2, this.d);
            for (int $$4 = 0; $$4 < this.e; ++$$4) {
                int $$5 = $$0.c() - this.g;
                int $$6 = $$5 + Math.floorMod($$4 - $$5, this.e);
                for (int $$7 = 0; $$7 < this.c; ++$$7) {
                    int $$8 = this.b.ay() + $$7;
                    hts.a $$9 = this.f[this.a($$1, $$7, $$4)];
                    long $$10 = $$9.g();
                    if ($$10 == jw.b($$3, $$8, $$6)) continue;
                    $$9.c(jw.b($$3, $$8, $$6));
                }
            }
        }
        this.h = $$0;
        this.a.x().a();
    }

    public jw d() {
        return this.h;
    }

    public void a(int $$0, int $$1, int $$2, boolean $$3) {
        hts.a $$4 = this.b($$0, $$1, $$2);
        if ($$4 != null) {
            $$4.b($$3);
        }
    }

    protected @Nullable hts.a a(is $$0) {
        return this.a(jw.c($$0));
    }

    protected @Nullable hts.a a(long $$0) {
        int $$1 = jw.b($$0);
        int $$2 = jw.c($$0);
        int $$3 = jw.d($$0);
        return this.b($$1, $$2, $$3);
    }

    private @Nullable hts.a b(int $$0, int $$1, int $$2) {
        if (!this.c($$0, $$1, $$2)) {
            return null;
        }
        int $$3 = $$1 - this.b.ay();
        int $$4 = Math.floorMod($$0, this.d);
        int $$5 = Math.floorMod($$2, this.e);
        return this.f[this.a($$4, $$3, $$5)];
    }

    private boolean c(int $$0, int $$1, int $$2) {
        if ($$1 < this.b.ay() || $$1 > this.b.az()) {
            return false;
        }
        if ($$0 < this.h.a() - this.g || $$0 > this.h.a() + this.g) {
            return false;
        }
        return $$2 >= this.h.c() - this.g && $$2 <= this.h.c() + this.g;
    }
}

