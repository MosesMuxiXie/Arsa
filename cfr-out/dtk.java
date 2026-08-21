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
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public final class dtk
extends Record
implements dth {
    private final boolean d;
    private final Optional<jd<cez>> e;
    private final Optional<dsv> f;
    private final Optional<jh<dzq>> g;
    private final ftm h;
    private final dsv i;
    private final boolean j;
    private final dwo.a k;
    private final lw l;
    private final lw m;
    private final cbn<lt> n;
    private final jd<bcz> o;
    public static final MapCodec<dtk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.BOOL.optionalFieldOf("attribute_to_user", (Object)false).forGetter(dtk::b), (App)cez.b.optionalFieldOf("damage_type").forGetter(dtk::c), (App)dsv.b.optionalFieldOf("knockback_multiplier").forGetter(dtk::d), (App)js.a(mj.i).optionalFieldOf("immune_blocks").forGetter(dtk::e), (App)ftm.a.optionalFieldOf("offset", (Object)ftm.c).forGetter(dtk::f), (App)dsv.b.fieldOf("radius").forGetter(dtk::g), (App)Codec.BOOL.optionalFieldOf("create_fire", (Object)false).forGetter(dtk::h), (App)dwo.a.f.fieldOf("block_interaction").forGetter(dtk::i), (App)ly.bl.fieldOf("small_particle").forGetter(dtk::j), (App)ly.bl.fieldOf("large_particle").forGetter(dtk::k), (App)cbn.a(lt.a).optionalFieldOf("block_particles", cbn.a()).forGetter(dtk::l), (App)bcz.b.fieldOf("sound").forGetter(dtk::m)).apply((Applicative)$$0, dtk::new));

    public dtk(boolean $$0, Optional<jd<cez>> $$1, Optional<dsv> $$2, Optional<jh<dzq>> $$3, ftm $$4, dsv $$5, boolean $$6, dwo.a $$7, lw $$8, lw $$9, cbn<lt> $$10, jd<bcz> $$11) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4;
        this.i = $$5;
        this.j = $$6;
        this.k = $$7;
        this.l = $$8;
        this.m = $$9;
        this.n = $$10;
        this.o = $$11;
    }

    @Override
    public void a(axf $$0, int $$12, dsn $$2, cgk $$3, ftm $$4) {
        ftm $$5 = $$4.e(this.h);
        $$0.a(this.d ? $$3 : null, this.a($$3, $$5), new dxh(this.k != dwo.a.a, this.e.isPresent(), this.f.map($$1 -> Float.valueOf($$1.a($$12))), this.g), $$5.a(), $$5.b(), $$5.c(), Math.max(this.i.a($$12), 0.0f), this.j, this.k, this.l, this.m, this.n, this.o);
    }

    private @Nullable cex a(cgk $$0, ftm $$1) {
        if (this.e.isEmpty()) {
            return null;
        }
        if (this.d) {
            return new cex(this.e.get(), $$0);
        }
        return new cex(this.e.get(), $$1);
    }

    public MapCodec<dtk> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dtk.class, "attributeToUser;damageType;knockbackMultiplier;immuneBlocks;offset;radius;createFire;blockInteraction;smallParticle;largeParticle;blockParticles;sound", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dtk.class, "attributeToUser;damageType;knockbackMultiplier;immuneBlocks;offset;radius;createFire;blockInteraction;smallParticle;largeParticle;blockParticles;sound", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dtk.class, "attributeToUser;damageType;knockbackMultiplier;immuneBlocks;offset;radius;createFire;blockInteraction;smallParticle;largeParticle;blockParticles;sound", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"}, this, $$0);
    }

    public boolean b() {
        return this.d;
    }

    public Optional<jd<cez>> c() {
        return this.e;
    }

    public Optional<dsv> d() {
        return this.f;
    }

    public Optional<jh<dzq>> e() {
        return this.g;
    }

    public ftm f() {
        return this.h;
    }

    public dsv g() {
        return this.i;
    }

    public boolean h() {
        return this.j;
    }

    public dwo.a i() {
        return this.k;
    }

    public lw j() {
        return this.l;
    }

    public lw k() {
        return this.m;
    }

    public cbn<lt> l() {
        return this.n;
    }

    public jd<bcz> m() {
        return this.o;
    }
}

