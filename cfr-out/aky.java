/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;

public final class aky
extends Record
implements aay<akw> {
    private final String b;
    private final UUID c;
    public static final aao<wx, aky> a = aay.a(aky::a, aky::new);

    private aky(wx $$0) {
        this($$0.d(16), $$0.n());
    }

    public aky(String $$0, UUID $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b, 16);
        $$0.a(this.c);
    }

    @Override
    public aba<aky> a() {
        return aku.g;
    }

    @Override
    public void a(akw $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aky.class, "name;profileId", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aky.class, "name;profileId", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aky.class, "name;profileId", "b", "c"}, this, $$0);
    }

    public String b() {
        return this.b;
    }

    public UUID e() {
        return this.c;
    }
}

