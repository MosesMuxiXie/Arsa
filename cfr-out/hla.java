/*
 * Decompiled with CFR 0.152.
 */
public class hla
extends hmb {
    hla(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ilp $$7) {
        super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    public hmg.b b() {
        return hmg.b.c;
    }

    @Override
    public void a(double $$0, double $$1, double $$2) {
        this.a(this.n().d($$0, $$1, $$2));
        this.l();
    }

    @Override
    public float b(float $$0) {
        float $$1 = ((float)this.z + $$0) / (float)this.A;
        return this.c * (1.0f - $$1 * $$1 * 0.5f);
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

    public static class b
    implements hlu<md> {
        private final hmo a;

        public b(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hla $$9 = new hla($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a.a($$8));
            $$9.d(0.5f);
            return $$9;
        }
    }

    public static class a
    implements hlu<md> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hla $$9 = new hla($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a.a($$8));
            return $$9;
        }
    }
}

