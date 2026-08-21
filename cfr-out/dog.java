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

public final class dog
extends Record {
    private final bef<cez> c;
    public static final Codec<dog> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bef.b(mj.ba).fieldOf("types").forGetter(dog::a)).apply((Applicative)$$0, dog::new));
    public static final aao<xq, dog> b = aao.a(bef.c(mj.ba), dog::a, dog::new);

    public dog(bef<cez> $$0) {
        this.c = $$0;
    }

    public boolean a(cex $$0) {
        return $$0.a(this.c);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dog.class, "types", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dog.class, "types", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dog.class, "types", "c"}, this, $$0);
    }

    public bef<cez> a() {
        return this.c;
    }
}

