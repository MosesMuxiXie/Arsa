/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4fStack
 *  org.joml.Quaternionfc
 */
import com.mojang.blaze3d.systems.RenderSystem;
import org.joml.Matrix4fStack;
import org.joml.Quaternionfc;

public class gpx
extends gpz<gqq> {
    public gpx(hon.a $$0) {
        super($$0);
    }

    @Override
    public Class<gqq> a() {
        return gqq.class;
    }

    @Override
    protected void a(gqq $$0, fzm $$1) {
        gfj.V().i.t().a(fyd.a.e);
        int $$2 = gfj.V().aR().s();
        Matrix4fStack $$3 = RenderSystem.getModelViewStack();
        $$3.pushMatrix();
        float $$4 = $$0.a() * (float)$$2;
        $$3.rotateAround((Quaternionfc)a.b.rotationDegrees($$0.d()), 0.0f, $$4 * -$$0.k(), 0.0f);
        $$1.a((Quaternionfc)a.d.rotationDegrees(-$$0.j()));
        $$1.a(0.0f, -1.6010001f, 0.0f);
        ijs $$5 = $$0.b().a($$0.c());
        $$0.b().a($$1, this.a.a($$5), 0xF000F0, ilg.d);
        this.a.b();
        $$3.popMatrix();
    }

    @Override
    protected String b() {
        return "player skin";
    }
}

