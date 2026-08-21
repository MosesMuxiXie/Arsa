/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public final class cz
extends Record
implements bt {
    private final boolean d;
    private final boolean e;
    public static final MapCodec<cz> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.BOOL.optionalFieldOf("has_raid", (Object)false).forGetter(cz::b), (App)Codec.BOOL.optionalFieldOf("is_captain", (Object)false).forGetter(cz::c)).apply((Applicative)$$0, cz::new));
    public static final cz c = new cz(false, true);

    public cz(boolean $$0, boolean $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    public MapCodec<cz> a() {
        return bu.e;
    }

    @Override
    public boolean a(cgk $$0, axf $$1, @Nullable ftm $$2) {
        if ($$0 instanceof dfi) {
            dfi $$3 = (dfi)$$0;
            return $$3.hg() == this.d && $$3.hf() == this.e;
        }
        return false;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cz.class, "hasRaid;isCaptain", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cz.class, "hasRaid;isCaptain", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cz.class, "hasRaid;isCaptain", "d", "e"}, this, $$0);
    }

    public boolean b() {
        return this.d;
    }

    public boolean c() {
        return this.e;
    }
}

