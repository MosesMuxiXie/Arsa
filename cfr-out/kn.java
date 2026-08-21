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
import java.util.function.Predicate;

public final class kn
extends Record
implements df<don> {
    private final Optional<az<don.c, a>> e;
    public static final Codec<kn> a = RecordCodecBuilder.create($$0 -> $$0.group((App)az.a(kn$a.a).optionalFieldOf("modifiers").forGetter(kn::b)).apply((Applicative)$$0, kn::new));

    public kn(Optional<az<don.c, a>> $$0) {
        this.e = $$0;
    }

    @Override
    public kh<don> a() {
        return ki.r;
    }

    @Override
    public boolean a(don $$0) {
        return !this.e.isPresent() || this.e.get().a($$0.b());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{kn.class, "modifiers", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{kn.class, "modifiers", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{kn.class, "modifiers", "e"}, this, $$0);
    }

    public Optional<az<don.c, a>> b() {
        return this.e;
    }

    public static final class a
    extends Record
    implements Predicate<don.c> {
        private final Optional<jh<cin>> b;
        private final Optional<amo> c;
        private final cq.b d;
        private final Optional<ciq.a> e;
        private final Optional<cgw> f;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)js.a(mj.c).optionalFieldOf("attribute").forGetter(a::a), (App)amo.a.optionalFieldOf("id").forGetter(a::b), (App)cq.b.d.optionalFieldOf("amount", (Object)cq.b.c).forGetter(a::c), (App)ciq.a.f.optionalFieldOf("operation").forGetter(a::d), (App)cgw.m.optionalFieldOf("slot").forGetter(a::e)).apply((Applicative)$$0, a::new));

        public a(Optional<jh<cin>> $$0, Optional<amo> $$1, cq.b $$2, Optional<ciq.a> $$3, Optional<cgw> $$4) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
            this.f = $$4;
        }

        public boolean a(don.c $$0) {
            if (this.b.isPresent() && !this.b.get().a($$0.a())) {
                return false;
            }
            if (this.c.isPresent() && !this.c.get().equals($$0.b().a())) {
                return false;
            }
            if (!this.d.d($$0.b().b())) {
                return false;
            }
            if (this.e.isPresent() && this.e.get() != $$0.b().c()) {
                return false;
            }
            return !this.f.isPresent() || this.f.get() == $$0.c();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "attribute;id;amount;operation;slot", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "attribute;id;amount;operation;slot", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "attribute;id;amount;operation;slot", "b", "c", "d", "e", "f"}, this, $$0);
        }

        public Optional<jh<cin>> a() {
            return this.b;
        }

        public Optional<amo> b() {
            return this.c;
        }

        public cq.b c() {
            return this.d;
        }

        public Optional<ciq.a> d() {
            return this.e;
        }

        public Optional<cgw> e() {
            return this.f;
        }

        @Override
        public /* synthetic */ boolean test(Object object) {
            return this.a((don.c)object);
        }
    }
}

