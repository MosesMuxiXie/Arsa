/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class hkw
extends hmg {
    private final float a;
    private final hmo b;

    hkw(hif $$0, double $$1, double $$2, double $$3, float $$4, float $$5, float $$6, hmo $$7) {
        super($$0, $$1, $$2, $$3, $$7.a());
        this.b = $$7;
        this.d = $$4;
        this.e = $$5;
        this.f = $$6;
        float $$8 = 0.9f;
        this.c *= 0.67499995f;
        int $$9 = (int)(32.0 / ((double)this.y.i() * 0.8 + 0.2));
        this.A = (int)Math.max((float)$$9 * 0.9f, 1.0f);
        this.a($$7);
        this.a = (this.y.i() - 0.5f) * 0.1f;
        this.h = this.y.i() * ((float)Math.PI * 2);
    }

    @Override
    public hmg.b b() {
        return hmg.b.c;
    }

    @Override
    public float b(float $$0) {
        return this.c * bgj.a(((float)this.z + $$0) / (float)this.A * 32.0f, 0.0f, 1.0f);
    }

    @Override
    public void a() {
        this.k = this.n;
        this.l = this.o;
        this.m = this.p;
        if (this.z++ >= this.A) {
            this.k();
            return;
        }
        this.a(this.b);
        this.i = this.h;
        this.h += (float)Math.PI * this.a * 2.0f;
        if (this.t) {
            this.h = 0.0f;
            this.i = 0.0f;
        }
        this.a(this.q, this.r, this.s);
        this.r -= (double)0.003f;
        this.r = Math.max(this.r, (double)-0.14f);
    }

    public static class a
    implements hlu<lp> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public @Nullable hlq a(lp $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            eoh $$9 = $$0.b();
            if (!$$9.l() && $$9.o() == egf.a) {
                return null;
            }
            is $$10 = is.a($$2, $$3, $$4);
            int $$11 = gfj.V().aE().a($$9, $$1, $$10);
            if ($$9.b() instanceof ecr) {
                $$11 = ((ecr)$$9.b()).b($$9, $$1, $$10);
            }
            float $$12 = (float)($$11 >> 16 & 0xFF) / 255.0f;
            float $$13 = (float)($$11 >> 8 & 0xFF) / 255.0f;
            float $$14 = (float)($$11 & 0xFF) / 255.0f;
            return new hkw($$1, $$2, $$3, $$4, $$12, $$13, $$14, this.a);
        }
    }
}

