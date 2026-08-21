/*
 * Decompiled with CFR 0.152.
 */
public class ahg
implements aay<adb> {
    public static final aao<xq, ahg> a = aay.a(ahg::a, ahg::new);
    private final jd<bcz> b;
    private final bdb c;
    private final int d;
    private final float e;
    private final float f;
    private final long g;

    public ahg(jd<bcz> $$0, bdb $$1, cgk $$2, float $$3, float $$4, long $$5) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2.aA();
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
    }

    private ahg(xq $$0) {
        this.b = (jd)bcz.d.decode($$0);
        this.c = $$0.b(bdb.class);
        this.d = $$0.l();
        this.e = $$0.readFloat();
        this.f = $$0.readFloat();
        this.g = $$0.readLong();
    }

    @Override
    private void a(xq $$0) {
        bcz.d.encode($$0, this.b);
        $$0.a(this.c);
        $$0.c(this.d);
        $$0.a(this.e);
        $$0.a(this.f);
        $$0.b(this.g);
    }

    @Override
    public aba<ahg> a() {
        return ahz.ba;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public jd<bcz> b() {
        return this.b;
    }

    public bdb e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }

    public float g() {
        return this.e;
    }

    public float h() {
        return this.f;
    }

    public long i() {
        return this.g;
    }
}

