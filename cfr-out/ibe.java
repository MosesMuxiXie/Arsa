/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class ibe
extends ibj<iem, hak> {
    private final hpw a;

    public ibe(hyq<iem, hak> $$0, hpw $$1) {
        super($$0);
        this.a = $$1;
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, iem $$3, float $$4, float $$5) {
        boolean $$6;
        if ($$3.aE) {
            return;
        }
        boolean bl2 = $$6 = $$3.d() && $$3.Q;
        if ($$3.Q && !$$6) {
            return;
        }
        eoh $$7 = $$3.a.a();
        int $$8 = hxs.a($$3, 0.0f);
        hqh $$9 = this.a.a($$7);
        $$0.a();
        $$0.a(0.2f, -0.35f, 0.5f);
        $$0.a((Quaternionfc)a.d.rotationDegrees(-48.0f));
        $$0.b(-1.0f, -1.0f, 1.0f);
        $$0.a(-0.5f, -0.5f, -0.5f);
        this.a($$0, $$1, $$2, $$6, $$3.U, $$7, $$8, $$9);
        $$0.b();
        $$0.a();
        $$0.a(0.2f, -0.35f, 0.5f);
        $$0.a((Quaternionfc)a.d.rotationDegrees(42.0f));
        $$0.a(0.1f, 0.0f, -0.6f);
        $$0.a((Quaternionfc)a.d.rotationDegrees(-48.0f));
        $$0.b(-1.0f, -1.0f, 1.0f);
        $$0.a(-0.5f, -0.5f, -0.5f);
        this.a($$0, $$1, $$2, $$6, $$3.U, $$7, $$8, $$9);
        $$0.b();
        $$0.a();
        ((hak)this.d()).g().a($$0);
        $$0.a(0.0f, -0.7f, -0.2f);
        $$0.a((Quaternionfc)a.d.rotationDegrees(-78.0f));
        $$0.b(-1.0f, -1.0f, 1.0f);
        $$0.a(-0.5f, -0.5f, -0.5f);
        this.a($$0, $$1, $$2, $$6, $$3.U, $$7, $$8, $$9);
        $$0.b();
    }

    private void a(fzm $$0, hpo $$1, int $$2, boolean $$3, int $$4, eoh $$5, int $$6, hqh $$7) {
        if ($$3) {
            $$1.a($$0, ijt.s(ilo.d), $$7, 0.0f, 0.0f, 0.0f, $$2, $$6, $$4);
        } else {
            $$1.a($$0, $$5, $$2, $$6, $$4);
        }
    }
}

