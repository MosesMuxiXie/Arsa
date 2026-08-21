/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class hko
extends hkq<lr> {
    private final Vector3f a;
    private final Vector3f b;

    protected hko(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, lr $$7, hmo $$8) {
        super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
        float $$9 = this.y.i() * 0.4f + 0.6f;
        this.a = this.a($$7.b(), $$9);
        this.b = this.a($$7.c(), $$9);
    }

    private Vector3f a(Vector3f $$0, float $$1) {
        return new Vector3f(this.a($$0.x(), $$1), this.a($$0.y(), $$1), this.a($$0.z(), $$1));
    }

    private void f(float $$0) {
        float $$1 = ((float)this.z + $$0) / ((float)this.A + 1.0f);
        Vector3f $$2 = new Vector3f((Vector3fc)this.a).lerp((Vector3fc)this.b, $$1);
        this.d = $$2.x();
        this.e = $$2.y();
        this.f = $$2.z();
    }

    @Override
    public void a(iku $$0, ger $$1, float $$2) {
        this.f($$2);
        super.a($$0, $$1, $$2);
    }

    public static class a
    implements hlu<lr> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(lr $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            return new hko($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0, this.a);
        }
    }
}

