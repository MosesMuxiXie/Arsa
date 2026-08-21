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

public final class bf
extends Record {
    private final cq.b b;
    private final cq.b c;
    private final Optional<bs> d;
    private final Optional<Boolean> e;
    private final Optional<bg> f;
    public static final Codec<bf> a = RecordCodecBuilder.create($$0 -> $$0.group((App)cq.b.d.optionalFieldOf("dealt", (Object)cq.b.c).forGetter(bf::a), (App)cq.b.d.optionalFieldOf("taken", (Object)cq.b.c).forGetter(bf::b), (App)bs.a.optionalFieldOf("source_entity").forGetter(bf::c), (App)Codec.BOOL.optionalFieldOf("blocked").forGetter(bf::d), (App)bg.a.optionalFieldOf("type").forGetter(bf::e)).apply((Applicative)$$0, bf::new));

    public bf(cq.b $$0, cq.b $$1, Optional<bs> $$2, Optional<Boolean> $$3, Optional<bg> $$4) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
    }

    public boolean a(axg $$0, cex $$1, float $$2, float $$3, boolean $$4) {
        if (!this.b.d($$2)) {
            return false;
        }
        if (!this.c.d($$3)) {
            return false;
        }
        if (this.d.isPresent() && !this.d.get().a($$0, $$1.d())) {
            return false;
        }
        if (this.e.isPresent() && this.e.get() != $$4) {
            return false;
        }
        return !this.f.isPresent() || this.f.get().a($$0, $$1);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bf.class, "dealtDamage;takenDamage;sourceEntity;blocked;type", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bf.class, "dealtDamage;takenDamage;sourceEntity;blocked;type", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bf.class, "dealtDamage;takenDamage;sourceEntity;blocked;type", "b", "c", "d", "e", "f"}, this, $$0);
    }

    public cq.b a() {
        return this.b;
    }

    public cq.b b() {
        return this.c;
    }

    public Optional<bs> c() {
        return this.d;
    }

    public Optional<Boolean> d() {
        return this.e;
    }

    public Optional<bg> e() {
        return this.f;
    }

    public static class a {
        private cq.b a = cq.b.c;
        private cq.b b = cq.b.c;
        private Optional<bs> c = Optional.empty();
        private Optional<Boolean> d = Optional.empty();
        private Optional<bg> e = Optional.empty();

        public static a a() {
            return new a();
        }

        public a a(cq.b $$0) {
            this.a = $$0;
            return this;
        }

        public a b(cq.b $$0) {
            this.b = $$0;
            return this;
        }

        public a a(bs $$0) {
            this.c = Optional.of($$0);
            return this;
        }

        public a a(Boolean $$0) {
            this.d = Optional.of($$0);
            return this;
        }

        public a a(bg $$0) {
            this.e = Optional.of($$0);
            return this;
        }

        public a a(bg.a $$0) {
            this.e = Optional.of($$0.b());
            return this;
        }

        public bf b() {
            return new bf(this.a, this.b, this.c, this.d, this.e);
        }
    }
}

