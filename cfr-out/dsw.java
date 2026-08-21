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

public final class dsw
extends Record {
    private final jh<dlp> c;
    public static final Codec<dsw> a = RecordCodecBuilder.create($$0 -> $$0.group((App)js.a(mj.R).fieldOf("items").forGetter(dsw::a)).apply((Applicative)$$0, dsw::new));
    public static final aao<xq, dsw> b = aao.a(aam.c(mj.R), dsw::a, dsw::new);

    public dsw(jh<dlp> $$0) {
        this.c = $$0;
    }

    public boolean a(dlt $$0) {
        return $$0.a(this.c);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dsw.class, "items", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dsw.class, "items", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dsw.class, "items", "c"}, this, $$0);
    }

    public jh<dlp> a() {
        return this.c;
    }
}

