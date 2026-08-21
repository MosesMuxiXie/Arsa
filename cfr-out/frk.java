/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.Set;

public record frk(Optional<co> b, is c) implements frm
{
    private final Optional<co> b;
    private final is c;
    private static final MapCodec<is> g = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.INT.optionalFieldOf("offsetX", (Object)0).forGetter(jy::u), (App)Codec.INT.optionalFieldOf("offsetY", (Object)0).forGetter(jy::v), (App)Codec.INT.optionalFieldOf("offsetZ", (Object)0).forGetter(jy::w)).apply((Applicative)$$0, is::new));
    public static final MapCodec<frk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)co.a.optionalFieldOf("predicate").forGetter(frk::c), (App)g.forGetter(frk::d)).apply((Applicative)$$0, frk::new));

    @Override
    public frn a() {
        return fro.n;
    }

    public boolean a(fnz $$0) {
        ftm $$1 = $$0.c(fqx.h);
        return $$1 != null && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
    }

    @Override
    public Set<bhv<?>> b() {
        return Set.of(fqx.h);
    }

    public static frm.a a(co.a $$0) {
        return () -> new frk(Optional.of($$0.b()), is.c);
    }

    public static frm.a a(co.a $$0, is $$1) {
        return () -> new frk(Optional.of($$0.b()), $$1);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{frk.class, "predicate;offset", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{frk.class, "predicate;offset", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{frk.class, "predicate;offset", "b", "c"}, this, $$0);
    }

    public Optional<co> c() {
        return this.b;
    }

    public is d() {
        return this.c;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((fnz)object);
    }
}

