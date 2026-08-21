/*
 * Decompiled with CFR 0.152.
 */
public class afr
implements aay<adb> {
    public static final aao<wx, afr> a = aay.a(afr::a, afr::new);
    private final int b;
    private final double c;

    public afr(int $$0, double $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    private afr(wx $$0) {
        this.b = $$0.l();
        this.c = $$0.readDouble();
    }

    @Override
    private void a(wx $$0) {
        $$0.c(this.b);
        $$0.a(this.c);
    }

    @Override
    public aba<afr> a() {
        return ahz.bo;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public int b() {
        return this.b;
    }

    public double e() {
        return this.c;
    }
}

