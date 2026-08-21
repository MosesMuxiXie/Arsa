/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class gpt
extends gpz<gqm> {
    public gpt(hon.a $$0) {
        super($$0);
    }

    @Override
    public Class<gqm> a() {
        return gqm.class;
    }

    @Override
    protected void a(gqm $$0, fzm $$1) {
        gfj.V().i.t().a(fyd.a.d);
        $$1.a((Quaternionfc)a.d.rotationDegrees(180.0f));
        $$1.a((Quaternionfc)a.b.rotationDegrees(25.0f));
        float $$2 = $$0.d();
        $$1.a((1.0f - $$2) * 0.2f, (1.0f - $$2) * 0.1f, (1.0f - $$2) * 0.25f);
        $$1.a((Quaternionfc)a.d.rotationDegrees(-(1.0f - $$2) * 90.0f - 90.0f));
        $$1.a((Quaternionfc)a.b.rotationDegrees(180.0f));
        float $$3 = $$0.j();
        float $$4 = bgj.a(bgj.g($$3 + 0.25f) * 1.6f - 0.3f, 0.0f, 1.0f);
        float $$5 = bgj.a(bgj.g($$3 + 0.75f) * 1.6f - 0.3f, 0.0f, 1.0f);
        hgr $$6 = $$0.b();
        $$6.a(new hgr.a(0.0f, $$4, $$5, $$2));
        amo $$7 = $$0.c();
        fzp $$8 = this.a.a($$6.a($$7));
        $$6.a($$1, $$8, 0xF000F0, ilg.d);
    }

    @Override
    protected float a(int $$0, int $$1) {
        return 17 * $$1;
    }

    @Override
    protected String b() {
        return "book model";
    }
}

