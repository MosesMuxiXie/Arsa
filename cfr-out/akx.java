/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public final class akx
extends Record
implements aay<akw> {
    private final int b;
    private final @Nullable alb c;
    public static final aao<wx, akx> a = aay.a(akx::c, akx::a);
    private static final int d = 0x100000;

    public akx(int $$0, @Nullable alb $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    private static akx a(wx $$0) {
        int $$1 = $$0.l();
        return new akx($$1, akx.a($$1, $$0));
    }

    private static alb a(int $$0, wx $$1) {
        return akx.b($$1);
    }

    private static alb b(wx $$0) {
        int $$1 = $$0.readableBytes();
        if ($$1 < 0 || $$1 > 0x100000) {
            throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
        }
        $$0.k($$1);
        return ald.a;
    }

    private void c(wx $$02) {
        $$02.c(this.b);
        $$02.a(this.c, ($$0, $$1) -> $$1.a((wx)((Object)$$0)));
    }

    @Override
    public aba<akx> a() {
        return aku.f;
    }

    @Override
    public void a(akw $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{akx.class, "transactionId;payload", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{akx.class, "transactionId;payload", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{akx.class, "transactionId;payload", "b", "c"}, this, $$0);
    }

    public int b() {
        return this.b;
    }

    public @Nullable alb e() {
        return this.c;
    }
}

