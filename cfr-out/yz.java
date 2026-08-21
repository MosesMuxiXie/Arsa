/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Duration;
import java.util.UUID;

public record yz(UUID a, dds b) {
    private final UUID a;
    private final dds b;

    public ze a(Duration $$0) {
        return new ze.a(this.b.a(), () -> this.b.b().a($$0));
    }

    public zc.b a(UUID $$0) {
        return new zc($$0, this.a).a(this.b);
    }

    public a a() {
        return new a(this.a, this.b.b());
    }

    public boolean b() {
        return this.b.b().a();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{yz.class, "sessionId;profilePublicKey", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{yz.class, "sessionId;profilePublicKey", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{yz.class, "sessionId;profilePublicKey", "a", "b"}, this, $$0);
    }

    public UUID c() {
        return this.a;
    }

    public dds d() {
        return this.b;
    }

    public record a(UUID a, dds.a b) {
        public static a a(wx $$0) {
            return new a($$0.n(), new dds.a($$0));
        }

        public static void a(wx $$0, a $$1) {
            $$0.a($$1.a);
            $$1.b.a($$0);
        }

        public yz a(GameProfile $$0, bgw $$1) throws dds.b {
            return new yz(this.a, dds.a($$1, $$0.id(), this.b));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "sessionId;profilePublicKey", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "sessionId;profilePublicKey", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "sessionId;profilePublicKey", "a", "b"}, this, $$0);
        }
    }
}

