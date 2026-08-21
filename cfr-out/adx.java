/*
 * Decompiled with CFR 0.152.
 */
public class adx
implements aay<adb> {
    public static final aao<xq, adx> a = aay.a(adx::a, adx::new);
    private final int b;
    private final int c;
    private final int d;
    private final dlt e;

    public adx(int $$0, int $$1, int $$2, dlt $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3.v();
    }

    private adx(xq $$0) {
        this.b = $$0.w();
        this.c = $$0.l();
        this.d = $$0.readShort();
        this.e = (dlt)dlt.h.decode($$0);
    }

    @Override
    private void a(xq $$0) {
        $$0.f(this.b);
        $$0.c(this.c);
        $$0.m(this.d);
        dlt.h.encode($$0, this.e);
    }

    @Override
    public aba<adx> a() {
        return ahz.v;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public int b() {
        return this.b;
    }

    public int e() {
        return this.d;
    }

    public dlt f() {
        return this.e;
    }

    public int g() {
        return this.c;
    }
}

