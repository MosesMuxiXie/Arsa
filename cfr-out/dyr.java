/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dyr
extends ejg {
    public static final MapCodec<dyr> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)amt.a(mj.i).fieldOf("fruit").forGetter($$0 -> $$0.d), (App)amt.a(mj.i).fieldOf("stem").forGetter($$0 -> $$0.e), (App)amt.a(mj.R).fieldOf("seed").forGetter($$0 -> $$0.f), dyr.x()).apply((Applicative)$$02, dyr::new));
    public static final epf<iz> b = edt.f;
    private static final Map<iz, fug> c = fud.c(dzq.a(4.0, 0.0, 10.0, 0.0, 10.0));
    private final amt<dzq> d;
    private final amt<dzq> e;
    private final amt<dlp> f;

    public MapCodec<dyr> a() {
        return a;
    }

    protected dyr(amt<dzq> $$0, amt<dzq> $$1, amt<dlp> $$2, eog.d $$3) {
        super($$3);
        this.l((eoh)((eoh)this.C.b()).b(b, iz.c));
        this.e = $$0;
        this.d = $$1;
        this.f = $$2;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return c.get($$0.c(b));
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        Optional<dzq> $$8;
        if (!$$6.a(this.d) && $$4 == $$0.c(b) && ($$8 = $$1.J_().f(mj.i).f(this.e)).isPresent()) {
            return (eoh)$$8.get().m().c(eib.c, 7);
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected boolean b(eoh $$0, dvt $$1, is $$2) {
        return $$0.a(dzs.cZ);
    }

    @Override
    protected dlt a(dwr $$0, is $$1, eoh $$2, boolean $$3) {
        return new dlt((dwn)DataFixUtils.orElse($$0.J_().f(mj.R).f(this.f), (Object)this));
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(b, $$1.a($$0.c(b)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a($$0.c(b)));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
    }
}

