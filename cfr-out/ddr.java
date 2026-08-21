/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.security.PrivateKey;
import java.time.Instant;

public record ddr(PrivateKey b, dds c, Instant d) {
    public static final Codec<ddr> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bfb.g.fieldOf("private_key").forGetter(ddr::b), (App)dds.c.fieldOf("public_key").forGetter(ddr::c), (App)bfm.x.fieldOf("refreshed_after").forGetter(ddr::d)).apply((Applicative)$$0, ddr::new));

    public boolean a() {
        return this.d.isBefore(Instant.now());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ddr.class, "privateKey;publicKey;refreshedAfter", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ddr.class, "privateKey;publicKey;refreshedAfter", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ddr.class, "privateKey;publicKey;refreshedAfter", "b", "c", "d"}, this, $$0);
    }
}

