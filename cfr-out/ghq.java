/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ghq
implements gho {
    private final dzq a;
    private final List<a> b = new ArrayList<a>();

    private ghq(dzq $$0) {
        this.a = $$0;
    }

    @Override
    public dzq a() {
        return this.a;
    }

    public static ghq a(dzq $$0) {
        return new ghq($$0);
    }

    public ghq a(ghm $$0) {
        this.b.add(new a(Optional.empty(), $$0));
        return this;
    }

    private void a(hqu $$0) {
        $$0.instantiate(this.a.l());
    }

    public ghq a(hqu $$0, ghm $$1) {
        this.a($$0);
        this.b.add(new a(Optional.of($$0), $$1));
        return this;
    }

    public ghq a(ghp $$0, ghm $$1) {
        return this.a($$0.a(), $$1);
    }

    @Override
    public hqf b() {
        return new hqf(Optional.empty(), Optional.of(new hqf.a(this.b.stream().map(a::a).toList())));
    }

    record a(Optional<hqu> a, ghm b) {
        private final Optional<hqu> a;
        private final ghm b;

        public hqx a() {
            return new hqx(this.a, this.b.a());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "condition;variants", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "condition;variants", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "condition;variants", "a", "b"}, this, $$0);
        }

        public Optional<hqu> b() {
            return this.a;
        }

        public ghm c() {
            return this.b;
        }
    }
}

