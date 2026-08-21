/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.Objects;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class cyu {
    private static final Logger a = LogUtils.getLogger();
    private final cyc b;
    private final @Nullable cyn[] c = new cyn[cyt.c()];
    private @Nullable cyn d;

    public cyu(cyc $$0) {
        this.b = $$0;
        this.a(cyt.k);
    }

    public void a(cyt<?> $$0) {
        if (this.d != null && $$0 == this.d.h()) {
            return;
        }
        if (this.d != null) {
            this.d.d();
        }
        this.d = this.b($$0);
        if (!this.b.ao().B_()) {
            this.b.aD().a(cyc.a, $$0.b());
        }
        a.debug("Dragon is now in phase {} on the {}", $$0, (Object)(this.b.ao().B_() ? "client" : "server"));
        this.d.c();
    }

    public cyn a() {
        return Objects.requireNonNull(this.d);
    }

    public <T extends cyn> T b(cyt<T> $$0) {
        int $$1 = $$0.b();
        cyn $$2 = this.c[$$1];
        if ($$2 == null) {
            this.c[$$1] = $$2 = $$0.a(this.b);
        }
        return (T)$$2;
    }
}

