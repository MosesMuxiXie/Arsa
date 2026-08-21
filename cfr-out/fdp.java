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

public final class fdp
extends Record {
    private final jd<dlp> c;
    private final fdr d;
    public static final Codec<fdp> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dlp.e.fieldOf("display").forGetter($$0 -> $$0.c), (App)fdr.a.fieldOf("settings").forGetter($$0 -> $$0.d)).apply((Applicative)$$02, fdp::new));
    public static final Codec<jd<fdp>> b = amq.a(mj.bg, a);

    public fdp(jd<dlp> $$0, fdr $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fdp.class, "displayItem;settings", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fdp.class, "displayItem;settings", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fdp.class, "displayItem;settings", "c", "d"}, this, $$0);
    }

    public jd<dlp> a() {
        return this.c;
    }

    public fdr b() {
        return this.d;
    }
}

