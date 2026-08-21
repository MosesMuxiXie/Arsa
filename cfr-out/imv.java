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

public record imv(String b, String c, boolean d) {
    public static final Codec<imv> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bfm.M.fieldOf("region").forGetter(imv::b), (App)bfm.M.fieldOf("name").forGetter(imv::c), (App)Codec.BOOL.optionalFieldOf("bidirectional", (Object)false).forGetter(imv::d)).apply((Applicative)$$0, imv::new));

    public yh a() {
        return yh.b(this.c + " (" + this.b + ")");
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{imv.class, "region;name;bidirectional", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{imv.class, "region;name;bidirectional", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{imv.class, "region;name;bidirectional", "b", "c", "d"}, this, $$0);
    }
}

