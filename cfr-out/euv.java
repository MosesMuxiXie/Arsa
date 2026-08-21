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
import java.util.List;

public final class euv
extends Record {
    private final euy j;
    private final eoh k;
    private final eoh l;
    private final euw m;
    private final evh.o n;
    private final List<dxx.d> o;
    private final int p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final boolean t;
    public static final Codec<euv> a = RecordCodecBuilder.create($$0 -> $$0.group((App)euy.a.fieldOf("noise").forGetter(euv::f), (App)eoh.a.fieldOf("default_block").forGetter(euv::g), (App)eoh.a.fieldOf("default_fluid").forGetter(euv::h), (App)euw.a.fieldOf("noise_router").forGetter(euv::i), (App)evh.o.b.fieldOf("surface_rule").forGetter(euv::j), (App)dxx.d.a.listOf().fieldOf("spawn_target").forGetter(euv::k), (App)Codec.INT.fieldOf("sea_level").forGetter(euv::l), (App)Codec.BOOL.fieldOf("disable_mob_generation").forGetter(euv::a), (App)Codec.BOOL.fieldOf("aquifers_enabled").forGetter(euv::b), (App)Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(euv::c), (App)Codec.BOOL.fieldOf("legacy_random_source").forGetter(euv::n)).apply((Applicative)$$0, euv::new));
    public static final Codec<jd<euv>> b = amq.a(mj.bl, a);
    public static final amt<euv> c = amt.a(mj.bl, amo.b("overworld"));
    public static final amt<euv> d = amt.a(mj.bl, amo.b("large_biomes"));
    public static final amt<euv> e = amt.a(mj.bl, amo.b("amplified"));
    public static final amt<euv> f = amt.a(mj.bl, amo.b("nether"));
    public static final amt<euv> g = amt.a(mj.bl, amo.b("end"));
    public static final amt<euv> h = amt.a(mj.bl, amo.b("caves"));
    public static final amt<euv> i = amt.a(mj.bl, amo.b("floating_islands"));

    public euv(euy $$0, eoh $$1, eoh $$2, euw $$3, evh.o $$4, List<dxx.d> $$5, int $$6, boolean $$7, boolean $$8, boolean $$9, boolean $$10) {
        this.j = $$0;
        this.k = $$1;
        this.l = $$2;
        this.m = $$3;
        this.n = $$4;
        this.o = $$5;
        this.p = $$6;
        this.q = $$7;
        this.r = $$8;
        this.s = $$9;
        this.t = $$10;
    }

    @Deprecated
    public boolean a() {
        return this.q;
    }

    public boolean b() {
        return this.r && !w.az;
    }

    public boolean c() {
        return this.s && !w.aE;
    }

    public evp.a d() {
        return this.t ? evp.a.a : evp.a.b;
    }

    public static void a(qr<euv> $$0) {
        $$0.a(c, euv.a($$0, false, false));
        $$0.a(d, euv.a($$0, false, true));
        $$0.a(e, euv.a($$0, true, false));
        $$0.a(f, euv.c($$0));
        $$0.a(g, euv.b($$0));
        $$0.a(h, euv.d($$0));
        $$0.a(i, euv.e($$0));
    }

    private static euv b(qr<?> $$0) {
        return new euv(euy.d, dzs.go.m(), dzs.a.m(), eux.a($$0.a(mj.bb)), re.c(), List.of(), 0, true, false, false, true);
    }

    private static euv c(qr<?> $$0) {
        return new euv(euy.c, dzs.ey.m(), dzs.K.m(), eux.a($$0.a(mj.bb), $$0.a(mj.bm)), re.b(), List.of(), 32, false, false, false, true);
    }

    private static euv a(qr<?> $$0, boolean $$1, boolean $$2) {
        return new euv(euy.b, dzs.b.m(), dzs.J.m(), eux.a($$0.a(mj.bb), $$0.a(mj.bm), $$2, $$1), re.a(), new dye().a(), 63, false, true, true, false);
    }

    private static euv d(qr<?> $$0) {
        return new euv(euy.e, dzs.b.m(), dzs.J.m(), eux.b($$0.a(mj.bb), $$0.a(mj.bm)), re.a(false, true, true), List.of(), 32, false, false, false, true);
    }

    private static euv e(qr<?> $$0) {
        return new euv(euy.f, dzs.b.m(), dzs.J.m(), eux.c($$0.a(mj.bb), $$0.a(mj.bm)), re.a(false, false, false), List.of(), -64, false, false, false, true);
    }

    public static euv e() {
        return new euv(euy.b, dzs.b.m(), dzs.a.m(), eux.a(), re.d(), List.of(), 63, true, false, false, false);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{euv.class, "noiseSettings;defaultBlock;defaultFluid;noiseRouter;surfaceRule;spawnTarget;seaLevel;disableMobGeneration;aquifersEnabled;oreVeinsEnabled;useLegacyRandomSource", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{euv.class, "noiseSettings;defaultBlock;defaultFluid;noiseRouter;surfaceRule;spawnTarget;seaLevel;disableMobGeneration;aquifersEnabled;oreVeinsEnabled;useLegacyRandomSource", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{euv.class, "noiseSettings;defaultBlock;defaultFluid;noiseRouter;surfaceRule;spawnTarget;seaLevel;disableMobGeneration;aquifersEnabled;oreVeinsEnabled;useLegacyRandomSource", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t"}, this, $$0);
    }

    public euy f() {
        return this.j;
    }

    public eoh g() {
        return this.k;
    }

    public eoh h() {
        return this.l;
    }

    public euw i() {
        return this.m;
    }

    public evh.o j() {
        return this.n;
    }

    public List<dxx.d> k() {
        return this.o;
    }

    public int l() {
        return this.p;
    }

    public boolean m() {
        return this.r;
    }

    public boolean n() {
        return this.t;
    }
}

