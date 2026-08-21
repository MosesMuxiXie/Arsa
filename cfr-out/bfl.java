/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class bfl<T extends Throwable> {
    private @Nullable T a;

    public void a(T $$0) {
        if (this.a == null) {
            this.a = $$0;
        } else {
            ((Throwable)this.a).addSuppressed((Throwable)$$0);
        }
    }

    public void a() throws T {
        if (this.a != null) {
            throw this.a;
        }
    }
}

