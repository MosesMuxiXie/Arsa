/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class drv
extends Record {
    private final jd<dlp> c;
    private final int d;
    private final kg e;
    private static final Codec<drv> f = RecordCodecBuilder.create($$0 -> $$0.group((App)dlp.e.fieldOf("id").forGetter(drv::b), (App)bfm.a(1, 99).optionalFieldOf("count", (Object)1).forGetter(drv::c), (App)kg.b.optionalFieldOf("components", (Object)kg.a).forGetter(drv::d)).apply((Applicative)$$0, drv::new));
    public static final Codec<drv> a = Codec.withAlternative(f, dlp.e, $$0 -> new drv((dlp)$$0.a())).validate(drv::a);
    public static final aao<xq, drv> b = aao.a(dlp.f, drv::b, aam.h, drv::c, kg.c, drv::d, drv::new);

    public drv(dlp $$0) {
        this($$0.e(), 1, kg.a);
    }

    public drv(jd<dlp> $$0, int $$1, kg $$2) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    private static DataResult<drv> a(drv $$0) {
        return dlt.a(new dlt($$0.c, $$0.d, $$0.e)).map($$1 -> $$0);
    }

    public dlt a(dlt $$0) {
        dlt $$1 = $$0.a(this.c.a(), this.d);
        $$1.b(this.e);
        return $$1;
    }

    public boolean b(dlt $$0) {
        dlt $$1 = this.a($$0);
        return $$1.N() == 1 && dlt.c($$0, $$1);
    }

    public dse a() {
        return new dse.f(new dlt(this.c, this.d, this.e));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{drv.class, "item;count;components", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{drv.class, "item;count;components", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{drv.class, "item;count;components", "c", "d", "e"}, this, $$0);
    }

    public jd<dlp> b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public kg d() {
        return this.e;
    }
}

