/*
 * Decompiled with CFR 0.152.
 */
public class adw
implements aay<adb> {
    public static final aao<wx, adw> a = aay.a(adw::a, adw::new);
    private final int b;
    private final int c;
    private final int d;

    public adw(int $$0, int $$1, int $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    private adw(wx $$0) {
        this.b = $$0.w();
        this.c = $$0.readShort();
        this.d = $$0.readShort();
    }

    @Override
    private void a(wx $$0) {
        $$0.f(this.b);
        $$0.m(this.c);
        $$0.m(this.d);
    }

    @Override
    public aba<adw> a() {
        return ahz.u;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public int b() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }
}

