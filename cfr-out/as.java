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
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public final class as
extends Record {
    private final Optional<jh<dzq>> c;
    private final Optional<dl> d;
    private final Optional<ct> e;
    private final bh f;
    public static final Codec<as> a = RecordCodecBuilder.create($$0 -> $$0.group((App)js.a(mj.i).optionalFieldOf("blocks").forGetter(as::b), (App)dl.a.optionalFieldOf("state").forGetter(as::c), (App)ct.a.optionalFieldOf("nbt").forGetter(as::d), (App)bh.b.forGetter(as::e)).apply((Applicative)$$0, as::new));
    public static final aao<xq, as> b = aao.a(aam.a(aam.c(mj.i)), as::b, aam.a(dl.b), as::c, aam.a(ct.b), as::d, bh.c, as::e, as::new);

    public as(Optional<jh<dzq>> $$0, Optional<dl> $$1, Optional<ct> $$2, bh $$3) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
    }

    public boolean a(axf $$0, is $$1) {
        if (!$$0.t($$1)) {
            return false;
        }
        if (!this.a($$0.a_($$1))) {
            return false;
        }
        if (this.e.isPresent() || !this.f.a()) {
            elb $$2 = $$0.c_($$1);
            if (this.e.isPresent() && !as.a($$0, $$2, this.e.get())) {
                return false;
            }
            if (!this.f.a() && !as.a($$2, this.f)) {
                return false;
            }
        }
        return true;
    }

    public boolean a(eol $$0) {
        if (!this.a($$0.a())) {
            return false;
        }
        return !this.e.isPresent() || as.a($$0.c(), $$0.b(), this.e.get());
    }

    private boolean a(eoh $$0) {
        if (this.c.isPresent() && !$$0.a(this.c.get())) {
            return false;
        }
        return !this.d.isPresent() || this.d.get().a($$0);
    }

    private static boolean a(dwr $$0, @Nullable elb $$1, ct $$2) {
        return $$1 != null && $$2.a($$1.b($$0.J_()));
    }

    private static boolean a(@Nullable elb $$0, bh $$1) {
        return $$0 != null && $$1.a($$0.t());
    }

    public boolean a() {
        return this.e.isPresent();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{as.class, "blocks;properties;nbt;components", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{as.class, "blocks;properties;nbt;components", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{as.class, "blocks;properties;nbt;components", "c", "d", "e", "f"}, this, $$0);
    }

    public Optional<jh<dzq>> b() {
        return this.c;
    }

    public Optional<dl> c() {
        return this.d;
    }

    public Optional<ct> d() {
        return this.e;
    }

    public bh e() {
        return this.f;
    }

    public static class a {
        private Optional<jh<dzq>> a = Optional.empty();
        private Optional<dl> b = Optional.empty();
        private Optional<ct> c = Optional.empty();
        private bh d = bh.a;

        private a() {
        }

        public static a a() {
            return new a();
        }

        public a a(je<dzq> $$0, dzq ... $$1) {
            return this.a($$0, Arrays.asList($$1));
        }

        public a a(je<dzq> $$0, Collection<dzq> $$1) {
            this.a = Optional.of(jh.a(dzq::p, $$1));
            return this;
        }

        public a a(je<dzq> $$0, bef<dzq> $$1) {
            this.a = Optional.of($$0.b($$1));
            return this;
        }

        public a a(uz $$0) {
            this.c = Optional.of(new ct($$0));
            return this;
        }

        public a a(dl.a $$0) {
            this.b = $$0.b();
            return this;
        }

        public a a(bh $$0) {
            this.d = $$0;
            return this;
        }

        public as b() {
            return new as(this.a, this.b, this.c, this.d);
        }
    }
}

