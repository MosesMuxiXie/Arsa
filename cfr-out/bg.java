/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;

public final class bg
extends Record {
    private final List<dn<cez>> b;
    private final Optional<bs> c;
    private final Optional<bs> d;
    private final Optional<Boolean> e;
    public static final Codec<bg> a = RecordCodecBuilder.create($$0 -> $$0.group((App)dn.a(mj.ba).listOf().optionalFieldOf("tags", List.of()).forGetter(bg::a), (App)bs.a.optionalFieldOf("direct_entity").forGetter(bg::b), (App)bs.a.optionalFieldOf("source_entity").forGetter(bg::c), (App)Codec.BOOL.optionalFieldOf("is_direct").forGetter(bg::d)).apply((Applicative)$$0, bg::new));

    public bg(List<dn<cez>> $$0, Optional<bs> $$1, Optional<bs> $$2, Optional<Boolean> $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    public boolean a(axg $$0, cex $$1) {
        return this.a($$0.A(), $$0.dI(), $$1);
    }

    public boolean a(axf $$0, ftm $$1, cex $$2) {
        for (dn<cez> $$3 : this.b) {
            if ($$3.a($$2.l())) continue;
            return false;
        }
        if (this.c.isPresent() && !this.c.get().a($$0, $$1, $$2.c())) {
            return false;
        }
        if (this.d.isPresent() && !this.d.get().a($$0, $$1, $$2.d())) {
            return false;
        }
        return !this.e.isPresent() || this.e.get().booleanValue() == $$2.b();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bg.class, "tags;directEntity;sourceEntity;isDirect", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bg.class, "tags;directEntity;sourceEntity;isDirect", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bg.class, "tags;directEntity;sourceEntity;isDirect", "b", "c", "d", "e"}, this, $$0);
    }

    public List<dn<cez>> a() {
        return this.b;
    }

    public Optional<bs> b() {
        return this.c;
    }

    public Optional<bs> c() {
        return this.d;
    }

    public Optional<Boolean> d() {
        return this.e;
    }

    public static class a {
        private final ImmutableList.Builder<dn<cez>> a = ImmutableList.builder();
        private Optional<bs> b = Optional.empty();
        private Optional<bs> c = Optional.empty();
        private Optional<Boolean> d = Optional.empty();

        public static a a() {
            return new a();
        }

        public a a(dn<cez> $$0) {
            this.a.add($$0);
            return this;
        }

        public a a(bs.a $$0) {
            this.b = Optional.of($$0.b());
            return this;
        }

        public a b(bs.a $$0) {
            this.c = Optional.of($$0.b());
            return this;
        }

        public a a(boolean $$0) {
            this.d = Optional.of($$0);
            return this;
        }

        public bg b() {
            return new bg((List<dn<cez>>)this.a.build(), this.b, this.c, this.d);
        }
    }
}

