/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class bas
implements bap {
    private static final Logger a = LogUtils.getLogger();
    private final Map<String, baq> c;
    private final List<azl> d;

    public bas(azn $$0, List<azl> $$12) {
        this.d = List.copyOf($$12);
        HashMap<String, baq> $$2 = new HashMap<String, baq>();
        List $$3 = $$12.stream().flatMap($$1 -> $$1.a($$0).stream()).distinct().toList();
        for (azl $$4 : $$12) {
            bay $$5 = this.a($$4);
            Set<String> $$6 = $$4.a($$0);
            Predicate<amo> $$7 = $$5 != null ? $$1 -> $$5.b($$1.a()) : null;
            for (String $$8 : $$3) {
                boolean $$10;
                boolean $$9 = $$6.contains($$8);
                boolean bl2 = $$10 = $$5 != null && $$5.a($$8);
                if (!$$9 && !$$10) continue;
                baq $$11 = (baq)$$2.get($$8);
                if ($$11 == null) {
                    $$11 = new baq($$0, $$8);
                    $$2.put($$8, $$11);
                }
                if ($$9 && $$10) {
                    $$11.a($$4, $$7);
                    continue;
                }
                if ($$9) {
                    $$11.a($$4);
                    continue;
                }
                $$11.a($$4.b(), $$7);
            }
        }
        this.c = $$2;
    }

    private @Nullable bay a(azl $$0) {
        try {
            return $$0.a(bay.a);
        }
        catch (IOException $$1) {
            a.error("Failed to get filter section from pack {}", (Object)$$0.b());
            return null;
        }
    }

    @Override
    public Set<String> a() {
        return this.c.keySet();
    }

    @Override
    public Optional<bax> getResource(amo $$0) {
        baz $$1 = this.c.get($$0.b());
        if ($$1 != null) {
            return $$1.getResource($$0);
        }
        return Optional.empty();
    }

    @Override
    public List<bax> a(amo $$0) {
        baz $$1 = this.c.get($$0.b());
        if ($$1 != null) {
            return $$1.a($$0);
        }
        return List.of();
    }

    @Override
    public Map<amo, bax> b(String $$0, Predicate<amo> $$1) {
        bas.a($$0);
        TreeMap<amo, bax> $$2 = new TreeMap<amo, bax>();
        for (baq $$3 : this.c.values()) {
            $$2.putAll($$3.b($$0, $$1));
        }
        return $$2;
    }

    @Override
    public Map<amo, List<bax>> c(String $$0, Predicate<amo> $$1) {
        bas.a($$0);
        TreeMap<amo, List<bax>> $$2 = new TreeMap<amo, List<bax>>();
        for (baq $$3 : this.c.values()) {
            $$2.putAll($$3.c($$0, $$1));
        }
        return $$2;
    }

    private static void a(String $$0) {
        if ($$0.endsWith("/")) {
            throw new IllegalArgumentException("Trailing slash in path " + $$0);
        }
    }

    @Override
    public Stream<azl> b() {
        return this.d.stream();
    }

    @Override
    public void close() {
        this.d.forEach(azl::close);
    }
}

