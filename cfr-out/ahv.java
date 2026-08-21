/*
 * Decompiled with CFR 0.152.
 */
public class ahv
implements aay<adb> {
    public static final aao<xq, ahv> a = aay.a(ahv::a, ahv::new);
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 4;
    private static final int e = 8;
    private final int f;
    private final jd<cfk> g;
    private final int h;
    private final int i;
    private final byte j;

    public ahv(int $$0, cfm $$1, boolean $$2) {
        this.f = $$0;
        this.g = $$1.c();
        this.h = $$1.e();
        this.i = $$1.d();
        byte $$3 = 0;
        if ($$1.f()) {
            $$3 = (byte)($$3 | 1);
        }
        if ($$1.g()) {
            $$3 = (byte)($$3 | 2);
        }
        if ($$1.h()) {
            $$3 = (byte)($$3 | 4);
        }
        if ($$2) {
            $$3 = (byte)($$3 | 8);
        }
        this.j = $$3;
    }

    private ahv(xq $$0) {
        this.f = $$0.l();
        this.g = (jd)cfk.b.decode($$0);
        this.h = $$0.l();
        this.i = $$0.l();
        this.j = $$0.readByte();
    }

    @Override
    private void a(xq $$0) {
        $$0.c(this.f);
        cfk.b.encode($$0, this.g);
        $$0.c(this.h);
        $$0.c(this.i);
        $$0.l(this.j);
    }

    @Override
    public aba<ahv> a() {
        return ahz.bm;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public int b() {
        return this.f;
    }

    public jd<cfk> e() {
        return this.g;
    }

    public int f() {
        return this.h;
    }

    public int g() {
        return this.i;
    }

    public boolean h() {
        return (this.j & 2) != 0;
    }

    public boolean i() {
        return (this.j & 1) != 0;
    }

    public boolean j() {
        return (this.j & 4) != 0;
    }

    public boolean k() {
        return (this.j & 8) != 0;
    }
}

