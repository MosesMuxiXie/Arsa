/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 */
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;

public class hsg
implements hri<enn, htf> {
    private final ihk a;
    private final bgr b = bgr.a();

    public hsg(hrj.a $$0) {
        this.a = $$0.c();
    }

    public htf a() {
        return new htf();
    }

    @Override
    public void a(enn $$0, htf $$1, float $$2, ftm $$3, @Nullable igi.a $$4) {
        hri.super.a($$0, $$1, $$2, $$3, $$4);
        dlt $$5 = $$0.c().a();
        if (!enn.a.a($$0.c()) || $$5.f() || $$0.j() == null) {
            return;
        }
        $$1.a = new iec();
        this.a.a($$1.a.a, $$5, dlr.h, $$0.j(), null, 0);
        $$1.a.b = iec.a($$5.N());
        $$1.a.c = iec.a($$5);
        eno $$6 = $$0.d();
        $$1.b = bgj.i($$2, $$6.b(), $$6.a());
    }

    @Override
    public void a(htf $$0, fzm $$1, hpo $$2, ikp $$3) {
        if ($$0.a == null) {
            return;
        }
        $$1.a();
        $$1.a(0.5f, 0.4f, 0.5f);
        $$1.a((Quaternionfc)a.d.rotationDegrees($$0.b));
        hxn.b($$1, $$2, $$0.i, $$0.a, this.b);
        $$1.b();
    }

    @Override
    public /* synthetic */ hsm e() {
        return this.a();
    }
}

