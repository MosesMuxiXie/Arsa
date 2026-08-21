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

public final class dtm
extends Record
implements dtj {
    private final dsv c;
    public static final MapCodec<dtm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dsv.b.fieldOf("factor").forGetter(dtm::b)).apply((Applicative)$$0, dtm::new));

    public dtm(dsv $$0) {
        this.c = $$0;
    }

    @Override
    public float a(int $$0, bgr $$1, float $$2) {
        return $$2 * this.c.a($$0);
    }

    public MapCodec<dtm> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dtm.class, "factor", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dtm.class, "factor", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dtm.class, "factor", "c"}, this, $$0);
    }

    public dsv b() {
        return this.c;
    }
}

