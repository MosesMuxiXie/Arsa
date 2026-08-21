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

public record frp(Optional<bs> b, fnz.c c) implements frm
{
    private final Optional<bs> b;
    private final fnz.c c;
    public static final MapCodec<frp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bs.a.optionalFieldOf("predicate").forGetter(frp::c), (App)fnz.c.g.fieldOf("entity").forGetter(frp::d)).apply((Applicative)$$0, frp::new));

    @Override
    public frn a() {
        return fro.f;
    }

    @Override
    public Set<bhv<?>> b() {
        return Set.of(fqx.h, this.c.a());
    }

    public boolean a(fnz $$0) {
        cgk $$1 = $$0.c(this.c.a());
        ftm $$2 = $$0.c(fqx.h);
        return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
    }

    public static frm.a a(fnz.c $$0) {
        return frp.a($$0, bs.a.a());
    }

    public static frm.a a(fnz.c $$0, bs.a $$1) {
        return () -> new frp(Optional.of($$1.b()), $$0);
    }

    public static frm.a a(fnz.c $$0, bs $$1) {
        return () -> new frp(Optional.of($$1), $$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{frp.class, "predicate;entityTarget", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{frp.class, "predicate;entityTarget", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{frp.class, "predicate;entityTarget", "b", "c"}, this, $$0);
    }

    public Optional<bs> c() {
        return this.b;
    }

    public fnz.c d() {
        return this.c;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((fnz)object);
    }
}

