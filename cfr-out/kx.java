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

public final class kx
extends Record
implements df<dly> {
    private final Optional<jh<dlz>> e;
    public static final Codec<kx> a = RecordCodecBuilder.create($$0 -> $$0.group((App)js.a(mj.bj).optionalFieldOf("song").forGetter(kx::c)).apply((Applicative)$$0, kx::new));

    public kx(Optional<jh<dlz>> $$0) {
        this.e = $$0;
    }

    @Override
    public kh<dly> a() {
        return ki.al;
    }

    @Override
    public boolean a(dly $$0) {
        if (this.e.isPresent()) {
            boolean $$1 = false;
            for (jd jd2 : this.e.get()) {
                Optional $$3 = jd2.e();
                if ($$3.isEmpty() || !$$3.equals($$0.a().a())) continue;
                $$1 = true;
                break;
            }
            return $$1;
        }
        return true;
    }

    public static kx b() {
        return new kx(Optional.empty());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{kx.class, "song", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{kx.class, "song", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{kx.class, "song", "e"}, this, $$0);
    }

    public Optional<jh<dlz>> c() {
        return this.e;
    }
}

