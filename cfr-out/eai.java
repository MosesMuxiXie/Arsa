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
import java.util.List;
import java.util.Map;

public class eai
extends dyi {
    public static final MapCodec<eai> c = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)mi.e.q().fieldOf("candle").forGetter($$0 -> $$0.h), eai.x()).apply((Applicative)$$02, eai::new));
    public static final eoy d = dyi.b;
    private static final fug e = fud.a(dzq.b(2.0, 8.0, 14.0), dzq.b(14.0, 0.0, 8.0));
    private static final Map<eah, eai> f = Maps.newHashMap();
    private static final Iterable<ftm> g = List.of(new ftm(8.0, 16.0, 8.0).c(0.0625));
    private final eah h;

    public MapCodec<eai> a() {
        return c;
    }

    /*
     * WARNING - void declaration
     */
    protected eai(dzq $$0, eog.d $$1) {
        super($$1);
        void $$3;
        this.l((eoh)((eoh)this.C.b()).b(d, false));
        if (!($$0 instanceof eah)) {
            throw new IllegalArgumentException("Expected block to be of " + String.valueOf(eah.class) + " was " + String.valueOf($$0.getClass()));
        }
        eah $$2 = (eah)$$0;
        f.put((eah)$$3, this);
        this.h = $$3;
    }

    @Override
    protected Iterable<ftm> b(eoh $$0) {
        return g;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return e;
    }

    @Override
    protected cdc a(dlt $$0, eoh $$1, dwo $$2, is $$3, ddm $$4, cdb $$5, fti $$6) {
        if ($$0.a(dlx.pT) || $$0.a(dlx.wi)) {
            return cdc.e;
        }
        if (eai.a($$6) && $$0.f() && $$1.c(d).booleanValue()) {
            eai.a($$4, $$1, (dwp)$$2, $$3);
            return cdc.a;
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        cdc $$5 = eae.a((dwp)$$1, $$2, dzs.eL.m(), $$3);
        if ($$5.a()) {
            eai.b($$0, $$1, $$2);
        }
        return $$5;
    }

    private static boolean a(fti $$0) {
        return $$0.g().h - (double)$$0.b().v() > 0.5;
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{d});
    }

    @Override
    protected dlt a(dwr $$0, is $$1, eoh $$2, boolean $$3) {
        return new dlt(dzs.eL);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4 == iz.a && !$$0.a($$1, $$3)) {
            return dzs.a.m();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        return $$1.a_($$2.e()).e();
    }

    @Override
    protected int a(eoh $$0, dwo $$1, is $$2, iz $$3) {
        return eae.d;
    }

    @Override
    protected boolean c_(eoh $$0) {
        return true;
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }

    public static eoh a(eah $$0) {
        return f.get($$0).m();
    }

    public static boolean h(eoh $$0) {
        return $$0.a(bdp.bx, (eog.a $$1) -> $$1.b(d) && $$0.c(d) == false);
    }
}

