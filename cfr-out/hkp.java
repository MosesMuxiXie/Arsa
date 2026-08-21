/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 */
import org.joml.Vector3f;

public class hkp
extends hkq<ls> {
    protected hkp(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ls $$7, hmo $$8) {
        super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
        float $$9 = this.y.i() * 0.4f + 0.6f;
        Vector3f $$10 = $$7.b();
        this.d = this.a($$10.x(), $$9);
        this.e = this.a($$10.y(), $$9);
        this.f = this.a($$10.z(), $$9);
    }

    public static class a
    implements hlu<ls> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(ls $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            return new hkp($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0, this.a);
        }
    }
}

