/*
 * Decompiled with CFR 0.152.
 */
public class agf
implements aay<adb> {
    public static final aao<wx, agf> a = aay.a(agf::a, agf::new);
    private final double b;
    private final double c;
    private final long d;

    public agf(eqa $$0) {
        this.b = $$0.j();
        this.c = $$0.l();
        this.d = $$0.k();
    }

    private agf(wx $$0) {
        this.b = $$0.readDouble();
        this.c = $$0.readDouble();
        this.d = $$0.m();
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
        $$0.a(this.c);
        $$0.a(this.d);
    }

    @Override
    public aba<agf> a() {
        return ahz.aB;
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

    public long f() {
        return this.d;
    }
}

