/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class hxu
extends hwp<deb, iej> {
    private static final amo a = amo.b("textures/entity/llama/spit.png");
    private final hbv f;

    public hxu(hwq.a $$0) {
        super($$0);
        this.f = new hbv($$0.a(hdf.bQ));
    }

    @Override
    public void a(iej $$0, fzm $$1, hpo $$2, ikp $$3) {
        $$1.a();
        $$1.a(0.0f, 0.15f, 0.0f);
        $$1.a((Quaternionfc)a.d.rotationDegrees($$0.a - 90.0f));
        $$1.a((Quaternionfc)a.f.rotationDegrees($$0.b));
        $$2.a(this.f, $$0, $$1, this.f.a(a), $$0.T, ilg.d, $$0.U, null);
        $$1.b();
        super.a($$0, $$1, $$2, $$3);
    }

    public iej a() {
        return new iej();
    }

    @Override
    public void a(deb $$0, iej $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.b = $$0.k($$2);
        $$1.a = $$0.l($$2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

