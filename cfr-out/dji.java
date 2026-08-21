/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class dji {
    private final int a;
    public final ccv c;
    public int d;
    public final int e;
    public final int f;

    public dji(ccv $$0, int $$1, int $$2, int $$3) {
        this.c = $$0;
        this.a = $$1;
        this.e = $$2;
        this.f = $$3;
    }

    public void b(dlt $$0, dlt $$1) {
        int $$2 = $$1.N() - $$0.N();
        if ($$2 > 0) {
            this.a($$1, $$2);
        }
    }

    protected void a(dlt $$0, int $$1) {
    }

    protected void b(int $$0) {
    }

    protected void c_(dlt $$0) {
    }

    public void a(ddm $$0, dlt $$1) {
        this.d();
    }

    public boolean a(dlt $$0) {
        return true;
    }

    public dlt g() {
        return this.c.a(this.a);
    }

    public boolean h() {
        return !this.g().f();
    }

    public void e(dlt $$0) {
        this.a($$0, this.g());
    }

    public void a(dlt $$0, dlt $$1) {
        this.f($$0);
    }

    public void f(dlt $$0) {
        this.c.a(this.a, $$0);
        this.d();
    }

    public void d() {
        this.c.e();
    }

    public int a() {
        return this.c.ap_();
    }

    public int b_(dlt $$0) {
        return Math.min(this.a(), $$0.k());
    }

    public @Nullable amo c() {
        return null;
    }

    public dlt a(int $$0) {
        return this.c.a(this.a, $$0);
    }

    public boolean a(ddm $$0) {
        return true;
    }

    public boolean b() {
        return true;
    }

    public Optional<dlt> a(int $$0, int $$1, ddm $$2) {
        if (!this.a($$2)) {
            return Optional.empty();
        }
        if (!this.b($$2) && $$1 < this.g().N()) {
            return Optional.empty();
        }
        dlt $$3 = this.a($$0 = Math.min($$0, $$1));
        if ($$3.f()) {
            return Optional.empty();
        }
        if (this.g().f()) {
            this.a(dlt.l, $$3);
        }
        return Optional.of($$3);
    }

    public dlt b(int $$0, int $$12, ddm $$2) {
        Optional<dlt> $$3 = this.a($$0, $$12, $$2);
        $$3.ifPresent($$1 -> this.a($$2, (dlt)$$1));
        return $$3.orElse(dlt.l);
    }

    public dlt d(dlt $$0) {
        return this.b($$0, $$0.N());
    }

    public dlt b(dlt $$0, int $$1) {
        if ($$0.f() || !this.a($$0)) {
            return $$0;
        }
        dlt $$2 = this.g();
        int $$3 = Math.min(Math.min($$1, $$0.N()), this.b_($$0) - $$2.N());
        if ($$3 <= 0) {
            return $$0;
        }
        if ($$2.f()) {
            this.e($$0.a($$3));
        } else if (dlt.c($$2, $$0)) {
            $$0.h($$3);
            $$2.g($$3);
            this.e($$2);
        }
        return $$0;
    }

    public boolean b(ddm $$0) {
        return this.a($$0) && this.a(this.g());
    }

    public int i() {
        return this.a;
    }

    public boolean e() {
        return true;
    }

    public boolean f() {
        return false;
    }
}

