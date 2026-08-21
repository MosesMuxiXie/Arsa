/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

public class djw
extends dlp {
    public djw(dlp.a $$0) {
        super($$0);
    }

    @Override
    public cdc a(dpw $$0) {
        iz $$1 = $$0.k();
        if ($$1 == iz.a) {
            return cdc.d;
        }
        dwo $$2 = $$0.q();
        dpu $$3 = new dpu($$0);
        is $$4 = $$3.a();
        dlt $$5 = $$0.n();
        ftm $$6 = ftm.c($$4);
        fth $$7 = cgu.h.n().a($$6.a(), $$6.b(), $$6.c());
        if (!$$2.a((cgk)null, $$7) || !$$2.a_(null, $$7).isEmpty()) {
            return cdc.d;
        }
        if ($$2 instanceof axf) {
            axf $$8 = (axf)$$2;
            Consumer $$9 = cgu.a((dwo)$$8, $$5, $$0.o());
            cyy $$10 = cgu.h.b($$8, $$9, $$4, cgt.m, true, true);
            if ($$10 == null) {
                return cdc.d;
            }
            float $$11 = (float)bgj.b((bgj.f($$0.i() - 180.0f) + 22.5f) / 45.0f) * 45.0f;
            $$10.b($$10.dP(), $$10.dR(), $$10.dV(), $$11, 0.0f);
            $$8.a_($$10);
            $$2.a(null, $$10.dP(), $$10.dR(), $$10.dV(), bda.aG, bdb.e, 0.75f, 0.8f);
            $$10.a(etk.t, (cgk)$$0.o());
        }
        $$5.h(1);
        return cdc.a;
    }
}

