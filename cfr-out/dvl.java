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
import java.util.Optional;

public class dvl {
    public static final Codec<dvl> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dvj.a.fieldOf("buy").forGetter($$0 -> $$0.c), (App)dvj.a.lenientOptionalFieldOf("buyB").forGetter($$0 -> $$0.d), (App)dlt.b.fieldOf("sell").forGetter($$0 -> $$0.e), (App)Codec.INT.lenientOptionalFieldOf("uses", (Object)0).forGetter($$0 -> $$0.f), (App)Codec.INT.lenientOptionalFieldOf("maxUses", (Object)4).forGetter($$0 -> $$0.g), (App)Codec.BOOL.lenientOptionalFieldOf("rewardExp", (Object)true).forGetter($$0 -> $$0.h), (App)Codec.INT.lenientOptionalFieldOf("specialPrice", (Object)0).forGetter($$0 -> $$0.i), (App)Codec.INT.lenientOptionalFieldOf("demand", (Object)0).forGetter($$0 -> $$0.j), (App)Codec.FLOAT.lenientOptionalFieldOf("priceMultiplier", (Object)Float.valueOf(0.0f)).forGetter($$0 -> Float.valueOf($$0.k)), (App)Codec.INT.lenientOptionalFieldOf("xp", (Object)1).forGetter($$0 -> $$0.l)).apply((Applicative)$$02, dvl::new));
    public static final aao<xq, dvl> b = aao.a(dvl::a, dvl::a);
    private final dvj c;
    private final Optional<dvj> d;
    private final dlt e;
    private int f;
    private final int g;
    private final boolean h;
    private int i;
    private int j;
    private final float k;
    private final int l;

    private dvl(dvj $$0, Optional<dvj> $$1, dlt $$2, int $$3, int $$4, boolean $$5, int $$6, int $$7, float $$8, int $$9) {
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
    }

    public dvl(dvj $$0, dlt $$1, int $$2, int $$3, float $$4) {
        this($$0, Optional.empty(), $$1, $$2, $$3, $$4);
    }

    public dvl(dvj $$0, Optional<dvj> $$1, dlt $$2, int $$3, int $$4, float $$5) {
        this($$0, $$1, $$2, 0, $$3, $$4, $$5);
    }

    public dvl(dvj $$0, Optional<dvj> $$1, dlt $$2, int $$3, int $$4, int $$5, float $$6) {
        this($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0);
    }

    public dvl(dvj $$0, Optional<dvj> $$1, dlt $$2, int $$3, int $$4, int $$5, float $$6, int $$7) {
        this($$0, $$1, $$2, $$3, $$4, true, 0, $$7, $$6, $$5);
    }

    private dvl(dvl $$0) {
        this($$0.c, $$0.d, $$0.e.v(), $$0.f, $$0.g, $$0.h, $$0.i, $$0.j, $$0.k, $$0.l);
    }

    public dlt a() {
        return this.c.d();
    }

    public dlt b() {
        return this.c.d().c(this.a(this.c));
    }

    private int a(dvj $$0) {
        int $$1 = $$0.b();
        int $$2 = Math.max(0, bgj.b((float)($$1 * this.j) * this.k));
        return bgj.a($$1 + $$2 + this.i, 1, $$0.d().k());
    }

    public dlt c() {
        return this.d.map(dvj::d).orElse(dlt.l);
    }

    public dvj d() {
        return this.c;
    }

    public Optional<dvj> e() {
        return this.d;
    }

    public dlt f() {
        return this.e;
    }

    public void g() {
        this.j = this.j + this.f - (this.g - this.f);
    }

    public dlt h() {
        return this.e.v();
    }

    public int i() {
        return this.f;
    }

    public void j() {
        this.f = 0;
    }

    public int k() {
        return this.g;
    }

    public void l() {
        ++this.f;
    }

    public int m() {
        return this.j;
    }

    public void a(int $$0) {
        this.i += $$0;
    }

    public void n() {
        this.i = 0;
    }

    public int o() {
        return this.i;
    }

    public void b(int $$0) {
        this.i = $$0;
    }

    public float p() {
        return this.k;
    }

    public int q() {
        return this.l;
    }

    public boolean r() {
        return this.f >= this.g;
    }

    public void s() {
        this.f = this.g;
    }

    public boolean t() {
        return this.f > 0;
    }

    public boolean u() {
        return this.h;
    }

    public boolean a(dlt $$0, dlt $$1) {
        if (!this.c.a($$0) || $$0.N() < this.a(this.c)) {
            return false;
        }
        if (this.d.isPresent()) {
            return this.d.get().a($$1) && $$1.N() >= this.d.get().b();
        }
        return $$1.f();
    }

    public boolean b(dlt $$0, dlt $$1) {
        if (!this.a($$0, $$1)) {
            return false;
        }
        $$0.h(this.b().N());
        if (!this.c().f()) {
            $$1.h(this.c().N());
        }
        return true;
    }

    public dvl v() {
        return new dvl(this);
    }

    private static void a(xq $$0, dvl $$1) {
        dvj.b.encode($$0, $$1.d());
        dlt.j.encode($$0, $$1.f());
        dvj.c.encode($$0, $$1.e());
        $$0.a($$1.r());
        $$0.q($$1.i());
        $$0.q($$1.k());
        $$0.q($$1.q());
        $$0.q($$1.o());
        $$0.a($$1.p());
        $$0.q($$1.m());
    }

    public static dvl a(xq $$0) {
        dvj $$1 = (dvj)dvj.b.decode($$0);
        dlt $$2 = (dlt)dlt.j.decode($$0);
        Optional $$3 = (Optional)dvj.c.decode($$0);
        boolean $$4 = $$0.readBoolean();
        int $$5 = $$0.readInt();
        int $$6 = $$0.readInt();
        int $$7 = $$0.readInt();
        int $$8 = $$0.readInt();
        float $$9 = $$0.readFloat();
        int $$10 = $$0.readInt();
        dvl $$11 = new dvl($$1, $$3, $$2, $$5, $$6, $$7, $$9, $$10);
        if ($$4) {
            $$11.s();
        }
        $$11.b($$8);
        return $$11;
    }
}

