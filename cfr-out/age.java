/*
 * Decompiled with CFR 0.152.
 */
public class age
implements aay<adb> {
    public static final aao<wx, age> a = aay.a(age::a, age::new);
    private final double b;
    private final double c;

    public age(eqa $$0) {
        this.b = $$0.h();
        this.c = $$0.i();
    }

    private age(wx $$0) {
        this.b = $$0.readDouble();
        this.c = $$0.readDouble();
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
        $$0.a(this.c);
    }

    @Override
    public aba<age> a() {
        return ahz.aA;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public double b() {
        return this.c;
    }

    public double e() {
        return this.b;
    }
}

