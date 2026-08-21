/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class hhy {
    private static final Logger a = LogUtils.getLogger();
    private final gfj b;
    private final irf c;
    private final ah d = new ah();
    private final Map<ac, ae> e = new Object2ObjectOpenHashMap();
    private @Nullable a f;
    private @Nullable ac g;

    public hhy(gfj $$0, irf $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public void a(aht $$0) {
        if ($$0.g()) {
            this.d.a();
            this.e.clear();
        }
        this.d.a($$0.e());
        this.d.a($$0.b());
        for (Map.Entry<amo, ae> $$1 : $$0.f().entrySet()) {
            ad $$2 = this.d.a($$1.getKey());
            if ($$2 != null) {
                ae $$3 = $$1.getValue();
                $$3.a($$2.a().f());
                this.e.put($$2.b(), $$3);
                if (this.f != null) {
                    this.f.a($$2, $$3);
                }
                if ($$0.g() || !$$3.a()) continue;
                if (this.b.r != null) {
                    this.c.a(this.b.r, $$2.b());
                }
                Optional<ao> $$4 = $$2.a().c();
                if (!$$0.h() || !$$4.isPresent() || !$$4.get().h()) continue;
                this.b.aG().a(new gmx($$2.b()));
                continue;
            }
            a.warn("Server informed client about progress for unknown advancement {}", (Object)$$1.getKey());
        }
    }

    public ah a() {
        return this.d;
    }

    public void a(@Nullable ac $$0, boolean $$1) {
        hig $$2 = this.b.R();
        if ($$2 != null && $$0 != null && $$1) {
            $$2.b(ajp.a($$0));
        }
        if (this.g != $$0) {
            this.g = $$0;
            if (this.f != null) {
                this.f.a($$0);
            }
        }
    }

    public void a(@Nullable a $$0) {
        this.f = $$0;
        this.d.a($$0);
        if ($$0 != null) {
            this.e.forEach(($$1, $$2) -> {
                ad $$3 = this.d.a((ac)$$1);
                if ($$3 != null) {
                    $$0.a($$3, (ae)$$2);
                }
            });
            $$0.a(this.g);
        }
    }

    public @Nullable ac a(amo $$0) {
        ad $$1 = this.d.a($$0);
        return $$1 != null ? $$1.b() : null;
    }

    public static interface a
    extends ah.a {
        public void a(ad var1, ae var2);

        public void a(@Nullable ac var1);
    }
}

