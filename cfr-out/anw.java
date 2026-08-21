/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.Map;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class anw {
    private static final Logger a = LogUtils.getLogger();
    private static final Codec<Map<amo, anv.a>> b = Codec.unboundedMap(amo.a, anv.a.a);
    private final Map<amo, anv> c = Maps.newHashMap();

    public @Nullable anv a(amo $$0) {
        return this.c.get($$0);
    }

    public anv a(amo $$0, yh $$1) {
        anv $$2 = new anv($$0, $$1);
        this.c.put($$0, $$2);
        return $$2;
    }

    public void a(anv $$0) {
        this.c.remove($$0.a());
    }

    public Collection<amo> a() {
        return this.c.keySet();
    }

    public Collection<anv> b() {
        return this.c.values();
    }

    public uz a(jf.a $$0) {
        Map<amo, anv.a> $$1 = bhs.a(this.c, anv::f);
        return (uz)b.encodeStart($$0.a(vn.a), $$1).getOrThrow();
    }

    public void a(uz $$02, jf.a $$12) {
        Map<amo, anv.a> $$2 = b.parse($$12.a(vn.a), (Object)$$02).resultOrPartial($$0 -> a.error("Failed to parse boss bar events: {}", $$0)).orElse(Map.of());
        $$2.forEach(($$0, $$1) -> this.c.put((amo)$$0, anv.a($$0, $$1)));
    }

    public void a(axg $$0) {
        for (anv $$1 : this.c.values()) {
            $$1.c($$0);
        }
    }

    public void b(axg $$0) {
        for (anv $$1 : this.c.values()) {
            $$1.d($$0);
        }
    }
}

