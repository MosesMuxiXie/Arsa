/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix3f
 *  org.joml.Matrix3fc
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.joml.Matrix3f;
import org.joml.Matrix3fc;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class fzm {
    private final List<a> a = new ArrayList<a>(16);
    private int b;

    public fzm() {
        this.a.add(new a());
    }

    public void a(double $$0, double $$1, double $$2) {
        this.a((float)$$0, (float)$$1, (float)$$2);
    }

    public void a(float $$0, float $$1, float $$2) {
        this.c().a($$0, $$1, $$2);
    }

    public void a(ftm $$0) {
        this.a($$0.g, $$0.h, $$0.i);
    }

    public void b(float $$0, float $$1, float $$2) {
        this.c().b($$0, $$1, $$2);
    }

    public void a(Quaternionfc $$0) {
        this.c().a($$0);
    }

    public void a(Quaternionfc $$0, float $$1, float $$2, float $$3) {
        this.c().a($$0, $$1, $$2, $$3);
    }

    public void a() {
        a $$0 = this.c();
        ++this.b;
        if (this.b >= this.a.size()) {
            this.a.add($$0.d());
        } else {
            this.a.get(this.b).a($$0);
        }
    }

    public void b() {
        if (this.b == 0) {
            throw new NoSuchElementException();
        }
        --this.b;
    }

    public a c() {
        return this.a.get(this.b);
    }

    public boolean d() {
        return this.b == 0;
    }

    public void e() {
        this.c().c();
    }

    public void a(Matrix4fc $$0) {
        this.c().a($$0);
    }

    public static final class a {
        private final Matrix4f a = new Matrix4f();
        private final Matrix3f b = new Matrix3f();
        private boolean c = true;

        private void e() {
            this.b.set((Matrix4fc)this.a).invert().transpose();
            this.c = false;
        }

        public void a(a $$0) {
            this.a.set((Matrix4fc)$$0.a);
            this.b.set((Matrix3fc)$$0.b);
            this.c = $$0.c;
        }

        public Matrix4f a() {
            return this.a;
        }

        public Matrix3f b() {
            return this.b;
        }

        public Vector3f a(Vector3fc $$0, Vector3f $$1) {
            return this.a($$0.x(), $$0.y(), $$0.z(), $$1);
        }

        public Vector3f a(float $$0, float $$1, float $$2, Vector3f $$3) {
            Vector3f $$4 = this.b.transform($$0, $$1, $$2, $$3);
            return this.c ? $$4 : $$4.normalize();
        }

        public Matrix4f a(float $$0, float $$1, float $$2) {
            return this.a.translate($$0, $$1, $$2);
        }

        public void b(float $$0, float $$1, float $$2) {
            this.a.scale($$0, $$1, $$2);
            if (Math.abs($$0) == Math.abs($$1) && Math.abs($$1) == Math.abs($$2)) {
                if ($$0 < 0.0f || $$1 < 0.0f || $$2 < 0.0f) {
                    this.b.scale(Math.signum($$0), Math.signum($$1), Math.signum($$2));
                }
                return;
            }
            this.b.scale(1.0f / $$0, 1.0f / $$1, 1.0f / $$2);
            this.c = false;
        }

        public void a(Quaternionfc $$0) {
            this.a.rotate($$0);
            this.b.rotate($$0);
        }

        public void a(Quaternionfc $$0, float $$1, float $$2, float $$3) {
            this.a.rotateAround($$0, $$1, $$2, $$3);
            this.b.rotate($$0);
        }

        public void c() {
            this.a.identity();
            this.b.identity();
            this.c = true;
        }

        public void a(Matrix4fc $$0) {
            this.a.mul($$0);
            if (!e.b($$0)) {
                if (e.c($$0)) {
                    this.b.mul((Matrix3fc)new Matrix3f($$0));
                } else {
                    this.e();
                }
            }
        }

        public a d() {
            a $$0 = new a();
            $$0.a(this);
            return $$0;
        }
    }
}

