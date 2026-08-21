/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionf
 */
import java.util.Optional;
import org.joml.Quaternionf;

public class hmx
extends hmg {
    private final eto a;
    private float b;
    private float F;
    private float G;
    private float H;

    hmx(hif $$0, double $$1, double $$2, double $$3, eto $$4, int $$5, ilp $$6) {
        super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0, $$6);
        this.c = 0.3f;
        this.a = $$4;
        this.A = $$5;
        Optional<ftm> $$7 = $$4.a($$0);
        if ($$7.isPresent()) {
            ftm $$8 = $$7.get();
            double $$9 = $$1 - $$8.a();
            double $$10 = $$2 - $$8.b();
            double $$11 = $$3 - $$8.c();
            this.F = this.b = (float)bgj.d($$9, $$11);
            this.H = this.G = (float)bgj.d($$10, Math.sqrt($$9 * $$9 + $$11 * $$11));
        }
    }

    @Override
    public void a(iku $$0, ger $$1, float $$2) {
        float $$3 = bgj.a((double)(((float)this.z + $$2 - (float)Math.PI * 2) * 0.05f)) * 2.0f;
        float $$4 = bgj.h($$2, this.F, this.b);
        float $$5 = bgj.h($$2, this.H, this.G) + 1.5707964f;
        Quaternionf $$6 = new Quaternionf();
        $$6.rotationY($$4).rotateX(-$$5).rotateY($$3);
        this.a($$0, $$1, $$6, $$2);
        $$6.rotationY((float)(-Math.PI) + $$4).rotateX($$5).rotateY($$3);
        this.a($$0, $$1, $$6, $$2);
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
        this.k = this.n;
        this.l = this.o;
        this.m = this.p;
        if (this.z++ >= this.A) {
            this.k();
            return;
        }
        Optional<ftm> $$0 = this.a.a(this.j);
        if ($$0.isEmpty()) {
            this.k();
            return;
        }
        int $$1 = this.A - this.z;
        double $$2 = 1.0 / (double)$$1;
        ftm $$3 = $$0.get();
        this.n = bgj.d($$2, this.n, $$3.a());
        this.o = bgj.d($$2, this.o, $$3.b());
        this.p = bgj.d($$2, this.p, $$3.c());
        double $$4 = this.n - $$3.a();
        double $$5 = this.o - $$3.b();
        double $$6 = this.p - $$3.c();
        this.F = this.b;
        this.b = (float)bgj.d($$4, $$6);
        this.H = this.G;
        this.G = (float)bgj.d($$5, Math.sqrt($$4 * $$4 + $$6 * $$6));
    }

    public static class a
    implements hlu<mg> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(mg $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hmx $$9 = new hmx($$1, $$2, $$3, $$4, $$0.b(), $$0.c(), this.a.a($$8));
            $$9.e(1.0f);
            return $$9;
        }
    }
}

