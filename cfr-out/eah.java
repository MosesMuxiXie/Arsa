/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 */
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class eah
extends dyi
implements ehg {
    public static final MapCodec<eah> c = eah.b(eah::new);
    public static final int d = 1;
    public static final int e = 4;
    public static final eph f = eox.aD;
    public static final eoy g = dyi.b;
    public static final eoy h = eox.I;
    public static final ToIntFunction<eoh> i = $$0 -> $$0.c(g) != false ? 3 * $$0.c(f) : 0;
    private static final Int2ObjectMap<List<ftm>> D = (Int2ObjectMap)bhs.a(new Int2ObjectOpenHashMap(4), (? super T $$0) -> {
        float $$1 = 0.0625f;
        $$0.put(1, List.of(new ftm(8.0, 8.0, 8.0).c(0.0625)));
        $$0.put(2, List.of(new ftm(6.0, 7.0, 8.0).c(0.0625), new ftm(10.0, 8.0, 7.0).c(0.0625)));
        $$0.put(3, List.of(new ftm(8.0, 5.0, 10.0).c(0.0625), new ftm(6.0, 7.0, 8.0).c(0.0625), new ftm(9.0, 8.0, 7.0).c(0.0625)));
        $$0.put(4, List.of(new ftm(7.0, 5.0, 9.0).c(0.0625), new ftm(10.0, 7.0, 9.0).c(0.0625), new ftm(6.0, 7.0, 6.0).c(0.0625), new ftm(9.0, 8.0, 6.0).c(0.0625)));
    });
    private static final fug[] R = new fug[]{dzq.b(2.0, 0.0, 6.0), dzq.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0), dzq.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0), dzq.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0)};

    public MapCodec<eah> a() {
        return c;
    }

    public eah(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)((eoh)this.C.b()).b(f, 1)).b(g, false)).b(h, false));
    }

    @Override
    protected cdc a(dlt $$0, eoh $$1, dwo $$2, is $$3, ddm $$4, cdb $$5, fti $$6) {
        if ($$0.f() && $$4.gL().e && $$1.c(g).booleanValue()) {
            eah.a($$4, $$1, (dwp)$$2, $$3);
            return cdc.a;
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
    }

    @Override
    protected boolean a(eoh $$0, dpu $$1) {
        if (!$$1.h() && $$1.n().h() == this.h() && $$0.c(f) < 4) {
            return true;
        }
        return super.a($$0, $$1);
    }

    @Override
    public eoh a(dpu $$0) {
        eoh $$1 = $$0.q().a_($$0.a());
        if ($$1.a(this)) {
            return (eoh)$$1.a(f);
        }
        flb $$2 = $$0.q().b_($$0.a());
        boolean $$3 = $$2.a() == flc.c;
        return (eoh)super.a($$0).b(h, $$3);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(h).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(h).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return R[$$0.c(f) - 1];
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(f, g, h);
    }

    @Override
    public boolean a(dwp $$0, is $$1, eoh $$2, flb $$3) {
        if ($$2.c(h).booleanValue() || $$3.a() != flc.c) {
            return false;
        }
        eoh $$4 = (eoh)$$2.b(h, true);
        if ($$2.c(g).booleanValue()) {
            eah.a(null, $$4, $$0, $$1);
        } else {
            $$0.a($$1, $$4, 3);
        }
        $$0.a($$1, $$3.a(), $$3.a().a($$0));
        return true;
    }

    public static boolean h(eoh $$02) {
        return $$02.a(bdp.U, (eog.a $$0) -> $$0.b(g) && $$0.b(h)) && $$02.c(g) == false && $$02.c(h) == false;
    }

    @Override
    protected Iterable<ftm> b(eoh $$0) {
        return (Iterable)D.get($$0.c(f).intValue());
    }

    @Override
    protected boolean d(eoh $$0) {
        return $$0.c(h) == false && super.d($$0);
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        return dzq.a($$1, $$2.e(), iz.b);
    }
}

