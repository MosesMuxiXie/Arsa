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

public final class aug<Result>
extends Record {
    private final String a;
    private final auh<Result> b;

    public aug(String $$0, auh<Result> $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public static <Result> Codec<aug<Result>> a() {
        return RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.STRING.fieldOf("name").forGetter(aug::b), (App)auh.a().fieldOf("schema").forGetter(aug::c)).apply((Applicative)$$0, aug::new));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aug.class, "name;schema", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aug.class, "name;schema", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aug.class, "name;schema", "a", "b"}, this, $$0);
    }

    public String b() {
        return this.a;
    }

    public auh<Result> c() {
        return this.b;
    }
}

