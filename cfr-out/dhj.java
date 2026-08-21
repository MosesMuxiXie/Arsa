/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public abstract class dhj
extends diz {
    private final int o;
    private final int p;
    protected final dib m;
    protected final djd n = new djd();

    public dhj(dis<?> $$0, int $$1, int $$2, int $$3) {
        super($$0, $$1);
        this.o = $$2;
        this.p = $$3;
        this.m = new djp(this, $$2, $$3);
    }

    protected dji a(ddm $$0, int $$1, int $$2) {
        return this.a(new dje($$0, this.m, this.n, 0, $$1, $$2));
    }

    protected void d(int $$0, int $$1) {
        for (int $$2 = 0; $$2 < this.o; ++$$2) {
            for (int $$3 = 0; $$3 < this.p; ++$$3) {
                this.a(new dji(this.m, $$3 + $$2 * this.o, $$0 + $$3 * 18, $$1 + $$2 * 18));
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public diz.a a(boolean $$0, boolean $$1, dqx<?> $$2, axf $$3, ddl $$4) {
        dqx<dqh> $$5 = $$2;
        this.l();
        try {
            List<dji> $$6 = this.n();
            diz.a a2 = amf.a(new amf.a<dqh>(){

                @Override
                public void a(ddu $$0) {
                    dhj.this.a($$0);
                }

                @Override
                public void a() {
                    dhj.this.n.a();
                    dhj.this.m.a();
                }

                @Override
                public boolean a(dqx<dqh> $$0) {
                    return $$0.b().a(dhj.this.m.aE_(), dhj.this.q().ao());
                }
            }, this.o, this.p, $$6, $$6, $$4, $$5, $$0, $$1);
            return a2;
        }
        finally {
            this.a($$3, $$5);
        }
    }

    protected void l() {
    }

    protected void a(axf $$0, dqx<dqh> $$1) {
    }

    public abstract dji m();

    public abstract List<dji> n();

    public int o() {
        return this.o;
    }

    public int p() {
        return this.p;
    }

    protected abstract ddm q();

    @Override
    public void a(ddu $$0) {
        this.m.fillStackedContents($$0);
    }
}

