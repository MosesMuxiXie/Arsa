/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.time.Duration;
import org.jspecify.annotations.Nullable;

public class gkv {
    private @Nullable gks a;
    private Duration b = Duration.ZERO;
    private long c;
    private boolean d;

    public void a(Duration $$0) {
        this.b = $$0;
    }

    public void a(@Nullable gks $$0) {
        this.a = $$0;
    }

    public @Nullable gks a() {
        return this.a;
    }

    public void a(gir $$0, int $$1, int $$2, boolean $$3, boolean $$4, gpm $$5) {
        boolean $$7;
        if (this.a == null) {
            this.d = false;
            return;
        }
        gfj $$6 = gfj.V();
        boolean bl2 = $$7 = $$3 || $$4 && $$6.aY().b();
        if ($$7 != this.d) {
            if ($$7) {
                this.c = bhs.c();
            }
            this.d = $$7;
        }
        if ($$7 && bhs.c() - this.c > this.b.toMillis()) {
            $$0.a($$6.g, this.a.a($$6), this.a($$5, $$3, $$4), $$1, $$2, $$4);
        }
    }

    private gvj a(gpm $$0, boolean $$1, boolean $$2) {
        if (!$$1 && $$2 && gfj.V().aY().b()) {
            return new gve($$0);
        }
        return new gvl($$0);
    }

    public void a(gpd $$0) {
        if (this.a != null) {
            this.a.b($$0);
        }
    }
}

