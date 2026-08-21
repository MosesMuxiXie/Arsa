/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Predicate;

public class eqr {
    public static final int a = 16;
    public static final int b = 16;
    public static final int c = 4096;
    public static final int d = 2;
    private short e;
    private short f;
    private short g;
    private final eqy<eoh> h;
    private era<jd<dxo>> i;

    private eqr(eqr $$0) {
        this.e = $$0.e;
        this.f = $$0.f;
        this.g = $$0.g;
        this.h = $$0.h.f();
        this.i = $$0.i.f();
    }

    public eqr(eqy<eoh> $$0, era<jd<dxo>> $$1) {
        this.h = $$0;
        this.i = $$1;
        this.g();
    }

    public eqr(eqz $$0) {
        this.h = $$0.a();
        this.i = $$0.b();
    }

    public eoh a(int $$0, int $$1, int $$2) {
        return this.h.a($$0, $$1, $$2);
    }

    public flb b(int $$0, int $$1, int $$2) {
        return this.h.a($$0, $$1, $$2).y();
    }

    public void a() {
        this.h.b();
    }

    public void b() {
        this.h.c();
    }

    public eoh a(int $$0, int $$1, int $$2, eoh $$3) {
        return this.a($$0, $$1, $$2, $$3, true);
    }

    public eoh a(int $$0, int $$1, int $$2, eoh $$3, boolean $$4) {
        eoh $$6;
        if ($$4) {
            eoh $$5 = this.h.a($$0, $$1, $$2, $$3);
        } else {
            $$6 = this.h.b($$0, $$1, $$2, $$3);
        }
        flb $$7 = $$6.y();
        flb $$8 = $$3.y();
        if (!$$6.l()) {
            this.e = (short)(this.e - 1);
            if ($$6.z()) {
                this.f = (short)(this.f - 1);
            }
        }
        if (!$$7.c()) {
            this.g = (short)(this.g - 1);
        }
        if (!$$3.l()) {
            this.e = (short)(this.e + 1);
            if ($$3.z()) {
                this.f = (short)(this.f + 1);
            }
        }
        if (!$$8.c()) {
            this.g = (short)(this.g + 1);
        }
        return $$6;
    }

    public boolean c() {
        return this.e == 0;
    }

    public boolean d() {
        return this.e() || this.f();
    }

    public boolean e() {
        return this.f > 0;
    }

    public boolean f() {
        return this.g > 0;
    }

    public void g() {
        class A
        implements eqy.a<eoh> {
            public int a;
            public int b;
            public int c;

            A(eqr $$0) {
            }

            public void a(eoh $$0, int $$1) {
                flb $$2 = $$0.y();
                if (!$$0.l()) {
                    this.a += $$1;
                    if ($$0.z()) {
                        this.b += $$1;
                    }
                }
                if (!$$2.c()) {
                    this.a += $$1;
                    if ($$2.f()) {
                        this.c += $$1;
                    }
                }
            }

            @Override
            public /* synthetic */ void accept(Object object, int n2) {
                this.a((eoh)object, n2);
            }
        }
        A $$0 = new A(this);
        this.h.a($$0);
        this.e = (short)$$0.a;
        this.f = (short)$$0.b;
        this.g = (short)$$0.c;
    }

    public eqy<eoh> h() {
        return this.h;
    }

    public era<jd<dxo>> i() {
        return this.i;
    }

    public void a(wx $$0) {
        this.e = $$0.readShort();
        this.h.a($$0);
        eqy<jd<dxo>> $$1 = this.i.g();
        $$1.a($$0);
        this.i = $$1;
    }

    public void b(wx $$0) {
        eqy<jd<dxo>> $$1 = this.i.g();
        $$1.a($$0);
        this.i = $$1;
    }

    public void c(wx $$0) {
        $$0.m(this.e);
        this.h.b($$0);
        this.i.b($$0);
    }

    public int j() {
        return 2 + this.h.d() + this.i.d();
    }

    public boolean a(Predicate<eoh> $$0) {
        return this.h.a($$0);
    }

    public jd<dxo> c(int $$0, int $$1, int $$2) {
        return this.i.a($$0, $$1, $$2);
    }

    public void a(dxr $$0, dxx.f $$1, int $$2, int $$3, int $$4) {
        eqy<jd<dxo>> $$5 = this.i.g();
        int $$6 = 4;
        for (int $$7 = 0; $$7 < 4; ++$$7) {
            for (int $$8 = 0; $$8 < 4; ++$$8) {
                for (int $$9 = 0; $$9 < 4; ++$$9) {
                    $$5.b($$7, $$8, $$9, $$0.getNoiseBiome($$2 + $$7, $$3 + $$8, $$4 + $$9, $$1));
                }
            }
        }
        this.i = $$5;
    }

    public eqr k() {
        return new eqr(this);
    }
}

