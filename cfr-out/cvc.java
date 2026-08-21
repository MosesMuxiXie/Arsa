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
import java.util.List;

public final class cvc
extends Record
implements dfq<dft, dfr> {
    private final iu.b e;
    private final dfu f;
    public static final Codec<cvc> a = RecordCodecBuilder.create($$0 -> $$0.group((App)iu.b.b.forGetter(cvc::b), (App)dfu.b.fieldOf("spawn_conditions").forGetter(cvc::c)).apply((Applicative)$$0, cvc::new));
    public static final Codec<cvc> b = RecordCodecBuilder.create($$0 -> $$0.group((App)iu.b.b.forGetter(cvc::b)).apply((Applicative)$$0, cvc::new));
    public static final Codec<jd<cvc>> c = amr.a(mj.aT);
    public static final aao<xq, jd<cvc>> d = aam.b(mj.aT);

    private cvc(iu.b $$0) {
        this($$0, dfu.a);
    }

    public cvc(iu.b $$0, dfu $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    @Override
    public List<dfq.a<dft, dfr>> a() {
        return this.f.a();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cvc.class, "assetInfo;spawnConditions", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cvc.class, "assetInfo;spawnConditions", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cvc.class, "assetInfo;spawnConditions", "e", "f"}, this, $$0);
    }

    public iu.b b() {
        return this.e;
    }

    public dfu c() {
        return this.f;
    }
}

