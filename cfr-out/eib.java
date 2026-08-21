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
import java.util.Optional;

public class eib
extends ejg
implements dzt {
    public static final MapCodec<eib> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)amt.a(mj.i).fieldOf("fruit").forGetter($$0 -> $$0.e), (App)amt.a(mj.i).fieldOf("attached_stem").forGetter($$0 -> $$0.f), (App)amt.a(mj.R).fieldOf("seed").forGetter($$0 -> $$0.g), eib.x()).apply((Applicative)$$02, eib::new));
    public static final int b = 7;
    public static final eph c = eox.az;
    private static final fug[] d = dzq.a(7, (int $$0) -> dzq.b(2.0, 0.0, 2 + $$0 * 2));
    private final amt<dzq> e;
    private final amt<dzq> f;
    private final amt<dlp> g;

    public MapCodec<eib> a() {
        return a;
    }

    protected eib(amt<dzq> $$0, amt<dzq> $$1, amt<dlp> $$2, eog.d $$3) {
        super($$3);
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
        this.l((eoh)((eoh)this.C.b()).b(c, 0));
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return d[$$0.c(c)];
    }

    @Override
    protected boolean b(eoh $$0, dvt $$1, is $$2) {
        return $$0.a(dzs.cZ);
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if ($$1.b($$2, 0) < 9) {
            return;
        }
        float $$4 = ebp.a(this, $$1, $$2);
        if ($$3.a((int)(25.0f / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
                $$0 = (eoh)$$0.b(c, $$5 + 1);
                $$1.a($$2, $$0, 2);
            } else {
                iz $$6 = iz.c.a.a($$3);
                is $$7 = $$2.a($$6);
                eoh $$8 = $$1.a_($$7.e());
                if ($$1.a_($$7).l() && ($$8.a(dzs.cZ) || $$8.a(bdp.ae))) {
                    jq<dzq> $$9 = $$1.J_().f(mj.i);
                    Optional<dzq> $$10 = $$9.f(this.e);
                    Optional<dzq> $$11 = $$9.f(this.f);
                    if ($$10.isPresent() && $$11.isPresent()) {
                        $$1.c($$7, $$10.get().m());
                        $$1.c($$2, (eoh)$$11.get().m().b(edt.f, $$6));
                    }
                }
            }
        }
    }

    @Override
    protected dlt a(dwr $$0, is $$1, eoh $$2, boolean $$3) {
        return new dlt((dwn)DataFixUtils.orElse($$0.J_().f(mj.R).f(this.g), (Object)this));
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        return $$2.c(c) != 7;
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        int $$4 = Math.min(7, $$3.c(c) + bgj.a($$0.y, 2, 5));
        eoh $$5 = (eoh)$$3.b(c, $$4);
        $$0.a($$2, $$5, 2);
        if ($$4 == 7) {
            $$5.b($$0, $$2, $$0.y);
        }
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{c});
    }
}

