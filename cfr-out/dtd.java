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

public final class dtd
extends Record
implements dth {
    private final dsv d;
    public static final MapCodec<dtd> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)dsv.b.fieldOf("amount").forGetter($$0 -> $$0.d)).apply((Applicative)$$02, dtd::new));

    public dtd(dsv $$0) {
        this.d = $$0;
    }

    @Override
    public void a(axf $$0, int $$1, dsn $$2, cgk $$3, ftm $$4) {
        dlt $$5 = $$2.a();
        if ($$5.c(ki.d) && $$5.c(ki.e)) {
            axg $$6;
            chl chl2 = $$2.c();
            axg $$7 = chl2 instanceof axg ? ($$6 = (axg)chl2) : null;
            int $$8 = (int)this.d.a($$1);
            $$5.a($$8, $$0, $$7, $$2.d());
        }
    }

    public MapCodec<dtd> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dtd.class, "amount", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dtd.class, "amount", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dtd.class, "amount", "d"}, this, $$0);
    }

    public dsv b() {
        return this.d;
    }
}

