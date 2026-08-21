/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class eoq
implements Predicate<eoh> {
    public static final Predicate<eoh> a = $$0 -> true;
    private final eoi<dzq, eoh> b;
    private final Map<epk<?>, Predicate<Object>> c = Maps.newHashMap();

    private eoq(eoi<dzq, eoh> $$0) {
        this.b = $$0;
    }

    public static eoq a(dzq $$0) {
        return new eoq($$0.l());
    }

    public boolean a(@Nullable eoh $$0) {
        if ($$0 == null || !$$0.b().equals(this.b.c())) {
            return false;
        }
        if (this.c.isEmpty()) {
            return true;
        }
        for (Map.Entry<epk<?>, Predicate<Object>> $$1 : this.c.entrySet()) {
            if (this.a($$0, $$1.getKey(), $$1.getValue())) continue;
            return false;
        }
        return true;
    }

    protected <T extends Comparable<T>> boolean a(eoh $$0, epk<T> $$1, Predicate<Object> $$2) {
        T $$3 = $$0.c($$1);
        return $$2.test($$3);
    }

    public <V extends Comparable<V>> eoq a(epk<V> $$0, Predicate<Object> $$1) {
        if (!this.b.d().contains($$0)) {
            throw new IllegalArgumentException(String.valueOf(this.b) + " cannot support property " + String.valueOf($$0));
        }
        this.c.put($$0, $$1);
        return this;
    }

    @Override
    public /* synthetic */ boolean test(@Nullable Object object) {
        return this.a((eoh)object);
    }
}

