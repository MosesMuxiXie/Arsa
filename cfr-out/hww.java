/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class hww
extends hwp<ddy, idm> {
    private final ihk a;

    public hww(hwq.a $$0) {
        super($$0);
        this.a = $$0.b();
    }

    @Override
    public void a(idm $$0, fzm $$1, hpo $$2, ikp $$3) {
        $$1.a();
        $$1.a((Quaternionfc)$$3.e);
        if ($$0.a) {
            $$1.a((Quaternionfc)a.f.rotationDegrees(180.0f));
            $$1.a((Quaternionfc)a.d.rotationDegrees(180.0f));
            $$1.a((Quaternionfc)a.b.rotationDegrees(90.0f));
        }
        $$0.b.a($$1, $$2, $$0.T, ilg.d, $$0.U);
        $$1.b();
        super.a($$0, $$1, $$2, $$3);
    }

    public idm a() {
        return new idm();
    }

    @Override
    public void a(ddy $$0, idm $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.f();
        this.a.a($$1.b, $$0.e(), dlr.h, $$0);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

