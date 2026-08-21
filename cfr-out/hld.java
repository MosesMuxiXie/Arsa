/*
 * Decompiled with CFR 0.152.
 */
public class hld
extends hmg {
    private final hmo a;

    hld(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, hmo $$7) {
        super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7.a());
        this.C = 0.96f;
        this.D = true;
        this.a = $$7;
        this.c *= 0.75f;
        this.u = false;
        this.a($$7);
    }

    @Override
    public hmg.b b() {
        return hmg.b.d;
    }

    @Override
    public int a(float $$0) {
        float $$1 = ((float)this.z + $$0) / (float)this.A;
        $$1 = bgj.a($$1, 0.0f, 1.0f);
        int $$2 = super.a($$0);
        int $$3 = $$2 & 0xFF;
        int $$4 = $$2 >> 16 & 0xFF;
        if (($$3 += (int)($$1 * 15.0f * 16.0f)) > 240) {
            $$3 = 240;
        }
        return $$3 | $$4 << 16;
    }

    @Override
    public void a() {
        super.a();
        this.a(this.a);
    }

    public static class c
    implements hlu<md> {
        private static final double a = 0.01;
        private final hmo b;

        public c(hmo $$0) {
            this.b = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hld $$9 = new hld($$1, $$2, $$3, $$4, 0.0, 0.0, 0.0, this.b);
            if ($$8.h()) {
                $$9.a(0.29f, 0.58f, 0.51f);
            } else {
                $$9.a(0.43f, 0.77f, 0.62f);
            }
            $$9.b($$5 * 0.01, $$6 * 0.01, $$7 * 0.01);
            int $$10 = 10;
            int $$11 = 40;
            $$9.a($$8.a(30) + 10);
            return $$9;
        }
    }

    public static class a
    implements hlu<md> {
        private static final double a = 0.25;
        private final hmo b;

        public a(hmo $$0) {
            this.b = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hld $$9 = new hld($$1, $$2, $$3, $$4, 0.0, 0.0, 0.0, this.b);
            $$9.a(1.0f, 0.9f, 1.0f);
            $$9.b($$5 * 0.25, $$6 * 0.25, $$7 * 0.25);
            int $$10 = 2;
            int $$11 = 4;
            $$9.a($$8.a(2) + 2);
            return $$9;
        }
    }

    public static class d
    implements hlu<md> {
        private static final double a = 0.01;
        private final hmo b;

        public d(hmo $$0) {
            this.b = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hld $$9 = new hld($$1, $$2, $$3, $$4, 0.0, 0.0, 0.0, this.b);
            $$9.a(1.0f, 0.9f, 1.0f);
            $$9.b($$5 * 0.01 / 2.0, $$6 * 0.01, $$7 * 0.01 / 2.0);
            int $$10 = 10;
            int $$11 = 40;
            $$9.a($$8.a(30) + 10);
            return $$9;
        }
    }

    public static class e
    implements hlu<md> {
        private static final double a = 0.01;
        private final hmo b;

        public e(hmo $$0) {
            this.b = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hld $$9 = new hld($$1, $$2, $$3, $$4, 0.0, 0.0, 0.0, this.b);
            $$9.a(0.91f, 0.55f, 0.08f);
            $$9.b($$5 * 0.01 / 2.0, $$6 * 0.01, $$7 * 0.01 / 2.0);
            int $$10 = 10;
            int $$11 = 40;
            $$9.a($$8.a(30) + 10);
            return $$9;
        }
    }

    public static class b
    implements hlu<md> {
        private final hmo a;

        public b(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hld $$9 = new hld($$1, $$2, $$3, $$4, 0.5 - $$8.j(), $$6, 0.5 - $$8.j(), this.a);
            if ($$8.h()) {
                $$9.a(0.6f, 1.0f, 0.8f);
            } else {
                $$9.a(0.08f, 0.4f, 0.4f);
            }
            $$9.r *= (double)0.2f;
            if ($$5 == 0.0 && $$7 == 0.0) {
                $$9.q *= (double)0.1f;
                $$9.s *= (double)0.1f;
            }
            $$9.a((int)(8.0 / ($$8.j() * 0.8 + 0.2)));
            return $$9;
        }
    }
}

