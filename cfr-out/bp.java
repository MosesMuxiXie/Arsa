/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public final class bp
extends Record {
    private final Optional<cg> b;
    private final Optional<cg> c;
    private final Optional<cg> d;
    private final Optional<cg> e;
    private final Optional<cg> f;
    private final Optional<cg> g;
    private final Optional<cg> h;
    public static final Codec<bp> a = RecordCodecBuilder.create($$0 -> $$0.group((App)cg.a.optionalFieldOf("head").forGetter(bp::a), (App)cg.a.optionalFieldOf("chest").forGetter(bp::b), (App)cg.a.optionalFieldOf("legs").forGetter(bp::c), (App)cg.a.optionalFieldOf("feet").forGetter(bp::d), (App)cg.a.optionalFieldOf("body").forGetter(bp::e), (App)cg.a.optionalFieldOf("mainhand").forGetter(bp::f), (App)cg.a.optionalFieldOf("offhand").forGetter(bp::g)).apply((Applicative)$$0, bp::new));

    public bp(Optional<cg> $$0, Optional<cg> $$1, Optional<cg> $$2, Optional<cg> $$3, Optional<cg> $$4, Optional<cg> $$5, Optional<cg> $$6) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
    }

    public static bp a(je<dlp> $$0, je<ekq> $$1) {
        return bp$a.a().a(cg.a.a().a($$0, dlx.xe).a(bh.a.a().a(kc.a(dfh.a($$1).a(), ki.at, ki.k)).b())).b();
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(@Nullable cgk $$0) {
        void $$2;
        if (!($$0 instanceof chl)) {
            return false;
        }
        chl $$1 = (chl)$$0;
        if (this.b.isPresent() && !this.b.get().a($$2.a(cgv.f))) {
            return false;
        }
        if (this.c.isPresent() && !this.c.get().a($$2.a(cgv.e))) {
            return false;
        }
        if (this.d.isPresent() && !this.d.get().a($$2.a(cgv.d))) {
            return false;
        }
        if (this.e.isPresent() && !this.e.get().a($$2.a(cgv.c))) {
            return false;
        }
        if (this.f.isPresent() && !this.f.get().a($$2.a(cgv.g))) {
            return false;
        }
        if (this.g.isPresent() && !this.g.get().a($$2.a(cgv.a))) {
            return false;
        }
        return !this.h.isPresent() || this.h.get().a($$2.a(cgv.b));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bp.class, "head;chest;legs;feet;body;mainhand;offhand", "b", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bp.class, "head;chest;legs;feet;body;mainhand;offhand", "b", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bp.class, "head;chest;legs;feet;body;mainhand;offhand", "b", "c", "d", "e", "f", "g", "h"}, this, $$0);
    }

    public Optional<cg> a() {
        return this.b;
    }

    public Optional<cg> b() {
        return this.c;
    }

    public Optional<cg> c() {
        return this.d;
    }

    public Optional<cg> d() {
        return this.e;
    }

    public Optional<cg> e() {
        return this.f;
    }

    public Optional<cg> f() {
        return this.g;
    }

    public Optional<cg> g() {
        return this.h;
    }

    public static class a {
        private Optional<cg> a = Optional.empty();
        private Optional<cg> b = Optional.empty();
        private Optional<cg> c = Optional.empty();
        private Optional<cg> d = Optional.empty();
        private Optional<cg> e = Optional.empty();
        private Optional<cg> f = Optional.empty();
        private Optional<cg> g = Optional.empty();

        public static a a() {
            return new a();
        }

        public a a(cg.a $$0) {
            this.a = Optional.of($$0.b());
            return this;
        }

        public a b(cg.a $$0) {
            this.b = Optional.of($$0.b());
            return this;
        }

        public a c(cg.a $$0) {
            this.c = Optional.of($$0.b());
            return this;
        }

        public a d(cg.a $$0) {
            this.d = Optional.of($$0.b());
            return this;
        }

        public a e(cg.a $$0) {
            this.e = Optional.of($$0.b());
            return this;
        }

        public a f(cg.a $$0) {
            this.f = Optional.of($$0.b());
            return this;
        }

        public a g(cg.a $$0) {
            this.g = Optional.of($$0.b());
            return this;
        }

        public bp b() {
            return new bp(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
    }
}

