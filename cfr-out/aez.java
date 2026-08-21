/*
 * Decompiled with CFR 0.152.
 */
public class aez
implements aay<adb> {
    public static final aao<wx, aez> a = aay.a(aez::a, aez::new);
    private final int b;
    private final int c;
    private final int d;

    public aez(int $$0, int $$1, int $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    private aez(wx $$0) {
        this.b = $$0.w();
        this.c = $$0.l();
        this.d = $$0.readInt();
    }

    @Override
    private void a(wx $$0) {
        $$0.f(this.b);
        $$0.c(this.c);
        $$0.q(this.d);
    }

    @Override
    public aba<aez> a() {
        return ahz.M;
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

