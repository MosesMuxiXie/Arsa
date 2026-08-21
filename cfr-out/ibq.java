/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class ibq
extends ibj<iff, hbs> {
    private final hpw a;

    public ibq(hyq<iff, hbs> $$0, hpw $$1) {
        super($$0);
        this.a = $$1;
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, iff $$3, float $$4, float $$5) {
        if (!$$3.a) {
            return;
        }
        if ($$3.Q && !$$3.d()) {
            return;
        }
        $$0.a();
        ((hbs)this.d()).e().a($$0);
        float $$6 = 0.625f;
        $$0.a(0.0f, -0.34375f, 0.0f);
        $$0.a((Quaternionfc)a.d.rotationDegrees(180.0f));
        $$0.b(0.625f, -0.625f, -0.625f);
        eoh $$7 = dzs.eJ.m();
        hqh $$8 = this.a.a($$7);
        int $$9 = hxs.a($$3, 0.0f);
        $$0.a(-0.5f, -0.5f, -0.5f);
        ijs $$10 = $$3.d() && $$3.Q ? ijt.s(ilo.d) : hoe.c($$7);
        $$1.a($$0, $$10, $$8, 0.0f, 0.0f, 0.0f, $$2, $$9, $$3.U);
        $$0.b();
    }
}

