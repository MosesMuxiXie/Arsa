/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class atf
extends Record
implements atg {
    private final yh c;
    private final boolean d;
    private final String e;
    private final String f;
    public static final MapCodec<atf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)yj.a.fieldOf("label").forGetter(atf::b), (App)Codec.BOOL.optionalFieldOf("initial", (Object)false).forGetter(atf::c), (App)Codec.STRING.optionalFieldOf("on_true", (Object)"true").forGetter(atf::d), (App)Codec.STRING.optionalFieldOf("on_false", (Object)"false").forGetter(atf::e)).apply((Applicative)$$0, atf::new));

    public atf(yh $$0, boolean $$1, String $$2, String $$3) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
    }

    public MapCodec<atf> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{atf.class, "label;initial;onTrue;onFalse", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{atf.class, "label;initial;onTrue;onFalse", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{atf.class, "label;initial;onTrue;onFalse", "c", "d", "e", "f"}, this, $$0);
    }

    public yh b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.f;
    }
}

