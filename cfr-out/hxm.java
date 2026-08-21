/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class hxm
extends hxx<cwh, ieb, hbr> {
    private static final amo a = amo.b("textures/entity/iron_golem/iron_golem.png");

    public hxm(hwq.a $$0) {
        super($$0, new hbr($$0.a(hdf.bI)), 0.7f);
        this.a(new iaz(this));
        this.a(new iba(this));
    }

    public amo a(ieb $$0) {
        return a;
    }

    public ieb b() {
        return new ieb();
    }

    @Override
    public void a(cwh $$0, ieb $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = (float)$$0.gP() > 0.0f ? (float)$$0.gP() - $$2 : 0.0f;
        $$1.b = $$0.gQ();
        $$1.c = $$0.p();
    }

    @Override
    protected void a(ieb $$0, fzm $$1, float $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        if ((double)$$0.ay < 0.01) {
            return;
        }
        float $$4 = 13.0f;
        float $$5 = $$0.ax + 6.0f;
        float $$6 = (Math.abs($$5 % 13.0f - 6.5f) - 3.25f) / 3.25f;
        $$1.a((Quaternionfc)a.f.rotationDegrees(6.5f * $$6));
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((ieb)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

