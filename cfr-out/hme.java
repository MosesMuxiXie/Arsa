/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionf
 */
import org.joml.Quaternionf;

public class hme
extends hmg {
    private static final float a = 1.0472f;
    private int b;

    hme(hif $$0, double $$1, double $$2, double $$3, int $$4, ilp $$5) {
        super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0, $$5);
        this.c = 0.85f;
        this.b = $$4;
        this.A = 30;
        this.B = 0.0f;
        this.q = 0.0;
        this.r = 0.1;
        this.s = 0.0;
    }

    @Override
    public float b(float $$0) {
        return this.c * bgj.a(((float)this.z + $$0) / (float)this.A * 0.75f, 0.0f, 1.0f);
    }

    @Override
    public void a(iku $$0, ger $$1, float $$2) {
        if (this.b > 0) {
            return;
        }
        this.g = 1.0f - bgj.a(((float)this.z + $$2) / (float)this.A, 0.0f, 1.0f);
        Quaternionf $$3 = new Quaternionf();
        $$3.rotationX(-1.0472f);
        this.a($$0, $$1, $$3, $$2);
        $$3.rotationYXZ((float)(-Math.PI), 1.0472f, 0.0f);
        this.a($$0, $$1, $$3, $$2);
    }

    @Override
    public int a(float $$0) {
        return 240;
    }

    @Override
    public hmg.b b() {
        return hmg.b.d;
    }

    @Override
    public void a() {
        if (this.b > 0) {
            --this.b;
            return;
        }
        super.a();
    }

    public static class a
    implements hlu<mc> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(mc $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hme $$9 = new hme($$1, $$2, $$3, $$4, $$0.b(), this.a.a($$8));
            $$9.e(1.0f);
            return $$9;
        }
    }
}

