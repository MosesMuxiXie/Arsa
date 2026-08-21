/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public final class hps
implements AutoCloseable {
    private final gfj a;
    private final fyi b;

    public hps(gfj $$0) {
        this.a = $$0;
        this.b = new fyi(fyf::new);
    }

    public fyk a(fxz $$0, @Nullable String $$1, String $$2) {
        return new fyk(this.a, this.b, $$0, $$1, $$2);
    }

    @Override
    public void close() {
        this.b.a();
    }
}

