/*
 * Decompiled with CFR 0.152.
 */
public class ahn
implements aay<adb> {
    public static final aao<wx, ahn> a = aay.a(ahn::a, ahn::new);
    private final int b;
    private final int c;
    private final int d;

    public ahn(int $$0, int $$1, int $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    private ahn(wx $$0) {
        this.b = $$0.l();
        this.c = $$0.l();
        this.d = $$0.l();
    }

    @Override
    private void a(wx $$0) {
        $$0.c(this.b);
        $$0.c(this.c);
        $$0.c(this.d);
    }

    @Override
    public aba<ahn> a() {
        return ahz.bh;
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

