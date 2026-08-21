/*
 * Decompiled with CFR 0.152.
 */
public class agg
implements aay<adb> {
    public static final aao<wx, agg> a = aay.a(agg::a, agg::new);
    private final double b;

    public agg(eqa $$0) {
        this.b = $$0.l();
    }

    private agg(wx $$0) {
        this.b = $$0.readDouble();
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
    }

    @Override
    public aba<agg> a() {
        return ahz.aC;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public double b() {
        return this.b;
    }
}

