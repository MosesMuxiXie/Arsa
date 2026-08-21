/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 *  com.google.common.collect.Sets$SetView
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.Set;

public class fog {
    private final bgp a;
    private final bhw b;
    private final Optional<je.a> c;
    private final Set<amt<?>> d;

    public fog(bgp $$0, bhw $$1, je.a $$2) {
        this($$0, $$1, Optional.of($$2), Set.of());
    }

    public fog(bgp $$0, bhw $$1) {
        this($$0, $$1, Optional.empty(), Set.of());
    }

    private fog(bgp $$0, bhw $$1, Optional<je.a> $$2, Set<amt<?>> $$3) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
    }

    public fog a(bgp.f $$0) {
        return new fog(this.a.a($$0), this.b, this.c, this.d);
    }

    public fog a(bgp.f $$0, amt<?> $$1) {
        ImmutableSet $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
        return new fog(this.a.a($$0), this.b, this.c, (Set<amt<?>>)$$2);
    }

    public boolean a(amt<?> $$0) {
        return this.d.contains($$0);
    }

    public void a(bgp.g $$0) {
        this.a.a($$0);
    }

    public void a(fob $$0) {
        Set<bhv<?>> $$1 = $$0.b();
        Sets.SetView $$2 = Sets.difference($$1, this.b.b());
        if (!$$2.isEmpty()) {
            this.a.a(new b((Set<bhv<?>>)$$2));
        }
    }

    public je.a a() {
        return this.c.orElseThrow(() -> new UnsupportedOperationException("References not allowed"));
    }

    public boolean b() {
        return this.c.isPresent();
    }

    public fog a(bhw $$0) {
        return new fog(this.a, $$0, this.c, this.d);
    }

    public bgp c() {
        return this.a;
    }

    public record b(Set<bhv<?>> a) implements bgp.g
    {
        private final Set<bhv<?>> a;

        @Override
        public String a() {
            return "Parameters " + String.valueOf(this.a) + " are not provided in this context";
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "notProvided", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "notProvided", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "notProvided", "a"}, this, $$0);
        }

        public Set<bhv<?>> b() {
            return this.a;
        }
    }

    public record a(amt<?> a) implements bgp.g
    {
        private final amt<?> a;

        @Override
        public String a() {
            return "Missing element " + String.valueOf(this.a.a()) + " of type " + String.valueOf(this.a.b());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "referenced", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "referenced", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "referenced", "a"}, this, $$0);
        }

        public amt<?> b() {
            return this.a;
        }
    }

    public record c(amt<?> a) implements bgp.g
    {
        private final amt<?> a;

        @Override
        public String a() {
            return String.valueOf(this.a.a()) + " of type " + String.valueOf(this.a.b()) + " is recursively called";
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "referenced", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "referenced", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "referenced", "a"}, this, $$0);
        }

        public amt<?> b() {
            return this.a;
        }
    }

    public record d(amt<?> a) implements bgp.g
    {
        private final amt<?> a;

        @Override
        public String a() {
            return "Reference to " + String.valueOf(this.a.a()) + " of type " + String.valueOf(this.a.b()) + " was used, but references are not allowed";
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "referenced", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "referenced", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "referenced", "a"}, this, $$0);
        }

        public amt<?> b() {
            return this.a;
        }
    }
}

