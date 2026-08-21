/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public final class doq
extends Record {
    private final int d;
    private final int e;
    private final Optional<a> f;
    private final Optional<a> g;
    private final Optional<a> h;
    private final float i;
    private final float j;
    private final Optional<jd<bcz>> k;
    private final Optional<jd<bcz>> l;
    public static final int a = 10;
    public static final Codec<doq> b = RecordCodecBuilder.create($$0 -> $$0.group((App)bfm.q.optionalFieldOf("contact_cooldown_ticks", (Object)10).forGetter(doq::b), (App)bfm.q.optionalFieldOf("delay_ticks", (Object)0).forGetter(doq::c), (App)doq$a.a.optionalFieldOf("dismount_conditions").forGetter(doq::d), (App)doq$a.a.optionalFieldOf("knockback_conditions").forGetter(doq::e), (App)doq$a.a.optionalFieldOf("damage_conditions").forGetter(doq::f), (App)Codec.FLOAT.optionalFieldOf("forward_movement", (Object)Float.valueOf(0.0f)).forGetter(doq::g), (App)Codec.FLOAT.optionalFieldOf("damage_multiplier", (Object)Float.valueOf(1.0f)).forGetter(doq::h), (App)bcz.b.optionalFieldOf("sound").forGetter(doq::i), (App)bcz.b.optionalFieldOf("hit_sound").forGetter(doq::j)).apply((Applicative)$$0, doq::new));
    public static final aao<xq, doq> c = aao.a(aam.h, doq::b, aam.h, doq::c, doq$a.b.a(aam::a), doq::d, doq$a.b.a(aam::a), doq::e, doq$a.b.a(aam::a), doq::f, aam.l, doq::g, aam.l, doq::h, bcz.d.a(aam::a), doq::i, bcz.d.a(aam::a), doq::j, doq::new);

    public doq(int $$0, int $$1, Optional<a> $$2, Optional<a> $$3, Optional<a> $$4, float $$5, float $$6, Optional<jd<bcz>> $$7, Optional<jd<bcz>> $$8) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4;
        this.i = $$5;
        this.j = $$6;
        this.k = $$7;
        this.l = $$8;
    }

    public static ftm a(cgk $$0) {
        if (!($$0 instanceof ddm) && $$0.cq()) {
            $$0 = $$0.du();
        }
        return $$0.ah().c(20.0);
    }

    public void b(cgk $$0) {
        this.k.ifPresent($$1 -> $$0.ao().a($$0, $$0.dP(), $$0.dR(), $$0.dV(), (jd<bcz>)$$1, $$0.dB(), 1.0f, 1.0f));
    }

    public void c(cgk $$0) {
        this.l.ifPresent($$1 -> $$0.ao().a($$0, (bcz)$$1.a(), $$0.dB(), 1.0f, 1.0f));
    }

    public int a() {
        return this.e + this.h.map(a::a).orElse(0);
    }

    public void a(dlt $$02, int $$12, chl $$2, cgv $$3) {
        int $$4 = $$02.a($$2) - $$12;
        if ($$4 < this.e) {
            return;
        }
        $$4 -= this.e;
        ftm $$5 = $$2.cj();
        double $$6 = $$5.b(doq.a($$2));
        float $$7 = $$2 instanceof ddm ? 1.0f : 0.2f;
        dnu $$8 = $$2.fz();
        double $$9 = $$2.j(cis.d);
        boolean $$10 = false;
        for (ftj $$11 : (Collection)dee.a((cgk)$$2, $$8, $$1 -> dow.a((cgk)$$2, $$1), dvw.a.a).map($$0 -> List.of(), $$0 -> $$0)) {
            boolean $$19;
            boolean $$14;
            cgk $$122 = $$11.a();
            if ($$122 instanceof cyd) {
                cyd $$13 = (cyd)$$122;
                $$122 = $$13.a;
            }
            if ($$14 = $$2.b($$122, this.d)) continue;
            $$2.E($$122);
            double $$15 = $$5.b(doq.a($$122));
            double $$16 = Math.max(0.0, $$6 - $$15);
            boolean $$17 = this.f.isPresent() && this.f.get().a($$4, $$6, $$16, $$7);
            boolean $$18 = this.g.isPresent() && this.g.get().a($$4, $$6, $$16, $$7);
            boolean bl2 = $$19 = this.h.isPresent() && this.h.get().a($$4, $$6, $$16, $$7);
            if (!$$17 && !$$18 && !$$19) continue;
            float $$20 = (float)$$9 + (float)bgj.c($$16 * (double)this.j);
            $$10 |= $$2.a($$3, $$122, $$20, $$19, $$18, $$17);
        }
        if ($$10) {
            $$2.ao().a((cgk)$$2, (byte)2);
            if ($$2 instanceof axg) {
                axg $$21 = (axg)$$2;
                aj.H.a($$21, $$2.c((cgk $$0) -> $$0 instanceof chl));
            }
        }
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{doq.class, "contactCooldownTicks;delayTicks;dismountConditions;knockbackConditions;damageConditions;forwardMovement;damageMultiplier;sound;hitSound", "d", "e", "f", "g", "h", "i", "j", "k", "l"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{doq.class, "contactCooldownTicks;delayTicks;dismountConditions;knockbackConditions;damageConditions;forwardMovement;damageMultiplier;sound;hitSound", "d", "e", "f", "g", "h", "i", "j", "k", "l"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{doq.class, "contactCooldownTicks;delayTicks;dismountConditions;knockbackConditions;damageConditions;forwardMovement;damageMultiplier;sound;hitSound", "d", "e", "f", "g", "h", "i", "j", "k", "l"}, this, $$0);
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public Optional<a> d() {
        return this.f;
    }

    public Optional<a> e() {
        return this.g;
    }

    public Optional<a> f() {
        return this.h;
    }

    public float g() {
        return this.i;
    }

    public float h() {
        return this.j;
    }

    public Optional<jd<bcz>> i() {
        return this.k;
    }

    public Optional<jd<bcz>> j() {
        return this.l;
    }

    public static final class a
    extends Record {
        private final int c;
        private final float d;
        private final float e;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bfm.q.fieldOf("max_duration_ticks").forGetter(a::a), (App)Codec.FLOAT.optionalFieldOf("min_speed", (Object)Float.valueOf(0.0f)).forGetter(a::b), (App)Codec.FLOAT.optionalFieldOf("min_relative_speed", (Object)Float.valueOf(0.0f)).forGetter(a::c)).apply((Applicative)$$0, a::new));
        public static final aao<ByteBuf, a> b = aao.a(aam.h, a::a, aam.l, a::b, aam.l, a::c, a::new);

        public a(int $$0, float $$1, float $$2) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
        }

        public boolean a(int $$0, double $$1, double $$2, double $$3) {
            return $$0 <= this.c && $$1 >= (double)this.d * $$3 && $$2 >= (double)this.e * $$3;
        }

        public static Optional<a> a(int $$0, float $$1) {
            return Optional.of(new a($$0, $$1, 0.0f));
        }

        public static Optional<a> b(int $$0, float $$1) {
            return Optional.of(new a($$0, 0.0f, $$1));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "maxDurationTicks;minSpeed;minRelativeSpeed", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "maxDurationTicks;minSpeed;minRelativeSpeed", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "maxDurationTicks;minSpeed;minRelativeSpeed", "c", "d", "e"}, this, $$0);
        }

        public int a() {
            return this.c;
        }

        public float b() {
            return this.d;
        }

        public float c() {
            return this.e;
        }
    }
}

