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
import java.util.Optional;
import java.util.Set;

public record frf(Optional<bg> b) implements frm
{
    private final Optional<bg> b;
    public static final MapCodec<frf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bg.a.optionalFieldOf("predicate").forGetter(frf::c)).apply((Applicative)$$0, frf::new));

    @Override
    public frn a() {
        return fro.m;
    }

    @Override
    public Set<bhv<?>> b() {
        return Set.of(fqx.h, fqx.e);
    }

    public boolean a(fnz $$0) {
        cex $$1 = $$0.c(fqx.e);
        ftm $$2 = $$0.c(fqx.h);
        if ($$2 == null || $$1 == null) {
            return false;
        }
        return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
    }

    public static frm.a a(bg.a $$0) {
        return () -> new frf(Optional.of($$0.b()));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{frf.class, "predicate", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{frf.class, "predicate", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{frf.class, "predicate", "b"}, this, $$0);
    }

    public Optional<bg> c() {
        return this.b;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((fnz)object);
    }
}

