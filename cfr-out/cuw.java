/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class cuw
extends cop {
    private final cuv a;

    public cuw(cuv $$0) {
        this.a = $$0;
    }

    @Override
    public boolean b() {
        return this.a.ao().a(this.a.dP(), this.a.dR(), this.a.dV(), 10.0);
    }

    @Override
    public void a() {
        axf $$0 = (axf)this.a.ao();
        cda $$1 = $$0.c(this.a.dK());
        this.a.x(false);
        this.a.y(true);
        this.a.d_(0);
        chk $$2 = cgu.aB.a($$0, cgt.k);
        if ($$2 == null) {
            return;
        }
        $$2.d(this.a.dP(), this.a.dR(), this.a.dV());
        $$2.a(true);
        $$0.b($$2);
        dby $$3 = this.a($$1, this.a);
        if ($$3 == null) {
            return;
        }
        $$3.o(this.a);
        $$0.a_($$3);
        for (int $$4 = 0; $$4 < 3; ++$$4) {
            dby $$6;
            cup $$5 = this.a($$1);
            if ($$5 == null || ($$6 = this.a($$1, $$5)) == null) continue;
            $$6.o($$5);
            $$5.i(this.a.ep().a(0.0, 1.1485), 0.0, this.a.ep().a(0.0, 1.1485));
            $$0.a_($$5);
        }
    }

    private @Nullable cup a(cda $$0) {
        cuv $$1 = cgu.bo.a(this.a.ao(), cgt.k);
        if ($$1 != null) {
            $$1.a((dxf)((axf)this.a.ao()), $$0, cgt.k, null);
            $$1.a_(this.a.dP(), this.a.dR(), this.a.dV());
            $$1.ax = 60;
            $$1.gz();
            $$1.y(true);
            $$1.d_(0);
        }
        return $$1;
    }

    private @Nullable dby a(cda $$0, cup $$1) {
        dby $$2 = cgu.bn.a($$1.ao(), cgt.k);
        if ($$2 != null) {
            $$2.a((dxf)((axf)$$1.ao()), $$0, cgt.k, null);
            $$2.a_($$1.dP(), $$1.dR(), $$1.dV());
            $$2.ax = 60;
            $$2.gz();
            if ($$2.a(cgv.f).f()) {
                $$2.a(cgv.f, new dlt(dlx.rq));
            }
            this.a($$2, cgv.a, $$0);
            this.a($$2, cgv.f, $$0);
        }
        return $$2;
    }

    private void a(dby $$0, cgv $$1, cda $$2) {
        dlt $$3 = $$0.a($$1);
        $$3.b(ki.o, dsu.a);
        dsq.a($$3, $$0.ao().J_(), duf.a, $$2, $$0.ep());
        $$0.a($$1, $$3);
    }
}

