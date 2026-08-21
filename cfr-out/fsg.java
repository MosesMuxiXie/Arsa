/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class fsg
extends Record
implements fsi {
    private final dsv b;
    public static final MapCodec<fsg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dsv.b.fieldOf("amount").forGetter(fsg::c)).apply((Applicative)$$0, fsg::new));

    public fsg(dsv $$0) {
        this.b = $$0;
    }

    @Override
    public float b(fnz $$0) {
        int $$1 = $$0.b(fqx.m);
        return this.b.a($$1);
    }

    @Override
    public fsh a() {
        return fsj.g;
    }

    public static fsg a(dsv $$0) {
        return new fsg($$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fsg.class, "amount", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fsg.class, "amount", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fsg.class, "amount", "b"}, this, $$0);
    }

    public dsv c() {
        return this.b;
    }
}

