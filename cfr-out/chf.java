/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Objects;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class chf {
    public static final int a = 3;
    private final cgk b;
    private int c;
    private final a d = new a(0, ftm.c, 0.0f, 0.0f);
    private @Nullable ftm e;
    private @Nullable ftl f;
    private final @Nullable Consumer<chf> g;

    public chf(cgk $$0) {
        this($$0, 3, null);
    }

    public chf(cgk $$0, int $$1) {
        this($$0, $$1, null);
    }

    public chf(cgk $$0, @Nullable Consumer<chf> $$1) {
        this($$0, 3, $$1);
    }

    public chf(cgk $$0, int $$1, @Nullable Consumer<chf> $$2) {
        this.c = $$1;
        this.b = $$0;
        this.g = $$2;
    }

    public ftm a() {
        return this.d.a > 0 ? this.d.b : this.b.dI();
    }

    public float b() {
        return this.d.a > 0 ? this.d.c : this.b.ec();
    }

    public float c() {
        return this.d.a > 0 ? this.d.d : this.b.ee();
    }

    public void a(ftm $$0, float $$1, float $$2) {
        if (this.c == 0) {
            this.b.b($$0, $$1, $$2);
            this.f();
            return;
        }
        if (this.d() && Objects.equals(Float.valueOf(this.b()), Float.valueOf($$1)) && Objects.equals(Float.valueOf(this.c()), Float.valueOf($$2)) && Objects.equals(this.a(), $$0)) {
            return;
        }
        this.d.a = this.c;
        this.d.b = $$0;
        this.d.c = $$1;
        this.d.d = $$2;
        this.e = this.b.dI();
        this.f = new ftl(this.b.ee(), this.b.ec());
        if (this.g != null) {
            this.g.accept(this);
        }
    }

    public boolean d() {
        return this.d.a > 0;
    }

    public void a(int $$0) {
        this.c = $$0;
    }

    public void e() {
        if (!this.d()) {
            this.f();
            return;
        }
        double $$0 = 1.0 / (double)this.d.a;
        if (this.e != null) {
            ftm $$1 = this.b.dI().d(this.e);
            if (this.b.ao().a(this.b, this.b.c(this.d.b.e($$1)))) {
                this.d.a($$1);
            }
        }
        if (this.f != null) {
            float $$2 = this.b.ec() - this.f.k;
            float $$3 = this.b.ee() - this.f.j;
            this.d.a($$2, $$3);
        }
        double $$4 = bgj.d($$0, this.b.dP(), this.d.b.g);
        double $$5 = bgj.d($$0, this.b.dR(), this.d.b.h);
        double $$6 = bgj.d($$0, this.b.dV(), this.d.b.i);
        ftm $$7 = new ftm($$4, $$5, $$6);
        float $$8 = (float)bgj.e($$0, (double)this.b.ec(), (double)this.d.c);
        float $$9 = (float)bgj.d($$0, (double)this.b.ee(), (double)this.d.d);
        this.b.b($$7);
        this.b.a($$8, $$9);
        this.d.a();
        this.e = $$7;
        this.f = new ftl(this.b.ee(), this.b.ec());
    }

    public void f() {
        this.d.a = 0;
        this.e = null;
        this.f = null;
    }

    static class a {
        protected int a;
        ftm b;
        float c;
        float d;

        a(int $$0, ftm $$1, float $$2, float $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        public void a() {
            --this.a;
        }

        public void a(ftm $$0) {
            this.b = this.b.e($$0);
        }

        public void a(float $$0, float $$1) {
            this.c += $$0;
            this.d += $$1;
        }
    }
}

