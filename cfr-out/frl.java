/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.Set;

public record frl(jd<dzq> b, Optional<dl> c) implements frm
{
    private final jd<dzq> b;
    private final Optional<dl> c;
    public static final MapCodec<frl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)mi.e.r().fieldOf("block").forGetter(frl::c), (App)dl.a.optionalFieldOf("properties").forGetter(frl::d)).apply((Applicative)$$0, frl::new)).validate(frl::a);

    private static DataResult<frl> a(frl $$0) {
        return $$0.d().flatMap($$1 -> $$1.a($$0.c().a().l())).map($$1 -> DataResult.error(() -> "Block " + String.valueOf($$0.c()) + " has no property" + $$1)).orElse(DataResult.success((Object)$$0));
    }

    @Override
    public frn a() {
        return fro.i;
    }

    @Override
    public Set<bhv<?>> b() {
        return Set.of(fqx.i);
    }

    public boolean a(fnz $$0) {
        eoh $$1 = $$0.c(fqx.i);
        return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
    }

    public static a a(dzq $$0) {
        return new a($$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{frl.class, "block;properties", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{frl.class, "block;properties", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{frl.class, "block;properties", "b", "c"}, this, $$0);
    }

    public jd<dzq> c() {
        return this.b;
    }

    public Optional<dl> d() {
        return this.c;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((fnz)object);
    }

    public static class a
    implements frm.a {
        private final jd<dzq> a;
        private Optional<dl> b = Optional.empty();

        public a(dzq $$0) {
            this.a = $$0.p();
        }

        public a a(dl.a $$0) {
            this.b = $$0.b();
            return this;
        }

        @Override
        public frm build() {
            return new frl(this.a, this.b);
        }
    }
}

