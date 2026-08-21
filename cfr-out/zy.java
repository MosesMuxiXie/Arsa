/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record zy(amo c, amo d) implements zz
{
    private final amo c;
    private final amo d;
    public static final amo a = ml.d;
    public static final MapCodec<zy> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amo.a.optionalFieldOf("atlas", (Object)a).forGetter(zy::d), (App)amo.a.fieldOf("sprite").forGetter(zy::e)).apply((Applicative)$$0, zy::new));

    public MapCodec<zy> a() {
        return b;
    }

    @Override
    public ym b() {
        return new ym.a(this.c, this.d);
    }

    private static String a(amo $$0) {
        return $$0.b().equals("minecraft") ? $$0.a() : $$0.toString();
    }

    @Override
    public String c() {
        String $$0 = zy.a(this.d);
        if (this.c.equals(a)) {
            return "[" + $$0 + "]";
        }
        return "[" + $$0 + "@" + zy.a(this.c) + "]";
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{zy.class, "atlas;sprite", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{zy.class, "atlas;sprite", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{zy.class, "atlas;sprite", "c", "d"}, this, $$0);
    }

    public amo d() {
        return this.c;
    }

    public amo e() {
        return this.d;
    }
}

