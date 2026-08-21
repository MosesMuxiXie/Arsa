/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public abstract class gmk
implements gml {
    private @Nullable gmm a;
    private boolean b;

    @Override
    public final boolean aN_() {
        return this.b;
    }

    @Override
    public final void c_(boolean $$0) {
        this.b = $$0;
    }

    @Override
    public @Nullable gmm aO_() {
        return this.a;
    }

    @Override
    public void a(@Nullable gmm $$0) {
        if (this.a == $$0) {
            return;
        }
        if (this.a != null) {
            this.a.b(false);
        }
        if ($$0 != null) {
            $$0.b(true);
        }
        this.a = $$0;
    }
}

