/*
 * Decompiled with CFR 0.152.
 */
public class cgj {
    private static final float a = 0.2617994f;
    private static final float b = -0.2617994f;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private final chl i;

    public cgj(chl $$0) {
        this.i = $$0;
    }

    public void a() {
        float $$11;
        float $$10;
        float $$9;
        this.f = this.c;
        this.g = this.d;
        this.h = this.e;
        if (this.i.gj()) {
            float $$0 = 1.0f;
            ftm $$1 = this.i.dN();
            if ($$1.h < 0.0) {
                ftm $$2 = $$1.d();
                $$0 = 1.0f - (float)Math.pow(-$$2.h, 1.5);
            }
            float $$3 = bgj.h($$0, 0.2617994f, 0.34906584f);
            float $$4 = bgj.h($$0, -0.2617994f, -1.5707964f);
            float $$5 = 0.0f;
        } else if (this.i.cz()) {
            float $$6 = 0.6981317f;
            float $$7 = -0.7853982f;
            float $$8 = 0.08726646f;
        } else {
            $$9 = 0.2617994f;
            $$10 = -0.2617994f;
            $$11 = 0.0f;
        }
        this.c += ($$9 - this.c) * 0.3f;
        this.d += ($$11 - this.d) * 0.3f;
        this.e += ($$10 - this.e) * 0.3f;
    }

    public float a(float $$0) {
        return bgj.h($$0, this.f, this.c);
    }

    public float b(float $$0) {
        return bgj.h($$0, this.g, this.d);
    }

    public float c(float $$0) {
        return bgj.h($$0, this.h, this.e);
    }
}

