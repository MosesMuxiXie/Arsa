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
import java.util.Optional;

public final class kw
extends Record
implements df<dol> {
    private final Optional<az<dok, kv.a>> e;
    private final cq.d f;
    public static final Codec<kw> a = RecordCodecBuilder.create($$0 -> $$0.group((App)az.a(kv.a.a).optionalFieldOf("explosions").forGetter(kw::b), (App)cq.d.d.optionalFieldOf("flight_duration", (Object)cq.d.c).forGetter(kw::c)).apply((Applicative)$$0, kw::new));

    public kw(Optional<az<dok, kv.a>> $$0, cq.d $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    @Override
    public kh<dol> a() {
        return ki.aq;
    }

    @Override
    public boolean a(dol $$0) {
        if (this.e.isPresent() && !this.e.get().a($$0.b())) {
            return false;
        }
        return this.f.d($$0.a());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{kw.class, "explosions;flightDuration", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{kw.class, "explosions;flightDuration", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{kw.class, "explosions;flightDuration", "e", "f"}, this, $$0);
    }

    public Optional<az<dok, kv.a>> b() {
        return this.e;
    }

    public cq.d c() {
        return this.f;
    }
}

