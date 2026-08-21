/*
 * Decompiled with CFR 0.152.
 */
public class hor {
    public static final amo a = amo.b("textures/gui/title/background/panorama_overlay.png");
    private final gfj b;
    private final hnw c;
    private float d;

    public hor(hnw $$0) {
        this.c = $$0;
        this.b = gfj.V();
    }

    public void a(gir $$0, int $$1, int $$2, boolean $$3) {
        if ($$3) {
            float $$4 = this.b.aD().b();
            float $$5 = (float)((double)$$4 * this.b.k.z().b());
            this.d = hor.a(this.d + $$5 * 0.1f, 360.0f);
        }
        this.c.a(this.b, 10.0f, -this.d);
        $$0.a(hpa.at, a, 0, 0, 0.0f, 0.0f, $$1, $$2, 16, 128, 16, 128);
    }

    private static float a(float $$0, float $$1) {
        return $$0 > $$1 ? $$0 - $$1 : $$0;
    }

    public void a(ilr $$0) {
        this.c.a($$0);
    }
}

