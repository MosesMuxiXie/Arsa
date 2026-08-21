/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public final class ilq
extends Record
implements Closeable {
    private final fyh a;
    private final @Nullable inj b;

    public ilq(fyh $$0, @Nullable inj $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    /*
     * WARNING - void declaration
     */
    public static ilq a(baz $$0, amo $$1) throws IOException {
        void $$5;
        bax $$2 = $$0.getResourceOrThrow($$1);
        try (InputStream $$3 = $$2.d();){
            fyh $$4 = fyh.a($$3);
        }
        inj $$6 = $$2.f().a(inj.e).orElse(null);
        return new ilq((fyh)$$5, $$6);
    }

    public static ilq a() {
        return new ilq(ilf.a(), null);
    }

    public boolean b() {
        return this.b != null ? this.b.a() : false;
    }

    public boolean c() {
        return this.b != null ? this.b.b() : false;
    }

    @Override
    public void close() {
        this.a.close();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ilq.class, "image;metadata", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ilq.class, "image;metadata", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ilq.class, "image;metadata", "a", "b"}, this, $$0);
    }

    public fyh d() {
        return this.a;
    }

    public @Nullable inj e() {
        return this.b;
    }
}

