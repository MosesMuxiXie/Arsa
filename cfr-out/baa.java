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

public final class baa
extends Record {
    private final yh d;
    private final bfz<azz> e;
    private static final Codec<baa> f = RecordCodecBuilder.create($$02 -> $$02.group((App)yj.a.fieldOf("description").forGetter(baa::a)).apply((Applicative)$$02, $$0 -> new baa((yh)$$0, new bfz<azz>(azz.a(Integer.MAX_VALUE)))));
    public static final azy<baa> a = new azy<baa>("pack", baa.b(azn.a));
    public static final azy<baa> b = new azy<baa>("pack", baa.b(azn.b));
    public static final azy<baa> c = new azy<baa>("pack", f);

    public baa(yh $$0, bfz<azz> $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    private static Codec<baa> b(azn $$0) {
        return RecordCodecBuilder.create($$1 -> $$1.group((App)yj.a.fieldOf("description").forGetter(baa::a), (App)azz.b($$0).forGetter(baa::b)).apply((Applicative)$$1, baa::new));
    }

    public static azy<baa> a(azn $$0) {
        return switch ($$0) {
            default -> throw new MatchException(null, null);
            case azn.a -> a;
            case azn.b -> b;
        };
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{baa.class, "description;supportedFormats", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{baa.class, "description;supportedFormats", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{baa.class, "description;supportedFormats", "d", "e"}, this, $$0);
    }

    public yh a() {
        return this.d;
    }

    public bfz<azz> b() {
        return this.e;
    }
}

