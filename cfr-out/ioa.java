/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 */
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ioa {
    static final int a = -1;
    private static final int b = 0;

    public static Object2IntMap<eoh> a(ggr $$0, ino.b $$1) {
        HashMap $$2 = new HashMap();
        HashMap $$32 = new HashMap();
        $$1.a().forEach(($$3, $$4) -> {
            List $$5 = $$2.computeIfAbsent($$3.b(), $$1 -> List.copyOf($$0.a((dzq)$$1)));
            a $$6 = ioa$a.a($$3, $$4, $$5);
            $$32.computeIfAbsent($$6, $$0 -> Sets.newIdentityHashSet()).add($$3);
        });
        int $$42 = 1;
        Object2IntOpenHashMap $$5 = new Object2IntOpenHashMap();
        $$5.defaultReturnValue(-1);
        for (Set $$6 : $$32.values()) {
            Iterator $$7 = $$6.iterator();
            while ($$7.hasNext()) {
                eoh $$8 = (eoh)$$7.next();
                if ($$8.o() == egf.b) continue;
                $$7.remove();
                $$5.put((Object)$$8, 0);
            }
            if ($$6.size() <= 1) continue;
            int $$9 = $$42++;
            $$6.forEach(arg_0 -> ioa.a((Object2IntMap)$$5, $$9, arg_0));
        }
        return $$5;
    }

    private static /* synthetic */ void a(Object2IntMap $$0, int $$1, eoh $$2) {
        $$0.put((Object)$$2, $$1);
    }

    record a(Object a, List<Object> b) {
        public static a a(eoh $$0, hqh.c $$1, List<epk<?>> $$2) {
            List<Object> $$3 = ioa$a.a($$0, $$2);
            Object $$4 = $$1.a($$0);
            return new a($$4, $$3);
        }

        private static List<Object> a(eoh $$0, List<epk<?>> $$1) {
            Object[] $$2 = new Object[$$1.size()];
            for (int $$3 = 0; $$3 < $$1.size(); ++$$3) {
                $$2[$$3] = $$0.c($$1.get($$3));
            }
            return List.of($$2);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "equalityGroup;coloringValues", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "equalityGroup;coloringValues", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "equalityGroup;coloringValues", "a", "b"}, this, $$0);
        }
    }
}

