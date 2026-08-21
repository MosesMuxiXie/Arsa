/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class bzr
implements AutoCloseable {
    public static final bzr a = new bzr(null);
    private final @Nullable bzm b;

    bzr(@Nullable bzm $$0) {
        this.b = $$0;
    }

    public bzr a(String $$0) {
        if (this.b != null) {
            this.b.e($$0);
        }
        return this;
    }

    public bzr a(Supplier<String> $$0) {
        if (this.b != null) {
            this.b.e($$0.get());
        }
        return this;
    }

    public bzr a(long $$0) {
        if (this.b != null) {
            this.b.a($$0);
        }
        return this;
    }

    public bzr a(int $$0) {
        if (this.b != null) {
            this.b.a($$0);
        }
        return this;
    }

    @Override
    public void close() {
        if (this.b != null) {
            this.b.c();
        }
    }
}

