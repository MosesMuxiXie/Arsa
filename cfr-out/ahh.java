/*
 * Decompiled with CFR 0.152.
 */
public class ahh
implements aay<adb> {
    public static final aao<xq, ahh> a = aay.a(ahh::a, ahh::new);
    public static final float b = 8.0f;
    private final jd<bcz> c;
    private final bdb d;
    private final int e;
    private final int f;
    private final int g;
    private final float h;
    private final float i;
    private final long j;

    public ahh(jd<bcz> $$0, bdb $$1, double $$2, double $$3, double $$4, float $$5, float $$6, long $$7) {
        this.c = $$0;
        this.d = $$1;
        this.e = (int)($$2 * 8.0);
        this.f = (int)($$3 * 8.0);
        this.g = (int)($$4 * 8.0);
        this.h = $$5;
        this.i = $$6;
        this.j = $$7;
    }

    private ahh(xq $$0) {
        this.c = (jd)bcz.d.decode($$0);
        this.d = $$0.b(bdb.class);
        this.e = $$0.readInt();
        this.f = $$0.readInt();
        this.g = $$0.readInt();
        this.h = $$0.readFloat();
        this.i = $$0.readFloat();
        this.j = $$0.readLong();
    }

    @Override
    private void a(xq $$0) {
        bcz.d.encode($$0, this.c);
        $$0.a(this.d);
        $$0.q(this.e);
        $$0.q(this.f);
        $$0.q(this.g);
        $$0.a(this.h);
        $$0.a(this.i);
        $$0.b(this.j);
    }

    @Override
    public aba<ahh> a() {
        return ahz.bb;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public jd<bcz> b() {
        return this.c;
    }

    public bdb e() {
        return this.d;
    }

    public double f() {
        return (float)this.e / 8.0f;
    }

    public double g() {
        return (float)this.f / 8.0f;
    }

    public double h() {
        return (float)this.g / 8.0f;
    }

    public float i() {
        return this.h;
    }

    public float j() {
        return this.i;
    }

    public long k() {
        return this.j;
    }
}

