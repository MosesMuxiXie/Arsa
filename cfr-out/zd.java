/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.primitives.Ints;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.security.SignatureException;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public record zd(int b, UUID c, UUID d) {
    public static final Codec<zd> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bfm.q.fieldOf("index").forGetter(zd::b), (App)jx.a.fieldOf("sender").forGetter(zd::c), (App)jx.a.fieldOf("session_id").forGetter(zd::d)).apply((Applicative)$$0, zd::new));

    public static zd a(UUID $$0) {
        return zd.a($$0, bhs.e);
    }

    public static zd a(UUID $$0, UUID $$1) {
        return new zd(0, $$0, $$1);
    }

    public void a(bgv.a $$0) throws SignatureException {
        $$0.update(jx.b(this.c));
        $$0.update(jx.b(this.d));
        $$0.update(Ints.toByteArray((int)this.b));
    }

    public boolean a(zd $$0) {
        return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
    }

    public @Nullable zd a() {
        if (this.b == Integer.MAX_VALUE) {
            return null;
        }
        return new zd(this.b + 1, this.c, this.d);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{zd.class, "index;sender;sessionId", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{zd.class, "index;sender;sessionId", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{zd.class, "index;sender;sessionId", "b", "c", "d"}, this, $$0);
    }
}

