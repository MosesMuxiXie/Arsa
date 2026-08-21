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

public record fmt(is b, int c, int d) {
    public static final Codec<fmt> a = RecordCodecBuilder.create($$0 -> $$0.group((App)is.a.fieldOf("pos").forGetter(fmt::b), (App)Codec.INT.fieldOf("rotation").forGetter(fmt::c), (App)Codec.INT.fieldOf("entity_id").forGetter(fmt::d)).apply((Applicative)$$0, fmt::new));

    public String a() {
        return fmt.a(this.b);
    }

    public static String a(is $$0) {
        return "frame-" + $$0.u() + "," + $$0.v() + "," + $$0.w();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fmt.class, "pos;rotation;entityId", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fmt.class, "pos;rotation;entityId", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fmt.class, "pos;rotation;entityId", "b", "c", "d"}, this, $$0);
    }
}

