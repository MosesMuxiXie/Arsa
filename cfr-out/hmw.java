/*
 * Decompiled with CFR 0.152.
 */
public class hmw
extends hmg {
    private final hmo a;
    private static final int b = 8;

    protected hmw(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, hmo $$8) {
        super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0, $$8.a());
        this.a = $$8;
        this.C = 0.96f;
        this.B = -0.1f;
        this.D = true;
        this.q *= 0.0;
        this.r *= 0.9;
        this.s *= 0.0;
        this.q += $$4;
        this.r += $$5;
        this.s += $$6;
        this.c *= 0.75f * $$7;
        this.A = (int)(8.0f / bgj.b(this.y, 0.5f, 1.0f) * $$7);
        this.A = Math.max(this.A, 1);
        this.a($$8);
        this.u = true;
    }

    @Override
    public hmg.b b() {
        return hmg.b.c;
    }

    @Override
    public int a(float $$0) {
        return 240;
    }

    @Override
    public hmg.a p() {
        return hmg.a.b;
    }

    @Override
    public void a() {
        super.a();
        this.a(this.a);
    }

    @Override
    public float b(float $$0) {
        return this.c * bgj.a(((float)this.z + $$0) / (float)this.A * 32.0f, 0.0f, 1.0f);
    }

    public static class a
    implements hlu<md> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            return new hmw($$1, $$2, $$3, $$4, $$5, $$6, $$7, 1.5f, this.a);
        }
    }
}

