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

public class ewq {
    public static final ewq a = new ewq(false, dzs.hp.m(), dzs.qL.m(), dzs.eO.m(), dzs.aX.m());
    public static final Codec<ewq> b = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.BOOL.optionalFieldOf("debug_mode", (Object)false).forGetter(ewq::a), (App)eoh.a.optionalFieldOf("air_state", (Object)a.b()).forGetter(ewq::b), (App)eoh.a.optionalFieldOf("water_state", (Object)a.b()).forGetter(ewq::c), (App)eoh.a.optionalFieldOf("lava_state", (Object)a.b()).forGetter(ewq::d), (App)eoh.a.optionalFieldOf("barrier_state", (Object)a.b()).forGetter(ewq::e)).apply((Applicative)$$0, ewq::new));
    private final boolean c;
    private final eoh d;
    private final eoh e;
    private final eoh f;
    private final eoh g;

    public static ewq a(boolean $$0, eoh $$1, eoh $$2, eoh $$3, eoh $$4) {
        return new ewq($$0, $$1, $$2, $$3, $$4);
    }

    public static ewq a(eoh $$0, eoh $$1, eoh $$2, eoh $$3) {
        return new ewq(false, $$0, $$1, $$2, $$3);
    }

    public static ewq a(boolean $$0, eoh $$1) {
        return new ewq($$0, $$1, a.c(), a.d(), a.e());
    }

    private ewq(boolean $$0, eoh $$1, eoh $$2, eoh $$3, eoh $$4) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
    }

    public boolean a() {
        return this.c;
    }

    public eoh b() {
        return this.d;
    }

    public eoh c() {
        return this.e;
    }

    public eoh d() {
        return this.f;
    }

    public eoh e() {
        return this.g;
    }
}

