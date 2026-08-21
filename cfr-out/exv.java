/*
 * Decompiled with CFR 0.152.
 */
public class exv
extends exx<faj> {
    public static final int a = 4;
    public static final int b = 4;
    public static final int c = 1;
    public static final float d = 0.5f;
    private static final is ap = is.c;
    private final boolean aq;

    public static is a(is $$0) {
        return ap.a($$0);
    }

    public exv(boolean $$0) {
        super(faj.b);
        this.aq = $$0;
    }

    @Override
    public boolean a(exz<faj> $$0) {
        is $$1 = $$0.e();
        dxn $$2 = $$0.b();
        for (is $$3 : is.c(new is($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new is($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
            boolean $$4 = $$3.a($$1, 2.5);
            if (!$$4 && !$$3.a($$1, 3.5)) continue;
            if ($$3.v() < $$1.v()) {
                if ($$4) {
                    this.a((dwv)$$2, $$3, dzs.I.m());
                    continue;
                }
                if ($$3.v() >= $$1.v()) continue;
                if (this.aq) {
                    this.a($$2, $$3, dzs.go);
                    continue;
                }
                this.a((dwv)$$2, $$3, dzs.go.m());
                continue;
            }
            if ($$3.v() > $$1.v()) {
                if (this.aq) {
                    this.a($$2, $$3, dzs.a);
                    continue;
                }
                this.a((dwv)$$2, $$3, dzs.a.m());
                continue;
            }
            if (!$$4) {
                this.a((dwv)$$2, $$3, dzs.I.m());
                continue;
            }
            if (this.aq) {
                this.a($$2, new is($$3), dzs.gm);
                continue;
            }
            this.a((dwv)$$2, new is($$3), dzs.a.m());
        }
        for (int $$5 = 0; $$5 < 4; ++$$5) {
            this.a((dwv)$$2, $$1.b($$5), dzs.I.m());
        }
        is $$6 = $$1.b(2);
        for (iz $$7 : iz.c.a) {
            this.a((dwv)$$2, $$6.a($$7), (eoh)dzs.cM.m().b(ejn.e, $$7));
        }
        return true;
    }

    private void a(dxn $$0, is $$1, dzq $$2) {
        if (!$$0.a_($$1).a($$2)) {
            $$0.a($$1, true, null);
            this.a((dwv)$$0, $$1, $$2.m());
        }
    }
}

