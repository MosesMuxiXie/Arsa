/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class hqw
implements hqh {
    private final b a;
    private final eoh b;
    private @Nullable List<hqh> c;

    hqw(b $$0, eoh $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public ilp a() {
        return this.a.b;
    }

    @Override
    public void a(bgr $$0, List<hqg> $$1) {
        if (this.c == null) {
            this.c = this.a.a(this.b);
        }
        long $$2 = $$0.g();
        for (hqh $$3 : this.c) {
            $$0.b($$2);
            $$3.a($$0, $$1);
        }
    }

    static final class b {
        private final List<a<hqh>> a;
        final ilp b;
        private final Map<BitSet, List<hqh>> c = new ConcurrentHashMap<BitSet, List<hqh>>();

        private static hqh a(List<a<hqh>> $$0) {
            if ($$0.isEmpty()) {
                throw new IllegalArgumentException("Model must have at least one selector");
            }
            return $$0.getFirst().b();
        }

        public b(List<a<hqh>> $$0) {
            this.a = $$0;
            hqh $$1 = hqw$b.a($$0);
            this.b = $$1.a();
        }

        public List<hqh> a(eoh $$02) {
            BitSet $$1 = new BitSet();
            for (int $$2 = 0; $$2 < this.a.size(); ++$$2) {
                if (!this.a.get((int)$$2).a.test($$02)) continue;
                $$1.set($$2);
            }
            return this.c.computeIfAbsent($$1, $$0 -> {
                ImmutableList.Builder $$1 = ImmutableList.builder();
                for (int $$2 = 0; $$2 < this.a.size(); ++$$2) {
                    if (!$$0.get($$2)) continue;
                    $$1.add((Object)((hqh)this.a.get((int)$$2).b));
                }
                return $$1.build();
            });
        }
    }

    public static class c
    implements hqh.c {
        final List<hqw$a<hqh.b>> a;
        private final inw.b<b> b = new inw.b<b>(){

            public b a(inw $$0) {
                ImmutableList.Builder $$1 = ImmutableList.builderWithExpectedSize((int)a.size());
                for (hqw$a<hqh.b> $$2 : a) {
                    $$1.add($$2.a(((hqh.b)$$2.b).a($$0)));
                }
                return new b((List<hqw$a<hqh>>)$$1.build());
            }

            @Override
            public /* synthetic */ Object compute(inw inw2) {
                return this.a(inw2);
            }
        };

        public c(List<hqw$a<hqh.b>> $$0) {
            this.a = $$0;
        }

        @Override
        public Object a(eoh $$0) {
            IntArrayList $$1 = new IntArrayList();
            for (int $$2 = 0; $$2 < this.a.size(); ++$$2) {
                if (!this.a.get((int)$$2).a.test($$0)) continue;
                $$1.add($$2);
            }
            record A(c a, IntList b) {
                @Override
                public final String toString() {
                    return ObjectMethods.bootstrap("toString", new MethodHandle[]{A.class, "model;selectors", "a", "b"}, this);
                }

                @Override
                public final int hashCode() {
                    return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{A.class, "model;selectors", "a", "b"}, this);
                }

                @Override
                public final boolean equals(Object $$0) {
                    return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{A.class, "model;selectors", "a", "b"}, this, $$0);
                }
            }
            return new A(this, (IntList)$$1);
        }

        @Override
        public void a(ioe.a $$0) {
            this.a.forEach($$1 -> ((hqh.b)$$1.b).a($$0));
        }

        @Override
        public hqh a(eoh $$0, inw $$1) {
            b $$2 = $$1.a(this.b);
            return new hqw($$2, $$0);
        }
    }

    public static final class a<T>
    extends Record {
        final Predicate<eoh> a;
        final T b;

        public a(Predicate<eoh> $$0, T $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public <S> a<S> a(S $$0) {
            return new a<S>(this.a, $$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "condition;model", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "condition;model", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "condition;model", "a", "b"}, this, $$0);
        }

        public Predicate<eoh> a() {
            return this.a;
        }

        public T b() {
            return this.b;
        }
    }
}

