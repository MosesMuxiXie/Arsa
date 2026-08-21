/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public final class acz
extends Record
implements aay<acy> {
    private final amo b;
    private final byte @Nullable [] c;
    public static final aao<wx, acz> a = aay.a(acz::a, acz::new);

    private acz(wx $$0) {
        this($$0.q(), $$0.c(abr.b));
    }

    public acz(amo $$0, byte @Nullable [] $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
        $$0.a(this.c, abr.b);
    }

    @Override
    public aba<acz> a() {
        return acx.b;
    }

    @Override
    public void a(acy $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{acz.class, "key;payload", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{acz.class, "key;payload", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{acz.class, "key;payload", "b", "c"}, this, $$0);
    }

    public amo b() {
        return this.b;
    }

    public byte @Nullable [] e() {
        return this.c;
    }
}

