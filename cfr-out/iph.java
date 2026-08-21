/*
 * Decompiled with CFR 0.152.
 */
public class iph
extends ios {
    public iph(bcz $$0, bdb $$1, float $$2, float $$3, bgr $$4, is $$5) {
        this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
    }

    public static iph a(bcz $$0, float $$1) {
        return iph.a($$0, $$1, 0.25f);
    }

    public static iph a(jd<bcz> $$0, float $$1) {
        return iph.a($$0.a(), $$1);
    }

    public static iph a(bcz $$0, float $$1, float $$2) {
        return new iph($$0.a(), bdb.k, $$2, $$1, ipm.u(), false, 0, ipm.a.a, 0.0, 0.0, 0.0, true);
    }

    public static iph a(bcz $$0) {
        return new iph($$0.a(), bdb.b, 1.0f, 1.0f, ipm.u(), false, 0, ipm.a.a, 0.0, 0.0, 0.0, true);
    }

    public static iph a(bcz $$0, ftm $$1) {
        return new iph($$0, bdb.c, 4.0f, 1.0f, ipm.u(), false, 0, ipm.a.b, $$1.g, $$1.h, $$1.i);
    }

    public static iph b(bcz $$0, float $$1, float $$2) {
        return new iph($$0.a(), bdb.i, $$2, $$1, ipm.u(), false, 0, ipm.a.a, 0.0, 0.0, 0.0, true);
    }

    public static iph b(bcz $$0) {
        return iph.b($$0, 1.0f, 1.0f);
    }

    public static iph a(bcz $$0, bgr $$1, double $$2, double $$3, double $$4) {
        return new iph($$0, bdb.i, 1.0f, 1.0f, $$1, false, 0, ipm.a.b, $$2, $$3, $$4);
    }

    public iph(bcz $$0, bdb $$1, float $$2, float $$3, bgr $$4, double $$5, double $$6, double $$7) {
        this($$0, $$1, $$2, $$3, $$4, false, 0, ipm.a.b, $$5, $$6, $$7);
    }

    private iph(bcz $$0, bdb $$1, float $$2, float $$3, bgr $$4, boolean $$5, int $$6, ipm.a $$7, double $$8, double $$9, double $$10) {
        this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
    }

    public iph(amo $$0, bdb $$1, float $$2, float $$3, bgr $$4, boolean $$5, int $$6, ipm.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
        super($$0, $$1, $$4);
        this.d = $$2;
        this.e = $$3;
        this.f = $$8;
        this.g = $$9;
        this.h = $$10;
        this.i = $$5;
        this.j = $$6;
        this.k = $$7;
        this.l = $$11;
    }
}

