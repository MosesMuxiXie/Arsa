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

public final class dun
extends Record {
    private final cgv c;
    private final jd<bcz> d;
    private final Optional<amt<dul>> e;
    private final Optional<amo> f;
    private final Optional<jh<cgu<?>>> g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final jd<bcz> m;
    public static final Codec<dun> a = RecordCodecBuilder.create($$0 -> $$0.group((App)cgv.l.fieldOf("slot").forGetter(dun::b), (App)bcz.b.optionalFieldOf("equip_sound", bda.as).forGetter(dun::c), (App)amt.a(dum.a).optionalFieldOf("asset_id").forGetter(dun::d), (App)amo.a.optionalFieldOf("camera_overlay").forGetter(dun::e), (App)js.a(mj.F).optionalFieldOf("allowed_entities").forGetter(dun::f), (App)Codec.BOOL.optionalFieldOf("dispensable", (Object)true).forGetter(dun::g), (App)Codec.BOOL.optionalFieldOf("swappable", (Object)true).forGetter(dun::h), (App)Codec.BOOL.optionalFieldOf("damage_on_hurt", (Object)true).forGetter(dun::i), (App)Codec.BOOL.optionalFieldOf("equip_on_interact", (Object)false).forGetter(dun::j), (App)Codec.BOOL.optionalFieldOf("can_be_sheared", (Object)false).forGetter(dun::k), (App)bcz.b.optionalFieldOf("shearing_sound", mi.b.e(bda.zy)).forGetter(dun::l)).apply((Applicative)$$0, dun::new));
    public static final aao<xq, dun> b = aao.a(cgv.m, dun::b, bcz.d, dun::c, amt.b(dum.a).a(aam::a), dun::d, amo.b.a(aam::a), dun::e, aam.c(mj.F).a(aam::a), dun::f, aam.b, dun::g, aam.b, dun::h, aam.b, dun::i, aam.b, dun::j, aam.b, dun::k, bcz.d, dun::l, dun::new);

    public dun(cgv $$0, jd<bcz> $$1, Optional<amt<dul>> $$2, Optional<amo> $$3, Optional<jh<cgu<?>>> $$4, boolean $$5, boolean $$6, boolean $$7, boolean $$8, boolean $$9, jd<bcz> $$10) {
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
    }

    public static dun a(dkr $$0) {
        return dun.a(cgv.g).a(bda.qq).a(dum.m.get($$0)).a(cgu.aC, cgu.bG).e(true).b(bda.qr).a();
    }

    public static dun a() {
        je<cgu<?>> $$0 = mi.a(mi.g);
        return dun.a(cgv.h).a(bda.oP).a(dum.l).a($$0.b(bdt.K)).d(true).e(true).b(bda.Hu).a();
    }

    public static dun b(dkr $$0) {
        je<cgu<?>> $$1 = mi.a(mi.g);
        return dun.a(cgv.g).a(bda.oh).a(dum.o.get($$0)).a($$1.b(bdt.L)).d(true).e(true).b(mi.b.e(bda.oi)).a();
    }

    public static a a(cgv $$0) {
        return new a($$0);
    }

    public cdc a(dlt $$0, ddm $$1) {
        if (!$$1.e(this.c) || !this.a($$1.ay())) {
            return cdc.e;
        }
        dlt $$2 = $$1.a(this.c);
        if (dsq.a($$2, dsp.F) && !$$1.ha() || dlt.c($$0, $$2)) {
            return cdc.d;
        }
        if (!$$1.ao().B_()) {
            $$1.b(bdk.c.b($$0.h()));
        }
        if ($$0.N() <= 1) {
            dlt $$3 = $$2.f() ? $$0 : $$2.g();
            dlt $$4 = $$1.ha() ? $$0.v() : $$0.g();
            $$1.a(this.c, $$4);
            return cdc.a.a($$3);
        }
        dlt $$5 = $$2.g();
        dlt $$6 = $$0.b(1, (chl)$$1);
        $$1.a(this.c, $$6);
        if (!$$1.gK().g($$5)) {
            $$1.a($$5, false);
        }
        return cdc.a.a($$0);
    }

    public cdc a(ddm $$0, chl $$1, dlt $$2) {
        if (!$$1.a($$2, this.c) || $$1.d(this.c) || !$$1.cb()) {
            return cdc.e;
        }
        if (!$$0.ao().B_()) {
            $$1.a(this.c, $$2.a(1));
            if ($$1 instanceof chn) {
                chn $$3 = (chn)$$1;
                $$3.g(this.c);
            }
        }
        return cdc.a;
    }

    public boolean a(cgu<?> $$0) {
        return this.g.isEmpty() || this.g.get().a($$0.r());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dun.class, "slot;equipSound;assetId;cameraOverlay;allowedEntities;dispensable;swappable;damageOnHurt;equipOnInteract;canBeSheared;shearingSound", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dun.class, "slot;equipSound;assetId;cameraOverlay;allowedEntities;dispensable;swappable;damageOnHurt;equipOnInteract;canBeSheared;shearingSound", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dun.class, "slot;equipSound;assetId;cameraOverlay;allowedEntities;dispensable;swappable;damageOnHurt;equipOnInteract;canBeSheared;shearingSound", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"}, this, $$0);
    }

    public cgv b() {
        return this.c;
    }

    public jd<bcz> c() {
        return this.d;
    }

    public Optional<amt<dul>> d() {
        return this.e;
    }

    public Optional<amo> e() {
        return this.f;
    }

    public Optional<jh<cgu<?>>> f() {
        return this.g;
    }

    public boolean g() {
        return this.h;
    }

    public boolean h() {
        return this.i;
    }

    public boolean i() {
        return this.j;
    }

    public boolean j() {
        return this.k;
    }

    public boolean k() {
        return this.l;
    }

    public jd<bcz> l() {
        return this.m;
    }

    public static class a {
        private final cgv a;
        private jd<bcz> b = bda.as;
        private Optional<amt<dul>> c = Optional.empty();
        private Optional<amo> d = Optional.empty();
        private Optional<jh<cgu<?>>> e = Optional.empty();
        private boolean f = true;
        private boolean g = true;
        private boolean h = true;
        private boolean i;
        private boolean j;
        private jd<bcz> k = mi.b.e(bda.zy);

        a(cgv $$0) {
            this.a = $$0;
        }

        public a a(jd<bcz> $$0) {
            this.b = $$0;
            return this;
        }

        public a a(amt<dul> $$0) {
            this.c = Optional.of($$0);
            return this;
        }

        public a a(amo $$0) {
            this.d = Optional.of($$0);
            return this;
        }

        public a a(cgu<?> ... $$0) {
            return this.a(jh.a(cgu::r, $$0));
        }

        public a a(jh<cgu<?>> $$0) {
            this.e = Optional.of($$0);
            return this;
        }

        public a a(boolean $$0) {
            this.f = $$0;
            return this;
        }

        public a b(boolean $$0) {
            this.g = $$0;
            return this;
        }

        public a c(boolean $$0) {
            this.h = $$0;
            return this;
        }

        public a d(boolean $$0) {
            this.i = $$0;
            return this;
        }

        public a e(boolean $$0) {
            this.j = $$0;
            return this;
        }

        public a b(jd<bcz> $$0) {
            this.k = $$0;
            return this;
        }

        public dun a() {
            return new dun(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
        }
    }
}

