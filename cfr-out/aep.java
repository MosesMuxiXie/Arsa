/*
 * Decompiled with CFR 0.152.
 */
public class aep
implements aay<adb> {
    public static final aao<wx, aep> a = aay.a(aep::a, aep::new);
    private final double b;
    private final double c;
    private final double d;
    private final double e;
    private final long f;
    private final int g;
    private final int h;
    private final int i;

    private aep(wx $$0) {
        this.b = $$0.readDouble();
        this.c = $$0.readDouble();
        this.d = $$0.readDouble();
        this.e = $$0.readDouble();
        this.f = $$0.m();
        this.g = $$0.l();
        this.h = $$0.l();
        this.i = $$0.l();
    }

    public aep(eqa $$0) {
        this.b = $$0.h();
        this.c = $$0.i();
        this.d = $$0.j();
        this.e = $$0.l();
        this.f = $$0.k();
        this.g = $$0.n();
        this.h = $$0.s();
        this.i = $$0.r();
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
        $$0.a(this.c);
        $$0.a(this.d);
        $$0.a(this.e);
        $$0.a(this.f);
        $$0.c(this.g);
        $$0.c(this.h);
        $$0.c(this.i);
    }

    @Override
    public aba<aep> a() {
        return ahz.O;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public double b() {
        return this.b;
    }

    public double e() {
        return this.c;
    }

    public double f() {
        return this.e;
    }

    public double g() {
        return this.d;
    }

    public long h() {
        return this.f;
    }

    public int i() {
        return this.g;
    }

    public int j() {
        return this.i;
    }

    public int k() {
        return this.h;
    }
}

