/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.FrustumIntersection
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector4f
 */
import org.joml.FrustumIntersection;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector4f;

public class htx {
    public static final int a = 4;
    private final FrustumIntersection b = new FrustumIntersection();
    private final Matrix4f c = new Matrix4f();
    private Vector4f d;
    private double e;
    private double f;
    private double g;

    public htx(Matrix4f $$0, Matrix4f $$1) {
        this.a($$0, $$1);
    }

    public htx(htx $$0) {
        this.b.set((Matrix4fc)$$0.c);
        this.c.set((Matrix4fc)$$0.c);
        this.e = $$0.e;
        this.f = $$0.f;
        this.g = $$0.g;
        this.d = $$0.d;
    }

    public htx a(float $$0) {
        this.e += (double)(this.d.x * $$0);
        this.f += (double)(this.d.y * $$0);
        this.g += (double)(this.d.z * $$0);
        return this;
    }

    public htx a(int $$0) {
        double $$1 = Math.floor(this.e / (double)$$0) * (double)$$0;
        double $$2 = Math.floor(this.f / (double)$$0) * (double)$$0;
        double $$3 = Math.floor(this.g / (double)$$0) * (double)$$0;
        double $$4 = Math.ceil(this.e / (double)$$0) * (double)$$0;
        double $$5 = Math.ceil(this.f / (double)$$0) * (double)$$0;
        double $$6 = Math.ceil(this.g / (double)$$0) * (double)$$0;
        while (this.b.intersectAab((float)($$1 - this.e), (float)($$2 - this.f), (float)($$3 - this.g), (float)($$4 - this.e), (float)($$5 - this.f), (float)($$6 - this.g)) != -2) {
            this.e -= (double)(this.d.x() * 4.0f);
            this.f -= (double)(this.d.y() * 4.0f);
            this.g -= (double)(this.d.z() * 4.0f);
        }
        return this;
    }

    public void a(double $$0, double $$1, double $$2) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
    }

    private void a(Matrix4f $$0, Matrix4f $$1) {
        $$1.mul((Matrix4fc)$$0, this.c);
        this.b.set((Matrix4fc)this.c);
        this.d = this.c.transformTranspose(new Vector4f(0.0f, 0.0f, 1.0f, 0.0f));
    }

    public boolean a(fth $$0) {
        int $$1 = this.a($$0.a, $$0.b, $$0.c, $$0.d, $$0.e, $$0.f);
        return $$1 == -2 || $$1 == -1;
    }

    public int a(ffg $$0) {
        return this.a($$0.h(), $$0.i(), $$0.j(), $$0.k() + 1, $$0.l() + 1, $$0.m() + 1);
    }

    private int a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
        float $$6 = (float)($$0 - this.e);
        float $$7 = (float)($$1 - this.f);
        float $$8 = (float)($$2 - this.g);
        float $$9 = (float)($$3 - this.e);
        float $$10 = (float)($$4 - this.f);
        float $$11 = (float)($$5 - this.g);
        return this.b.intersectAab($$6, $$7, $$8, $$9, $$10, $$11);
    }

    public boolean b(double $$0, double $$1, double $$2) {
        return this.b.testPoint((float)($$0 - this.e), (float)($$1 - this.f), (float)($$2 - this.g));
    }

    public Vector4f[] a() {
        Vector4f[] $$0 = new Vector4f[]{new Vector4f(-1.0f, -1.0f, -1.0f, 1.0f), new Vector4f(1.0f, -1.0f, -1.0f, 1.0f), new Vector4f(1.0f, 1.0f, -1.0f, 1.0f), new Vector4f(-1.0f, 1.0f, -1.0f, 1.0f), new Vector4f(-1.0f, -1.0f, 1.0f, 1.0f), new Vector4f(1.0f, -1.0f, 1.0f, 1.0f), new Vector4f(1.0f, 1.0f, 1.0f, 1.0f), new Vector4f(-1.0f, 1.0f, 1.0f, 1.0f)};
        Matrix4f $$1 = this.c.invert(new Matrix4f());
        for (int $$2 = 0; $$2 < 8; ++$$2) {
            $$1.transform($$0[$$2]);
            $$0[$$2].div($$0[$$2].w());
        }
        return $$0;
    }

    public double b() {
        return this.e;
    }

    public double c() {
        return this.f;
    }

    public double d() {
        return this.g;
    }
}

