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

public final class aso
extends Record {
    private final String b;
    private final atg c;
    public static final Codec<aso> a = RecordCodecBuilder.create($$0 -> $$0.group((App)asx.b.fieldOf("key").forGetter(aso::a), (App)atg.b.forGetter(aso::b)).apply((Applicative)$$0, aso::new));

    public aso(String $$0, atg $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aso.class, "key;control", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aso.class, "key;control", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aso.class, "key;control", "b", "c"}, this, $$0);
    }

    public String a() {
        return this.b;
    }

    public atg b() {
        return this.c;
    }
}

