/*
 * Decompiled with CFR 0.152.
 */
public interface dxg
extends dvt {
    public static final iz[] A = iz.values();

    default public int a(is $$0, iz $$1) {
        return this.a_($$0).b((dvt)this, $$0, $$1);
    }

    default public int d_(is $$0) {
        int $$1 = 0;
        if (($$1 = Math.max($$1, this.a($$0.e(), iz.a))) >= 15) {
            return $$1;
        }
        if (($$1 = Math.max($$1, this.a($$0.d(), iz.b))) >= 15) {
            return $$1;
        }
        if (($$1 = Math.max($$1, this.a($$0.f(), iz.c))) >= 15) {
            return $$1;
        }
        if (($$1 = Math.max($$1, this.a($$0.g(), iz.d))) >= 15) {
            return $$1;
        }
        if (($$1 = Math.max($$1, this.a($$0.h(), iz.e))) >= 15) {
            return $$1;
        }
        if (($$1 = Math.max($$1, this.a($$0.i(), iz.f))) >= 15) {
            return $$1;
        }
        return $$1;
    }

    default public int a(is $$0, iz $$1, boolean $$2) {
        eoh $$3 = this.a_($$0);
        if ($$2) {
            return ebv.n($$3) ? this.a($$0, $$1) : 0;
        }
        if ($$3.a(dzs.hR)) {
            return 15;
        }
        if ($$3.a(dzs.cT)) {
            return $$3.c(egb.f);
        }
        if ($$3.p()) {
            return this.a($$0, $$1);
        }
        return 0;
    }

    default public boolean b(is $$0, iz $$1) {
        return this.c($$0, $$1) > 0;
    }

    default public int c(is $$0, iz $$1) {
        eoh $$2 = this.a_($$0);
        int $$3 = $$2.a((dvt)this, $$0, $$1);
        if ($$2.d(this, $$0)) {
            return Math.max($$3, this.d_($$0));
        }
        return $$3;
    }

    default public boolean I(is $$0) {
        if (this.c($$0.e(), iz.a) > 0) {
            return true;
        }
        if (this.c($$0.d(), iz.b) > 0) {
            return true;
        }
        if (this.c($$0.f(), iz.c) > 0) {
            return true;
        }
        if (this.c($$0.g(), iz.d) > 0) {
            return true;
        }
        if (this.c($$0.h(), iz.e) > 0) {
            return true;
        }
        return this.c($$0.i(), iz.f) > 0;
    }

    default public int J(is $$0) {
        int $$1 = 0;
        for (iz $$2 : A) {
            int $$3 = this.c($$0.a($$2), $$2);
            if ($$3 >= 15) {
                return 15;
            }
            if ($$3 <= $$1) continue;
            $$1 = $$3;
        }
        return $$1;
    }
}

