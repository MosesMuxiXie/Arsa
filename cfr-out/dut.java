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

public final class dut
extends Record {
    private final amo e;
    private final yh f;
    private final boolean g;
    public static final Codec<dut> a = RecordCodecBuilder.create($$0 -> $$0.group((App)amo.a.fieldOf("asset_id").forGetter(dut::a), (App)yj.a.fieldOf("description").forGetter(dut::b), (App)Codec.BOOL.fieldOf("decal").orElse((Object)false).forGetter(dut::c)).apply((Applicative)$$0, dut::new));
    public static final aao<xq, dut> b = aao.a(amo.b, dut::a, yj.b, dut::b, aam.b, dut::c, dut::new);
    public static final Codec<jd<dut>> c = amq.a(mj.bA, a);
    public static final aao<xq, jd<dut>> d = aam.a(mj.bA, b);

    public dut(amo $$0, yh $$1, boolean $$2) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
    }

    public yh a(jd<dur> $$0) {
        return this.f.f().c($$0.a().b().a());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dut.class, "assetId;description;decal", "e", "f", "g"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dut.class, "assetId;description;decal", "e", "f", "g"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dut.class, "assetId;description;decal", "e", "f", "g"}, this, $$0);
    }

    public amo a() {
        return this.e;
    }

    public yh b() {
        return this.f;
    }

    public boolean c() {
        return this.g;
    }
}

