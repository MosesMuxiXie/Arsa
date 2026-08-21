/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class dff
extends dey {
    public dff(cgu<? extends dff> $$0, dwo $$1) {
        super((cgu<? extends dey>)$$0, $$1);
    }

    public dff(dwo $$0, chl $$1, dlt $$2) {
        super(cgu.bd, $$0, $$1, $$2);
    }

    public dff(dwo $$0, double $$1, double $$2, double $$3, dlt $$4) {
        super(cgu.bd, $$0, $$1, $$2, $$3, $$4);
    }

    @Override
    protected dlp f() {
        return dlx.xD;
    }

    @Override
    public void a(axf $$0, dlt $$1, ftk $$22) {
        dnr $$3 = $$1.a(ki.Y, dnr.a);
        float $$4 = $$1.a(ki.Z, Float.valueOf(1.0f)).floatValue();
        Iterable<cfm> $$5 = $$3.a();
        fth $$6 = this.dj().c($$22.g().d(this.dI()));
        fth $$7 = $$6.c(4.0, 2.0, 4.0);
        List<chl> $$8 = this.ao().a(chl.class, $$7);
        float $$9 = dee.a(this);
        if (!$$8.isEmpty()) {
            cgk $$10 = this.m();
            for (chl $$11 : $$8) {
                double $$12;
                if (!$$11.gl() || !(($$12 = $$6.d($$11.dj().g($$9))) < 16.0)) continue;
                double $$13 = 1.0 - Math.sqrt($$12) / 4.0;
                for (cfm $$14 : $$5) {
                    jd<cfk> $$15 = $$14.c();
                    if ($$15.a().a()) {
                        $$15.a().a($$0, this, this.p(), $$11, $$14.e(), $$13);
                        continue;
                    }
                    int $$16 = $$14.a($$2 -> (int)($$13 * (double)$$2 * (double)$$4 + 0.5));
                    cfm $$17 = new cfm($$15, $$16, $$14.e(), $$14.f(), $$14.g());
                    if ($$17.a(20)) continue;
                    $$11.b($$17, $$10);
                }
            }
        }
    }
}

