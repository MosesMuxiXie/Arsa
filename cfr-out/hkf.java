/*
 * Decompiled with CFR 0.152.
 */
public class hkf
extends hmg {
    private final hmg.b a;

    hkf(hif $$0, double $$1, double $$2, double $$3, eoh $$4) {
        super($$0, $$1, $$2, $$3, gfj.V().ax().a().a($$4));
        this.B = 0.0f;
        this.A = 80;
        this.u = false;
        this.a = this.E.h().equals(ilo.d) ? hmg.b.a : hmg.b.b;
    }

    @Override
    public hmg.b b() {
        return this.a;
    }

    @Override
    public float b(float $$0) {
        return 0.5f;
    }

    public static class a
    implements hlu<lp> {
        @Override
        public hlq a(lp $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            return new hkf($$1, $$2, $$3, $$4, $$0.b());
        }
    }
}

