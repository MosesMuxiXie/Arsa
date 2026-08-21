/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.MapCodec
 */
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class fip
extends fjn {
    public static final MapCodec<fip> a = MapCodec.unit(() -> b);
    public static final fip b = new fip();
    private final Map<dzq, dzq> c = bhs.a(Maps.newHashMap(), $$0 -> {
        $$0.put(dzs.m, dzs.qr);
        $$0.put(dzs.cJ, dzs.qr);
        $$0.put(dzs.b, dzs.qv);
        $$0.put(dzs.fn, dzs.qw);
        $$0.put(dzs.fo, dzs.qw);
        $$0.put(dzs.do, dzs.qs);
        $$0.put(dzs.of, dzs.qs);
        $$0.put(dzs.oh, dzs.qD);
        $$0.put(dzs.fS, dzs.qA);
        $$0.put(dzs.od, dzs.qA);
        $$0.put(dzs.kB, dzs.qu);
        $$0.put(dzs.ot, dzs.qu);
        $$0.put(dzs.kx, dzs.qE);
        $$0.put(dzs.kw, dzs.qE);
        $$0.put(dzs.kD, dzs.qz);
        $$0.put(dzs.or, dzs.qz);
        $$0.put(dzs.oH, dzs.qB);
        $$0.put(dzs.oF, dzs.qB);
        $$0.put(dzs.gE, dzs.qt);
        $$0.put(dzs.gF, dzs.qt);
        $$0.put(dzs.fq, dzs.qy);
        $$0.put(dzs.fp, dzs.qx);
        $$0.put(dzs.fC, dzs.fE);
    });

    private fip() {
    }

    @Override
    public fjq.d a(dwr $$0, is $$1, is $$2, fjq.d $$3, fjq.d $$4, fjm $$5) {
        dzq $$6 = this.c.get($$4.b().b());
        if ($$6 == null) {
            return $$4;
        }
        eoh $$7 = $$4.b();
        eoh $$8 = $$6.m();
        if ($$7.b(ehz.b)) {
            $$8 = (eoh)$$8.b(ehz.b, $$7.c(ehz.b));
        }
        if ($$7.b(ehz.c)) {
            $$8 = (eoh)$$8.b(ehz.c, $$7.c(ehz.c));
        }
        if ($$7.b(ehi.b)) {
            $$8 = (eoh)$$8.b(ehi.b, $$7.c(ehi.b));
        }
        return new fjq.d($$4.a(), $$8, $$4.c());
    }

    @Override
    protected fjp<?> a() {
        return fjp.l;
    }
}

