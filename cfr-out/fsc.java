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
import java.util.Set;

public record fsc(amo b) implements fsa
{
    private final amo b;
    public static final MapCodec<fsc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amo.a.fieldOf("source").forGetter(fsc::c)).apply((Applicative)$$0, fsc::new));

    @Override
    public frz a() {
        return fsb.b;
    }

    @Override
    public vz a(fnz $$0) {
        return $$0.d().s().aL().a(this.b);
    }

    @Override
    public Set<bhv<?>> b() {
        return Set.of();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fsc.class, "id", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fsc.class, "id", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fsc.class, "id", "b"}, this, $$0);
    }

    public amo c() {
        return this.b;
    }
}

