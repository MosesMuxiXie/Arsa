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
import java.util.Optional;
import java.util.function.UnaryOperator;

public final class dvj
extends Record {
    private final jd<dlp> d;
    private final int e;
    private final kc f;
    private final dlt g;
    public static final Codec<dvj> a = RecordCodecBuilder.create($$0 -> $$0.group((App)dlp.e.fieldOf("id").forGetter(dvj::a), (App)bfm.r.fieldOf("count").orElse((Object)1).forGetter(dvj::b), (App)kc.a.optionalFieldOf("components", (Object)kc.c).forGetter(dvj::c)).apply((Applicative)$$0, dvj::new));
    public static final aao<xq, dvj> b = aao.a(dlp.f, dvj::a, aam.h, dvj::b, kc.b, dvj::c, dvj::new);
    public static final aao<xq, Optional<dvj>> c = b.a(aam::a);

    public dvj(dwn $$0) {
        this($$0, 1);
    }

    public dvj(dwn $$0, int $$1) {
        this($$0.h().e(), $$1, kc.c);
    }

    public dvj(jd<dlp> $$0, int $$1, kc $$2) {
        this($$0, $$1, $$2, dvj.a($$0, $$1, $$2));
    }

    public dvj(jd<dlp> $$0, int $$1, kc $$2, dlt $$3) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
    }

    public dvj a(UnaryOperator<kc.a> $$0) {
        return new dvj(this.d, this.e, ((kc.a)$$0.apply(kc.a())).a());
    }

    private static dlt a(jd<dlp> $$0, int $$1, kc $$2) {
        return new dlt($$0, $$1, $$2.d());
    }

    public boolean a(dlt $$0) {
        return $$0.a(this.d) && this.f.a($$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dvj.class, "item;count;components;itemStack", "d", "e", "f", "g"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dvj.class, "item;count;components;itemStack", "d", "e", "f", "g"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dvj.class, "item;count;components;itemStack", "d", "e", "f", "g"}, this, $$0);
    }

    public jd<dlp> a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public kc c() {
        return this.f;
    }

    public dlt d() {
        return this.g;
    }
}

