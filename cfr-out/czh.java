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

public final class czh
extends Record {
    private final int e;
    private final int f;
    private final amo g;
    private final Optional<yh> h;
    private final Optional<yh> i;
    public static final Codec<czh> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bfm.a(1, 16).fieldOf("width").forGetter(czh::b), (App)bfm.a(1, 16).fieldOf("height").forGetter(czh::c), (App)amo.a.fieldOf("asset_id").forGetter(czh::d), (App)yj.a.optionalFieldOf("title").forGetter(czh::e), (App)yj.a.optionalFieldOf("author").forGetter(czh::f)).apply((Applicative)$$0, czh::new));
    public static final aao<xq, czh> b = aao.a(aam.h, czh::b, aam.h, czh::c, amo.b, czh::d, yj.e, czh::e, yj.e, czh::f, czh::new);
    public static final Codec<jd<czh>> c = amr.a(mj.bn);
    public static final aao<xq, jd<czh>> d = aam.a(mj.bn, b);

    public czh(int $$0, int $$1, amo $$2, Optional<yh> $$3, Optional<yh> $$4) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
        this.h = $$3;
        this.i = $$4;
    }

    public int a() {
        return this.b() * this.c();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{czh.class, "width;height;assetId;title;author", "e", "f", "g", "h", "i"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{czh.class, "width;height;assetId;title;author", "e", "f", "g", "h", "i"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{czh.class, "width;height;assetId;title;author", "e", "f", "g", "h", "i"}, this, $$0);
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

    public amo d() {
        return this.g;
    }

    public Optional<yh> e() {
        return this.h;
    }

    public Optional<yh> f() {
        return this.i;
    }
}

