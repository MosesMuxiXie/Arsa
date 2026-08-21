/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class ecz
extends dzq {
    public static final MapCodec<ecz> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)mi.e.q().fieldOf("potted").forGetter($$0 -> $$0.d), ecz.x()).apply((Applicative)$$02, ecz::new));
    private static final Map<dzq, dzq> b = Maps.newHashMap();
    private static final fug c = dzq.b(6.0, 0.0, 6.0);
    private final dzq d;

    public MapCodec<ecz> a() {
        return a;
    }

    public ecz(dzq $$0, eog.d $$1) {
        super($$1);
        this.d = $$0;
        b.put($$0, this);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return c;
    }

    @Override
    protected cdc a(dlt $$0, eoh $$1, dwo $$2, is $$3, ddm $$4, cdb $$5, fti $$6) {
        dzq dzq2;
        dlp dlp2 = $$0.h();
        if (dlp2 instanceof dkb) {
            dkb $$7 = (dkb)dlp2;
            dzq2 = b.getOrDefault($$7.c(), dzs.a);
        } else {
            dzq2 = dzs.a;
        }
        eoh $$8 = dzq2.m();
        if ($$8.l()) {
            return cdc.f;
        }
        if (!this.q()) {
            return cdc.c;
        }
        $$2.a($$3, $$8, 3);
        $$2.a((cgk)$$4, etk.c, $$3);
        $$4.a(bdk.aj);
        $$0.a(1, (chl)$$4);
        return cdc.a;
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        if (this.q()) {
            return cdc.c;
        }
        dlt $$5 = new dlt(this.d);
        if (!$$3.h($$5)) {
            $$3.a($$5, false);
        }
        $$1.a($$2, dzs.gG.m(), 3);
        $$1.a((cgk)$$3, etk.c, $$2);
        return cdc.a;
    }

    @Override
    protected dlt a(dwr $$0, is $$1, eoh $$2, boolean $$3) {
        if (this.q()) {
            return super.a($$0, $$1, $$2, $$3);
        }
        return new dlt(this.d);
    }

    private boolean q() {
        return this.d == dzs.a;
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4 == iz.a && !$$0.a($$1, $$3)) {
            return dzs.a.m();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    public dzq b() {
        return this.d;
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }

    @Override
    protected boolean f(eoh $$0) {
        return $$0.a(dzs.uY) || $$0.a(dzs.uZ);
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        boolean $$5;
        boolean $$4;
        if (this.f($$0) && ($$4 = this.d == dzs.uW) != ($$5 = $$1.c().a(ceg.H, $$2).b($$4))) {
            $$1.a($$2, this.p($$0), 3);
            eco.a $$6 = eco.a.a($$4).c();
            $$6.a($$1, $$2, $$3);
            $$1.a(null, $$2, $$6.e(), bdb.e, 1.0f, 1.0f);
        }
        super.b($$0, $$1, $$2, $$3);
    }

    public eoh p(eoh $$0) {
        if ($$0.a(dzs.uY)) {
            return dzs.uZ.m();
        }
        if ($$0.a(dzs.uZ)) {
            return dzs.uY.m();
        }
        return $$0;
    }
}

