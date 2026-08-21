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

public final class atd
extends Record
implements ata {
    private final yh f;
    private final int g;
    public static final int c = 200;
    public static final MapCodec<atd> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)yj.a.fieldOf("contents").forGetter(atd::b), (App)asj.b.optionalFieldOf("width", (Object)200).forGetter(atd::c)).apply((Applicative)$$0, atd::new));
    public static final Codec<atd> e = Codec.withAlternative((Codec)d.codec(), yj.a, $$0 -> new atd((yh)$$0, 200));

    public atd(yh $$0, int $$1) {
        this.f = $$0;
        this.g = $$1;
    }

    public MapCodec<atd> a() {
        return d;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{atd.class, "contents;width", "f", "g"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{atd.class, "contents;width", "f", "g"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{atd.class, "contents;width", "f", "g"}, this, $$0);
    }

    public yh b() {
        return this.f;
    }

    public int c() {
        return this.g;
    }
}

