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

public final class kz
extends Record
implements df<dup> {
    private final Optional<jh<dur>> e;
    private final Optional<jh<dut>> f;
    public static final Codec<kz> a = RecordCodecBuilder.create($$0 -> $$0.group((App)js.a(mj.bz).optionalFieldOf("material").forGetter(kz::b), (App)js.a(mj.bA).optionalFieldOf("pattern").forGetter(kz::c)).apply((Applicative)$$0, kz::new));

    public kz(Optional<jh<dur>> $$0, Optional<jh<dut>> $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    @Override
    public kh<dup> a() {
        return ki.ad;
    }

    @Override
    public boolean a(dup $$0) {
        if (this.e.isPresent() && !this.e.get().a($$0.a())) {
            return false;
        }
        return !this.f.isPresent() || this.f.get().a($$0.b());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{kz.class, "material;pattern", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{kz.class, "material;pattern", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{kz.class, "material;pattern", "e", "f"}, this, $$0);
    }

    public Optional<jh<dur>> b() {
        return this.e;
    }

    public Optional<jh<dut>> c() {
        return this.f;
    }
}

