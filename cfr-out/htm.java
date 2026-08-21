/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 */
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class htm {
    private final Long2ObjectMap<htq> a = new Long2ObjectOpenHashMap();

    public htn a(dwo $$0, long $$1) {
        int $$2 = jw.b($$1);
        int $$3 = jw.c($$1);
        int $$4 = jw.d($$1);
        int $$5 = $$2 - 1;
        int $$6 = $$3 - 1;
        int $$7 = $$4 - 1;
        int $$8 = $$2 + 1;
        int $$9 = $$3 + 1;
        int $$10 = $$4 + 1;
        htq[] $$11 = new htq[27];
        for (int $$12 = $$7; $$12 <= $$10; ++$$12) {
            for (int $$13 = $$6; $$13 <= $$9; ++$$13) {
                for (int $$14 = $$5; $$14 <= $$8; ++$$14) {
                    int $$15 = htn.a($$5, $$6, $$7, $$14, $$13, $$12);
                    $$11[$$15] = this.a($$0, $$14, $$13, $$12);
                }
            }
        }
        return new htn($$0, $$5, $$6, $$7, $$11);
    }

    private htq a(dwo $$0, int $$1, int $$2, int $$3) {
        return (htq)this.a.computeIfAbsent(jw.b($$1, $$2, $$3), $$4 -> {
            eqq $$5 = $$0.d($$1, $$3);
            return new htq($$5, $$5.g($$2));
        });
    }
}

