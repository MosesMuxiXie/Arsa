/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.UnaryOperator;
import org.jspecify.annotations.Nullable;

public class cdn
extends fmn {
    private static final Codec<cdn> b = Codec.unboundedMap(amo.a, (Codec)Codec.LONG).fieldOf("stopwatches").codec().xmap(cdn::a, cdn::d);
    public static final fmo<cdn> a = new fmo<cdn>("stopwatches", cdn::new, b, bhz.p);
    private final Map<amo, cdm> c = new Object2ObjectOpenHashMap();

    private cdn() {
    }

    private static cdn a(Map<amo, Long> $$0) {
        cdn $$1 = new cdn();
        long $$22 = cdn.c();
        $$0.forEach(($$2, $$3) -> $$0.c.put((amo)$$2, new cdm($$22, (long)$$3)));
        return $$1;
    }

    private Map<amo, Long> d() {
        long $$0 = cdn.c();
        TreeMap<amo, Long> $$1 = new TreeMap<amo, Long>();
        this.c.forEach(($$2, $$3) -> $$1.put((amo)$$2, $$3.a($$0)));
        return $$1;
    }

    public @Nullable cdm a(amo $$0) {
        return this.c.get($$0);
    }

    public boolean a(amo $$0, cdm $$1) {
        if (this.c.putIfAbsent($$0, $$1) == null) {
            this.u();
            return true;
        }
        return false;
    }

    public boolean a(amo $$0, UnaryOperator<cdm> $$12) {
        if (this.c.computeIfPresent($$0, ($$1, $$2) -> (cdm)$$12.apply((cdm)$$2)) != null) {
            this.u();
            return true;
        }
        return false;
    }

    public boolean b(amo $$0) {
        boolean $$1;
        boolean bl2 = $$1 = this.c.remove($$0) != null;
        if ($$1) {
            this.u();
        }
        return $$1;
    }

    @Override
    public boolean O_() {
        return super.O_() || !this.c.isEmpty();
    }

    public List<amo> b() {
        return List.copyOf(this.c.keySet());
    }

    public static long c() {
        return bhs.c();
    }
}

