/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class hzk
extends hwp<czm, ifm> {
    public hzk(hwq.a $$0) {
        super($$0);
        this.d = 0.5f;
    }

    @Override
    public void a(ifm $$0, fzm $$1, hpo $$2, ikp $$3) {
        $$1.a();
        $$1.a(0.0f, 0.5f, 0.0f);
        float $$4 = $$0.a;
        if ($$0.a < 10.0f) {
            float $$5 = 1.0f - $$0.a / 10.0f;
            $$5 = bgj.a($$5, 0.0f, 1.0f);
            $$5 *= $$5;
            $$5 *= $$5;
            float $$6 = 1.0f + $$5 * 0.3f;
            $$1.b($$6, $$6, $$6);
        }
        $$1.a((Quaternionfc)a.d.rotationDegrees(-90.0f));
        $$1.a(-0.5f, -0.5f, 0.5f);
        $$1.a((Quaternionfc)a.d.rotationDegrees(90.0f));
        if ($$0.b != null) {
            hzj.a($$0.b, $$1, $$2, $$0.T, (int)$$4 / 5 % 2 == 0, $$0.U);
        }
        $$1.b();
        super.a($$0, $$1, $$2, $$3);
    }

    public ifm a() {
        return new ifm();
    }

    @Override
    public void a(czm $$0, ifm $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = (float)$$0.f() - $$2 + 1.0f;
        $$1.b = $$0.i();
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

