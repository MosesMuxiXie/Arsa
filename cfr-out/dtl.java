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

public final class dtl
extends Record
implements dth {
    private final dsv d;
    public static final MapCodec<dtl> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)dsv.b.fieldOf("duration").forGetter($$0 -> $$0.d)).apply((Applicative)$$02, dtl::new));

    public dtl(dsv $$0) {
        this.d = $$0;
    }

    @Override
    public void a(axf $$0, int $$1, dsn $$2, cgk $$3, ftm $$4) {
        $$3.e(this.d.a($$1));
    }

    public MapCodec<dtl> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dtl.class, "duration", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dtl.class, "duration", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dtl.class, "duration", "d"}, this, $$0);
    }

    public dsv b() {
        return this.d;
    }
}

