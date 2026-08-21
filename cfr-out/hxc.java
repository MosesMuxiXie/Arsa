/*
 * Decompiled with CFR 0.152.
 */
public class hxc
extends hzc<cxp> {
    private static final amo a = amo.b("textures/entity/squid/glow_squid.png");

    public hxc(hwq.a $$0, hcs $$1, hcs $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    public amo a(ifg $$0) {
        return a;
    }

    @Override
    protected int a(cxp $$0, is $$1) {
        int $$2 = (int)bgj.b(1.0f - (float)$$0.gQ() / 10.0f, 0.0f, 15.0f);
        if ($$2 == 15) {
            return 15;
        }
        return Math.max($$2, super.a($$0, $$1));
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((ifg)ieh2);
    }
}

