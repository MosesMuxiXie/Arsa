/*
 * Decompiled with CFR 0.152.
 */
public class dje
extends dji {
    private final dib a;
    private final ddm b;
    private int g;

    public dje(ddm $$0, dib $$1, ccv $$2, int $$3, int $$4, int $$5) {
        super($$2, $$3, $$4, $$5);
        this.b = $$0;
        this.a = $$1;
    }

    @Override
    public boolean a(dlt $$0) {
        return false;
    }

    @Override
    public dlt a(int $$0) {
        if (this.h()) {
            this.g += Math.min($$0, this.g().N());
        }
        return super.a($$0);
    }

    @Override
    protected void a(dlt $$0, int $$1) {
        this.g += $$1;
        this.c_($$0);
    }

    @Override
    protected void b(int $$0) {
        this.g += $$0;
    }

    @Override
    protected void c_(dlt $$0) {
        ccv ccv2;
        if (this.g > 0) {
            $$0.a(this.b, this.g);
        }
        if ((ccv2 = this.c) instanceof djb) {
            djb $$1 = (djb)((Object)ccv2);
            $$1.a(this.b, this.a.i());
        }
        this.g = 0;
    }

    private static jm<dlt> a(dqg $$0) {
        jm<dlt> $$1 = jm.a($$0.a(), dlt.l);
        for (int $$2 = 0; $$2 < $$1.size(); ++$$2) {
            $$1.set($$2, $$0.a($$2));
        }
        return $$1;
    }

    private jm<dlt> a(dqg $$0, dwo $$12) {
        if ($$12 instanceof axf) {
            axf $$2 = (axf)$$12;
            return $$2.x().a(drd.a, $$0, $$2).map($$1 -> ((dqh)$$1.b()).a($$0)).orElseGet(() -> dje.a($$0));
        }
        return dqh.b($$0);
    }

    @Override
    public void a(ddm $$0, dlt $$1) {
        this.c_($$1);
        dqg.a $$2 = this.a.aF_();
        dqg $$3 = $$2.a();
        int $$4 = $$2.b();
        int $$5 = $$2.c();
        jm<dlt> $$6 = this.a($$3, $$0.ao());
        for (int $$7 = 0; $$7 < $$3.g(); ++$$7) {
            for (int $$8 = 0; $$8 < $$3.f(); ++$$8) {
                int $$9 = $$8 + $$4 + ($$7 + $$5) * this.a.aB_();
                dlt $$10 = this.a.a($$9);
                dlt $$11 = $$6.get($$8 + $$7 * $$3.f());
                if (!$$10.f()) {
                    this.a.a($$9, 1);
                    $$10 = this.a.a($$9);
                }
                if ($$11.f()) continue;
                if ($$10.f()) {
                    this.a.a($$9, $$11);
                    continue;
                }
                if (dlt.c($$10, $$11)) {
                    $$11.g($$10.N());
                    this.a.a($$9, $$11);
                    continue;
                }
                if (this.b.gK().g($$11)) continue;
                this.b.a($$11, false);
            }
        }
    }

    @Override
    public boolean f() {
        return true;
    }
}

