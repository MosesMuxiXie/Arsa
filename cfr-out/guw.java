/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 *  org.jspecify.annotations.Nullable
 */
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;

public class guw
extends gtm {
    public static final float c = 62.500004f;
    public static final float d = 0.9765628f;
    private static final Vector3f e = new Vector3f(0.9765628f, 0.9765628f, 0.9765628f);
    private @Nullable gzp.a f;

    public guw(ems $$0, boolean $$1, boolean $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    protected void bg_() {
        super.bg_();
        boolean $$0 = this.a.o().b() instanceof eia;
        this.f = hrz.a(this.n.aV(), this.b, $$0);
    }

    @Override
    protected float p() {
        return 90.0f;
    }

    @Override
    protected void d(gir $$0) {
        if (this.f == null) {
            return;
        }
        int $$1 = this.o / 2;
        int $$2 = $$1 - 48;
        int $$3 = 66;
        int $$4 = $$1 + 48;
        int $$5 = 168;
        $$0.a(this.f, 62.500004f, this.b, $$2, 66, $$4, 168);
    }

    @Override
    protected Vector3f o() {
        return e;
    }
}

