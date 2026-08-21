/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class czr
extends czx {
    public static final float a = cgu.Q.l() / cgu.an.l();
    private static final int d = 1200;
    private static final int e = 50;
    private static final int f = 6000;
    private static final int cv = 2;
    private static final int cw = 1200;

    public czr(cgu<? extends czr> $$0, dwo $$1) {
        super((cgu<? extends czx>)$$0, $$1);
        this.gz();
        if (this.c != null) {
            this.c.c(400);
        }
    }

    public static cir.a k() {
        return czx.gQ().a(cis.x, 0.3f).a(cis.d, 8.0).a(cis.u, 80.0);
    }

    @Override
    public int p() {
        return 60;
    }

    @Override
    protected bcz W() {
        return this.by() ? bda.jw : bda.jx;
    }

    @Override
    protected bcz h(cex $$0) {
        return this.by() ? bda.jC : bda.jD;
    }

    @Override
    protected bcz fd() {
        return this.by() ? bda.jz : bda.jA;
    }

    @Override
    protected bcz gP() {
        return bda.jB;
    }

    @Override
    protected void a(axf $$02) {
        super.a($$02);
        if ((this.at + this.aA()) % 1200 == 0) {
            cfm $$1 = new cfm(cfo.d, 6000, 2);
            List<axg> $$2 = cfn.a($$02, this, this.dI(), 50.0, $$1, 1200);
            $$2.forEach($$0 -> $$0.g.b(new aem(aem.l, this.bq() ? 0.0f : 1.0f)));
        }
        if (!this.gF()) {
            this.a(this.dK(), 16);
        }
    }
}

