/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class fgj
extends fgl {
    public static final MapCodec<fgj> a = RecordCodecBuilder.mapCodec($$0 -> fgj.a($$0).and($$0.group((App)Codec.intRange((int)0, (int)4096).fieldOf("spacing").forGetter(fgj::a), (App)Codec.intRange((int)0, (int)4096).fieldOf("separation").forGetter(fgj::b), (App)fgk.c.optionalFieldOf("spread_type", (Object)fgk.a).forGetter(fgj::c))).apply((Applicative)$$0, fgj::new)).validate(fgj::a);
    private final int c;
    private final int d;
    private final fgk e;

    private static DataResult<fgj> a(fgj $$0) {
        if ($$0.c <= $$0.d) {
            return DataResult.error(() -> "Spacing has to be larger than separation");
        }
        return DataResult.success((Object)$$0);
    }

    public fgj(jy $$0, fgl.c $$1, float $$2, int $$3, Optional<fgl.a> $$4, int $$5, int $$6, fgk $$7) {
        super($$0, $$1, $$2, $$3, $$4);
        this.c = $$5;
        this.d = $$6;
        this.e = $$7;
    }

    public fgj(int $$0, int $$1, fgk $$2, int $$3) {
        this(jy.i, fgl.c.a, 1.0f, $$3, Optional.empty(), $$0, $$1, $$2);
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.d;
    }

    public fgk c() {
        return this.e;
    }

    public dvu a(long $$0, int $$1, int $$2) {
        int $$3 = Math.floorDiv($$1, this.c);
        int $$4 = Math.floorDiv($$2, this.c);
        evp $$5 = new evp(new eur(0L));
        $$5.a($$0, $$3, $$4, this.i());
        int $$6 = this.c - this.d;
        int $$7 = this.e.a($$5, $$6);
        int $$8 = this.e.a($$5, $$6);
        return new dvu($$3 * this.c + $$7, $$4 * this.c + $$8);
    }

    @Override
    protected boolean a(eqh $$0, int $$1, int $$2) {
        dvu $$3 = this.a($$0.d(), $$1, $$2);
        return $$3.h == $$1 && $$3.i == $$2;
    }

    @Override
    public fgm<?> e() {
        return fgm.a;
    }
}

