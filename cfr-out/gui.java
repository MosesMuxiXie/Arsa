/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 */
import org.joml.Vector3f;

public class gui
extends gtm {
    public static final float c = 4.5f;
    private static final Vector3f d = new Vector3f(1.0f, 1.0f, 1.0f);
    private static final int e = 16;
    private static final int f = 16;
    private final amo t;

    public gui(ems $$0, boolean $$1, boolean $$2) {
        super($$0, $$1, $$2, yh.c("hanging_sign.edit"));
        this.t = amo.b("textures/gui/hanging_signs/" + this.b.b() + ".png");
    }

    @Override
    protected float p() {
        return 125.0f;
    }

    @Override
    protected void d(gir $$0) {
        $$0.e().translate(0.0f, -13.0f);
        $$0.e().scale(4.5f, 4.5f);
        $$0.a(hpa.at, this.t, -8, -8, 0.0f, 0.0f, 16, 16, 16, 16);
    }

    @Override
    protected Vector3f o() {
        return d;
    }
}

