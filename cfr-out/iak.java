/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class iak
extends ibj<ide, hee<ide>> {
    public iak(hyq<ide, hee<ide>> $$0) {
        super($$0);
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, ide $$3, float $$4, float $$5) {
        eoh $$6 = $$3.b;
        if ($$6 == null) {
            return;
        }
        $$0.a();
        $$0.a(0.0f, 0.6875f, -0.75f);
        $$0.a((Quaternionfc)a.b.rotationDegrees(20.0f));
        $$0.a((Quaternionfc)a.d.rotationDegrees(45.0f));
        $$0.a(0.25f, 0.1875f, 0.25f);
        float $$7 = 0.5f;
        $$0.b(-0.5f, -0.5f, 0.5f);
        $$0.a((Quaternionfc)a.d.rotationDegrees(90.0f));
        $$1.a($$0, $$6, $$2, ilg.d, $$3.U);
        $$0.b();
    }
}

