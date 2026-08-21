/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  org.slf4j.Logger
 */
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class dgy {
    private static final Logger a = LogUtils.getLogger();
    private final dha b;
    private final Map<amo, dgx> c;
    private final dgz d;

    dgy(dha $$0, dgz $$1, Map<amo, dgx> $$2) {
        this.b = $$0;
        this.c = $$2;
        this.d = $$1;
    }

    public boolean a(dgz $$0) {
        return $$0.a(this.d);
    }

    public dgz a() {
        return this.d;
    }

    public dgz a(Iterable<amo> $$02) {
        return this.a($$02, (amo $$0) -> a.warn("Unknown feature flag: {}", $$0));
    }

    public dgz a(dgx ... $$0) {
        return dgz.a(this.b, Arrays.asList($$0));
    }

    public dgz a(Iterable<amo> $$0, Consumer<amo> $$1) {
        Set $$2 = Sets.newIdentityHashSet();
        for (amo $$3 : $$0) {
            dgx $$4 = this.c.get($$3);
            if ($$4 == null) {
                $$1.accept($$3);
                continue;
            }
            $$2.add($$4);
        }
        return dgz.a(this.b, $$2);
    }

    public Set<amo> b(dgz $$0) {
        HashSet<amo> $$1 = new HashSet<amo>();
        this.c.forEach(($$2, $$3) -> {
            if ($$0.b((dgx)$$3)) {
                $$1.add((amo)$$2);
            }
        });
        return $$1;
    }

    public Codec<dgz> b() {
        return amo.a.listOf().comapFlatMap($$0 -> {
            HashSet $$1 = new HashSet();
            dgz $$2 = this.a((Iterable<amo>)$$0, $$1::add);
            if (!$$1.isEmpty()) {
                return DataResult.error(() -> "Unknown feature ids: " + String.valueOf($$1), (Object)$$2);
            }
            return DataResult.success((Object)$$2);
        }, $$0 -> List.copyOf(this.b((dgz)$$0)));
    }

    public static class a {
        private final dha a;
        private int b;
        private final Map<amo, dgx> c = new LinkedHashMap<amo, dgx>();

        public a(String $$0) {
            this.a = new dha($$0);
        }

        public dgx a(String $$0) {
            return this.a(amo.b($$0));
        }

        public dgx a(amo $$0) {
            dgx $$1;
            dgx $$2;
            if (this.b >= 64) {
                throw new IllegalStateException("Too many feature flags");
            }
            if (($$2 = this.c.put($$0, $$1 = new dgx(this.a, this.b++))) != null) {
                throw new IllegalStateException("Duplicate feature flag " + String.valueOf($$0));
            }
            return $$1;
        }

        public dgy a() {
            dgz $$0 = dgz.a(this.a, this.c.values());
            return new dgy(this.a, $$0, Map.copyOf(this.c));
        }
    }
}

