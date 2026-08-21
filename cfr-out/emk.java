/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Predicate;

public interface emk
extends ccv {
    public jm<dlt> h();

    default public int aA_() {
        return (int)this.h().stream().filter(Predicate.not(dlt::f)).count();
    }

    @Override
    default public int b() {
        return this.h().size();
    }

    @Override
    default public void a() {
        this.h().clear();
    }

    @Override
    default public boolean c() {
        return this.h().stream().allMatch(dlt::f);
    }

    @Override
    default public dlt a(int $$0) {
        return this.h().get($$0);
    }

    @Override
    default public dlt a(int $$0, int $$1) {
        dlt $$2 = ccw.a(this.h(), $$0, $$1);
        if (!$$2.f()) {
            this.e();
        }
        return $$2;
    }

    @Override
    default public dlt b(int $$0) {
        return ccw.a(this.h(), $$0, this.ap_());
    }

    @Override
    default public boolean b(int $$0, dlt $$1) {
        return this.b($$1) && (this.a($$0).f() || this.a($$0).N() < this.f_($$1));
    }

    default public boolean b(dlt $$0) {
        return true;
    }

    @Override
    default public void a(int $$0, dlt $$1) {
        this.c($$0, $$1);
        this.e();
    }

    default public void c(int $$0, dlt $$1) {
        this.h().set($$0, $$1);
        $$1.f(this.f_($$1));
    }
}

