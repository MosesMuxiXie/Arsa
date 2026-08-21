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
import java.util.List;

public final class dtn
extends Record
implements dth {
    private final List<jd<bcz>> d;
    private final ccf e;
    private final ccf f;
    public static final MapCodec<dtn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bfm.c(bcz.b, bcz.b.sizeLimitedListOf(255)).fieldOf("sound").forGetter(dtn::b), (App)ccf.a(1.0E-5f, 10.0f).fieldOf("volume").forGetter(dtn::c), (App)ccf.a(1.0E-5f, 2.0f).fieldOf("pitch").forGetter(dtn::d)).apply((Applicative)$$0, dtn::new));

    public dtn(List<jd<bcz>> $$0, ccf $$1, ccf $$2) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
    }

    @Override
    public void a(axf $$0, int $$1, dsn $$2, cgk $$3, ftm $$4) {
        if ($$3.bq()) {
            return;
        }
        bgr $$5 = $$3.ep();
        int $$6 = bgj.a($$1 - 1, 0, this.d.size() - 1);
        $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d.get($$6), $$3.dB(), this.e.a($$5), this.f.a($$5));
    }

    public MapCodec<dtn> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dtn.class, "soundEvents;volume;pitch", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dtn.class, "soundEvents;volume;pitch", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dtn.class, "soundEvents;volume;pitch", "d", "e", "f"}, this, $$0);
    }

    public List<jd<bcz>> b() {
        return this.d;
    }

    public ccf c() {
        return this.e;
    }

    public ccf d() {
        return this.f;
    }
}

