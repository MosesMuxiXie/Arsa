/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ArrayListMultimap
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Multimap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multimap;
import java.lang.runtime.SwitchBootstraps;
import java.util.Collection;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class iod {
    public static final iod a = new iod(List.of(), List.of(), List.of(), List.of(), List.of(), List.of(), List.of(), List.of());
    private final List<hqa> b;
    private final List<hqa> c;
    private final List<hqa> d;
    private final List<hqa> e;
    private final List<hqa> f;
    private final List<hqa> g;
    private final List<hqa> h;
    private final List<hqa> i;

    iod(List<hqa> $$0, List<hqa> $$1, List<hqa> $$2, List<hqa> $$3, List<hqa> $$4, List<hqa> $$5, List<hqa> $$6, List<hqa> $$7) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
        this.i = $$7;
    }

    public List<hqa> a(@Nullable iz $$0) {
        iz iz2 = $$0;
        int n2 = 0;
        return switch (SwitchBootstraps.enumSwitch("enumSwitch", new Object[]{"NORTH", "SOUTH", "EAST", "WEST", "UP", "DOWN"}, (iz)iz2, n2)) {
            default -> throw new MatchException(null, null);
            case -1 -> this.c;
            case 0 -> this.d;
            case 1 -> this.e;
            case 2 -> this.f;
            case 3 -> this.g;
            case 4 -> this.h;
            case 5 -> this.i;
        };
    }

    public List<hqa> a() {
        return this.b;
    }

    public static class a {
        private final ImmutableList.Builder<hqa> a = ImmutableList.builder();
        private final Multimap<iz, hqa> b = ArrayListMultimap.create();

        public a a(iz $$0, hqa $$1) {
            this.b.put((Object)$$0, (Object)$$1);
            return this;
        }

        public a a(hqa $$0) {
            this.a.add((Object)$$0);
            return this;
        }

        private static iod a(List<hqa> $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
            int $$8 = 0;
            List<hqa> $$9 = $$0.subList($$8, $$8 += $$1);
            List<hqa> $$10 = $$0.subList($$8, $$8 += $$2);
            List<hqa> $$11 = $$0.subList($$8, $$8 += $$3);
            List<hqa> $$12 = $$0.subList($$8, $$8 += $$4);
            List<hqa> $$13 = $$0.subList($$8, $$8 += $$5);
            List<hqa> $$14 = $$0.subList($$8, $$8 += $$6);
            List<hqa> $$15 = $$0.subList($$8, $$8 + $$7);
            return new iod($$0, $$9, $$10, $$11, $$12, $$13, $$14, $$15);
        }

        public iod a() {
            ImmutableList $$0 = this.a.build();
            if (this.b.isEmpty()) {
                if ($$0.isEmpty()) {
                    return a;
                }
                return new iod((List<hqa>)$$0, (List<hqa>)$$0, List.of(), List.of(), List.of(), List.of(), List.of(), List.of());
            }
            ImmutableList.Builder $$1 = ImmutableList.builder();
            $$1.addAll((Iterable)$$0);
            Collection $$2 = this.b.get((Object)iz.c);
            $$1.addAll((Iterable)$$2);
            Collection $$3 = this.b.get((Object)iz.d);
            $$1.addAll((Iterable)$$3);
            Collection $$4 = this.b.get((Object)iz.f);
            $$1.addAll((Iterable)$$4);
            Collection $$5 = this.b.get((Object)iz.e);
            $$1.addAll((Iterable)$$5);
            Collection $$6 = this.b.get((Object)iz.b);
            $$1.addAll((Iterable)$$6);
            Collection $$7 = this.b.get((Object)iz.a);
            $$1.addAll((Iterable)$$7);
            return iod$a.a((List<hqa>)$$1.build(), $$0.size(), $$2.size(), $$3.size(), $$4.size(), $$5.size(), $$6.size(), $$7.size());
        }
    }
}

