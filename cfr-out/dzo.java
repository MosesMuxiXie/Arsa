/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;

public class dzo
extends edt
implements dzt,
ehg {
    public static final MapCodec<dzo> a = dzo.b(dzo::new);
    private static final eoy b = eox.I;
    private static final Map<iz, fug> c = fud.c(dzq.b(6.0, 0.0, 16.0).a(0.0, 0.0, 0.25).d());

    public MapCodec<dzo> a() {
        return a;
    }

    protected dzo(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)this.C.b()).b(b, false)).b(f, iz.c));
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return c.get($$0.c(f));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, f);
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(b).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        is $$3 = $$2.e();
        eoh $$4 = $$1.a_($$3);
        eoh $$5 = $$1.a_($$2.d());
        return !(!$$4.a(this) && !$$4.a(bdp.bL) || !$$5.a(this) && !$$5.a(dzs.uc));
    }

    protected static boolean a(dwp $$0, is $$1, flb $$2, iz $$3) {
        eoh $$4 = (eoh)((eoh)dzs.ud.m().b(b, $$2.a(flc.c))).b(f, $$3);
        return $$0.a($$1, $$4, 3);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if (!($$4 != iz.a && $$4 != iz.b || $$0.a($$1, $$3))) {
            $$2.a($$3, this, 1);
        }
        if ($$0.c(b).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (!$$0.a((dwr)$$1, $$2)) {
            $$1.b($$2, true);
        }
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        Optional<is> $$3 = ber.a($$0, $$1, $$2.b(), iz.b, dzs.uc);
        if ($$3.isEmpty()) {
            return false;
        }
        is $$4 = $$3.get().d();
        eoh $$5 = $$0.a_($$4);
        return dzn.a((dwq)$$0, $$4, $$5);
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        Optional<is> $$4 = ber.a($$0, $$2, $$3.b(), iz.b, dzs.uc);
        if ($$4.isEmpty()) {
            return;
        }
        is $$5 = $$4.get();
        is $$6 = $$5.d();
        iz $$7 = (iz)$$3.c(f);
        dzo.a((dwp)$$0, $$5, $$0.b_($$5), $$7);
        dzn.a((dwp)$$0, $$6, $$0.b_($$6), $$7);
    }

    @Override
    protected dlt a(dwr $$0, is $$1, eoh $$2, boolean $$3) {
        return new dlt(dzs.uc);
    }
}

