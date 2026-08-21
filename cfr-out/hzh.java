/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import java.util.List;
import org.joml.Quaternionfc;

public class hzh
extends hwp<dek, ifk> {
    public static final amo a = amo.b("textures/entity/trident.png");
    private final hhg f;

    public hzh(hwq.a $$0) {
        super($$0);
        this.f = new hhg($$0.a(hdf.dL));
    }

    @Override
    public void a(ifk $$0, fzm $$1, hpo $$2, ikp $$3) {
        $$1.a();
        $$1.a((Quaternionfc)a.d.rotationDegrees($$0.b - 90.0f));
        $$1.a((Quaternionfc)a.f.rotationDegrees($$0.a + 90.0f));
        List<ijs> $$4 = hxp.a(this.f.a(a), false, $$0.c);
        for (int $$5 = 0; $$5 < $$4.size(); ++$$5) {
            $$2.a($$5).a(this.f, bhr.a, $$1, $$4.get($$5), $$0.T, ilg.d, -1, null, $$0.U, null);
        }
        $$1.b();
        super.a($$0, $$1, $$2, $$3);
    }

    public ifk a() {
        return new ifk();
    }

    @Override
    public void a(dek $$0, ifk $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.b = $$0.l($$2);
        $$1.a = $$0.k($$2);
        $$1.c = $$0.A();
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

