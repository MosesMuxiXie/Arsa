/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 */
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;

public class gpu
extends gpz<gqn> {
    private final hwo b;

    public gpu(hon.a $$0, hwo $$1) {
        super($$0);
        this.b = $$1;
    }

    @Override
    public Class<gqn> a() {
        return gqn.class;
    }

    @Override
    protected void a(gqn $$0, fzm $$1) {
        gfj.V().i.t().a(fyd.a.d);
        Vector3f $$2 = $$0.c();
        $$1.a($$2.x, $$2.y, $$2.z);
        $$1.a((Quaternionfc)$$0.d());
        Quaternionf $$3 = $$0.j();
        ige $$4 = gfj.V().i.c();
        ikp $$5 = new ikp();
        if ($$3 != null) {
            $$5.e = $$3.conjugate(new Quaternionf()).rotateY((float)Math.PI);
        }
        this.b.a($$0.b(), $$5, 0.0, 0.0, 0.0, $$1, $$4.c());
        $$4.a();
    }

    @Override
    protected float a(int $$0, int $$1) {
        return (float)$$0 / 2.0f;
    }

    @Override
    protected String b() {
        return "entity";
    }
}

