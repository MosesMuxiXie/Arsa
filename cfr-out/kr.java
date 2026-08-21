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

public final class kr
extends Record
implements ks {
    private final cq.d e;
    private final cq.d f;
    public static final Codec<kr> a = RecordCodecBuilder.create($$0 -> $$0.group((App)cq.d.d.optionalFieldOf("durability", (Object)cq.d.c).forGetter(kr::a), (App)cq.d.d.optionalFieldOf("damage", (Object)cq.d.c).forGetter(kr::b)).apply((Applicative)$$0, kr::new));

    public kr(cq.d $$0, cq.d $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    @Override
    public boolean a(kd $$0) {
        Integer $$1 = $$0.a(ki.e);
        if ($$1 == null) {
            return false;
        }
        int $$2 = $$0.a(ki.d, 0);
        if (!this.e.d($$2 - $$1)) {
            return false;
        }
        return this.f.d($$1);
    }

    public static kr a(cq.d $$0) {
        return new kr($$0, cq.d.c);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{kr.class, "durability;damage", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{kr.class, "durability;damage", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{kr.class, "durability;damage", "e", "f"}, this, $$0);
    }

    public cq.d a() {
        return this.e;
    }

    public cq.d b() {
        return this.f;
    }
}

