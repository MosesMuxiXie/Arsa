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

public final class bq
extends Record {
    private final Optional<Boolean> b;
    private final Optional<Boolean> c;
    private final Optional<Boolean> d;
    private final Optional<Boolean> e;
    private final Optional<Boolean> f;
    private final Optional<Boolean> g;
    private final Optional<Boolean> h;
    private final Optional<Boolean> i;
    private final Optional<Boolean> j;
    public static final Codec<bq> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.BOOL.optionalFieldOf("is_on_ground").forGetter(bq::a), (App)Codec.BOOL.optionalFieldOf("is_on_fire").forGetter(bq::b), (App)Codec.BOOL.optionalFieldOf("is_sneaking").forGetter(bq::c), (App)Codec.BOOL.optionalFieldOf("is_sprinting").forGetter(bq::d), (App)Codec.BOOL.optionalFieldOf("is_swimming").forGetter(bq::e), (App)Codec.BOOL.optionalFieldOf("is_flying").forGetter(bq::f), (App)Codec.BOOL.optionalFieldOf("is_baby").forGetter(bq::g), (App)Codec.BOOL.optionalFieldOf("is_in_water").forGetter(bq::h), (App)Codec.BOOL.optionalFieldOf("is_fall_flying").forGetter(bq::i)).apply((Applicative)$$0, bq::new));

    public bq(Optional<Boolean> $$0, Optional<Boolean> $$1, Optional<Boolean> $$2, Optional<Boolean> $$3, Optional<Boolean> $$4, Optional<Boolean> $$5, Optional<Boolean> $$6, Optional<Boolean> $$7, Optional<Boolean> $$8) {
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

    /*
     * Unable to fully structure code
     */
    public boolean a(cgk $$0) {
        block11: {
            if (this.b.isPresent() && $$0.aV() != this.b.get().booleanValue()) {
                return false;
            }
            if (this.c.isPresent() && $$0.cp() != this.c.get().booleanValue()) {
                return false;
            }
            if (this.d.isPresent() && $$0.cz() != this.d.get().booleanValue()) {
                return false;
            }
            if (this.e.isPresent() && $$0.cA() != this.e.get().booleanValue()) {
                return false;
            }
            if (this.f.isPresent() && $$0.cB() != this.f.get().booleanValue()) {
                return false;
            }
            if (!this.g.isPresent()) break block11;
            if (!($$0 instanceof chl)) ** GOTO lbl-1000
            $$1 = (chl)$$0;
            if ($$1.gj()) ** GOTO lbl-1000
            if ($$1 instanceof ddm) {
                $$2 = (ddm)$$1;
                ** if (!$$2.gL().b) goto lbl-1000
            }
            ** GOTO lbl-1000
lbl-1000:
            // 2 sources

            {
                v0 = true;
                ** GOTO lbl22
            }
lbl-1000:
            // 3 sources

            {
                v0 = $$3 = false;
            }
lbl22:
            // 2 sources

            if ($$3 != this.g.get()) {
                return false;
            }
        }
        if (this.i.isPresent() && $$0.by() != this.i.get().booleanValue()) {
            return false;
        }
        if (this.j.isPresent() && $$0 instanceof chl && ($$4 = (chl)$$0).gj() != this.j.get().booleanValue()) {
            return false;
        }
        return this.h.isPresent() == false || $$0 instanceof chl == false || ($$5 = (chl)$$0).e_() == this.h.get().booleanValue();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bq.class, "isOnGround;isOnFire;isCrouching;isSprinting;isSwimming;isFlying;isBaby;isInWater;isFallFlying", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bq.class, "isOnGround;isOnFire;isCrouching;isSprinting;isSwimming;isFlying;isBaby;isInWater;isFallFlying", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bq.class, "isOnGround;isOnFire;isCrouching;isSprinting;isSwimming;isFlying;isBaby;isInWater;isFallFlying", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this, $$0);
    }

    public Optional<Boolean> a() {
        return this.b;
    }

    public Optional<Boolean> b() {
        return this.c;
    }

    public Optional<Boolean> c() {
        return this.d;
    }

    public Optional<Boolean> d() {
        return this.e;
    }

    public Optional<Boolean> e() {
        return this.f;
    }

    public Optional<Boolean> f() {
        return this.g;
    }

    public Optional<Boolean> g() {
        return this.h;
    }

    public Optional<Boolean> h() {
        return this.i;
    }

    public Optional<Boolean> i() {
        return this.j;
    }

    public static class a {
        private Optional<Boolean> a = Optional.empty();
        private Optional<Boolean> b = Optional.empty();
        private Optional<Boolean> c = Optional.empty();
        private Optional<Boolean> d = Optional.empty();
        private Optional<Boolean> e = Optional.empty();
        private Optional<Boolean> f = Optional.empty();
        private Optional<Boolean> g = Optional.empty();
        private Optional<Boolean> h = Optional.empty();
        private Optional<Boolean> i = Optional.empty();

        public static a a() {
            return new a();
        }

        public a a(Boolean $$0) {
            this.a = Optional.of($$0);
            return this;
        }

        public a b(Boolean $$0) {
            this.b = Optional.of($$0);
            return this;
        }

        public a c(Boolean $$0) {
            this.c = Optional.of($$0);
            return this;
        }

        public a d(Boolean $$0) {
            this.d = Optional.of($$0);
            return this;
        }

        public a e(Boolean $$0) {
            this.e = Optional.of($$0);
            return this;
        }

        public a f(Boolean $$0) {
            this.f = Optional.of($$0);
            return this;
        }

        public a g(Boolean $$0) {
            this.g = Optional.of($$0);
            return this;
        }

        public a h(Boolean $$0) {
            this.h = Optional.of($$0);
            return this;
        }

        public a i(Boolean $$0) {
            this.i = Optional.of($$0);
            return this;
        }

        public bq b() {
            return new bq(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }
    }
}

