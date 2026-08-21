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

public final class bet
extends Record {
    private final int d;
    private final int e;
    public static final Codec<Integer> a = bfm.a(0, 15);
    public static final Codec<bet> b = RecordCodecBuilder.create($$0 -> $$0.group((App)a.fieldOf("block").forGetter(bet::b), (App)a.fieldOf("sky").forGetter(bet::c)).apply((Applicative)$$0, bet::new));
    public static final bet c = new bet(15, 15);

    public bet(int $$0, int $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    public static int a(int $$0, int $$1) {
        return $$0 << 4 | $$1 << 20;
    }

    public int a() {
        return bet.a(this.d, this.e);
    }

    public static int a(int $$0) {
        return $$0 >> 4 & 0xFFFF;
    }

    public static int b(int $$0) {
        return $$0 >> 20 & 0xFFFF;
    }

    public static bet c(int $$0) {
        return new bet(bet.a($$0), bet.b($$0));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bet.class, "block;sky", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bet.class, "block;sky", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bet.class, "block;sky", "d", "e"}, this, $$0);
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }
}

