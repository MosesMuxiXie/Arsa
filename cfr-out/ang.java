/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Map;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class ang
extends bbd<ab> {
    private static final Logger a = LogUtils.getLogger();
    private Map<amo, ac> b = Map.of();
    private ah c = new ah();
    private final jf.a d;

    public ang(jf.a $$0) {
        super($$0, ab.a, mj.bJ);
        this.d = $$0;
    }

    @Override
    protected void a(Map<amo, ab> $$0, baz $$12, bzm $$22) {
        ImmutableMap.Builder $$3 = ImmutableMap.builder();
        $$0.forEach(($$1, $$2) -> {
            this.a((amo)$$1, (ab)$$2);
            $$3.put($$1, (Object)new ac((amo)$$1, (ab)$$2));
        });
        this.b = $$3.buildOrThrow();
        ah $$4 = new ah();
        $$4.a(this.b.values());
        for (ad $$5 : $$4.b()) {
            if (!$$5.b().b().c().isPresent()) continue;
            ap.a($$5);
        }
        this.c = $$4;
    }

    private void a(amo $$0, ab $$1) {
        bgp.a $$2 = new bgp.a();
        $$1.a($$2, this.d);
        if (!$$2.a()) {
            a.warn("Found validation problems in advancement {}: \n{}", (Object)$$0, (Object)$$2.b());
        }
    }

    public @Nullable ac a(amo $$0) {
        return this.b.get($$0);
    }

    public ah a() {
        return this.c;
    }

    public Collection<ac> b() {
        return this.b.values();
    }
}

