/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public final class bs
extends Record {
    private final Optional<bv> c;
    private final Optional<bj> d;
    private final Optional<cs> e;
    private final b f;
    private final Optional<cr> g;
    private final Optional<ct> h;
    private final Optional<bq> i;
    private final Optional<bp> j;
    private final Optional<bt> k;
    private final Optional<Integer> l;
    private final Optional<bs> m;
    private final Optional<bs> n;
    private final Optional<bs> o;
    private final Optional<String> p;
    private final Optional<di> q;
    private final bh r;
    public static final Codec<bs> a = Codec.recursive((String)"EntityPredicate", $$0 -> RecordCodecBuilder.create($$1 -> $$1.group((App)bv.a.optionalFieldOf("type").forGetter(bs::a), (App)bj.a.optionalFieldOf("distance").forGetter(bs::b), (App)cs.a.optionalFieldOf("movement").forGetter(bs::c), (App)bs$b.a.forGetter(bs::d), (App)cr.a.optionalFieldOf("effects").forGetter(bs::e), (App)ct.a.optionalFieldOf("nbt").forGetter(bs::f), (App)bq.a.optionalFieldOf("flags").forGetter(bs::g), (App)bp.a.optionalFieldOf("equipment").forGetter(bs::h), (App)bt.a.optionalFieldOf("type_specific").forGetter(bs::i), (App)bfm.r.optionalFieldOf("periodic_tick").forGetter(bs::j), (App)$$0.optionalFieldOf("vehicle").forGetter(bs::k), (App)$$0.optionalFieldOf("passenger").forGetter(bs::l), (App)$$0.optionalFieldOf("targeted_entity").forGetter(bs::m), (App)Codec.STRING.optionalFieldOf("team").forGetter(bs::n), (App)di.a.optionalFieldOf("slots").forGetter(bs::o), (App)bh.b.forGetter(bs::p)).apply((Applicative)$$1, bs::new)));
    public static final Codec<bc> b = Codec.withAlternative(bc.a, a, bs::a);

    public bs(Optional<bv> $$0, Optional<bj> $$1, Optional<cs> $$2, b $$3, Optional<cr> $$4, Optional<ct> $$5, Optional<bq> $$6, Optional<bp> $$7, Optional<bt> $$8, Optional<Integer> $$9, Optional<bs> $$10, Optional<bs> $$11, Optional<bs> $$12, Optional<String> $$13, Optional<di> $$14, bh $$15) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
        this.h = $$5;
        this.i = $$6;
        this.j = $$7;
        this.k = $$8;
        this.l = $$9;
        this.m = $$10;
        this.n = $$11;
        this.o = $$12;
        this.p = $$13;
        this.q = $$14;
        this.r = $$15;
    }

    public static bc a(a $$0) {
        return bs.a($$0.b());
    }

    public static Optional<bc> a(Optional<bs> $$0) {
        return $$0.map(bs::a);
    }

    public static List<bc> a(a ... $$0) {
        return Stream.of($$0).map(bs::a).toList();
    }

    public static bc a(bs $$0) {
        frm $$1 = frp.a(fnz.c.a, $$0).build();
        return new bc(List.of($$1));
    }

    public boolean a(axg $$0, @Nullable cgk $$1) {
        return this.a($$0.A(), $$0.dI(), $$1);
    }

    public boolean a(axf $$0, @Nullable ftm $$1, @Nullable cgk $$22) {
        fum $$7;
        if ($$22 == null) {
            return false;
        }
        if (this.c.isPresent() && !this.c.get().a($$22.ay())) {
            return false;
        }
        if ($$1 == null ? this.d.isPresent() : this.d.isPresent() && !this.d.get().a($$1.g, $$1.h, $$1.i, $$22.dP(), $$22.dR(), $$22.dV())) {
            return false;
        }
        if (this.e.isPresent()) {
            ftm $$3 = $$22.ag();
            ftm $$4 = $$3.c(20.0);
            if (!this.e.get().a($$4.g, $$4.h, $$4.i, $$22.an)) {
                return false;
            }
        }
        if (this.f.b.isPresent() && !this.f.b.get().a($$0, $$22.dP(), $$22.dR(), $$22.dV())) {
            return false;
        }
        if (this.f.c.isPresent()) {
            ftm $$5 = ftm.b($$22.bg());
            if (!$$22.aV() || !this.f.c.get().a($$0, $$5.a(), $$5.b(), $$5.c())) {
                return false;
            }
        }
        if (this.f.d.isPresent()) {
            ftm $$6 = ftm.b($$22.bf());
            if (!this.f.d.get().a($$0, $$6.a(), $$6.b(), $$6.c())) {
                return false;
            }
        }
        if (this.g.isPresent() && !this.g.get().a($$22)) {
            return false;
        }
        if (this.i.isPresent() && !this.i.get().a($$22)) {
            return false;
        }
        if (this.j.isPresent() && !this.j.get().a($$22)) {
            return false;
        }
        if (this.k.isPresent() && !this.k.get().a($$22, $$0, $$1)) {
            return false;
        }
        if (this.m.isPresent() && !this.m.get().a($$0, $$1, $$22.dz())) {
            return false;
        }
        if (this.n.isPresent() && $$22.dn().stream().noneMatch($$2 -> this.n.get().a($$0, $$1, (cgk)$$2))) {
            return false;
        }
        if (this.o.isPresent() && !this.o.get().a($$0, $$1, $$22 instanceof chn ? ((chn)$$22).ag_() : null)) {
            return false;
        }
        if (this.l.isPresent() && $$22.at % this.l.get() != 0) {
            return false;
        }
        if (this.p.isPresent() && (($$7 = $$22.cI()) == null || !this.p.get().equals(((fut)$$7).c()))) {
            return false;
        }
        if (this.q.isPresent() && !this.q.get().a($$22)) {
            return false;
        }
        if (!this.r.a($$22)) {
            return false;
        }
        return this.h.isEmpty() || this.h.get().a($$22);
    }

    public static fnz b(axg $$0, cgk $$1) {
        fod $$2 = new fod.a($$0.A()).a(fqx.a, $$1).a(fqx.h, $$0.dI()).a(fqw.n);
        return new fnz.b($$2).a(Optional.empty());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bs.class, "entityType;distanceToPlayer;movement;location;effects;nbt;flags;equipment;subPredicate;periodicTick;vehicle;passenger;targetedEntity;team;slots;components", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bs.class, "entityType;distanceToPlayer;movement;location;effects;nbt;flags;equipment;subPredicate;periodicTick;vehicle;passenger;targetedEntity;team;slots;components", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bs.class, "entityType;distanceToPlayer;movement;location;effects;nbt;flags;equipment;subPredicate;periodicTick;vehicle;passenger;targetedEntity;team;slots;components", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r"}, this, $$0);
    }

    public Optional<bv> a() {
        return this.c;
    }

    public Optional<bj> b() {
        return this.d;
    }

    public Optional<cs> c() {
        return this.e;
    }

    public b d() {
        return this.f;
    }

    public Optional<cr> e() {
        return this.g;
    }

    public Optional<ct> f() {
        return this.h;
    }

    public Optional<bq> g() {
        return this.i;
    }

    public Optional<bp> h() {
        return this.j;
    }

    public Optional<bt> i() {
        return this.k;
    }

    public Optional<Integer> j() {
        return this.l;
    }

    public Optional<bs> k() {
        return this.m;
    }

    public Optional<bs> l() {
        return this.n;
    }

    public Optional<bs> m() {
        return this.o;
    }

    public Optional<String> n() {
        return this.p;
    }

    public Optional<di> o() {
        return this.q;
    }

    public bh p() {
        return this.r;
    }

    public static final class b
    extends Record {
        final Optional<co> b;
        final Optional<co> c;
        final Optional<co> d;
        public static final MapCodec<b> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)co.a.optionalFieldOf("location").forGetter(b::a), (App)co.a.optionalFieldOf("stepping_on").forGetter(b::b), (App)co.a.optionalFieldOf("movement_affected_by").forGetter(b::c)).apply((Applicative)$$0, b::new));

        public b(Optional<co> $$0, Optional<co> $$1, Optional<co> $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "located;steppingOn;affectsMovement", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "located;steppingOn;affectsMovement", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "located;steppingOn;affectsMovement", "b", "c", "d"}, this, $$0);
        }

        public Optional<co> a() {
            return this.b;
        }

        public Optional<co> b() {
            return this.c;
        }

        public Optional<co> c() {
            return this.d;
        }
    }

    public static class a {
        private Optional<bv> a = Optional.empty();
        private Optional<bj> b = Optional.empty();
        private Optional<cs> c = Optional.empty();
        private Optional<co> d = Optional.empty();
        private Optional<co> e = Optional.empty();
        private Optional<co> f = Optional.empty();
        private Optional<cr> g = Optional.empty();
        private Optional<ct> h = Optional.empty();
        private Optional<bq> i = Optional.empty();
        private Optional<bp> j = Optional.empty();
        private Optional<bt> k = Optional.empty();
        private Optional<Integer> l = Optional.empty();
        private Optional<bs> m = Optional.empty();
        private Optional<bs> n = Optional.empty();
        private Optional<bs> o = Optional.empty();
        private Optional<String> p = Optional.empty();
        private Optional<di> q = Optional.empty();
        private bh r = bh.a;

        public static a a() {
            return new a();
        }

        public a a(je<cgu<?>> $$0, cgu<?> $$1) {
            this.a = Optional.of(bv.a($$0, $$1));
            return this;
        }

        public a a(je<cgu<?>> $$0, bef<cgu<?>> $$1) {
            this.a = Optional.of(bv.a($$0, $$1));
            return this;
        }

        public a a(bv $$0) {
            this.a = Optional.of($$0);
            return this;
        }

        public a a(bj $$0) {
            this.b = Optional.of($$0);
            return this;
        }

        public a a(cs $$0) {
            this.c = Optional.of($$0);
            return this;
        }

        public a a(co.a $$0) {
            this.d = Optional.of($$0.b());
            return this;
        }

        public a b(co.a $$0) {
            this.e = Optional.of($$0.b());
            return this;
        }

        public a c(co.a $$0) {
            this.f = Optional.of($$0.b());
            return this;
        }

        public a a(cr.a $$0) {
            this.g = $$0.b();
            return this;
        }

        public a a(ct $$0) {
            this.h = Optional.of($$0);
            return this;
        }

        public a a(bq.a $$0) {
            this.i = Optional.of($$0.b());
            return this;
        }

        public a a(bp.a $$0) {
            this.j = Optional.of($$0.b());
            return this;
        }

        public a a(bp $$0) {
            this.j = Optional.of($$0);
            return this;
        }

        public a a(bt $$0) {
            this.k = Optional.of($$0);
            return this;
        }

        public a a(int $$0) {
            this.l = Optional.of($$0);
            return this;
        }

        public a a(a $$0) {
            this.m = Optional.of($$0.b());
            return this;
        }

        public a b(a $$0) {
            this.n = Optional.of($$0.b());
            return this;
        }

        public a c(a $$0) {
            this.o = Optional.of($$0.b());
            return this;
        }

        public a a(String $$0) {
            this.p = Optional.of($$0);
            return this;
        }

        public a a(di $$0) {
            this.q = Optional.of($$0);
            return this;
        }

        public a a(bh $$0) {
            this.r = $$0;
            return this;
        }

        public bs b() {
            return new bs(this.a, this.b, this.c, new b(this.d, this.e, this.f), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
        }
    }
}

