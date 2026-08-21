/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.ref.WeakReference;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class dqw {
    private final @Nullable a[] a;
    private WeakReference<@Nullable dqz> b = new WeakReference<Object>(null);

    public dqw(int $$0) {
        this.a = new a[$$0];
    }

    public Optional<dqx<dqh>> a(axf $$0, dqg $$1) {
        if ($$1.b()) {
            return Optional.empty();
        }
        this.a($$0);
        for (int $$2 = 0; $$2 < this.a.length; ++$$2) {
            a $$3 = this.a[$$2];
            if ($$3 == null || !$$3.a($$1)) continue;
            this.a($$2);
            return Optional.ofNullable($$3.d());
        }
        return this.a($$1, $$0);
    }

    private void a(axf $$0) {
        dqz $$1 = $$0.x();
        if ($$1 != this.b.get()) {
            this.b = new WeakReference<dqz>($$1);
            Arrays.fill(this.a, null);
        }
    }

    private Optional<dqx<dqh>> a(dqg $$0, axf $$1) {
        Optional<dqx<dqh>> $$2 = $$1.x().a(drd.a, $$0, $$1);
        this.a($$0, (dqx<dqh>)$$2.orElse(null));
        return $$2;
    }

    private void a(int $$0) {
        if ($$0 > 0) {
            a $$1 = this.a[$$0];
            System.arraycopy(this.a, 0, this.a, 1, $$0);
            this.a[0] = $$1;
        }
    }

    private void a(dqg $$0, @Nullable dqx<dqh> $$1) {
        jm<dlt> $$2 = jm.a($$0.a(), dlt.l);
        for (int $$3 = 0; $$3 < $$0.a(); ++$$3) {
            $$2.set($$3, $$0.a($$3).c(1));
        }
        System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
        this.a[0] = new a($$2, $$0.f(), $$0.g(), $$1);
    }

    record a(jm<dlt> a, int b, int c, @Nullable dqx<dqh> d) {
        public boolean a(dqg $$0) {
            if (this.b != $$0.f() || this.c != $$0.g()) {
                return false;
            }
            for (int $$1 = 0; $$1 < this.a.size(); ++$$1) {
                if (dlt.c(this.a.get($$1), $$0.a($$1))) continue;
                return false;
            }
            return true;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "key;width;height;value", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "key;width;height;value", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "key;width;height;value", "a", "b", "c", "d"}, this, $$0);
        }
    }
}

