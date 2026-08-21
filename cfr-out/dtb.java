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

public final class dtb
extends Record
implements dth {
    private final dsv d;
    public static final MapCodec<dtb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dsv.b.fieldOf("amount").forGetter(dtb::b)).apply((Applicative)$$0, dtb::new));

    public dtb(dsv $$0) {
        this.d = $$0;
    }

    @Override
    public void a(axf $$0, int $$1, dsn $$2, cgk $$3, ftm $$4) {
        if ($$3 instanceof ddm) {
            ddm $$5 = (ddm)$$3;
            $$5.a(this.d.a($$1));
        }
    }

    public MapCodec<dtb> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dtb.class, "amount", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dtb.class, "amount", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dtb.class, "amount", "d"}, this, $$0);
    }

    public dsv b() {
        return this.d;
    }
}

