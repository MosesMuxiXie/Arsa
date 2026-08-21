/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 */
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;

public class hrv
implements hri<emi, hsx> {
    private final inu a;
    private final hgr b;
    private final hgr.a c = new hgr.a(0.0f, 0.1f, 0.9f, 1.2f);

    public hrv(hrj.a $$0) {
        this.a = $$0.h();
        this.b = new hgr($$0.a(hdf.G));
    }

    public hsx a() {
        return new hsx();
    }

    @Override
    public void a(emi $$0, hsx $$1, float $$2, ftm $$3, @Nullable igi.a $$4) {
        hri.super.a($$0, $$1, $$2, $$3, $$4);
        $$1.a = $$0.o().c(eej.d);
        $$1.b = $$0.o().c(eej.b).h().p();
    }

    @Override
    public void a(hsx $$0, fzm $$1, hpo $$2, ikp $$3) {
        if (!$$0.a) {
            return;
        }
        $$1.a();
        $$1.a(0.5f, 1.0625f, 0.5f);
        $$1.a((Quaternionfc)a.d.rotationDegrees(-$$0.b));
        $$1.a((Quaternionfc)a.f.rotationDegrees(67.5f));
        $$1.a(0.0f, -0.125f, 0.0f);
        $$2.a(this.b, this.c, $$1, hrt.a.a(ijt::d), $$0.i, ilg.d, -1, this.a.a(hrt.a), 0, $$0.j);
        $$1.b();
    }

    @Override
    public /* synthetic */ hsm e() {
        return this.a();
    }
}

