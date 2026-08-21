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

public final class ekq
extends Record {
    private final amo e;
    private final String f;
    public static final Codec<ekq> a = RecordCodecBuilder.create($$0 -> $$0.group((App)amo.a.fieldOf("asset_id").forGetter(ekq::a), (App)Codec.STRING.fieldOf("translation_key").forGetter(ekq::b)).apply((Applicative)$$0, ekq::new));
    public static final aao<xq, ekq> b = aao.a(amo.b, ekq::a, aam.p, ekq::b, ekq::new);
    public static final Codec<jd<ekq>> c = amq.a(mj.aR, a);
    public static final aao<xq, jd<ekq>> d = aam.a(mj.aR, b);

    public ekq(amo $$0, String $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ekq.class, "assetId;translationKey", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ekq.class, "assetId;translationKey", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ekq.class, "assetId;translationKey", "e", "f"}, this, $$0);
    }

    public amo a() {
        return this.e;
    }

    public String b() {
        return this.f;
    }
}

