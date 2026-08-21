/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class aud<Param>
extends Record {
    private final String a;
    private final auh<Param> b;
    private final boolean c;

    public aud(String $$0, auh<Param> $$1) {
        this($$0, $$1, true);
    }

    public aud(String $$0, auh<Param> $$1, boolean $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    public static <Param> MapCodec<aud<Param>> a() {
        return RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.STRING.fieldOf("name").forGetter(aud::b), (App)auh.a().fieldOf("schema").forGetter(aud::c), (App)Codec.BOOL.fieldOf("required").forGetter(aud::d)).apply((Applicative)$$0, aud::new));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aud.class, "name;schema;required", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aud.class, "name;schema;required", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aud.class, "name;schema;required", "a", "b", "c"}, this, $$0);
    }

    public String b() {
        return this.a;
    }

    public auh<Param> c() {
        return this.b;
    }

    public boolean d() {
        return this.c;
    }
}

