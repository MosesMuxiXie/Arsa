/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import org.jspecify.annotations.Nullable;

public class dkc
extends dlp {
    private final cgu<? extends dgb> a;

    public dkc(cgu<? extends dgb> $$0, dlp.a $$1) {
        super($$1);
        this.a = $$0;
    }

    @Override
    public cdc a(dwo $$0, ddm $$1, cdb $$2) {
        dlt $$3 = $$1.b($$2);
        fti $$4 = dkc.a($$0, $$1, dvw.b.c);
        if (((ftk)$$4).d() == ftk.a.a) {
            return cdc.e;
        }
        ftm $$5 = $$1.h(1.0f);
        double $$6 = 5.0;
        List<cgk> $$7 = $$0.a((cgk)$$1, $$1.dj().b($$5.c(5.0)).g(1.0), cgs.h);
        if (!$$7.isEmpty()) {
            ftm $$8 = $$1.bV();
            for (cgk $$9 : $$7) {
                fth $$10 = $$9.dj().g($$9.ci());
                if (!$$10.d($$8)) continue;
                return cdc.e;
            }
        }
        if (((ftk)$$4).d() == ftk.a.b) {
            dgb $$11 = this.a($$0, $$4, $$3, $$1);
            if ($$11 == null) {
                return cdc.d;
            }
            $$11.v($$1.ec());
            if (!$$0.a((cgk)$$11, $$11.dj())) {
                return cdc.d;
            }
            if (!$$0.B_()) {
                $$0.b($$11);
                $$0.a((cgk)$$1, etk.t, $$4.g());
                $$3.a(1, (chl)$$1);
            }
            $$1.b(bdk.c.b(this));
            return cdc.a;
        }
        return cdc.e;
    }

    private @Nullable dgb a(dwo $$0, ftk $$1, dlt $$2, ddm $$3) {
        dgb $$4 = this.a.a($$0, cgt.m);
        if ($$4 != null) {
            ftm $$5 = $$1.g();
            $$4.o($$5.g, $$5.h, $$5.i);
            if ($$0 instanceof axf) {
                axf $$6 = (axf)$$0;
                cgu.a((dwo)$$6, $$2, $$3).accept($$4);
            }
        }
        return $$4;
    }
}

