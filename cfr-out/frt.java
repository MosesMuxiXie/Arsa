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

public record frt(Optional<cg> b) implements frm
{
    private final Optional<cg> b;
    public static final MapCodec<frt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)cg.a.optionalFieldOf("predicate").forGetter(frt::c)).apply((Applicative)$$0, frt::new));

    @Override
    public frn a() {
        return fro.j;
    }

    @Override
    public Set<bhv<?>> b() {
        return Set.of(fqx.k);
    }

    public boolean a(fnz $$0) {
        dlt $$1 = $$0.c(fqx.k);
        return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
    }

    public static frm.a a(cg.a $$0) {
        return () -> new frt(Optional.of($$0.b()));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{frt.class, "predicate", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{frt.class, "predicate", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{frt.class, "predicate", "b"}, this, $$0);
    }

    public Optional<cg> c() {
        return this.b;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((fnz)object);
    }
}

