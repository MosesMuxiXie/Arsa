/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class hyt
extends hwp<def, ifa> {
    private static final amo a = amo.b("textures/entity/shulker/spark.png");
    private static final ijs f = ijt.j(a);
    private final hhf g;

    public hyt(hwq.a $$0) {
        super($$0);
        this.g = new hhf($$0.a(hdf.dg));
    }

    @Override
    protected int a(def $$0, is $$1) {
        return 15;
    }

    @Override
    public void a(ifa $$0, fzm $$1, hpo $$2, ikp $$3) {
        $$1.a();
        float $$4 = $$0.L;
        $$1.a(0.0f, 0.15f, 0.0f);
        $$1.a((Quaternionfc)a.d.rotationDegrees(bgj.a((double)($$4 * 0.1f)) * 180.0f));
        $$1.a((Quaternionfc)a.b.rotationDegrees(bgj.b((double)($$4 * 0.1f)) * 180.0f));
        $$1.a((Quaternionfc)a.f.rotationDegrees(bgj.a((double)($$4 * 0.15f)) * 360.0f));
        $$1.b(-0.5f, -0.5f, 0.5f);
        $$2.a(this.g, $$0, $$1, this.g.a(a), $$0.T, ilg.d, $$0.U, null);
        $$1.b(1.5f, 1.5f, 1.5f);
        $$2.a(1).a(this.g, $$0, $$1, f, $$0.T, ilg.d, 0x26FFFFFF, null, $$0.U, null);
        $$1.b();
        super.a($$0, $$1, $$2, $$3);
    }

    public ifa a() {
        return new ifa();
    }

    @Override
    public void a(def $$0, ifa $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.b = $$0.l($$2);
        $$1.a = $$0.k($$2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

