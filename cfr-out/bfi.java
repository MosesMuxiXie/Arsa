/*
 * Decompiled with CFR 0.152.
 */
public class bfi {
    public static float a(float $$0) {
        float $$1 = 1.70158f;
        float $$2 = 2.70158f;
        return bgj.j($$0) * (2.70158f * $$0 - 1.70158f);
    }

    public static float b(float $$0) {
        return 1.0f - bfi.o(1.0f - $$0);
    }

    public static float c(float $$0) {
        return bgj.k($$0);
    }

    public static float d(float $$0) {
        if ($$0 == 0.0f) {
            return 0.0f;
        }
        if ($$0 == 1.0f) {
            return 1.0f;
        }
        float $$1 = 2.0943952f;
        return (float)(-Math.pow(2.0, 10.0 * (double)$$0 - 10.0) * Math.sin(((double)$$0 * 10.0 - 10.75) * 2.094395160675049));
    }

    public static float e(float $$0) {
        return $$0 == 0.0f ? 0.0f : (float)Math.pow(2.0, 10.0 * (double)$$0 - 10.0);
    }

    public static float f(float $$0) {
        return bgj.j(bgj.j($$0));
    }

    public static float g(float $$0) {
        return bgj.j(bgj.j($$0)) * $$0;
    }

    public static float h(float $$0) {
        return 1.0f - bgj.b((double)($$0 * 1.5707964f));
    }

    public static float i(float $$0) {
        if ($$0 < 0.5f) {
            return (1.0f - bfi.o(1.0f - 2.0f * $$0)) / 2.0f;
        }
        return (1.0f + bfi.o(2.0f * $$0 - 1.0f)) / 2.0f;
    }

    public static float j(float $$0) {
        if ($$0 < 0.5f) {
            return (float)((1.0 - Math.sqrt(1.0 - Math.pow(2.0 * (double)$$0, 2.0))) / 2.0);
        }
        return (float)((Math.sqrt(1.0 - Math.pow(-2.0 * (double)$$0 + 2.0, 2.0)) + 1.0) / 2.0);
    }

    public static float k(float $$0) {
        if ($$0 < 0.5f) {
            return 4.0f * bgj.k($$0);
        }
        return (float)(1.0 - Math.pow(-2.0 * (double)$$0 + 2.0, 3.0) / 2.0);
    }

    public static float l(float $$0) {
        if ($$0 < 0.5f) {
            return 2.0f * bgj.j($$0);
        }
        return (float)(1.0 - Math.pow(-2.0 * (double)$$0 + 2.0, 2.0) / 2.0);
    }

    public static float m(float $$0) {
        if ($$0 < 0.5f) {
            return 8.0f * bgj.j(bgj.j($$0));
        }
        return (float)(1.0 - Math.pow(-2.0 * (double)$$0 + 2.0, 4.0) / 2.0);
    }

    public static float n(float $$0) {
        if ((double)$$0 < 0.5) {
            return 16.0f * $$0 * $$0 * $$0 * $$0 * $$0;
        }
        return (float)(1.0 - Math.pow(-2.0 * (double)$$0 + 2.0, 5.0) / 2.0);
    }

    public static float o(float $$0) {
        float $$1 = 7.5625f;
        float $$2 = 2.75f;
        if ($$0 < 0.36363637f) {
            return 7.5625f * bgj.j($$0);
        }
        if ($$0 < 0.72727275f) {
            return 7.5625f * bgj.j($$0 - 0.54545456f) + 0.75f;
        }
        if ((double)$$0 < 0.9090909090909091) {
            return 7.5625f * bgj.j($$0 - 0.8181818f) + 0.9375f;
        }
        return 7.5625f * bgj.j($$0 - 0.95454544f) + 0.984375f;
    }

    public static float p(float $$0) {
        float $$1 = 2.0943952f;
        if ($$0 == 0.0f) {
            return 0.0f;
        }
        if ($$0 == 1.0f) {
            return 1.0f;
        }
        return (float)(Math.pow(2.0, -10.0 * (double)$$0) * Math.sin(((double)$$0 * 10.0 - 0.75) * 2.094395160675049) + 1.0);
    }

    public static float q(float $$0) {
        if ($$0 == 1.0f) {
            return 1.0f;
        }
        return 1.0f - (float)Math.pow(2.0, -10.0 * (double)$$0);
    }

    public static float r(float $$0) {
        return 1.0f - bgj.j(1.0f - $$0);
    }

    public static float s(float $$0) {
        return 1.0f - (float)Math.pow(1.0 - (double)$$0, 5.0);
    }

    public static float t(float $$0) {
        return bgj.a((double)($$0 * 1.5707964f));
    }

    public static float u(float $$0) {
        return -(bgj.b((double)((float)Math.PI * $$0)) - 1.0f) / 2.0f;
    }

    public static float v(float $$0) {
        float $$1 = 1.70158f;
        float $$2 = 2.70158f;
        return 1.0f + 2.70158f * bgj.k($$0 - 1.0f) + 1.70158f * bgj.j($$0 - 1.0f);
    }

    public static float w(float $$0) {
        return 1.0f - bgj.j(bgj.j(1.0f - $$0));
    }

    public static float x(float $$0) {
        return 1.0f - bgj.k(1.0f - $$0);
    }

    public static float y(float $$0) {
        if ($$0 < 0.5f) {
            return $$0 == 0.0f ? 0.0f : (float)(Math.pow(2.0, 20.0 * (double)$$0 - 10.0) / 2.0);
        }
        return $$0 == 1.0f ? 1.0f : (float)((2.0 - Math.pow(2.0, -20.0 * (double)$$0 + 10.0)) / 2.0);
    }

    public static float z(float $$0) {
        return $$0 * $$0;
    }

    public static float A(float $$0) {
        return (float)Math.sqrt(1.0f - bgj.j($$0 - 1.0f));
    }

    public static float B(float $$0) {
        float $$1 = 1.3962635f;
        if ($$0 == 0.0f) {
            return 0.0f;
        }
        if ($$0 == 1.0f) {
            return 1.0f;
        }
        double $$2 = Math.sin((20.0 * (double)$$0 - 11.125) * 1.3962634801864624);
        if ($$0 < 0.5f) {
            return (float)(-(Math.pow(2.0, 20.0 * (double)$$0 - 10.0) * $$2) / 2.0);
        }
        return (float)(Math.pow(2.0, -20.0 * (double)$$0 + 10.0) * $$2 / 2.0 + 1.0);
    }

    public static float C(float $$0) {
        return (float)(-Math.sqrt(1.0f - $$0 * $$0)) + 1.0f;
    }

    public static float D(float $$0) {
        float $$1 = 1.70158f;
        float $$2 = 2.5949094f;
        if ($$0 < 0.5f) {
            return 4.0f * $$0 * $$0 * (7.189819f * $$0 - 2.5949094f) / 2.0f;
        }
        float $$3 = 2.0f * $$0 - 2.0f;
        return ($$3 * $$3 * (3.5949094f * $$3 + 2.5949094f) + 2.0f) / 2.0f;
    }
}

