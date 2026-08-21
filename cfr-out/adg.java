/*
 * Decompiled with CFR 0.152.
 */
public class adg
implements aay<adb> {
    public static final aao<wx, adg> a = aay.a(adg::a, adg::new);
    private final int b;
    private final is c;
    private final int d;

    public adg(int $$0, is $$1, int $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    private adg(wx $$0) {
        this.b = $$0.l();
        this.c = $$0.e();
        this.d = $$0.readUnsignedByte();
    }

    @Override
    private void a(wx $$0) {
        $$0.c(this.b);
        $$0.a(this.c);
        $$0.l(this.d);
    }

    @Override
    public aba<adg> a() {
        return ahz.g;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public int b() {
        return this.b;
    }

    public is e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }
}

