/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 */
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;

public class geu
extends bdd {
    private final Map<dsa, drz> b = new HashMap<dsa, drz>();
    private final Set<dsa> c = new HashSet<dsa>();
    private Map<dqk, List<gwz>> d = Map.of();
    private List<gwz> e = List.of();

    public void a(drz $$0) {
        this.b.put($$0.a(), $$0);
    }

    public void a(dsa $$0) {
        this.b.remove($$0);
        this.c.remove($$0);
    }

    public void b() {
        this.b.clear();
        this.c.clear();
    }

    public boolean b(dsa $$0) {
        return this.c.contains($$0);
    }

    public void c(dsa $$0) {
        this.c.remove($$0);
    }

    public void d(dsa $$0) {
        this.c.add($$0);
    }

    public void c() {
        Map<dqv, List<List<drz>>> $$0 = geu.a(this.b.values());
        HashMap<gxb, List> $$12 = new HashMap<gxb, List>();
        ImmutableList.Builder $$22 = ImmutableList.builder();
        $$0.forEach(($$2, $$3) -> $$12.put((gxb)$$2, (List)$$3.stream().map(gwz::new).peek(arg_0 -> ((ImmutableList.Builder)$$22).add(arg_0)).collect(ImmutableList.toImmutableList())));
        for (gxb $$32 : gxb.values()) {
            $$12.put($$32, (List)$$32.a().stream().flatMap($$1 -> $$12.getOrDefault($$1, List.of()).stream()).collect(ImmutableList.toImmutableList()));
        }
        this.d = Map.copyOf($$12);
        this.e = $$22.build();
    }

    private static Map<dqv, List<List<drz>>> a(Iterable<drz> $$02) {
        HashMap<dqv, List<List<drz>>> $$1 = new HashMap<dqv, List<List<drz>>>();
        HashBasedTable $$2 = HashBasedTable.create();
        for (drz $$3 : $$02) {
            dqv $$4 = $$3.d();
            OptionalInt $$5 = $$3.c();
            if ($$5.isEmpty()) {
                $$1.computeIfAbsent($$4, $$0 -> new ArrayList()).add(List.of($$3));
                continue;
            }
            ArrayList<drz> $$6 = (ArrayList<drz>)$$2.get((Object)$$4, (Object)$$5.getAsInt());
            if ($$6 == null) {
                $$6 = new ArrayList<drz>();
                $$2.put((Object)$$4, (Object)$$5.getAsInt(), $$6);
                $$1.computeIfAbsent($$4, $$0 -> new ArrayList()).add($$6);
            }
            $$6.add($$3);
        }
        return $$1;
    }

    public List<gwz> d() {
        return this.e;
    }

    public List<gwz> a(dqk $$0) {
        return this.d.getOrDefault($$0, Collections.emptyList());
    }
}

