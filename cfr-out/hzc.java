/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class hzc<T extends cxq>
extends hvh<T, ifg, hcs> {
    private static final amo a = amo.b("textures/entity/squid/squid.png");

    public hzc(hwq.a $$0, hcs $$1, hcs $$2) {
        super($$0, $$1, $$2, 0.7f);
    }

    public amo a(ifg $$0) {
        return a;
    }

    public ifg b() {
        return new ifg();
    }

    @Override
    public void a(T $$0, ifg $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = bgj.h($$2, ((cxq)$$0).cC, ((cxq)$$0).cB);
        $$1.b = bgj.h($$2, ((cxq)$$0).cw, ((cxq)$$0).cv);
        $$1.c = bgj.h($$2, ((cxq)$$0).cy, ((cxq)$$0).cx);
    }

    @Override
    protected void a(ifg $$0, fzm $$1, float $$2, float $$3) {
        $$1.a(0.0f, $$0.aE ? 0.25f : 0.5f, 0.0f);
        $$1.a((Quaternionfc)a.d.rotationDegrees(180.0f - $$2));
        $$1.a((Quaternionfc)a.b.rotationDegrees($$0.b));
        $$1.a((Quaternionfc)a.d.rotationDegrees($$0.c));
        $$1.a(0.0f, $$0.aE ? -0.6f : -1.2f, 0.0f);
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((ifg)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

