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

public final class fap
extends Record
implements fac {
    private final int b;
    private final int c;
    private final int d;
    private final jd<fes> e;
    public static final Codec<fap> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bfm.r.fieldOf("tries").orElse((Object)128).forGetter(fap::a), (App)bfm.q.fieldOf("xz_spread").orElse((Object)7).forGetter(fap::b), (App)bfm.q.fieldOf("y_spread").orElse((Object)3).forGetter(fap::c), (App)fes.b.fieldOf("feature").forGetter(fap::d)).apply((Applicative)$$0, fap::new));

    public fap(int $$0, int $$1, int $$2, jd<fes> $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fap.class, "tries;xzSpread;ySpread;feature", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fap.class, "tries;xzSpread;ySpread;feature", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fap.class, "tries;xzSpread;ySpread;feature", "b", "c", "d", "e"}, this, $$0);
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public jd<fes> d() {
        return this.e;
    }
}

