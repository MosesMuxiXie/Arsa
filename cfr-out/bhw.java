/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.collect.Sets
 */
import com.google.common.base.Joiner;
import com.google.common.collect.Sets;
import java.util.Set;

public class bhw {
    private final Set<bhv<?>> a;
    private final Set<bhv<?>> b;

    bhw(Set<bhv<?>> $$0, Set<bhv<?>> $$1) {
        this.a = Set.copyOf($$0);
        this.b = Set.copyOf(Sets.union($$0, $$1));
    }

    public Set<bhv<?>> a() {
        return this.a;
    }

    public Set<bhv<?>> b() {
        return this.b;
    }

    public String toString() {
        return "[" + Joiner.on((String)", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + String.valueOf($$0.a())).iterator()) + "]";
    }

    public static class a {
        private final Set<bhv<?>> a = Sets.newIdentityHashSet();
        private final Set<bhv<?>> b = Sets.newIdentityHashSet();

        public a a(bhv<?> $$0) {
            if (this.b.contains($$0)) {
                throw new IllegalArgumentException("Parameter " + String.valueOf($$0.a()) + " is already optional");
            }
            this.a.add($$0);
            return this;
        }

        public a b(bhv<?> $$0) {
            if (this.a.contains($$0)) {
                throw new IllegalArgumentException("Parameter " + String.valueOf($$0.a()) + " is already required");
            }
            this.b.add($$0);
            return this;
        }

        public bhw a() {
            return new bhw(this.a, this.b);
        }
    }
}

