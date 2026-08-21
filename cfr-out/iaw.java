/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class iaw
extends ibj<ido, hbg> {
    public iaw(hyq<ido, hbg> $$0) {
        super($$0);
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, ido $$3, float $$4, float $$5) {
        ihm $$6 = $$3.i;
        if ($$6.e()) {
            return;
        }
        boolean $$7 = $$3.d;
        boolean $$8 = $$3.aE;
        $$0.a();
        $$0.a(((hbg)this.d()).c.b / 16.0f, ((hbg)this.d()).c.c / 16.0f, ((hbg)this.d()).c.d / 16.0f);
        if ($$8) {
            float $$9 = 0.75f;
            $$0.b(0.75f, 0.75f, 0.75f);
        }
        $$0.a((Quaternionfc)a.f.rotation($$3.a));
        $$0.a((Quaternionfc)a.d.rotationDegrees($$4));
        $$0.a((Quaternionfc)a.b.rotationDegrees($$5));
        if ($$3.aE) {
            if ($$7) {
                $$0.a(0.4f, 0.26f, 0.15f);
            } else {
                $$0.a(0.06f, 0.26f, -0.5f);
            }
        } else if ($$7) {
            $$0.a(0.46f, 0.26f, 0.22f);
        } else {
            $$0.a(0.06f, 0.27f, -0.5f);
        }
        $$0.a((Quaternionfc)a.b.rotationDegrees(90.0f));
        if ($$7) {
            $$0.a((Quaternionfc)a.f.rotationDegrees(90.0f));
        }
        $$6.a($$0, $$1, $$2, ilg.d, $$3.U);
        $$0.b();
    }
}

