/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class hvz
extends hxx<cvi, ieh, hay> {
    private static final amo a = amo.b("textures/entity/fish/cod.png");

    public hvz(hwq.a $$0) {
        super($$0, new hay($$0.a(hdf.ab)), 0.3f);
    }

    @Override
    public amo b(ieh $$0) {
        return a;
    }

    public ieh a() {
        return new ieh();
    }

    @Override
    protected void a(ieh $$0, fzm $$1, float $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        float $$4 = 4.3f * bgj.a((double)(0.6f * $$0.L));
        $$1.a((Quaternionfc)a.d.rotationDegrees($$4));
        if (!$$0.aF) {
            $$1.a(0.1f, 0.1f, -0.1f);
            $$1.a((Quaternionfc)a.f.rotationDegrees(90.0f));
        }
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

