/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 */
import com.mojang.datafixers.util.Pair;
import java.util.Iterator;
import java.util.List;

public class cme {
    public static <E extends chl> ckp<E> a(List<Pair<? extends cmy<? super E>, Integer>> $$0) {
        return cme.a($$0, cjs.a.b, cjs.b.a);
    }

    public static <E extends chl> ckp<E> a(List<Pair<? extends cmy<? super E>, Integer>> $$0, cjs.a $$12, cjs.b $$2) {
        cln $$3 = new cln();
        $$0.forEach($$1 -> $$3.a((cmy)$$1.getFirst(), (Integer)$$1.getSecond()));
        return cmv.a((cmv.b<E> $$32) -> $$32.a(($$3, $$4, $$5) -> {
            cmy $$6;
            if ($$12 == cjs.a.b) {
                $$3.a();
            }
            Iterator iterator = $$3.iterator();
            while (iterator.hasNext() && (!($$6 = (cmy)iterator.next()).trigger($$3, $$4, $$5) || $$2 != cjs.b.a)) {
            }
            return true;
        }));
    }
}

