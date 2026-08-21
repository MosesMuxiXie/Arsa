/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class hyh
extends hxx<dab, ier, het> {
    private static final amo a = amo.b("textures/entity/phantom.png");

    public hyh(hwq.a $$0) {
        super($$0, new het($$0.a(hdf.cr)), 0.75f);
        this.a(new ibh(this));
    }

    public amo a(ier $$0) {
        return a;
    }

    public ier b() {
        return new ier();
    }

    @Override
    public void a(dab $$0, ier $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = (float)$$0.p() + $$1.L;
        $$1.b = $$0.k();
    }

    @Override
    protected void a(ier $$0, fzm $$1) {
        float $$2 = 1.0f + 0.15f * (float)$$0.b;
        $$1.b($$2, $$2, $$2);
        $$1.a(0.0f, 1.3125f, 0.1875f);
    }

    @Override
    protected void a(ier $$0, fzm $$1, float $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        $$1.a((Quaternionfc)a.b.rotationDegrees($$0.av));
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((ier)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

