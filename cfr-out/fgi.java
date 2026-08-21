/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Products$P4
 *  com.mojang.datafixers.Products$P5
 *  com.mojang.datafixers.Products$P9
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 */
import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class fgi
extends fgl {
    public static final MapCodec<fgi> a = RecordCodecBuilder.mapCodec($$0 -> fgi.b((RecordCodecBuilder.Instance<fgi>)$$0).apply((Applicative)$$0, fgi::new));
    private final int c;
    private final int d;
    private final int e;
    private final jh<dxo> f;

    private static Products.P9<RecordCodecBuilder.Mu<fgi>, jy, fgl.c, Float, Integer, Optional<fgl.a>, Integer, Integer, Integer, jh<dxo>> b(RecordCodecBuilder.Instance<fgi> $$0) {
        Products.P5<RecordCodecBuilder.Mu<fgi>, jy, fgl.c, Float, Integer, Optional<fgl.a>> $$1 = fgi.a($$0);
        Products.P4 $$2 = $$0.group((App)Codec.intRange((int)0, (int)1023).fieldOf("distance").forGetter(fgi::a), (App)Codec.intRange((int)0, (int)1023).fieldOf("spread").forGetter(fgi::b), (App)Codec.intRange((int)1, (int)4095).fieldOf("count").forGetter(fgi::c), (App)js.a(mj.aS).fieldOf("preferred_biomes").forGetter(fgi::d));
        return new Products.P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
    }

    public fgi(jy $$0, fgl.c $$1, float $$2, int $$3, Optional<fgl.a> $$4, int $$5, int $$6, int $$7, jh<dxo> $$8) {
        super($$0, $$1, $$2, $$3, $$4);
        this.c = $$5;
        this.d = $$6;
        this.e = $$7;
        this.f = $$8;
    }

    public fgi(int $$0, int $$1, int $$2, jh<dxo> $$3) {
        this(jy.i, fgl.c.a, 1.0f, 0, Optional.empty(), $$0, $$1, $$2, $$3);
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public jh<dxo> d() {
        return this.f;
    }

    @Override
    protected boolean a(eqh $$0, int $$1, int $$2) {
        List<dvu> $$3 = $$0.a(this);
        if ($$3 == null) {
            return false;
        }
        return $$3.contains(new dvu($$1, $$2));
    }

    @Override
    public fgm<?> e() {
        return fgm.b;
    }
}

