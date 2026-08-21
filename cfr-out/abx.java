/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public final class abx
extends Record
implements aay<abv> {
    private final amo b;
    private final Optional<vz> c;
    private static final aao<ByteBuf, Optional<vz>> d = aam.a(() -> new vi(32768L, 16)).a(aam.d(65536));
    public static final aao<ByteBuf, abx> a = aao.a(amo.b, abx::b, d, abx::e, abx::new);

    public abx(amo $$0, Optional<vz> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public aba<abx> a() {
        return abu.s;
    }

    @Override
    public void a(abv $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{abx.class, "id;payload", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{abx.class, "id;payload", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{abx.class, "id;payload", "b", "c"}, this, $$0);
    }

    public amo b() {
        return this.b;
    }

    public Optional<vz> e() {
        return this.c;
    }
}

