/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  org.apache.commons.lang3.mutable.MutableInt
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import org.apache.commons.lang3.mutable.MutableInt;

public class dxy {
    public static <T> List<b> a(List<T> $$0, Function<T, List<jh<fes>>> $$12, boolean $$2) {
        Object2IntOpenHashMap $$3 = new Object2IntOpenHashMap();
        MutableInt $$4 = new MutableInt(0);
        record A(int a, int b, fes c) {
            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{A.class, "featureIndex;step;feature", "a", "b", "c"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{A.class, "featureIndex;step;feature", "a", "b", "c"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{A.class, "featureIndex;step;feature", "a", "b", "c"}, this, $$0);
            }
        }
        Comparator<A> $$5 = Comparator.comparingInt(A::b).thenComparingInt(A::a);
        TreeMap<A, Set> $$6 = new TreeMap<A, Set>($$5);
        int $$7 = 0;
        for (T $$8 : $$0) {
            ArrayList $$9 = Lists.newArrayList();
            List<jh<fes>> $$10 = $$12.apply($$8);
            $$7 = Math.max($$7, $$10.size());
            for (int $$11 = 0; $$11 < $$10.size(); ++$$11) {
                for (jd $$122 : (jh)$$10.get($$11)) {
                    fes $$13 = (fes)$$122.a();
                    $$9.add(new A($$3.computeIfAbsent((Object)$$13, $$1 -> $$4.getAndIncrement()), $$11, $$13));
                }
            }
            for (int $$14 = 0; $$14 < $$9.size(); ++$$14) {
                Set $$15 = $$6.computeIfAbsent((A)$$9.get($$14), $$1 -> new TreeSet($$5));
                if ($$14 >= $$9.size() - 1) continue;
                $$15.add((A)$$9.get($$14 + 1));
            }
        }
        TreeSet<A> $$16 = new TreeSet<A>($$5);
        TreeSet<A> $$17 = new TreeSet<A>($$5);
        ArrayList $$18 = Lists.newArrayList();
        for (A $$19 : $$6.keySet()) {
            if (!$$17.isEmpty()) {
                throw new IllegalStateException("You somehow broke the universe; DFS bork (iteration finished with non-empty in-progress vertex set");
            }
            if ($$16.contains($$19) || !bfu.a($$6, $$16, $$17, $$18::add, $$19)) continue;
            if ($$2) {
                int $$21;
                ArrayList<T> $$20 = new ArrayList<T>($$0);
                do {
                    $$21 = $$20.size();
                    ListIterator $$22 = $$20.listIterator();
                    while ($$22.hasNext()) {
                        Object $$23 = $$22.next();
                        $$22.remove();
                        try {
                            dxy.a($$20, $$12, false);
                        }
                        catch (IllegalStateException $$24) {
                            continue;
                        }
                        $$22.add($$23);
                    }
                } while ($$21 != $$20.size());
                throw new IllegalStateException("Feature order cycle found, involved sources: " + String.valueOf($$20));
            }
            throw new IllegalStateException("Feature order cycle found");
        }
        Collections.reverse($$18);
        ImmutableList.Builder $$25 = ImmutableList.builder();
        int $$26 = 0;
        while ($$26 < $$7) {
            int $$27 = $$26++;
            List<fes> $$28 = $$18.stream().filter($$1 -> $$1.b() == $$27).map(A::c).collect(Collectors.toList());
            $$25.add((Object)new b($$28));
        }
        return $$25.build();
    }

    public record b(List<fes> a, ToIntFunction<fes> b) {
        b(List<fes> $$0) {
            this($$0, bhs.g($$0));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "features;indexMapping", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "features;indexMapping", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "features;indexMapping", "a", "b"}, this, $$0);
        }
    }
}

