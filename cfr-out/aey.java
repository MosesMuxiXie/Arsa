/*
 * Decompiled with CFR 0.152.
 */
public class aey
implements aay<adb> {
    public static final aao<xq, aey> a = aay.a(aey::a, aey::new);
    private final int b;
    private final dvm c;
    private final int d;
    private final int e;
    private final boolean f;
    private final boolean g;

    public aey(int $$0, dvm $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
        this.b = $$0;
        this.c = $$1.a();
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
    }

    private aey(xq $$0) {
        this.b = $$0.w();
        this.c = (dvm)dvm.b.decode($$0);
        this.d = $$0.l();
        this.e = $$0.l();
        this.f = $$0.readBoolean();
        this.g = $$0.readBoolean();
    }

    @Override
    private void a(xq $$0) {
        $$0.f(this.b);
        dvm.b.encode($$0, this.c);
        $$0.c(this.d);
        $$0.c(this.e);
        $$0.a(this.f);
        $$0.a(this.g);
    }

    @Override
    public aba<aey> a() {
        return ahz.V;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public int b() {
        return this.b;
    }

    public dvm e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }

    public int g() {
        return this.e;
    }

    public boolean h() {
        return this.f;
    }

    public boolean i() {
        return this.g;
    }
}

