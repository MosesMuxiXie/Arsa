/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.Splitter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class hqs {
    private static final Splitter a = Splitter.on((char)',');
    private static final Splitter b = Splitter.on((char)'=').limit(2);

    public static <O, S extends eoj<O, S>> Predicate<eoj<O, S>> a(eoi<O, S> $$0, String $$12) {
        HashMap $$2 = new HashMap();
        for (String $$3 : a.split((CharSequence)$$12)) {
            Iterator $$4 = b.split((CharSequence)$$3).iterator();
            if (!$$4.hasNext()) continue;
            String $$5 = (String)$$4.next();
            epk<?> $$6 = $$0.a($$5);
            if ($$6 != null && $$4.hasNext()) {
                String $$7 = (String)$$4.next();
                Object $$8 = hqs.a($$6, $$7);
                if ($$8 != null) {
                    $$2.put($$6, $$8);
                    continue;
                }
                throw new RuntimeException("Unknown value: '" + $$7 + "' for blockstate property: '" + $$5 + "' " + String.valueOf($$6.a()));
            }
            if ($$5.isEmpty()) continue;
            throw new RuntimeException("Unknown blockstate property: '" + $$5 + "'");
        }
        return $$1 -> {
            for (Map.Entry $$2 : $$2.entrySet()) {
                if (Objects.equals($$1.c((epk)$$2.getKey()), $$2.getValue())) continue;
                return false;
            }
            return true;
        };
    }

    private static <T extends Comparable<T>> @Nullable T a(epk<T> $$0, String $$1) {
        return (T)((Comparable)$$0.b($$1).orElse(null));
    }
}

