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

public final class co
extends Record {
    private final Optional<b> b;
    private final Optional<jh<dxo>> c;
    private final Optional<jh<ffo>> d;
    private final Optional<amt<dwo>> e;
    private final Optional<Boolean> f;
    private final Optional<cl> g;
    private final Optional<as> h;
    private final Optional<ca> i;
    private final Optional<Boolean> j;
    public static final Codec<co> a = RecordCodecBuilder.create($$0 -> $$0.group((App)co$b.a.optionalFieldOf("position").forGetter(co::a), (App)js.a(mj.aS).optionalFieldOf("biomes").forGetter(co::b), (App)js.a(mj.bs).optionalFieldOf("structures").forGetter(co::c), (App)amt.a(mj.bE).optionalFieldOf("dimension").forGetter(co::d), (App)Codec.BOOL.optionalFieldOf("smokey").forGetter(co::e), (App)cl.a.optionalFieldOf("light").forGetter(co::f), (App)as.a.optionalFieldOf("block").forGetter(co::g), (App)ca.a.optionalFieldOf("fluid").forGetter(co::h), (App)Codec.BOOL.optionalFieldOf("can_see_sky").forGetter(co::i)).apply((Applicative)$$0, co::new));

    public co(Optional<b> $$0, Optional<jh<dxo>> $$1, Optional<jh<ffo>> $$2, Optional<amt<dwo>> $$3, Optional<Boolean> $$4, Optional<cl> $$5, Optional<as> $$6, Optional<ca> $$7, Optional<Boolean> $$8) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
        this.i = $$7;
        this.j = $$8;
    }

    public boolean a(axf $$0, double $$1, double $$2, double $$3) {
        if (this.b.isPresent() && !this.b.get().a($$1, $$2, $$3)) {
            return false;
        }
        if (this.e.isPresent() && this.e.get() != $$0.aq()) {
            return false;
        }
        is $$4 = is.a($$1, $$2, $$3);
        boolean $$5 = $$0.t($$4);
        if (!(!this.c.isPresent() || $$5 && this.c.get().a($$0.z($$4)))) {
            return false;
        }
        if (!(!this.d.isPresent() || $$5 && $$0.b().a($$4, this.d.get()).b())) {
            return false;
        }
        if (this.f.isPresent() && (!$$5 || this.f.get() != eag.a($$0, $$4))) {
            return false;
        }
        if (this.g.isPresent() && !this.g.get().a($$0, $$4)) {
            return false;
        }
        if (this.h.isPresent() && !this.h.get().a($$0, $$4)) {
            return false;
        }
        if (this.i.isPresent() && !this.i.get().a($$0, $$4)) {
            return false;
        }
        return !this.j.isPresent() || this.j.get().booleanValue() == $$0.k($$4);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{co.class, "position;biomes;structures;dimension;smokey;light;block;fluid;canSeeSky", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{co.class, "position;biomes;structures;dimension;smokey;light;block;fluid;canSeeSky", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{co.class, "position;biomes;structures;dimension;smokey;light;block;fluid;canSeeSky", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this, $$0);
    }

    public Optional<b> a() {
        return this.b;
    }

    public Optional<jh<dxo>> b() {
        return this.c;
    }

    public Optional<jh<ffo>> c() {
        return this.d;
    }

    public Optional<amt<dwo>> d() {
        return this.e;
    }

    public Optional<Boolean> e() {
        return this.f;
    }

    public Optional<cl> f() {
        return this.g;
    }

    public Optional<as> g() {
        return this.h;
    }

    public Optional<ca> h() {
        return this.i;
    }

    public Optional<Boolean> i() {
        return this.j;
    }

    static final class b
    extends Record {
        private final cq.b b;
        private final cq.b c;
        private final cq.b d;
        public static final Codec<b> a = RecordCodecBuilder.create($$0 -> $$0.group((App)cq.b.d.optionalFieldOf("x", (Object)cq.b.c).forGetter(b::a), (App)cq.b.d.optionalFieldOf("y", (Object)cq.b.c).forGetter(b::b), (App)cq.b.d.optionalFieldOf("z", (Object)cq.b.c).forGetter(b::c)).apply((Applicative)$$0, b::new));

        private b(cq.b $$0, cq.b $$1, cq.b $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        static Optional<b> a(cq.b $$0, cq.b $$1, cq.b $$2) {
            if ($$0.d() && $$1.d() && $$2.d()) {
                return Optional.empty();
            }
            return Optional.of(new b($$0, $$1, $$2));
        }

        public boolean a(double $$0, double $$1, double $$2) {
            return this.b.d($$0) && this.c.d($$1) && this.d.d($$2);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "x;y;z", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "x;y;z", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "x;y;z", "b", "c", "d"}, this, $$0);
        }

        public cq.b a() {
            return this.b;
        }

        public cq.b b() {
            return this.c;
        }

        public cq.b c() {
            return this.d;
        }
    }

    public static class a {
        private cq.b a = cq.b.c;
        private cq.b b = cq.b.c;
        private cq.b c = cq.b.c;
        private Optional<jh<dxo>> d = Optional.empty();
        private Optional<jh<ffo>> e = Optional.empty();
        private Optional<amt<dwo>> f = Optional.empty();
        private Optional<Boolean> g = Optional.empty();
        private Optional<cl> h = Optional.empty();
        private Optional<as> i = Optional.empty();
        private Optional<ca> j = Optional.empty();
        private Optional<Boolean> k = Optional.empty();

        public static a a() {
            return new a();
        }

        public static a a(jd<dxo> $$0) {
            return co$a.a().a(jh.a($$0));
        }

        public static a a(amt<dwo> $$0) {
            return co$a.a().b($$0);
        }

        public static a b(jd<ffo> $$0) {
            return co$a.a().b(jh.a($$0));
        }

        public static a a(cq.b $$0) {
            return co$a.a().c($$0);
        }

        public a b(cq.b $$0) {
            this.a = $$0;
            return this;
        }

        public a c(cq.b $$0) {
            this.b = $$0;
            return this;
        }

        public a d(cq.b $$0) {
            this.c = $$0;
            return this;
        }

        public a a(jh<dxo> $$0) {
            this.d = Optional.of($$0);
            return this;
        }

        public a b(jh<ffo> $$0) {
            this.e = Optional.of($$0);
            return this;
        }

        public a b(amt<dwo> $$0) {
            this.f = Optional.of($$0);
            return this;
        }

        public a a(cl.a $$0) {
            this.h = Optional.of($$0.b());
            return this;
        }

        public a a(as.a $$0) {
            this.i = Optional.of($$0.b());
            return this;
        }

        public a a(ca.a $$0) {
            this.j = Optional.of($$0.b());
            return this;
        }

        public a a(boolean $$0) {
            this.g = Optional.of($$0);
            return this;
        }

        public a b(boolean $$0) {
            this.k = Optional.of($$0);
            return this;
        }

        public co b() {
            Optional<b> $$0 = co$b.a(this.a, this.b, this.c);
            return new co($$0, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
        }
    }
}

