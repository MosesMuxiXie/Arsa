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

public final class lb
extends Record
implements df<dpl> {
    private final Optional<az<axx<yh>, a>> e;
    private final Optional<String> f;
    private final Optional<String> g;
    private final cq.d h;
    private final Optional<Boolean> i;
    public static final Codec<lb> a = RecordCodecBuilder.create($$0 -> $$0.group((App)az.a(lb$a.a).optionalFieldOf("pages").forGetter(lb::b), (App)Codec.STRING.optionalFieldOf("author").forGetter(lb::c), (App)Codec.STRING.optionalFieldOf("title").forGetter(lb::d), (App)cq.d.d.optionalFieldOf("generation", (Object)cq.d.c).forGetter(lb::e), (App)Codec.BOOL.optionalFieldOf("resolved").forGetter(lb::f)).apply((Applicative)$$0, lb::new));

    public lb(Optional<az<axx<yh>, a>> $$0, Optional<String> $$1, Optional<String> $$2, cq.d $$3, Optional<Boolean> $$4) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
        this.h = $$3;
        this.i = $$4;
    }

    @Override
    public kh<dpl> a() {
        return ki.ac;
    }

    @Override
    public boolean a(dpl $$0) {
        if (this.f.isPresent() && !this.f.get().equals($$0.e())) {
            return false;
        }
        if (this.g.isPresent() && !this.g.get().equals($$0.d().a())) {
            return false;
        }
        if (!this.h.d($$0.f())) {
            return false;
        }
        if (this.i.isPresent() && this.i.get().booleanValue() != $$0.g()) {
            return false;
        }
        return !this.e.isPresent() || this.e.get().a($$0.a());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lb.class, "pages;author;title;generation;resolved", "e", "f", "g", "h", "i"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lb.class, "pages;author;title;generation;resolved", "e", "f", "g", "h", "i"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lb.class, "pages;author;title;generation;resolved", "e", "f", "g", "h", "i"}, this, $$0);
    }

    public Optional<az<axx<yh>, a>> b() {
        return this.e;
    }

    public Optional<String> c() {
        return this.f;
    }

    public Optional<String> d() {
        return this.g;
    }

    public cq.d e() {
        return this.h;
    }

    public Optional<Boolean> f() {
        return this.i;
    }

    public static final class a
    extends Record
    implements Predicate<axx<yh>> {
        private final yh b;
        public static final Codec<a> a = yj.a.xmap(a::new, a::a);

        public a(yh $$0) {
            this.b = $$0;
        }

        public boolean a(axx<yh> $$0) {
            return $$0.a().equals(this.b);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "contents", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "contents", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "contents", "b"}, this, $$0);
        }

        public yh a() {
            return this.b;
        }

        @Override
        public /* synthetic */ boolean test(Object object) {
            return this.a((axx)object);
        }
    }
}

