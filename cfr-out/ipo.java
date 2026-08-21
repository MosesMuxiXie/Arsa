/*
 * Decompiled with CFR 0.152.
 */
public class ipo
implements iou {
    public static final float a = 0.01f;
    public static final float b = 0.001f;
    public static final float c = 1.0E-4f;
    private static final int d = 0;
    private final hnh e;
    private final iqr f;
    private int g = 0;

    public ipo(hnh $$0, iqr $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    @Override
    public void a() {
        --this.g;
        if (this.g <= 0 && this.e.bC()) {
            float $$0 = this.e.ao().y.i();
            if ($$0 < 1.0E-4f) {
                this.g = 0;
                this.f.a((ipm)new ipp.a(this.e, bda.C));
            } else if ($$0 < 0.001f) {
                this.g = 0;
                this.f.a((ipm)new ipp.a(this.e, bda.B));
            } else if ($$0 < 0.01f) {
                this.g = 0;
                this.f.a((ipm)new ipp.a(this.e, bda.A));
            }
        }
    }
}

