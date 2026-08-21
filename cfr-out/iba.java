/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class iba
extends ibj<ieb, hbr> {
    public iba(hyq<ieb, hbr> $$0) {
        super($$0);
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, ieb $$3, float $$4, float $$5) {
        if ($$3.b == 0) {
            return;
        }
        $$0.a();
        hdg $$6 = ((hbr)this.d()).e();
        $$6.a($$0);
        $$0.a(-1.1875f, 1.0625f, -0.9375f);
        $$0.a(0.5f, 0.5f, 0.5f);
        float $$7 = 0.5f;
        $$0.b(0.5f, 0.5f, 0.5f);
        $$0.a((Quaternionfc)a.b.rotationDegrees(-90.0f));
        $$0.a(-0.5f, -0.5f, -0.5f);
        $$1.a($$0, dzs.cd.m(), $$2, ilg.d, $$3.U);
        $$0.b();
    }
}

