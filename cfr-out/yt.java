/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;

public record yt(UUID a, ddr b) {
    private final UUID a;
    private final ddr b;

    public static yt a(ddr $$0) {
        return new yt(UUID.randomUUID(), $$0);
    }

    public zc.c a(UUID $$0) {
        return new zc($$0, this.a).a(bgx.a(this.b.b(), "SHA256withRSA"));
    }

    public yz a() {
        return new yz(this.a, this.b.c());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{yt.class, "sessionId;keyPair", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{yt.class, "sessionId;keyPair", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{yt.class, "sessionId;keyPair", "a", "b"}, this, $$0);
    }

    public UUID b() {
        return this.a;
    }

    public ddr c() {
        return this.b;
    }
}

