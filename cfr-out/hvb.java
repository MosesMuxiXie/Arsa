/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionf;
import org.joml.Quaternionfc;

public abstract class hvb
extends hwp<dgb, icp> {
    public hvb(hwq.a $$0) {
        super($$0);
        this.d = 0.8f;
    }

    @Override
    public void a(icp $$0, fzm $$1, hpo $$2, ikp $$3) {
        $$1.a();
        $$1.a(0.0f, 0.375f, 0.0f);
        $$1.a((Quaternionfc)a.d.rotationDegrees(180.0f - $$0.a));
        float $$4 = $$0.c;
        if ($$4 > 0.0f) {
            $$1.a((Quaternionfc)a.b.rotationDegrees(bgj.a((double)$$4) * $$4 * $$0.d / 10.0f * (float)$$0.b));
        }
        if (!$$0.f && !bgj.b($$0.e, 0.0f)) {
            $$1.a((Quaternionfc)new Quaternionf().setAngleAxis($$0.e * ((float)Math.PI / 180), 1.0f, 0.0f, 1.0f));
        }
        $$1.b(-1.0f, -1.0f, 1.0f);
        $$1.a((Quaternionfc)a.d.rotationDegrees(90.0f));
        $$2.a(this.a(), $$0, $$1, this.b(), $$0.T, ilg.d, $$0.U, null);
        this.a($$0, $$1, $$2, $$0.T);
        $$1.b();
        super.a($$0, $$1, $$2, $$3);
    }

    protected void a(icp $$0, fzm $$1, hpo $$2, int $$3) {
    }

    protected abstract gzm<icp> a();

    protected abstract ijs b();

    public icp c() {
        return new icp();
    }

    @Override
    public void a(dgb $$0, icp $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.l($$2);
        $$1.c = (float)$$0.m() - $$2;
        $$1.b = $$0.n();
        $$1.d = Math.max($$0.f() - $$2, 0.0f);
        $$1.e = $$0.b($$2);
        $$1.f = $$0.bC();
        $$1.g = $$0.a(0, $$2);
        $$1.h = $$0.a(1, $$2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.c();
    }
}

