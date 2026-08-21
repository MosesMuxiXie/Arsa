/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.UUID;

public final class aue
extends Record {
    private final Optional<UUID> b;
    private final Optional<String> c;
    public static final MapCodec<aue> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)jx.d.optionalFieldOf("id").forGetter(aue::a), (App)Codec.STRING.optionalFieldOf("name").forGetter(aue::b)).apply((Applicative)$$0, aue::new));

    public aue(Optional<UUID> $$0, Optional<String> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public static aue a(GameProfile $$0) {
        return new aue(Optional.of($$0.id()), Optional.of($$0.name()));
    }

    public static aue a(bbx $$0) {
        return new aue(Optional.of($$0.a()), Optional.of($$0.b()));
    }

    public static aue a(axg $$0) {
        GameProfile $$1 = $$0.gI();
        return aue.a($$1);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aue.class, "id;name", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aue.class, "id;name", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aue.class, "id;name", "b", "c"}, this, $$0);
    }

    public Optional<UUID> a() {
        return this.b;
    }

    public Optional<String> b() {
        return this.c;
    }
}

