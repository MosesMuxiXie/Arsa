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

public record dn<T>(bef<T> a, boolean b) {
    public static <T> Codec<dn<T>> a(amt<? extends jq<T>> $$0) {
        return RecordCodecBuilder.create($$1 -> $$1.group((App)bef.a($$0).fieldOf("id").forGetter(dn::a), (App)Codec.BOOL.fieldOf("expected").forGetter(dn::b)).apply((Applicative)$$1, dn::new));
    }

    public static <T> dn<T> a(bef<T> $$0) {
        return new dn<T>($$0, true);
    }

    public static <T> dn<T> b(bef<T> $$0) {
        return new dn<T>($$0, false);
    }

    public boolean a(jd<T> $$0) {
        return $$0.a(this.a) == this.b;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dn.class, "tag;expected", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dn.class, "tag;expected", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dn.class, "tag;expected", "a", "b"}, this, $$0);
    }
}

