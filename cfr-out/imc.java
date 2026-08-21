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

public final class imc
extends Record
implements ilu {
    private final bfy c;
    public static final MapCodec<imc> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bfy.a.fieldOf("pattern").forGetter(imc::b)).apply((Applicative)$$0, imc::new));

    public imc(bfy $$0) {
        this.c = $$0;
    }

    @Override
    public void a(baz $$0, ilu.c $$1) {
        $$1.a(this.c.c());
    }

    public MapCodec<imc> a() {
        return b;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{imc.class, "filter", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{imc.class, "filter", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{imc.class, "filter", "c"}, this, $$0);
    }

    public bfy b() {
        return this.c;
    }
}

