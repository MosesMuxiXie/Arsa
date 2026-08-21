/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class hws
extends hwp<ddw, idh> {
    private static final amo a = amo.b("textures/entity/illager/evoker_fangs.png");
    private final hcy f;

    public hws(hwq.a $$0) {
        super($$0);
        this.f = new hcy($$0.a(hdf.bb));
    }

    @Override
    public void a(idh $$0, fzm $$1, hpo $$2, ikp $$3) {
        float $$4 = $$0.b;
        if ($$4 == 0.0f) {
            return;
        }
        $$1.a();
        $$1.a((Quaternionfc)a.d.rotationDegrees(90.0f - $$0.a));
        $$1.b(-1.0f, -1.0f, 1.0f);
        $$1.a(0.0f, -1.501f, 0.0f);
        $$2.a(this.f, $$0, $$1, this.f.a(a), $$0.T, ilg.d, $$0.U, null);
        $$1.b();
        super.a($$0, $$1, $$2, $$3);
    }

    public idh a() {
        return new idh();
    }

    @Override
    public void a(ddw $$0, idh $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.ec();
        $$1.b = $$0.a($$2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

