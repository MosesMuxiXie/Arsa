/*
 * Decompiled with CFR 0.152.
 */
public class agu
implements aay<adb> {
    public static final aao<wx, agu> a = aay.a(agu::a, agu::new);
    private final float b;
    private final int c;
    private final float d;

    public agu(float $$0, int $$1, float $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    private agu(wx $$0) {
        this.b = $$0.readFloat();
        this.c = $$0.l();
        this.d = $$0.readFloat();
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
        $$0.c(this.c);
        $$0.a(this.d);
    }

    @Override
    public aba<agu> a() {
        return ahz.aP;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public float b() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public float f() {
        return this.d;
    }
}

